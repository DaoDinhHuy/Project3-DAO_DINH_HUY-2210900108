package com.project.shopapp.models;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "shopapp_order_details")
@Data
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Float price;

    @Column(name = "number_of_products")
    private Integer numberOfProducts;

    @Column(name = "total_money")
    private Float totalMoney;

    @Column(length = 20)
    private String color;
}