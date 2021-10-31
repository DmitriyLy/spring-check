package net.dmly.springdatabuilder.starter;

import java.util.Map;

public class DataExtractorResolver {

    private Map<String, DataExtractor> dataExtractorMap;

    DataExtractor resolve(String pathToData) {
        String fileExtension = pathToData.split("\\.")[1];
        return dataExtractorMap.get(fileExtension);
    }
}
