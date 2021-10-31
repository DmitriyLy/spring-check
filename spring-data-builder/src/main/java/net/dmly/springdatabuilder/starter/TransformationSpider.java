package net.dmly.springdatabuilder.starter;

import java.lang.reflect.Method;
import java.util.List;

public interface TransformationSpider {

    SparkTransformation getTransformation(List<String> methodWords);

}
