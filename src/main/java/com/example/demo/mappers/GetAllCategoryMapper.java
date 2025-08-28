package com.example.demo.mappers;

import com.example.demo.dto.CategoryDto;
import com.example.demo.dto.FakeStoreCategoryResponseDto;
import java.util.List;

public class GetAllCategoryMapper {

    public static List<CategoryDto> toCategoryDTO(FakeStoreCategoryResponseDto fakeStoreCategoryResponseDto){
        return fakeStoreCategoryResponseDto.getCategories()
                .stream().map(category ->
                        CategoryDto.builder().category(category).build())
                .toList();
    }
}
