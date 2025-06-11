package com.example.asmn2java5.Entity;
import jakarta.persistence.*;
import lombok.Data;import jakarta.persistence.*;
import lombok.Data;
@Entity
@Table(name = "CartItem")
@Data
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "Username")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "ProductId")
    private Product product;

    private Integer quantity;
}
