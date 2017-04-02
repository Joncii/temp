package hu.jonci.service.food.domain.nutrient;

import hu.jonci.service.food.domain.Portion;

public class NutrientPortion {

    private Nutrient nutrient;

    private Portion portion;

    public Nutrient getNutrient() {
        return nutrient;
    }

    public void setNutrient(Nutrient nutrient) {
        this.nutrient = nutrient;
    }

    public Portion getPortion() {
        return portion;
    }

    public void setPortion(Portion portion) {
        this.portion = portion;
    }

}
