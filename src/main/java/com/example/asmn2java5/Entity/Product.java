package com.example.asmn2java5.Entity;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "Product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private BigDecimal price;

    private String image;

    private Boolean available;

    @ManyToOne
    @JoinColumn(name = "CategoryId")
    private Category category;
}
