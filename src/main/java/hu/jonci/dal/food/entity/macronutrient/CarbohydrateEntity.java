package hu.jonci.dal.food.entity.macronutrient;

import hu.jonci.dal.food.entity.NutrientEntity;
import hu.jonci.dal.food.entity.NutrientType;

public class CarbohydrateEntity extends NutrientEntity{

    public CarbohydrateEntity() {
        super();
        this.setNutrientType(NutrientType.MACRONUTRIENT);
    }
    
}
