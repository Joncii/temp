package hu.jonci.service.food.transformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hu.jonci.dal.food.entity.portion.FatPortionEntity;
import hu.jonci.service.food.domain.portion.FatPortion;

@Component
public class FatPortionTransformer {

    @Autowired
    private FatTransformer fatTransformer;

    @Autowired
    private WeightPortionTransformer weightPortionTransformer;

    public FatPortion transform(FatPortionEntity entity) {
        FatPortion fatPortion = new FatPortion();
        fatPortion.setFat(fatTransformer.transform(entity.getFat()));
        fatPortion.setWeightPortion(weightPortionTransformer.transform(entity.getWeightPortion()));
        return fatPortion;
    }

    public FatPortionEntity transform(FatPortion fatPortion) {
        FatPortionEntity entity = new FatPortionEntity();
        entity.setFat(fatTransformer.transform(fatPortion.getFat()));
        entity.setWeightPortion(weightPortionTransformer.transform(fatPortion.getWeightPortion()));
        return entity;
    }

}
