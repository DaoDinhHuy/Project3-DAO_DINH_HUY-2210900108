package com.project.shopapp.repositories;
import com.yourpackage.shopapp.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}