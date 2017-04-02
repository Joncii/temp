package hu.jonci.web.food.transformer;

import org.springframework.stereotype.Component;

import hu.jonci.dal.food.entity.WeightMetric;

@Component
public class WeightMetricViewTransformer {

    public WeightMetric transform(String stringValue) {
        WeightMetric metric;
        switch (stringValue) {
        case "μg":
            metric = WeightMetric.MICROGRAMMS;
            break;
        case "mg":
            metric = WeightMetric.MILLIGRAMMS;
            break;
        case "g":
            metric = WeightMetric.GRAMMS;
            break;
        default:
            metric = WeightMetric.GRAMMS;
        }
        return metric;
    }

}
