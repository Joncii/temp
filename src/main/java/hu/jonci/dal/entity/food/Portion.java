package hu.jonci.dal.entity.food;

public class Portion {

    private double value;

    private Metric metric;

    public double getValue() {
        return value;
    }

    public Metric getMetric() {
        return metric;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setMetric(Metric metric) {
        this.metric = metric;
    }

}
