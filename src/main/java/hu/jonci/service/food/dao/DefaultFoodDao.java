package hu.jonci.service.food.dao;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hu.jonci.dal.food.repository.FoodRepository;
import hu.jonci.service.food.domain.Food;
import hu.jonci.service.food.transformer.FoodTransformer;

@Component
public class DefaultFoodDao implements FoodDao {

    @Autowired
    private FoodRepository foodRepository;

    @Autowired
    private FoodTransformer foodTransformer;

    @Override
    public void addFood(Food food) {
        foodRepository.insert(foodTransformer.transform(food));
    }

    @Override
    public Set<Food> listFoods() {
        return foodTransformer.transformEntities(foodRepository.findAll());
    }

}
