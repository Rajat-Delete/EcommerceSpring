package com.example.demo.services;

import com.example.demo.dto.FakeStoreProductResponseDto;
import com.example.demo.dto.FakeStoreProductsOfCategoryResponseDto;
import com.example.demo.gateway.IProductGateway;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class FakeStoreProductService implements IProductService{

    private final IProductGateway productGateway;

    public FakeStoreProductService(IProductGateway _productGateway){
        this.productGateway = _productGateway;
    }
    @Override
    public FakeStoreProductResponseDto getProductById(long id) throws IOException {
        return productGateway.getProductById(id);
    }

    @Override
    public FakeStoreProductsOfCategoryResponseDto getProductsOfCategoryType(String categoryType) throws IOException {
        return productGateway.getProductsByCategory(categoryType);
    }
}
