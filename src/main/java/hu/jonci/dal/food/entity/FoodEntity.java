package hu.jonci.dal.food.entity;

import java.util.Set;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "food")
public class FoodEntity {

    @Id
    private String id;

    private String name;

    private EnergyEntity energy;

    private Set<NutrientPortionEntity> nutrientPortions;

    private PortionEntity portion;

    public Set<NutrientPortionEntity> getNutrientPortions() {
        return nutrientPortions;
    }

    public void setNutrientPortions(Set<NutrientPortionEntity> nutrientPortions) {
        this.nutrientPortions = nutrientPortions;
    }

    public PortionEntity getPortion() {
        return portion;
    }

    public void setPortion(PortionEntity portion) {
        this.portion = portion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EnergyEntity getEnergy() {
        return energy;
    }

    public void setEnergy(EnergyEntity energy) {
        this.energy = energy;
    }

}
