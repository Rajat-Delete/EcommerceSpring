package com.example.demo.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FakeStoreProductsOfCategoryResponseDto {
    boolean status;
    String message;
    List<Category> products;
}
