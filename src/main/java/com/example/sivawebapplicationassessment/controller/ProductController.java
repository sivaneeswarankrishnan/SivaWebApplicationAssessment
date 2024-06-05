package com.example.sivawebapplicationassessment.controller;

import com.example.sivawebapplicationassessment.entity.OrderDTO;
import com.example.sivawebapplicationassessment.entity.ProductEntity;
import com.example.sivawebapplicationassessment.entity.RegistrationDTO;
import com.example.sivawebapplicationassessment.service.OrderService;
import com.example.sivawebapplicationassessment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService; // Inject your product service

    @Autowired
    private OrderService orderService;

    @GetMapping("/product-listing")
    public String getProducts(Model model) {
        List<ProductEntity> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "product-listing"; // Name of your Thymeleaf template
    }

    @GetMapping("/product/{id}")
    public String getProductById(@PathVariable Long id, Model model) {
        ProductEntity product = productService.getProductById(id);
        if (product == null) {
            return "product-not-found"; // Create a template for product not found
        }
        model.addAttribute("product", product);
        return "product"; // Name of your Thymeleaf template
    }

    @PostMapping("/order")
    public String order(@ModelAttribute OrderDTO orderDto, Model model) {
        System.out.println("here");
        try {
            orderService.order(orderDto);
            return "redirect:/product-listing";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "";
        }
    }

}
