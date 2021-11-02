package net.dmly.springdatabuilder.unsafe_starter;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

public interface Finalizer {
    Object doAction(Dataset<Row> dataset, Class<?> model);
}
