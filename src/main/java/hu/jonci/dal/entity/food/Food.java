package hu.jonci.dal.entity.food;

import java.util.Set;

public class Food {

    private String name;

    private Set<NutrientPortion> nutrientPortions;

    private Portion portion;

    public Set<NutrientPortion> getNutrientPortions() {
        return nutrientPortions;
    }

    public void setNutrientPortions(Set<NutrientPortion> nutrientPortions) {
        this.nutrientPortions = nutrientPortions;
    }

    public Portion getPortion() {
        return portion;
    }

    public void setPortion(Portion portion) {
        this.portion = portion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
