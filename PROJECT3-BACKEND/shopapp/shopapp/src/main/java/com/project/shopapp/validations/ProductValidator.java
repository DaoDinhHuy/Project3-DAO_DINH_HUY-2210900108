package com.project.shopapp.validations;

import com.yourpackage.shopapp.dtos.ProductDTO;
import org.springframework.stereotype.Component;

@Component
public class ProductValidator {
    public boolean validateProduct(ProductDTO productDTO) {
        if (productDTO.getName() == null || productDTO.getName().trim().isEmpty()) {
            return false;
        }
        if (productDTO.getPrice() == null || productDTO.getPrice() < 0) {
            return false;
        }
        return true;
    }
}