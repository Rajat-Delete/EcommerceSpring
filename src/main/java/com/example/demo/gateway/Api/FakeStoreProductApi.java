package com.example.demo.gateway.Api;

import com.example.demo.dto.FakeStoreProductResponseDto;
import com.example.demo.dto.FakeStoreProductsOfCategoryResponseDto;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.io.IOException;

public interface FakeStoreProductApi {

    @GET("products/{id}")
    Call<FakeStoreProductResponseDto> getProductById(@Path("id")long id) throws IOException;

    @GET("products/category")
    Call<FakeStoreProductsOfCategoryResponseDto> getAllProductsofCategory(@Query("type") String categoryType) throws IOException;
}
