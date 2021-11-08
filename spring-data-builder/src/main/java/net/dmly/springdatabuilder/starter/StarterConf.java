package net.dmly.springdatabuilder.starter;

import net.dmly.springdatabuilder.unsafe_starter.FirstLevelCacheService;
import net.dmly.springdatabuilder.unsafe_starter.LazyCollectionAspectHandler;
import net.dmly.springdatabuilder.unsafe_starter.LazySparkList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class StarterConf {

    @Bean
    @Scope("prototype")
    public LazySparkList lazySparkList() {
        return new LazySparkList();
    }

    @Bean
    public FirstLevelCacheService firstLevelCacheService() {
        return new FirstLevelCacheService();
    }

    @Bean
    public LazyCollectionAspectHandler lazyCollectionAspectHandler() {
        return new LazyCollectionAspectHandler();
    }

}
