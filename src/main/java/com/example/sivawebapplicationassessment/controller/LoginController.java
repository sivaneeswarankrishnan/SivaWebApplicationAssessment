package com.example.sivawebapplicationassessment.controller;

import com.example.sivawebapplicationassessment.entity.LoginEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(Model model) {
        model.addAttribute("login", new LoginEntity());
        return "login";
    }

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("login", new LoginEntity());
        return "registration";
    }

    @GetMapping("/header")
    public String header() {
        return "header";
    }

}

