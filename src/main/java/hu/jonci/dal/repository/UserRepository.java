package hu.jonci.dal.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import hu.jonci.dal.entity.UserEntity;

public interface UserRepository extends MongoRepository<UserEntity, ObjectId> {
    
    UserEntity findByEmail(String email);

}
