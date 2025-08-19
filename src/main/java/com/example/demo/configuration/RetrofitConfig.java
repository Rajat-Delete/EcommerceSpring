package com.example.demo.configuration;


import com.example.demo.gateway.Api.FakeStoreCategoryApi;
import com.example.demo.gateway.Api.FakeStoreProductApi;
import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Configuration
public class RetrofitConfig {
    @Autowired
    private Environment env;

    @Bean
    public Retrofit retrofit(){
        return new Retrofit.Builder()
                .baseUrl(env.getProperty("fakestore_url"))
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    @Bean
    public FakeStoreCategoryApi fakeStoreCategoryApi(Retrofit retrofit){
        return retrofit.create(FakeStoreCategoryApi.class);
    }

    @Bean
    public FakeStoreProductApi fakeStoreProductApi(Retrofit retrofit){
        return retrofit.create(FakeStoreProductApi.class);
    }
}
