package net.dmly.springdatabuilder.unsafe_starter;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component("orderBy")
public class OrderByTransformationSpider implements TransformationSpider {
    @Override
    public SparkTransformation getTransformation(List<String> methodWords, Set<String> fieldNames) {
        return null;
    }
}
