package hu.jonci.service.food.domain.nutrient;

import hu.jonci.dal.food.entity.NutrientType;

public abstract class Nutrient {

    private NutrientType nutrientType;

    public NutrientType getNutrientType() {
        return nutrientType;
    }

    public void setNutrientType(NutrientType nutrientType) {
        this.nutrientType = nutrientType;
    }

}
