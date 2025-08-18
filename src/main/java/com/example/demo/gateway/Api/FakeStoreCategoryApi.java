package com.example.demo.gateway.Api;

import com.example.demo.dto.*;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;

public interface FakeStoreCategoryApi {

    @GET("products/category")
    Call<FakeStoreCategoryResponseDto> getAllCategories() throws IOException;

    @GET("products/category?type=mobile")
    Call<FakeStoreAllCategory> getAllCategoryOfType() throws IOException;

    @GET("products/2")
    Call<FakeStoreProductResponseDto> getCategoryById() throws IOException;
}
