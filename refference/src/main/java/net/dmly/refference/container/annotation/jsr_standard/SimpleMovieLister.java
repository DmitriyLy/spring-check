package net.dmly.refference.container.annotation.jsr_standard;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.inject.Inject;

@ManagedBean("movieListener")
public class SimpleMovieLister {
    private MovieProvider movieProvider;

    @Inject
    public void setMovieProvider(MovieProvider movieProvider) {
        this.movieProvider = movieProvider;
    }

    @PostConstruct
    public void init() {
        System.out.println(String.format("SimpleMovieLister > movieProvider#provide: %s", movieProvider.provide()));
    }
}
