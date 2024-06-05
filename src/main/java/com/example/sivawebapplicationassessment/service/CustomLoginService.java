package com.example.sivawebapplicationassessment.service;

import com.example.sivawebapplicationassessment.entity.LoginEntity;
import com.example.sivawebapplicationassessment.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomLoginService implements UserDetailsService{

    @Autowired
    private LoginRepository loginRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Fetch the user from the database using the repository
        LoginEntity user = loginRepository.findByUsername(username);

        // If the user is not found, throw an exception
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        // Return the user details
        return User.withUsername(user.getUsername())
                .password(user.getPassword())
                .roles(user.getRole())
                .build();
    }
}
