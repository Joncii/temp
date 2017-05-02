package hu.jonci.web.food.domain;

import java.util.Set;

public class ListFoodResponse {

    private Set<FoodNameView> foods;

    public Set<FoodNameView> getFoods() {
        return foods;
    }

    public void setFoods(Set<FoodNameView> foods) {
        this.foods = foods;
    }

}
