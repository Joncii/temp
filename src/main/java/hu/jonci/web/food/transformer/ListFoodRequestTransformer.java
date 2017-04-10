package hu.jonci.web.food.transformer;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hu.jonci.service.food.domain.Food;
import hu.jonci.web.food.domain.FoodView;
import hu.jonci.web.food.domain.ListFoodResponse;

@Component
public class ListFoodRequestTransformer {
    
    @Autowired
    private CarbohydratePortionViewTransformer carbohydratePortionViewTransformer;
    
    @Autowired
    private ProteinPortionViewTransformer proteinPortionViewTransformer;
    
    @Autowired
    private FatPortionViewTransformer fatPortionViewTransformer;
    
    public ListFoodResponse transform(Set<Food> foods){
        ListFoodResponse response = new ListFoodResponse();
        Set<FoodView> foodViews = foods.stream().map(this::transform).collect(Collectors.toSet());
        response.setFoods(foodViews);
        return response;
    }
    
    public FoodView transform(Food food){
        FoodView foodView = new FoodView();
        foodView.setName(food.getName());
        foodView.setCarbohydrate(carbohydratePortionViewTransformer.transform(food.getCarbohydratePortion()));
        foodView.setProtein(proteinPortionViewTransformer.transform(food.getProteinPortion()));
        foodView.setFat(fatPortionViewTransformer.transform(food.getFatPortion()));
        return foodView;
    }

}
