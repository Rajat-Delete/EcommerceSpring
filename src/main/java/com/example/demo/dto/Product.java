package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    int id;
    String title;
    String image;
    int price;
    String description;
    String brand;
    String model;
    String color;
    String category;
    String popular;
    int discount;
}
