package net.dmly.springdatabuilder.sparkdata;

import net.dmly.springdatabuilder.unsafe_starter.SparkRepository;

import java.util.List;

public interface SpeakerRepo extends SparkRepository<Speaker> {

    List<Speaker> findByAgeBetween(int min, int max);
    List<Speaker> findByAgeGreaterThan(int min);
    Long findByAgeGreaterThanCount(int min);

}
