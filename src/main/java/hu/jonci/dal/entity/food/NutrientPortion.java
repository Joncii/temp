package hu.jonci.dal.entity.food;

public class NutrientPortion {

    private Nutrient nutrient;
    
    private Portion portion;

    public Nutrient getNutrient() {
        return nutrient;
    }

    public Portion getPortion() {
        return portion;
    }

    public void setNutrient(Nutrient nutrient) {
        this.nutrient = nutrient;
    }

    public void setPortion(Portion portion) {
        this.portion = portion;
    }
    
    
    
}
