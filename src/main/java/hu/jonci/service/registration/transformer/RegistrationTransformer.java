package hu.jonci.service.registration.transformer;

import org.springframework.stereotype.Component;

import hu.jonci.dal.entity.UserEntity;
import hu.jonci.service.registration.domain.RegistrationEntry;

@Component
public class RegistrationTransformer {

    public UserEntity transform(RegistrationEntry entry) {
        UserEntity entity = new UserEntity();
        entity.setEmail(entry.getEmail());
        entity.setPassword(entry.getPassword());
        return entity;
    }

}
