package net.dmly.springdatabuilder.sparkdata;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.dmly.springdatabuilder.unsafe_starter.Source;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Source("data/criminals.csv")
public class Criminal {
    private long id;
    private String name;
    private long number;

    private List<Order> orders;
}
