package com.example.demo.services;
import com.example.demo.dto.Category;
import com.example.demo.dto.CategoryDto;
import com.example.demo.dto.FakeStoreProductResponseDto;
import com.example.demo.dto.ProductDto;

import java.io.IOException;
import java.util.List;


public interface ICategoryService {

    List<CategoryDto> getAllCategories() throws IOException;

    List<ProductDto> getAllCategoryOfType() throws IOException;

    FakeStoreProductResponseDto getCategoryById() throws IOException;
}
