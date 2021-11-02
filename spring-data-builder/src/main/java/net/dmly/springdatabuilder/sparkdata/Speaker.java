package net.dmly.springdatabuilder.sparkdata;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.dmly.springdatabuilder.unsafe_starter.Source;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Source("data/speakers.json")
public class Speaker {
    private String name;
    private int age;
}
