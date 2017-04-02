package hu.jonci.dal.food.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import hu.jonci.dal.food.entity.FoodEntity;

@Repository
public interface FoodRepository extends MongoRepository<FoodEntity, ObjectId> {

}
