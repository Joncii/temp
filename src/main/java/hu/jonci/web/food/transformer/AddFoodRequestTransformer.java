package hu.jonci.web.food.transformer;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hu.jonci.service.food.domain.Food;
import hu.jonci.service.food.domain.nutrient.NutrientPortion;
import hu.jonci.web.food.domain.AddFoodRequest;

@Component
public class AddFoodRequestTransformer {

    @Autowired
    private CarbohydrateViewTransformer carbohydrateViewTransformer;
    
    @Autowired
    private ProteinViewTransformer proteinViewTransformer;
    
    @Autowired
    private FatViewTransformer fatViewTransformer;
    
    @Autowired
    private PortionViewTransformer portionViewTransformer;
    
    public Food transform(AddFoodRequest request){
        Food food = new Food();
        food.setName(request.getName());
        Set<NutrientPortion> nutrientPortions = new HashSet<>();
        nutrientPortions.add(carbohydrateViewTransformer.transform(request.getCarbohydrate()));
        nutrientPortions.add(proteinViewTransformer.transform(request.getProtein()));
        nutrientPortions.add(fatViewTransformer.transform(request.getFat()));
        food.setNutritionPortions(nutrientPortions);
        food.setPortion(portionViewTransformer.transform(100.0, "g"));
        return food;
    }
    
}
