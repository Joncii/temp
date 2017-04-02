package hu.jonci.service.food.domain.nutrient;

import hu.jonci.dal.food.entity.NutrientType;

public class Carbohydrate extends Nutrient{
    
    public Carbohydrate() {
        this.setNutrientType(NutrientType.MACRONUTRIENT);
    }

}
