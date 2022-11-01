package by.trucking.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "role_id")
    private Role role;

    public User(int id) {
        this.id = id;
    }
    public User(int id, String password) {
        this.id = id;
        this.password = password;
    }

   //constructor for UserCreate
    public User(String login, String password, Role role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }
    public User(String login, String password) {
        this.login = login;
        this.password = password;

    }
}
