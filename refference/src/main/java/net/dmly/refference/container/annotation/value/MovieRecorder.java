package net.dmly.refference.container.annotation.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("valueMovieRecorder")
public class MovieRecorder {

    private final String catalog;

    @Value("#{systemProperties['user.dir']}")
    private String systemCatalog;

    public MovieRecorder(@Value("${catalog.name}") String catalog) {
        this.catalog = catalog;
    }

    @PostConstruct
    public void init() {
        System.out.println(String.format("MovieRecorder>\n catalog: %s\n systemCatalog: %s", catalog, systemCatalog));
    }
}
