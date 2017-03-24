package hu.jonci.service.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.jonci.service.registration.dao.UserDao;
import hu.jonci.service.registration.domain.RegistrationEntry;
import hu.jonci.service.registration.exception.EmailAlreadyRegisteredException;

@Service
public class RegistrationService {
    
    @Autowired
    private UserDao userDao;
    
    public void register(RegistrationEntry entry){
        if(userDao.containsEmail(entry.getEmail())){
           throw new EmailAlreadyRegisteredException();
        }
        userDao.register(entry);
    }

}
