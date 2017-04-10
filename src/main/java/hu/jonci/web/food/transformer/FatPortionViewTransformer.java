package hu.jonci.web.food.transformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hu.jonci.service.food.domain.nutrient.Fat;
import hu.jonci.service.food.domain.portion.FatPortion;
import hu.jonci.web.food.domain.FatPortionView;

@Component
public class FatPortionViewTransformer {

    @Autowired
    private WeightPortionViewTransformer portionViewTransformer;

    public FatPortion transform(FatPortionView view) {
        FatPortion fatPortion = new FatPortion();
        fatPortion.setFat(new Fat());
        fatPortion.setWeightPortion(portionViewTransformer.transform(view.getWeightPortion()));
        return fatPortion;
    }

    public FatPortionView transform(FatPortion fatPortion) {
        FatPortionView fatPortionView = new FatPortionView();
        fatPortionView.setWeightPortion(portionViewTransformer.transform(fatPortion.getWeightPortion()));
        return fatPortionView;
    }

}
