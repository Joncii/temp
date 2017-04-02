package hu.jonci.dal.user.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import hu.jonci.dal.user.entity.UserEntity;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, ObjectId> {
    
    UserEntity findByEmail(String email);
    
    List<UserEntity> findByEmailLike(String email);

}
