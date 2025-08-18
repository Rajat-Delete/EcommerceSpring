package com.example.demo.controllers;

import com.example.demo.dto.Category;
import com.example.demo.dto.CategoryDto;
import com.example.demo.dto.FakeStoreProductResponseDto;
import com.example.demo.dto.ProductDto;
import com.example.demo.services.ICategoryService;
import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api")
public class CategoryController {

    private ICategoryService categoryService;

    public CategoryController(ICategoryService _categoryService){
        this.categoryService = _categoryService;
    }

    @GetMapping("/categories")
    public List<CategoryDto> getAllCategories() throws IOException {
        return categoryService.getAllCategories();
    }

    @GetMapping("/products/category/")
    public List<ProductDto> getAllCategoryOfSameType() throws IOException{
        return categoryService.getAllCategoryOfType();
    }

    @GetMapping("/product")
    public FakeStoreProductResponseDto getProductById() throws IOException{
        return categoryService.getCategoryById();
    }

}
