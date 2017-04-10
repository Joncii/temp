package hu.jonci.web.food.transformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hu.jonci.service.food.domain.Food;
import hu.jonci.web.food.domain.AddFoodRequest;
import hu.jonci.web.food.domain.WeightPortionView;

@Component
public class AddFoodRequestTransformer {

    @Autowired
    private CarbohydratePortionViewTransformer carbohydrateViewTransformer;

    @Autowired
    private ProteinPortionViewTransformer proteinViewTransformer;

    @Autowired
    private FatPortionViewTransformer fatViewTransformer;

    @Autowired
    private WeightPortionViewTransformer portionViewTransformer;

    public Food transform(AddFoodRequest request) {
        Food food = new Food();
        food.setName(request.getName());
        food.setCarbohydratePortion(carbohydrateViewTransformer.transform(request.getCarbohydrate()));
        food.setProteinPortion(proteinViewTransformer.transform(request.getProtein()));
        food.setFatPortion(fatViewTransformer.transform(request.getFat()));
        WeightPortionView weightPortionView = new WeightPortionView();
        weightPortionView.setMetric("g");
        weightPortionView.setValue(100.0);
        food.setPortion(portionViewTransformer.transform(weightPortionView));
        return food;
    }

}
