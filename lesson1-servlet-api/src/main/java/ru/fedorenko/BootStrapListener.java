package ru.fedorenko;

import ru.fedorenko.persist.User;
import ru.fedorenko.persist.UserRepository;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class BootStrapListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        UserRepository userRepository = new UserRepository();
        userRepository.insert(new User("Vladimir"));
        userRepository.insert(new User("Anastasia"));
        userRepository.insert(new User("Evgeniy"));
        sce.getServletContext().setAttribute("UserRepository", userRepository);
    }
}
