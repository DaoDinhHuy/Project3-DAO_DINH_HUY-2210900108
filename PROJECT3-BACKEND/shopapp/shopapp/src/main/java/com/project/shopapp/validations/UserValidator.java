package com.project.shopapp.validations;

import com.yourpackage.shopapp.dtos.OrderDTO;
import org.springframework.stereotype.Component;

@Component
public class OrderValidator {
    public boolean validateOrder(OrderDTO orderDTO) {
        if (orderDTO.getFullName() == null || orderDTO.getFullName().trim().isEmpty()) {
            return false;
        }
        if (orderDTO.getTotalMoney() == null || orderDTO.getTotalMoney() < 0) {
            return false;
        }
        return true;
    }
}