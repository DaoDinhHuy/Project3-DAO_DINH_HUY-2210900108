package com.project.shopapp.repositories;

import com.yourpackage.shopapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}