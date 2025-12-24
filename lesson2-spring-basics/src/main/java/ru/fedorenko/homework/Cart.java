package ru.fedorenko.homework;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@Scope("prototype")
public class Cart {
    private Set<Product> cart = new HashSet<>();

    public void add(Product product) {
        cart.add(product);
    }
    public void remove(Product product) {
        cart.remove(product);
    }
    public List<Product> getAllProducts() {
        return new ArrayList<>(cart);
    }
}
