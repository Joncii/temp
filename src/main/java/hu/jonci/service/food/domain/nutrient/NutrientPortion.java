package hu.jonci.service.food.domain.nutrient;

import hu.jonci.service.food.domain.WeightPortion;

public class NutrientPortion {

    private Nutrient nutrient;

    private WeightPortion portion;

    public Nutrient getNutrient() {
        return nutrient;
    }

    public void setNutrient(Nutrient nutrient) {
        this.nutrient = nutrient;
    }

    public WeightPortion getPortion() {
        return portion;
    }

    public void setPortion(WeightPortion portion) {
        this.portion = portion;
    }

}
