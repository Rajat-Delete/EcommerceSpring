package com.example.demo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @GetMapping
    public String getCategory(){
        return "Category Fectched";
    }

    @PostMapping
    public String postCategory(){
        return "Posted a Category";
    }

    @GetMapping("/count")
    public Integer getCategoryCount(){
        return 5;
    }
}
