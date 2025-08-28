package com.example.demo.services;

import com.example.demo.dto.FakeStoreProductResponseDto;
import com.example.demo.dto.FakeStoreProductsOfCategoryResponseDto;
import com.example.demo.dto.Product;
import com.example.demo.dto.ProductRequestDTO;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ProductService  implements IProductService{
    @Override
    public FakeStoreProductResponseDto getProductById(long id) throws IOException {
        return null;
    }

    @Override
    public FakeStoreProductsOfCategoryResponseDto getProductsOfCategoryType(String categoryType) throws IOException {
        return null;
    }

    @Override
    public Product createProduct(ProductRequestDTO productRequestDTO) {

    }
}
