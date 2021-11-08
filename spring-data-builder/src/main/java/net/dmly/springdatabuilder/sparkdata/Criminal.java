package net.dmly.springdatabuilder.sparkdata;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.dmly.springdatabuilder.unsafe_starter.ForeignKey;
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

    @ForeignKey("criminalId")
    private List<Order> orders;
}
