package hu.jonci.web.food.transformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hu.jonci.service.food.domain.nutrient.Carbohydrate;
import hu.jonci.service.food.domain.portion.CarbohydratePortion;
import hu.jonci.web.food.domain.CarbohydratePortionView;

@Component
public class CarbohydratePortionViewTransformer {
    
    @Autowired
    private WeightPortionViewTransformer portionViewTransformer;

    public CarbohydratePortion transform(CarbohydratePortionView view) {
        CarbohydratePortion carbohydratePortion = new CarbohydratePortion();
        carbohydratePortion.setCarbohydrate(new Carbohydrate());
        carbohydratePortion.setWeightPortion(portionViewTransformer.transform(view.getWeightPortion()));
        return carbohydratePortion;
    }
    
    public CarbohydratePortionView transform(CarbohydratePortion carbohydratePortion){
        CarbohydratePortionView carbohydratePortionView = new CarbohydratePortionView();
        carbohydratePortionView.setWeightPortion(portionViewTransformer.transform(carbohydratePortion.getWeightPortion()));
        return carbohydratePortionView;
    }

}
