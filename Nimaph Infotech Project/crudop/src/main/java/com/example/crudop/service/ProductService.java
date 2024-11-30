package com.example.crudop.service;

import org.springframework.data.domain.Page;

import com.example.crudop.entity.Product;

public interface ProductService {
    Page<Product> getAllProducts(int page, int size);
    Product createProduct(Product product);
    Product getProductById(Long id);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}
