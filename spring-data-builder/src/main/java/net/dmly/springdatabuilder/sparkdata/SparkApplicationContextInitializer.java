package net.dmly.springdatabuilder.sparkdata;

import org.apache.spark.sql.SparkSession;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class SparkApplicationContextInitializer implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext context) {
        registerSparkBeans(context);
    }

    private void registerSparkBeans(ConfigurableApplicationContext context) {
        String appName = context.getEnvironment().getProperty("spark.app-name");
        SparkSession sparkSession = SparkSession.builder().appName(appName).master("local[*]").getOrCreate();
    }
}
