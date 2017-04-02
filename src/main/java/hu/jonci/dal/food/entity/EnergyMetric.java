package hu.jonci.dal.food.entity;

public enum EnergyMetric {
    
    CALORIE("cal"), KILOCALORIE("kcal");
    
    private final String name;
    
    private EnergyMetric(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }

}
