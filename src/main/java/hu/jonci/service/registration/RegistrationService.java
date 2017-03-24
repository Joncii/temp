package hu.jonci.service.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.jonci.service.registration.dao.RegistrationDao;
import hu.jonci.service.registration.domain.RegistrationEntry;

@Service
public class RegistrationService {
    
    @Autowired
    private RegistrationDao registrationDao;
    
    public void register(RegistrationEntry entry){
        registrationDao.register(entry);
    }

}
