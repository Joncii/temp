package hu.jonci.service.food.transformer;

import org.springframework.stereotype.Component;

import hu.jonci.dal.food.entity.portion.WeightPortionEntity;
import hu.jonci.service.food.domain.WeightPortion;

@Component
public class WeightPortionTransformer {
    
    public WeightPortion transform(WeightPortionEntity entity){
        WeightPortion portion = new WeightPortion();
        portion.setMetric(entity.getMetric());
        portion.setValue(entity.getValue());
        return portion;
    }
    
    public WeightPortionEntity transform(WeightPortion portion){
        WeightPortionEntity entity = new WeightPortionEntity();
        entity.setMetric(portion.getMetric());
        entity.setValue(portion.getValue());
        return entity;
    }

}
