package hu.jonci.web.food;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hu.jonci.dal.entity.food.Metric;

@RestController
public class FoodController {
    
    @RequestMapping(value = "/food/metrics", method = RequestMethod.GET)
    public List<String> getMetrics(){
        return Stream.of(Metric.values()).map(m -> m.toString()).collect(Collectors.toList());
    }

}
