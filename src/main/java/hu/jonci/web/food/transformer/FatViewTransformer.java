package hu.jonci.web.food.transformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hu.jonci.service.food.domain.nutrient.Fat;
import hu.jonci.service.food.domain.nutrient.NutrientPortion;
import hu.jonci.web.food.domain.FatPortionView;

@Component
public class FatViewTransformer {
    
    @Autowired
    private PortionViewTransformer portionViewTransformer;

    public NutrientPortion transform(FatPortionView view) {
        NutrientPortion carbohydratePortion = new NutrientPortion();
        carbohydratePortion.setNutrient(new Fat());
        carbohydratePortion.setPortion(portionViewTransformer.transform(view.getValue(), view.getMetric()));
        return carbohydratePortion;
    }

}
