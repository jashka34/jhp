package jashka.jhp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Table(name = "usr")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class User {

    public User() {}
    public User(Integer id, String username, String password, String email, String activationCode) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.activationCode = activationCode;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank(message = "Username cannot be empty")
    private String username;

    @NotBlank(message = "Password cannot be empty")
    private String password;
     private boolean active;

    @Email(message = "Email is not correct")
    @NotBlank(message = "Email cannot be empty")
    private String email;

    private String activationCode;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getActivationCode() {
        return activationCode;
    }
}
