package net.dmly.springdatabuilder.unsafe_starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class DataExtractorResolver {

    @Autowired
    private Map<String, DataExtractor> dataExtractorMap;

    DataExtractor resolve(String pathToData) {
        String fileExtension = pathToData.split("\\.")[1];
        return dataExtractorMap.get(fileExtension);
    }
}
