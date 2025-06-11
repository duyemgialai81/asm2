package com.example.asmn2java5.Entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "Account")
@Data
public class Account {
    @Id
    private String username;

    private String password;

    private String fullname;

    private String email;

    private String role; // USER, ADMIN

    private Boolean activated;
}
