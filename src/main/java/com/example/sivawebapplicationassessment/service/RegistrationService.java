package com.example.sivawebapplicationassessment.service;

import com.example.sivawebapplicationassessment.entity.LoginEntity;
import com.example.sivawebapplicationassessment.entity.RegistrationDTO;
import com.example.sivawebapplicationassessment.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registerUser(RegistrationDTO registrationDto) throws Exception {
        if (loginRepository.findByUsername(registrationDto.getUsername()) != null) {
            throw new Exception("User already exists");
        }
        if (!registrationDto.getPassword().equals(registrationDto.getConfirmPassword())) {
            throw new Exception("Passwords do not match");
        }
        System.out.println(registrationDto);
        LoginEntity user = new LoginEntity();
        user.setUsername(registrationDto.getUsername());
        user.setPassword(passwordEncoder.encode(registrationDto.getPassword()));
        user.setEmail(registrationDto.getEmail());
        user.setRole("USER");

        loginRepository.save(user);
    }
}
