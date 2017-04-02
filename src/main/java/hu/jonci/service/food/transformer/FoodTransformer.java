package hu.jonci.service.food.transformer;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hu.jonci.dal.food.entity.FoodEntity;
import hu.jonci.service.food.domain.Food;

@Component
public class FoodTransformer {
    
    @Autowired
    private NutrientPortionTransformer nutrientPortionTransformer;
    
    @Autowired
    private PortionTransformer portionTransformer;
    
    public FoodEntity transform(Food food){
        FoodEntity entity = new FoodEntity();
        entity.setId(food.getId());
        entity.setName(food.getName());
        entity.setPortion(portionTransformer.transform(food.getPortion()));
        entity.setNutrientPortions(nutrientPortionTransformer.transform(food.getNutritionPortions()));
        return entity;
    }
    
    public Food transformEntity(FoodEntity entity){
        Food food = new Food();
        food.setId(entity.getId());
        food.setName(entity.getName());
        food.setNutritionPortions(nutrientPortionTransformer.transformEntities(entity.getNutrientPortions()));
        food.setPortion(portionTransformer.transform(entity.getPortion()));
        return food;
    }
    
    public Set<Food> transformEntities(Collection<FoodEntity> entities){
        return entities.stream().map(this::transformEntity).collect(Collectors.toSet());
    }

}
