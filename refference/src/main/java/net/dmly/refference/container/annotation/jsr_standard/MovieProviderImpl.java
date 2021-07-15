package net.dmly.refference.container.annotation.jsr_standard;

import javax.inject.Named;
import java.util.List;

@Named("mainMovieProvider")
public class MovieProviderImpl implements MovieProvider {
    @Override
    public List<String> provide() {
        return List.of("movie1", "movie2", "movie3");
    }
}
