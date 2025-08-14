package com.example.demo.services;
import com.example.demo.dto.CategoryDto;

import java.io.IOException;
import java.util.List;


public interface ICategoryService {

    List<CategoryDto> getAllCategories() throws IOException;
}
