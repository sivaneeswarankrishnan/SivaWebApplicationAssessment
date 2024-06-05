package com.example.sivawebapplicationassessment.repository;

import com.example.sivawebapplicationassessment.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
    List<ProductEntity> findAll();

    @Override
    ProductEntity getById(Long aLong);
}
