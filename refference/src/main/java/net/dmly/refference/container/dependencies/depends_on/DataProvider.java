package net.dmly.refference.container.dependencies.depends_on;

import java.util.Map;

public class DataProvider {
    private final Map<Long, String> cache;

    public DataProvider(Map<Long, String> cache) {
        this.cache = cache;
    }

    public String getEntryById(Long id) {
        return  cache.get(id);
    }
}
