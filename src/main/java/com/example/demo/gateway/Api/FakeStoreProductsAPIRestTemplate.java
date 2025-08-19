package com.example.demo.gateway.Api;

import com.example.demo.dto.FakeStoreProductResponseDto;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class FakeStoreProductsAPIRestTemplate {
    private final RestTemplate restTemplate;
    private final Environment env;


    public FakeStoreProductsAPIRestTemplate(RestTemplate _restTemplate, Environment env) {
        this.restTemplate = _restTemplate;
        this.env = env;
    }

    public FakeStoreProductResponseDto getProductById(long ProductId) throws IOException {
        String resourceUrl = env.getProperty("fakestore_url") + "products/"+ ProductId;
        return restTemplate.getForEntity(resourceUrl, FakeStoreProductResponseDto.class).getBody();
    }
}
