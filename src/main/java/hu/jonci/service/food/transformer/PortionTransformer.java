package hu.jonci.service.food.transformer;

import org.springframework.stereotype.Component;

import hu.jonci.dal.food.entity.PortionEntity;
import hu.jonci.service.food.domain.Portion;

@Component
public class PortionTransformer {
    
    public Portion transform(PortionEntity entity){
        Portion portion = new Portion();
        portion.setMetric(entity.getMetric());
        portion.setValue(entity.getValue());
        return portion;
    }
    
    public PortionEntity transform(Portion portion){
        PortionEntity entity = new PortionEntity();
        entity.setMetric(portion.getMetric());
        entity.setValue(portion.getValue());
        return entity;
    }

}
