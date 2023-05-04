package com.example.hw.repository;

import com.example.hw.POJO.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> productAll();
    Product findProductById(Long id);
    void addProduct(Product product);
}
