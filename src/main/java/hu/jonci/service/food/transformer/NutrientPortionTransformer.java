package hu.jonci.service.food.transformer;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hu.jonci.dal.food.entity.NutrientPortionEntity;
import hu.jonci.service.food.domain.nutrient.NutrientPortion;

@Component
public class NutrientPortionTransformer {

    @Autowired
    private NutrientTransformer nutrientTransformer;
    
    @Autowired
    private PortionTransformer portionTransformer;
    
    public NutrientPortion transformEntity(NutrientPortionEntity entity){
        NutrientPortion nutrientPortion = new NutrientPortion();
        nutrientPortion.setNutrient(nutrientTransformer.transform(entity.getNutrient()));
        nutrientPortion.setPortion(portionTransformer.transform(entity.getPortion()));
        return nutrientPortion;
    }
    
    public Set<NutrientPortion> transformEntities(Collection<NutrientPortionEntity> entities){
        return entities.stream().map(this::transformEntity).collect(Collectors.toSet());
    }
    
    public NutrientPortionEntity transform(NutrientPortion nutrientPortion){
        NutrientPortionEntity entity = new NutrientPortionEntity();
        entity.setNutrient(nutrientTransformer.transform(nutrientPortion.getNutrient()));
        entity.setPortion(portionTransformer.transform(nutrientPortion.getPortion()));
        return entity;
    }
    
    public Set<NutrientPortionEntity> transform(Collection<NutrientPortion> nutrientPortions){
        return nutrientPortions.stream().map(this::transform).collect(Collectors.toSet());
    }
    
}
