package hu.jonci.service.food.domain.portion;

import hu.jonci.service.food.domain.WeightPortion;
import hu.jonci.service.food.domain.nutrient.Fat;

public class FatPortion {

    private Fat fat;

    private WeightPortion weightPortion;

    public Fat getFat() {
        return fat;
    }

    public void setFat(Fat fat) {
        this.fat = fat;
    }

    public WeightPortion getWeightPortion() {
        return weightPortion;
    }

    public void setWeightPortion(WeightPortion weightPortion) {
        this.weightPortion = weightPortion;
    }

}
