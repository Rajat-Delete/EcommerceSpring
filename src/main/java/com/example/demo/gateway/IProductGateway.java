package com.example.demo.gateway;

import com.example.demo.dto.FakeStoreProductResponseDto;
import com.example.demo.dto.FakeStoreProductsOfCategoryResponseDto;

import java.io.IOException;

public interface IProductGateway {

    public FakeStoreProductResponseDto getProductById(long ProductId) throws IOException;

    public FakeStoreProductsOfCategoryResponseDto getProductsByCategory(String categoryType) throws IOException;
}
