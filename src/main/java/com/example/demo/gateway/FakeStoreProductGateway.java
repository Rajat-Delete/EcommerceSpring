package com.example.demo.gateway;

import com.example.demo.dto.FakeStoreProductResponseDto;
import com.example.demo.dto.FakeStoreProductsOfCategoryResponseDto;
import com.example.demo.gateway.Api.FakeStoreProductApi;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class FakeStoreProductGateway implements IProductGateway{
    private final FakeStoreProductApi fakeStoreProductApi;

    public FakeStoreProductGateway(FakeStoreProductApi _fakeStoreProductApi){
        this.fakeStoreProductApi = _fakeStoreProductApi;
    }

    @Override
    public FakeStoreProductResponseDto getProductById(long productId) throws IOException {
        return fakeStoreProductApi.getProductById(productId).execute().body();
    }

    public FakeStoreProductsOfCategoryResponseDto getProductsByCategory(String categoryType) throws IOException{
        System.out.println(categoryType);
        return fakeStoreProductApi.getAllProductsofCategory(categoryType).execute().body();
    }
}
