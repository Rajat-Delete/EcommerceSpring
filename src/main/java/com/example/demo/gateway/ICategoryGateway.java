package com.example.demo.gateway;

import com.example.demo.dto.CategoryDto;

import java.io.IOException;
import java.util.List;

public interface ICategoryGateway {

    List<CategoryDto> getAllCategory() throws IOException;
}
