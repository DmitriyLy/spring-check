package net.dmly.refference.container.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataConsumer {

    private final DataProvider dataProvider;

    @Autowired
    public DataConsumer(@Qualifier("additionalDataProvider") DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }

    @PostConstruct
    public void init() {
        System.out.println(dataProvider.provide());
    }
}
