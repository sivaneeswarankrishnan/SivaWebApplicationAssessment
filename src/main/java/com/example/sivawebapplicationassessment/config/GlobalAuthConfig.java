package com.example.sivawebapplicationassessment.config;

import com.example.sivawebapplicationassessment.service.CustomLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableGlobalAuthentication
public class GlobalAuthConfig {

    @Autowired
    private CustomLoginService customLoginService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customLoginService).passwordEncoder(passwordEncoder);
    }
}

