package hu.jonci.service.food.domain;

import hu.jonci.dal.food.entity.WeightMetric;

public class WeightPortion {

    private Double value;

    private WeightMetric metric;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public WeightMetric getMetric() {
        return metric;
    }

    public void setMetric(WeightMetric metric) {
        this.metric = metric;
    }

}
