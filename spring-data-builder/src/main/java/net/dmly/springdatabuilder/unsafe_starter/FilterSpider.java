package net.dmly.springdatabuilder.unsafe_starter;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component("findBy")
public class FilterSpider implements TransformationSpider {

    private Map<String, FilterTransformation> filterTransformationMap;

    @Override
    public SparkTransformation getTransformation(List<String> methodWords, Set<String> fieldNames) {
        String fieldName = WordsMatcher.findAndRemoveMatchingPiecesIfExists(fieldNames, methodWords);
        String filterName = WordsMatcher.findAndRemoveMatchingPiecesIfExists(filterTransformationMap.keySet(), methodWords);
        filterTransformationMap.get(filterName);
        return filterTransformationMap.get(filterName);
    }
}
