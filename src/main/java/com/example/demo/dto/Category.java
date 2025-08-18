package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    int id;
    String title;
    String image;
    String description;
    String brand;
    String model;
    String color;
    String category;
    int discount;
    boolean onSale;
}
