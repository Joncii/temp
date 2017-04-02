package hu.jonci.web.food.transformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hu.jonci.service.food.domain.nutrient.NutrientPortion;
import hu.jonci.service.food.domain.nutrient.Protein;
import hu.jonci.web.food.domain.ProteinPortionView;

@Component
public class ProteinViewTransformer {
    
    @Autowired
    private PortionViewTransformer portionViewTransformer;

    public NutrientPortion transform(ProteinPortionView view) {
        NutrientPortion carbohydratePortion = new NutrientPortion();
        carbohydratePortion.setNutrient(new Protein());
        carbohydratePortion.setPortion(portionViewTransformer.transform(view.getValue(), view.getMetric()));
        return carbohydratePortion;
    }

}
