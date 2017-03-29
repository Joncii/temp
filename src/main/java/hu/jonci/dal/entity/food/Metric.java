package hu.jonci.dal.entity.food;

public enum Metric {

    MICROGRAMMS("μg"), MILLIGRAMMS("mg"), GRAMMS("g"), KILOGRAMMS("kg");
    
    private final String name;

    private Metric(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }

}
