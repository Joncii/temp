package hu.jonci.web.food;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hu.jonci.service.food.FoodService;
import hu.jonci.web.food.domain.AddFoodRequest;
import hu.jonci.web.food.domain.FoodView;
import hu.jonci.web.food.domain.ListFoodResponse;
import hu.jonci.web.food.transformer.AddFoodRequestTransformer;
import hu.jonci.web.food.transformer.FoodViewTransformer;
import hu.jonci.web.food.transformer.ListFoodResponseTransformer;

@Component
public class FoodViewFacade {
    
    @Autowired
    private FoodService service;
    
    @Autowired
    private ListFoodResponseTransformer listFoodResponseTransformer;
    
    @Autowired
    private FoodViewTransformer foodViewTransformer;
    
    @Autowired
    private AddFoodRequestTransformer addFoodRequestTransformer;

    public void addFood(AddFoodRequest request){
        service.addFood(addFoodRequestTransformer.transform(request));
    }
    
    public ListFoodResponse listFoods(){
        return listFoodResponseTransformer.transform(service.listFoods());
    }
    
    public FoodView find(String objectId){
        return foodViewTransformer.transform(service.find(new ObjectId(objectId)));
    }
    
}
