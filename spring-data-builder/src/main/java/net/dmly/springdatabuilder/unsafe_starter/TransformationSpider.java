package net.dmly.springdatabuilder.unsafe_starter;

import java.util.List;
import java.util.Set;

public interface TransformationSpider {

    SparkTransformation getTransformation(List<String> methodWords, Set<String> fieldNames);

}
