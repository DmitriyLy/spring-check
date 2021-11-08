package net.dmly.springdatabuilder.unsafe_starter;

import org.apache.spark.sql.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstLevelCacheService {

    private Map<Class<?>, Dataset<Row>> model2DataSet = new HashMap<>();

    @Autowired
    private DataExtractorResolver extractorResolver;

    public List readDataFor(long ownerId, Class<?> modelClass, String pathToSource, String foreignKey,  ConfigurableApplicationContext context) {
        if (!model2DataSet.containsKey(modelClass)) {
            DataExtractor extractor = extractorResolver.resolve(pathToSource);
            Dataset<Row> dataset = extractor.load(pathToSource, context);
            dataset.persist();
        }

        Encoder<?> encoder = Encoders.bean(modelClass);

        return model2DataSet.get(modelClass)
                .filter(functions.col(foreignKey).equalTo(ownerId))
                .as(encoder).collectAsList();
    }
}
