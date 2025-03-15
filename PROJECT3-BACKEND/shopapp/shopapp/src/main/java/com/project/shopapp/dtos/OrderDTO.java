package com.project.shopapp.dtos;

import lombok.Data;

@Data
public class OrderDTO {
    private Long id;
    private Long userId;
    private String fullName;
    private String email;
    private String phoneNumber;
    private String address;
    private String status;
    private Float totalMoney;
}