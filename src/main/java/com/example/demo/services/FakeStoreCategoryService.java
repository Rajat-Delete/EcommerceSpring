package com.example.demo.services;


import com.example.demo.dto.Category;
import com.example.demo.dto.CategoryDto;
import com.example.demo.dto.FakeStoreProductResponseDto;
import com.example.demo.dto.ProductDto;
import com.example.demo.gateway.ICategoryGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class FakeStoreCategoryService implements ICategoryService{

    private final ICategoryGateway categoryGateway;

    public FakeStoreCategoryService(ICategoryGateway categoryGateway){
        this.categoryGateway = categoryGateway;
    }

    @Override
    public List<CategoryDto> getAllCategories() throws IOException {
        return categoryGateway.getAllCategory();
    }

    @Override
    public List<ProductDto> getAllCategoryOfType() throws IOException {
        return categoryGateway.getAllCategoryOfType();
    }

    @Override
    public FakeStoreProductResponseDto getCategoryById() throws IOException {
        return categoryGateway.getCategoryById();
    }


}
