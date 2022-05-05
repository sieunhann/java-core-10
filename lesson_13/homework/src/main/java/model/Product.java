package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product {
    private int id;
    private String name;
    private String description;
    private long price;
    private int quantity;
    private int number;
    private String company;
    private Enum[] category;

    @Override
    public String toString() {
        return  "id: " + id +
                ", name: " + name +
                ", description: " + description +
                ", price: " + price +
                ", quantity: " + quantity +
                ", number: " + number +
                ", company: " + company +
                ", category: " + Arrays.toString(category);
    }
}
