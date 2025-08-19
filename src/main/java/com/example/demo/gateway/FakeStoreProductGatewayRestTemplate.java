package com.example.demo.gateway;

import com.example.demo.dto.FakeStoreProductResponseDto;
import com.example.demo.dto.FakeStoreProductsOfCategoryResponseDto;
import com.example.demo.gateway.Api.FakeStoreProductsAPIRestTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Qualifier("fakeStoreProductGatewayRestTemplate")
public class FakeStoreProductGatewayRestTemplate implements IProductGateway{
    private final FakeStoreProductsAPIRestTemplate fakeStoreProductsAPIRestTemplate;

    public FakeStoreProductGatewayRestTemplate(FakeStoreProductsAPIRestTemplate _fakeStoreProductsAPIRestTemplate){
        this.fakeStoreProductsAPIRestTemplate = _fakeStoreProductsAPIRestTemplate;
    }

    @Override
    public FakeStoreProductResponseDto getProductById(long ProductId) throws IOException {
        return fakeStoreProductsAPIRestTemplate.getProductById(ProductId);
    }

    @Override
    public FakeStoreProductsOfCategoryResponseDto getProductsByCategory(String categoryType) throws IOException {
        return null;
    }
}
