package com.project.shopapp.dtos;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private Float price;
    private String thumbnail;
    private String description;
    private Long categoryId;
}