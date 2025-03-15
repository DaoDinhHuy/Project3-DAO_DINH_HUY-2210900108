package com.project.shopapp.models;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shopapp_roles")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;
}