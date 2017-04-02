package hu.jonci.web.food.transformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hu.jonci.service.food.domain.nutrient.Carbohydrate;
import hu.jonci.service.food.domain.nutrient.NutrientPortion;
import hu.jonci.web.food.domain.CarbohydratePortionView;

@Component
public class CarbohydrateViewTransformer {
    
    @Autowired
    private PortionViewTransformer portionViewTransformer;

    public NutrientPortion transform(CarbohydratePortionView view) {
        NutrientPortion carbohydratePortion = new NutrientPortion();
        carbohydratePortion.setNutrient(new Carbohydrate());
        carbohydratePortion.setPortion(portionViewTransformer.transform(view.getValue(), view.getMetric()));
        return carbohydratePortion;
    }

}
