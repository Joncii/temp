package hu.jonci.web.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hu.jonci.web.registration.domain.RegistrationRequest;
import hu.jonci.web.registration.facade.RegistrationFacade;

@RestController
public class RegistrationRestController {
    
    @Autowired
    private RegistrationFacade registrationFacade;
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public void register(@RequestBody RegistrationRequest request) {
        registrationFacade.register(request);
    }

}
