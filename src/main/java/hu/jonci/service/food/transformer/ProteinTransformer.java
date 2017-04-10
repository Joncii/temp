package hu.jonci.service.food.transformer;

import org.springframework.stereotype.Component;

import hu.jonci.dal.food.entity.macronutrient.ProteinEntity;
import hu.jonci.service.food.domain.nutrient.Protein;

@Component
public class ProteinTransformer {

    public Protein transform(ProteinEntity entity) {
        Protein protein = new Protein();
        protein.setNutrientType(entity.getNutrientType());
        return protein;
    }

    public ProteinEntity transform(Protein protein) {
        ProteinEntity entity = new ProteinEntity();
        entity.setNutrientType(protein.getNutrientType());
        return entity;
    }
}
