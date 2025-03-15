package com.project.shopapp.repositories;
import com.yourpackage.shopapp.models.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {
}