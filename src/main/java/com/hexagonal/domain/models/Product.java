package com.hexagonal.domain.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product {

    private Integer id;
    private String name;
    private String price;
}
