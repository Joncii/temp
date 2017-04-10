package hu.jonci.web.food.domain;

import java.util.Set;

public class ListFoodResponse {

    private Set<FoodView> foods;

    public Set<FoodView> getFoods() {
        return foods;
    }

    public void setFoods(Set<FoodView> foods) {
        this.foods = foods;
    }

}
