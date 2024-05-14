package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Car {
    private String label;
    private String color;
    private int price;
    private int age;

    public Car(String label, int price) {
        this.label = label;
        this.price = price;
    }
}
