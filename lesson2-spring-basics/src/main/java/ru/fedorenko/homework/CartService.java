package ru.fedorenko.homework;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("prototype")
@RequiredArgsConstructor
public class CartService {

    private final Cart cart;
    private final ProductRepository productRepository;

    public void addProductToCart(Long id) {
        Product product = productRepository.findProductById(id);
        cart.add(product);
    }

    public void removeProductFromCart(Long productid) {
        Product product = productRepository.findProductById(productid);
        cart.remove(product);
    }

    public List<Product> getCartProducts() {
        return cart.getAllProducts();
    }

    }
