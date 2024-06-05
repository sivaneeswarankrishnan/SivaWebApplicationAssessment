package com.example.sivawebapplicationassessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.sivawebapplicationassessment.repository")
@EntityScan(basePackages = "com.example.sivawebapplicationassessment.entity")
public class SivaFootballKitSellingWebsite {

	public static void main(String[] args) {
		SpringApplication.run(SivaFootballKitSellingWebsite.class, args);
	}

}
