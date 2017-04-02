package hu.jonci.service.food.dao;

import java.util.Set;

import hu.jonci.service.food.domain.Food;

public interface FoodDao {
    
    void addFood(Food food);
    
    Set<Food> listFoods();

}
