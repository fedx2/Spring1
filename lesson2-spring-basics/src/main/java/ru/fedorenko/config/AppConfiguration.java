package ru.fedorenko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.fedorenko.Cart;
import ru.fedorenko.UserService;
import ru.fedorenko.persist.UserRepository;
import ru.fedorenko.persist.UserRepositoryImpl;

@Configuration
@ComponentScan("ru.fedorenko")
public class AppConfiguration {

    /*@Bean
    public UserRepository userRepository() {
        return new UserRepositoryImpl();
    }

    @Bean
    public UserService userService(UserRepository userRepository) {
        return new UserService(userRepository);
    }

    @Bean
    @Scope("prototype")
    public Cart cart() {
        return new Cart();
    }*/
}
