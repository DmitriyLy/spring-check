package net.dmly.springdatabuilder.unsafe_starter;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.functions;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("between")
public class BetweenTransformation implements FilterTransformation {
    @Override
    public Dataset<Row> transform(Dataset<Row> dataset, List<String> columnNames, OrderedBag<Object> args) {
        dataset.filter(functions.col(columnNames.get(0)).between(args.takeAndRemove(), args.takeAndRemove()));
        return null;
    }
}
