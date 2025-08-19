package com.example.demo.gateway;

import com.example.demo.dto.Category;
import com.example.demo.dto.CategoryDto;
import com.example.demo.dto.FakeStoreProductResponseDto;
import com.example.demo.dto.ProductDto;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {

    List<CategoryDto> getAllCategory() throws IOException;
}
