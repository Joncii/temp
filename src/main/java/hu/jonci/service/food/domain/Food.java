package hu.jonci.service.food.domain;

import java.util.Set;

import hu.jonci.service.food.domain.nutrient.NutrientPortion;

public class Food {

    private String id;

    private String name;

    private Set<NutrientPortion> nutritionPortions;

    private Portion portion;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<NutrientPortion> getNutritionPortions() {
        return nutritionPortions;
    }

    public void setNutritionPortions(Set<NutrientPortion> nutritionPortions) {
        this.nutritionPortions = nutritionPortions;
    }

    public Portion getPortion() {
        return portion;
    }

    public void setPortion(Portion portion) {
        this.portion = portion;
    }

}
