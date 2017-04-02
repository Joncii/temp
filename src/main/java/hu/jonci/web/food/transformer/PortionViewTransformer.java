package hu.jonci.web.food.transformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hu.jonci.service.food.domain.Portion;

@Component
public class PortionViewTransformer {
    
    @Autowired
    private WeightMetricViewTransformer weightMetricViewTransformer;
    
    public Portion transform(Double value, String metric){
        Portion portion = new Portion();
        portion.setMetric(weightMetricViewTransformer.transform(metric));
        portion.setValue(value);
        return portion;
    }

}
