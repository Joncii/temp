package hu.jonci.configuration.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import hu.jonci.dal.entity.UserEntity;
import hu.jonci.dal.repository.UserRepository;

public class DefaultUserDetailsService implements UserDetailsService {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UserEntity userEntity = userRepository.findByEmail(email);
        if(userEntity != null){
            return new MongoUserDetails(userEntity.getEmail(), userEntity.getPassword(), new String[]{});
        }
        throw new IllegalArgumentException();
    }

}
