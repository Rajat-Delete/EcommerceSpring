package com.example.demo.services;

import com.example.demo.dto.FakeStoreProductResponseDto;
import com.example.demo.dto.FakeStoreProductsOfCategoryResponseDto;

import java.io.IOException;

public interface IProductService {

    public FakeStoreProductResponseDto getProductById(long id) throws IOException;

    public FakeStoreProductsOfCategoryResponseDto getProductsOfCategoryType(String categoryType) throws IOException;
}
