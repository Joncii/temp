package hu.jonci.service.food.domain.nutrient;

import hu.jonci.dal.food.entity.NutrientType;

public class Protein extends Nutrient{
    
    public Protein() {
        this.setNutrientType(NutrientType.MACRONUTRIENT);
    }

}
