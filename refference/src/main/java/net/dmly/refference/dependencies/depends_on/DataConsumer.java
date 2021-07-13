package net.dmly.refference.dependencies.depends_on;

public class DataConsumer {
    private DataProvider dataProvider;
    private String entry;

    public DataConsumer(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
        entry = dataProvider.getEntryById(1L);
        System.out.println("DataConsumer: " + entry);
    }

    public void setDataProvider(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
    }
}
