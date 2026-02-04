package ru.fedorenko.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users")
@NamedQueries({
        @NamedQuery(name = "findAllUsers", query = "Select u from User u"),
        @NamedQuery(name = "countAllUsers", query = "Select count(u) from User u"),
        @NamedQuery(name = "deleteUserById", query = "delete from User u where u.id = :id")
})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @OneToMany(mappedBy = "user",
    cascade = {CascadeType.PERSIST,  CascadeType.REMOVE, CascadeType.MERGE},
    orphanRemoval = true)
    private List<Contact> contacts;

    @Column(nullable = false, length = 1024)
    private String password;

    @OneToOne(mappedBy = "user",
            cascade = {CascadeType.PERSIST,  CascadeType.REMOVE, CascadeType.MERGE},
     orphanRemoval = true)
    private Customer customer;

    @Embedded
    @AttributeOverride(name = "another", column = @Column(name = "issuedDate"))
    private Passport passport;

    @ManyToMany(mappedBy = "users")
    private List<Role> roles;


    public User(String username, List<Contact> contacts, String password) {
        this.username = username;
        this.contacts = contacts;
        this.password = password;
    }
}
