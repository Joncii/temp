package hu.jonci.web.food;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import hu.jonci.dal.food.entity.WeightMetric;
import hu.jonci.web.food.domain.AddFoodRequest;
import hu.jonci.web.food.domain.FoodView;
import hu.jonci.web.food.domain.ListFoodResponse;

@RestController
public class FoodController {
    
    @Autowired
    private FoodViewFacade foodViewFacade;
    
    @RequestMapping(value = "/food/metrics", method = RequestMethod.GET)
    public List<String> getMetrics(){
        return Stream.of(WeightMetric.values()).map(m -> m.toString()).collect(Collectors.toList());
    }
    
    @ResponseStatus(code = HttpStatus.CREATED)
    @RequestMapping(value = "/food/add", method = RequestMethod.PUT)
    public void addFood(@RequestBody AddFoodRequest request){
        foodViewFacade.addFood(request);
    }
    
    @RequestMapping(value = "/foods", method = RequestMethod.GET)
    public ListFoodResponse listFoods(){
        return foodViewFacade.listFoods();
    }
    
    @RequestMapping(value = "/food/{objectId}", method = RequestMethod.GET)
    public FoodView find(@PathVariable("objectId") String objectId){
        return foodViewFacade.find(objectId);
    }

}
