package hu.jonci.service.food.domain.nutrient;

import hu.jonci.dal.food.entity.NutrientType;

public class Fat extends Nutrient {
    
    public Fat() {
        this.setNutrientType(NutrientType.MACRONUTRIENT);
    }

}
