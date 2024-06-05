package com.example.sivawebapplicationassessment.repository;

import com.example.sivawebapplicationassessment.entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<LoginEntity, Long> {
    LoginEntity findByUsername(String username);
}
