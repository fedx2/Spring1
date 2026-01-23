package ru.fedorenko.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users")
@ToString
@NamedQueries({
        @NamedQuery(name = "findAllUsers", query = "Select u from User u")
        @NamedQuery(name = "countAllUsers", query = "Select count(u) from User u")
        @NamedQuery(name = "deleteUserById", query = "Delete from User where u.id = :id")
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false, length = 1024)
    private String Password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        Password = password;
    }
}
