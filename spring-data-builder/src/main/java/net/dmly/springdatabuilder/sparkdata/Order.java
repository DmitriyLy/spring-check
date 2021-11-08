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
@Source("data/orders.csv")
public class Order {
    private long id;
    private String name;
    private String desc;
    private int price;
    private long criminalId;
}
