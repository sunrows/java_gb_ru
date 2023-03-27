package org.example.homework_3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Goods {
    private String name;
    private int price; //можно и double но так проще
    private int sort;

    private int weight;
    private String country;

}
