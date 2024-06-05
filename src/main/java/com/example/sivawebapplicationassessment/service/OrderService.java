package com.example.sivawebapplicationassessment.service;

import com.example.sivawebapplicationassessment.entity.*;
import com.example.sivawebapplicationassessment.repository.LoginRepository;
import com.example.sivawebapplicationassessment.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void order(OrderDTO orderDto) throws Exception {
        OrderEntity orderEntity = new OrderEntity();
        ProductEntity productEntity = new ProductEntity();
        productEntity.setProductId(orderDto.getProductId());
        orderEntity.setProduct(productEntity);
        orderEntity.setQuantity(orderDto.getQuantity());
        orderEntity.setSize(orderDto.getSize());
        orderEntity.setStatus("Pending");

        orderRepository.save(orderEntity);
    }

    public List<OrderEntity> getAllOrdersWithProducts() {
        return orderRepository.findAllOrdersWithProducts();
    }

    public void updateOrderStatus(Long orderId, String status) {
        OrderEntity order = orderRepository.findById(orderId).orElse(null);
        System.out.println(order.getOrderId() + " " + order.getStatus());
        if (order != null) {
            order.setStatus(status);
            orderRepository.save(order);
        }
    }

    public void deleteOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }
}
