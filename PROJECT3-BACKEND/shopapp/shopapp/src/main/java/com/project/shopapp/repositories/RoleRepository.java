package com.project.shopapp.repositories;
import com.yourpackage.shopapp.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}