package com.example.sivawebapplicationassessment.repository;

import com.example.sivawebapplicationassessment.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {


    @Query("SELECT o FROM OrderEntity o JOIN FETCH o.product")
    List<OrderEntity> findAllOrdersWithProducts();
}
