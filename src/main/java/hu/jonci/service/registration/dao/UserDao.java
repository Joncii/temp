package hu.jonci.service.registration.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hu.jonci.dal.entity.UserEntity;
import hu.jonci.dal.repository.UserRepository;
import hu.jonci.service.registration.domain.RegistrationEntry;
import hu.jonci.service.registration.transformer.RegistrationTransformer;

@Component
public class UserDao {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private RegistrationTransformer registrationTransformer;
    
    public void register(RegistrationEntry entry){
        userRepository.save(registrationTransformer.transform(entry));
    }
    
    public boolean containsEmail(String email){
        List<UserEntity> users = userRepository.findByEmailLike(email);
        if(users.isEmpty()){
            return false;
        } else {
            return true;
        }
    }

}
