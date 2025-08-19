package com.example.demo.gateway.Api;

import com.example.demo.dto.*;
import retrofit2.Call;
import retrofit2.http.GET;

import java.io.IOException;

public interface FakeStoreCategoryApi {

    @GET("products/category")
    Call<FakeStoreCategoryResponseDto> getAllCategories() throws IOException;

}
