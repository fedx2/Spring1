package ru.fedorenko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.fedorenko.persist.User;
import ru.fedorenko.persist.UserRepository;

import javax.annotation.PostConstruct;

@Service
public class UserService {

    private UserRepository userRepository;

    @PostConstruct
    private void init() {
        System.out.println("Метод отработал");
    }

    public void insert(User user) {
        if (user.getRole().equals("ADMIN") || user.getRole().equals("GUEST")) {
            this.userRepository.insert(user);
        } else {
            throw new IllegalArgumentException("Incorrect role");
        }
    }
    @Autowired
    @Qualifier("repositoryFirst")
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public int findAll() {
        return this.userRepository.findAll().size();
    }
}