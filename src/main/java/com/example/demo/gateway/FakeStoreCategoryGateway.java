package com.example.demo.gateway;

import com.example.demo.dto.*;
import com.example.demo.gateway.Api.FakeStoreCategoryApi;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway{

    private final FakeStoreCategoryApi fakeStoreCategoryApi;

    public FakeStoreCategoryGateway(FakeStoreCategoryApi fakeStoreCategoryApi){
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
