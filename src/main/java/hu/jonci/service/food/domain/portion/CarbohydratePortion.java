package hu.jonci.service.food.domain.portion;

import hu.jonci.service.food.domain.WeightPortion;
import hu.jonci.service.food.domain.nutrient.Carbohydrate;

public class CarbohydratePortion {
    
    private Carbohydrate carbohydrate;
    
    private WeightPortion weightPortion;

    public Carbohydrate getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(Carbohydrate carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public WeightPortion getWeightPortion() {
        return weightPortion;
    }

    public void setWeightPortion(WeightPortion weightPortion) {
        this.weightPortion = weightPortion;
    }

}
