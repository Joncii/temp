package hu.jonci.web.registration.transformer;

import org.springframework.stereotype.Component;

import hu.jonci.service.registration.domain.RegistrationEntry;
import hu.jonci.web.registration.domain.RegistrationRequest;

@Component
public class RegistrationViewTransformer {
    
    public RegistrationEntry transform(RegistrationRequest request){
        RegistrationEntry registrationEntry = new RegistrationEntry();
        registrationEntry.setEmail(request.getEmail());
        registrationEntry.setPassword(request.getPassword());
        registrationEntry.setRepassword(request.getRepassword());
        return registrationEntry;
    }

}
