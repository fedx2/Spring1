package ru.fedorenko.homework;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final Map<Long, Product> productMap = new HashMap<>();

    @PostConstruct
    public void init() {
        addProduct(1L, new Product(1L, "productName1"));
        addProduct(2L, new Product(2L, "productName2"));
        addProduct(3L, new Product(3L, "productName3"));
        addProduct(4L, new Product(4L, "productName4"));
        addProduct(5L, new Product(5L, "productName5"));
    }

    @Override
    public Product findProductById(Long id) {
        return productMap.get(id);
    }

    @Override
    public void addProduct(Long id, Product product) {
        productMap.put(id, product);
    }
}
