package com.example.asmn2java5.Entity;
import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDate;

@Entity
@Table(name = "Orders")
@Data
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate createDate;

    private String address;

    @ManyToOne
    @JoinColumn(name = "Username")
    private Account account;
}
