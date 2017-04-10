package hu.jonci.dal.food.entity.macronutrient;

import hu.jonci.dal.food.entity.NutrientEntity;
import hu.jonci.dal.food.entity.NutrientType;

public class FatEntity extends NutrientEntity {
    
    public FatEntity() {
        super();
        this.setNutrientType(NutrientType.MACRONUTRIENT);
    }

}
