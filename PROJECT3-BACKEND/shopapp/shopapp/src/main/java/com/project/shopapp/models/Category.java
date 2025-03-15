package com.project.shopapp.models;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shopapp_categories")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100)
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products;
}