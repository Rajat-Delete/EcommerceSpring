package com.example.demo.gateway;

import com.example.demo.dto.CategoryDto;
import com.example.demo.dto.FakeStoreCategoryResponseDto;
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
}
