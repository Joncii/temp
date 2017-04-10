package hu.jonci.dal.food.entity.portion;

import hu.jonci.dal.food.entity.macronutrient.CarbohydrateEntity;

public class CarbohydratePortionEntity {

    private CarbohydrateEntity carbohydrate;

    private WeightPortionEntity weightPortion;

    public CarbohydrateEntity getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(CarbohydrateEntity carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public WeightPortionEntity getWeightPortion() {
        return weightPortion;
    }

    public void setWeightPortion(WeightPortionEntity weightPortion) {
        this.weightPortion = weightPortion;
    }

}
