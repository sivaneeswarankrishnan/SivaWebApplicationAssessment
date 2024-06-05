package com.example.sivawebapplicationassessment.config;

import com.example.sivawebapplicationassessment.service.CustomLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private CustomLoginService customLoginService;

    @Autowired
    private CustomSuccessHandler customSuccessHandler;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers ("/header").permitAll() // Allow access to the homepage
                                .requestMatchers ("/index","/login").anonymous()// Only unauthenticated users can access the login page
                                .requestMatchers ("/register").anonymous()
                                .requestMatchers("/admin_homepage","admin_homepage/{id}").hasRole("ADMIN") // Admin can access
                                .requestMatchers("/product-listing","/product","/product/{id}").hasRole("USER") // USer can access
                                .anyRequest().permitAll()// All other requests require authentication
                )
                .formLogin(formLogin ->
                        formLogin
                                .loginPage("/login")
                                .successHandler(customSuccessHandler) // Use custom success handler
                                .permitAll()
                )
                .logout(logout ->
                        logout
                                .logoutUrl("/logout")
                                .logoutSuccessUrl("/index")
                                .permitAll() // Logout functionality should be accessible by authenticated users
                );

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}


