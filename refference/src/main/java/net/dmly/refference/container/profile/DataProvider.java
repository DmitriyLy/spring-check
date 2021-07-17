package net.dmly.refference.container.profile;

public class DataProvider {
    private final String data;

    public DataProvider(String data) {
        this.data = data;
    }

    public String provide() {
        return data;
    }
}
