package hu.jonci.service.food.transformer;

import org.springframework.stereotype.Component;

import hu.jonci.dal.food.entity.macronutrient.FatEntity;
import hu.jonci.service.food.domain.nutrient.Fat;

@Component
public class FatTransformer {

    public Fat transform(FatEntity entity) {
        Fat fat = new Fat();
        fat.setNutrientType(entity.getNutrientType());
        return fat;
    }

    public FatEntity transform(Fat fat) {
        FatEntity entity = new FatEntity();
        entity.setNutrientType(fat.getNutrientType());
        return entity;
    }
}
