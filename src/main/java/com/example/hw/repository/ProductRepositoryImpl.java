package com.example.hw.repository;

import com.example.hw.POJO.Product;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private static final AtomicLong autoId = new AtomicLong(0);
    private static final Map<Long, Product> productMap = new HashMap<>();

    static {
        Product meat = new Product(autoId.getAndIncrement(), "Meat", 756.5);
        Product sausages = new Product(autoId.getAndIncrement(), "Sausages", 365.2);
        Product bread = new Product(autoId.getAndIncrement(), "Bread", 27.0);
        Product banana = new Product(autoId.getAndIncrement(), "Banana", 54.1);
        Product cocaCola = new Product(autoId.getAndIncrement(), "Coca-cola", 125.0);
        productMap.put(meat.getId(), meat);
        productMap.put(sausages.getId(), sausages);
        productMap.put(bread.getId(), bread);
        productMap.put(bread.getId(), banana);
        productMap.put(cocaCola.getId(), cocaCola);
    }

    @Override
    public List<Product> productAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public Product findProductById(Long id) {
        return productMap.get(id);
    }

    @Override
    public void addProduct(Product product) {
        product.setId(autoId.getAndIncrement());
        productMap.put(product.getId(), product);
    }
}
