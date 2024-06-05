package com.example.sivawebapplicationassessment.controller;

import com.example.sivawebapplicationassessment.entity.OrderEntity;
import com.example.sivawebapplicationassessment.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/admin_homepage")
    public String getAllOrders(Model model) {
        List<OrderEntity> orders = orderService.getAllOrdersWithProducts();
        model.addAttribute("orders", orders);
        return "admin_homepage"; // Assuming your Thymeleaf template is named admin_homepage.html
    }

    @PutMapping("/admin_homepage/{id}")
    public String updateOrderStatus(@PathVariable Long id) {
        orderService.updateOrderStatus(id, "Done");
        return "admin_homepage";
    }

    @DeleteMapping("/admin_homepage/{id}")
    public String deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return "admin_homepage";
    }
}
