package hu.jonci.dal.food.entity.portion;

import hu.jonci.dal.food.entity.macronutrient.FatEntity;

public class FatPortionEntity {

    private FatEntity fat;

    private WeightPortionEntity weightPortion;

    public FatEntity getFat() {
        return fat;
    }

    public void setFat(FatEntity fat) {
        this.fat = fat;
    }

    public WeightPortionEntity getWeightPortion() {
        return weightPortion;
    }

    public void setWeightPortion(WeightPortionEntity weightPortion) {
        this.weightPortion = weightPortion;
    }

}
