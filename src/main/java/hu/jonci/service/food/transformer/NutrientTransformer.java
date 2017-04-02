package hu.jonci.service.food.transformer;

import org.springframework.stereotype.Component;

import hu.jonci.dal.food.entity.CarbohydrateEntity;
import hu.jonci.dal.food.entity.FatEntity;
import hu.jonci.dal.food.entity.NutrientEntity;
import hu.jonci.dal.food.entity.ProteinEntity;
import hu.jonci.service.food.domain.nutrient.Carbohydrate;
import hu.jonci.service.food.domain.nutrient.Fat;
import hu.jonci.service.food.domain.nutrient.Nutrient;
import hu.jonci.service.food.domain.nutrient.Protein;

@Component
public class NutrientTransformer {

    public Nutrient transform(NutrientEntity entity){
        Nutrient nutrient = createNutrientInstance(entity);
        if(nutrient != null){
            nutrient.setNutrientType(entity.getNutrientType());
        }
        return nutrient;
    }
    
    private Nutrient createNutrientInstance(NutrientEntity entity){
        Nutrient nutrient = null;;
        if(entity instanceof CarbohydrateEntity){
            nutrient = new Carbohydrate();
        } else if(entity instanceof ProteinEntity){
            nutrient = new Protein();
        } else if(entity instanceof FatEntity){
            nutrient = new Fat();
        }
        return nutrient;
    }
    
    public NutrientEntity transform(Nutrient nutrient){
        NutrientEntity entity = createNutrientEntityInstance(nutrient);
        if(entity != null){
            entity.setNutrientType(nutrient.getNutrientType());
        }
        return entity;
    }
    
    private NutrientEntity createNutrientEntityInstance(Nutrient nutrient){
        NutrientEntity entity = null;
        if(nutrient instanceof Carbohydrate){
            entity = new CarbohydrateEntity();
        } else if(nutrient instanceof Protein){
            entity = new ProteinEntity();
        } else if(nutrient instanceof Fat){
            entity = new FatEntity();
        }
        return entity;
    }
    
}
