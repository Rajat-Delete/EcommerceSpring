package com.example.demo.controllers;

import com.example.demo.dto.CategoryDto;
import com.example.demo.services.ICategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/categories")
public class CategoryController {

    private ICategoryService categoryService;

    public CategoryController(ICategoryService _categoryService){
        this.categoryService = _categoryService;
    }

    @GetMapping
    public List<CategoryDto> getAllCategories() throws IOException {
        return categoryService.getAllCategories();
    }


}
