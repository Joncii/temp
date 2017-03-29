package hu.jonci.dal.entity.food;

public class Nutrient {

    private NutrientType nutrientType;

    private String name;

    public NutrientType getNutrientType() {
        return nutrientType;
    }

    public String getName() {
        return name;
    }

    public void setNutrientType(NutrientType nutrientType) {
        this.nutrientType = nutrientType;
    }

    public void setName(String name) {
        this.name = name;
    }

}
