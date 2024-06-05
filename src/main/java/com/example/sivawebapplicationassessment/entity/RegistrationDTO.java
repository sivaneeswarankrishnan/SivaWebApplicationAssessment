package com.example.sivawebapplicationassessment.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class RegistrationDTO {

    private String username;
    private String password;
    private String email;
    private String confirmPassword;

    // Getters and setters
}
