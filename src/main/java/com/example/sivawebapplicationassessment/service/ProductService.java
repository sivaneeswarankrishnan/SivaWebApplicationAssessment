package com.example.sivawebapplicationassessment.service;

import com.example.sivawebapplicationassessment.entity.ProductEntity;
import com.example.sivawebapplicationassessment.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository; // Inject the ProductRepository

    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll(); // Find all products from the repository
    }

    public ProductEntity getProductById(Long id) {
        return productRepository.getById(id);
    }
}
