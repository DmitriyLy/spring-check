package net.dmly.springdatabuilder.sparkdata;

import net.dmly.springdatabuilder.unsafe_starter.SparkRepository;

import java.util.List;

public interface CriminalRepo extends SparkRepository<Criminal> {
    List<Criminal> findByNumberGreaterThanOrderByNumber(int min);
    long findByNameContainsCount(String s);
    List<Criminal> findByNameContains(String s);
}
