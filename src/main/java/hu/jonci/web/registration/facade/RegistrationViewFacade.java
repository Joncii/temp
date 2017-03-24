package hu.jonci.web.registration.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hu.jonci.service.registration.RegistrationService;
import hu.jonci.web.registration.domain.RegistrationRequest;
import hu.jonci.web.registration.transformer.RegistrationViewTransformer;

@Component
public class RegistrationViewFacade {
    
    @Autowired
    private RegistrationService registrationService;
    
    @Autowired
    private RegistrationViewTransformer registrationTransformer;
    
    public void register(RegistrationRequest request){
        registrationService.register(registrationTransformer.transform(request));
    }

}
