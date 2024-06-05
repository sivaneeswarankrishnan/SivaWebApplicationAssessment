package com.example.sivawebapplicationassessment.controller;

import com.example.sivawebapplicationassessment.entity.RegistrationDTO;
import com.example.sivawebapplicationassessment.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("registrationDto", new RegistrationDTO());
        return "registration";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute RegistrationDTO registrationDto, Model model) {
        try {
            registrationService.registerUser(registrationDto);
            return "redirect:/login";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "registration";
        }
    }

}
