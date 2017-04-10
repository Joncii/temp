package hu.jonci.service.food.domain.portion;

import hu.jonci.service.food.domain.WeightPortion;
import hu.jonci.service.food.domain.nutrient.Protein;

public class ProteinPortion {

    private Protein protein;

    private WeightPortion weightPortion;

    public Protein getProtein() {
        return protein;
    }

    public void setProtein(Protein protein) {
        this.protein = protein;
    }

    public WeightPortion getWeightPortion() {
        return weightPortion;
    }

    public void setWeightPortion(WeightPortion weightPortion) {
        this.weightPortion = weightPortion;
    }

}
