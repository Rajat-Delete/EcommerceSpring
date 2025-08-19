package com.example.demo.gateway.Api;

import com.example.demo.dto.OKhttpUserResponseDto;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class OkHttpUsersApi {

    OkHttpClient okHttpClient;
    @Autowired
    private Environment env;

    public OkHttpUsersApi(OkHttpClient _okHttpClient){
        this.okHttpClient = _okHttpClient;
    }

    public OKhttpUserResponseDto getAllUsers() throws IOException{
        Request request = new Request.Builder().url(env.getProperty("fakestore_url") + "users").build();

        try (Response response = okHttpClient.newCall(request).execute()){
            if (!response.isSuccessful() || response.body() == null) {
                throw new IOException("Unable to fetch Response");
            }
            //System.out.println("All users Data"+response.body().string());
            OKhttpUserResponseDto responseDto = new Gson().fromJson(response.body().string(), OKhttpUserResponseDto.class);
            return responseDto;
        }

    }
}
