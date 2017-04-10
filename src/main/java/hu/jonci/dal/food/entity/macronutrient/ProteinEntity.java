package hu.jonci.dal.food.entity.macronutrient;

import hu.jonci.dal.food.entity.NutrientEntity;
import hu.jonci.dal.food.entity.NutrientType;

public class ProteinEntity extends NutrientEntity {
    
    public ProteinEntity() {
        super();
        this.setNutrientType(NutrientType.MACRONUTRIENT);
    }

}
