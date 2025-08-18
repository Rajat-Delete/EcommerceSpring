package com.example.demo.gateway;

import com.example.demo.dto.*;
import com.example.demo.gateway.Api.FakeStoreCategoryApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreGateway implements ICategoryGateway{

    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    public FakeStoreGateway(FakeStoreCategoryApi fakeStoreCategoryApi){
        this.fakeStoreCategoryApi = fakeStoreCategoryApi;
    }

    @Override
    public List<CategoryDto> getAllCategory() throws IOException {
        FakeStoreCategoryResponseDto responseDto = fakeStoreCategoryApi.getAllCategories().execute().body();

        return responseDto.getCategories()
                .stream().map(category ->
                        CategoryDto.builder().category(category).build())
                .toList();
    }

    @Override
    public List<ProductDto> getAllCategoryOfType() throws IOException {
        FakeStoreAllCategory fakeStoreAllCategories =  fakeStoreCategoryApi.getAllCategoryOfType().execute().body();

        return fakeStoreAllCategories.getProducts()
                .stream().map(category -> ProductDto.builder()
                        .title(category.getTitle()).build())
                .toList();
    }

    @Override
    public FakeStoreProductResponseDto getCategoryById() throws IOException {
        FakeStoreProductResponseDto category = fakeStoreCategoryApi.getCategoryById().execute().body();
        return category;
    }

}
