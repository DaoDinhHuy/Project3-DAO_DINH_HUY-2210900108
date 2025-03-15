package com.project.shopapp.repositories;
import com.yourpackage.shopapp.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}