package hu.jonci.service.food.dao;

import java.util.Set;

import org.bson.types.ObjectId;

import hu.jonci.service.food.domain.Food;

public interface FoodDao {
    
    void addFood(Food food);
    
    Set<Food> listFoods();
    
    Food find(ObjectId objectId);
    
}
