package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity(name = "Product")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseEntity{
    private String image;
    private String color;
    private int price;
    private String description;
    private int discount;
    private String model;
    private String title;
    private String category;
    private String brand;
    private boolean popular;
}
