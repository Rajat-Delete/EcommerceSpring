package com.example.demo.controllers;

import com.example.demo.dto.FakeStoreProductResponseDto;
import com.example.demo.dto.FakeStoreProductsOfCategoryResponseDto;
import com.example.demo.dto.Product;
import com.example.demo.dto.ProductRequestDTO;
import com.example.demo.services.IProductService;
import okhttp3.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("api/products")
public class ProductController {
    private final IProductService productService;

    public ProductController(IProductService _productService){
        this.productService = _productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<FakeStoreProductResponseDto> getProductById(@PathVariable(value = "id") long productId) throws IOException {
        return ResponseEntity.ok(productService.getProductById(productId));
    }

    @GetMapping("/category")
    public ResponseEntity<FakeStoreProductsOfCategoryResponseDto> getProductsByCategoryType(@RequestParam("type") String categoryType) throws IOException{
        return ResponseEntity.ok(productService.getProductsOfCategoryType(categoryType));
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody ProductRequestDTO productRequestDTO){
        return ResponseEntity.ok(productService.createProduct(productRequestDTO));
    }
}
