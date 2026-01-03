package ru.fedorenko.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

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
