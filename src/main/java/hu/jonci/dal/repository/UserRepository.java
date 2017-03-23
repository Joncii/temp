package hu.jonci.dal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import hu.jonci.dal.entity.UserEntity;

public interface UserRepository extends MongoRepository<UserEntity, String> {
    
    UserEntity findByEmail(String email);

}
