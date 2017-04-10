package hu.jonci.service.food.domain;

import hu.jonci.service.food.domain.portion.CarbohydratePortion;
import hu.jonci.service.food.domain.portion.FatPortion;
import hu.jonci.service.food.domain.portion.ProteinPortion;

public class Food {

    private String id;

    private String name;

    private CarbohydratePortion carbohydratePortion;

    private ProteinPortion proteinPortion;

    private FatPortion fatPortion;

    private WeightPortion portion;

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

    public WeightPortion getPortion() {
        return portion;
    }

    public void setPortion(WeightPortion portion) {
        this.portion = portion;
    }

    public CarbohydratePortion getCarbohydratePortion() {
        return carbohydratePortion;
    }

    public void setCarbohydratePortion(CarbohydratePortion carbohydratePortion) {
        this.carbohydratePortion = carbohydratePortion;
    }

    public ProteinPortion getProteinPortion() {
        return proteinPortion;
    }

    public void setProteinPortion(ProteinPortion proteinPortion) {
        this.proteinPortion = proteinPortion;
    }

    public FatPortion getFatPortion() {
        return fatPortion;
    }

    public void setFatPortion(FatPortion fatPortion) {
        this.fatPortion = fatPortion;
    }

}
