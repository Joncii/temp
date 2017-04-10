package hu.jonci.service.food.transformer;

import org.springframework.stereotype.Component;

import hu.jonci.dal.food.entity.macronutrient.CarbohydrateEntity;
import hu.jonci.service.food.domain.nutrient.Carbohydrate;

@Component
public class CarbohydrateTransformer {

    public Carbohydrate transform(CarbohydrateEntity entity) {
        Carbohydrate carbohydrate = new Carbohydrate();
        carbohydrate.setNutrientType(entity.getNutrientType());
        return carbohydrate;
    }

    public CarbohydrateEntity transform(Carbohydrate carbohydrate) {
        CarbohydrateEntity entity = new CarbohydrateEntity();
        entity.setNutrientType(carbohydrate.getNutrientType());
        return entity;
    }

}
