package hu.jonci.web.food.domain;

public class FoodView {

    private String id;

    private String name;

    private CarbohydratePortionView carbohydrate;

    private ProteinPortionView protein;

    private FatPortionView fat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarbohydratePortionView getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(CarbohydratePortionView carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public ProteinPortionView getProtein() {
        return protein;
    }

    public void setProtein(ProteinPortionView protein) {
        this.protein = protein;
    }

    public FatPortionView getFat() {
        return fat;
    }

    public void setFat(FatPortionView fat) {
        this.fat = fat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
