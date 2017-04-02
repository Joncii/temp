package hu.jonci.web.food;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import hu.jonci.dal.food.entity.WeightMetric;
import hu.jonci.service.food.FoodService;
import hu.jonci.service.food.domain.Food;
import hu.jonci.web.food.domain.AddFoodRequest;
import hu.jonci.web.food.transformer.AddFoodRequestTransformer;

@RestController
public class FoodController {
    
    @Autowired
    private AddFoodRequestTransformer transformer;
    
    @Autowired
    private FoodService foodService;
    
    @RequestMapping(value = "/food/metrics", method = RequestMethod.GET)
    public List<String> getMetrics(){
        return Stream.of(WeightMetric.values()).map(m -> m.toString()).collect(Collectors.toList());
    }
    
    @ResponseStatus(code = HttpStatus.CREATED)
    @RequestMapping(value = "/food/add", method = RequestMethod.PUT)
    public void addFood(@RequestBody AddFoodRequest request){
        foodService.addFood(transformer.transform(request));
    }
    
    @RequestMapping(value = "/foods", method = RequestMethod.GET)
    public Set<Food> listFoods(){
        return foodService.listFoods();
    }

}
