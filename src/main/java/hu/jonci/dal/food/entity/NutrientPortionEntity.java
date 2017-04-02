package hu.jonci.dal.food.entity;

public class NutrientPortionEntity {

    private NutrientEntity nutrient;

    private PortionEntity portion;

    public NutrientEntity getNutrient() {
        return nutrient;
    }

    public PortionEntity getPortion() {
        return portion;
    }

    public void setNutrient(NutrientEntity nutrient) {
        this.nutrient = nutrient;
    }

    public void setPortion(PortionEntity portion) {
        this.portion = portion;
    }

}
