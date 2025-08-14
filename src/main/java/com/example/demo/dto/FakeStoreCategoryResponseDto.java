package com.example.demo.dto;


import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FakeStoreCategoryResponseDto {
    Boolean status;
    String message;
    List<String> categories;
}
