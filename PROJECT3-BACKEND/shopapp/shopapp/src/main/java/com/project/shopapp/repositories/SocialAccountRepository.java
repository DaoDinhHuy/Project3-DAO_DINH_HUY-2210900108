package com.project.shopapp.repositories;
import com.yourpackage.shopapp.models.SocialAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialAccountRepository extends JpaRepository<SocialAccount, Long> {
}