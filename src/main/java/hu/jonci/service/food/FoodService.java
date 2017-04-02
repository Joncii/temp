package hu.jonci.service.food;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.jonci.service.food.dao.FoodDao;
import hu.jonci.service.food.domain.Food;

@Service
public class FoodService {
    
    @Autowired
    private FoodDao foodDao;
    
    public void addFood(Food food){
        foodDao.addFood(food);
    }
    
    public Set<Food> listFoods(){
        return foodDao.listFoods();
    }

}
