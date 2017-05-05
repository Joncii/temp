package hu.jonci.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

import hu.jonci.configuration.authentication.DefaultUserDetailsService;

@Configuration
@EnableWebSecurity()
@ComponentScan("hu.jonci")
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    
    @Autowired
    private RestAuthenticationEntryPoint restAuthenticationEntryPoint;
    
    @Autowired
    private SavedRequestAwareAuthenticationSuccessHandler savedRequestAwareAuthenticationSuccessHandler;

    @Bean
    public UserDetailsService userDetailsService() {
        return new DefaultUserDetailsService();
    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//            .antMatchers("/login", "/processLogin").anonymous()
//            .anyRequest().authenticated()
//            .and()
//            .formLogin()
//            .loginPage("/login")
//            .loginProcessingUrl("/processLogin")
//            .usernameParameter("email").passwordParameter("password")
//            .defaultSuccessUrl("/summary", true).and()
//            .logout().logoutSuccessUrl("/login").and()
//            .csrf().disable();
//    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().exceptionHandling().authenticationEntryPoint(restAuthenticationEntryPoint).and()
                .authorizeRequests().antMatchers("/api/*").authenticated().and().formLogin().usernameParameter("email")
                .successHandler(savedRequestAwareAuthenticationSuccessHandler)
                .failureHandler(myFailureHandler()).defaultSuccessUrl("/summary", true).and().logout().deleteCookies("JSESSIONID").logoutSuccessUrl("/login");
    }
    
    @Override
    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/resources/**");
//        web.ignoring().antMatchers("/login");
//        web.ignoring().antMatchers("/register");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService());
    }
    
    @Bean
    public SimpleUrlAuthenticationFailureHandler myFailureHandler() {
        return new SimpleUrlAuthenticationFailureHandler();
    }

}
