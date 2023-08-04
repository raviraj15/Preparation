package com.CompanyRating;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CompanyRatingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyRatingApplication.class, args);
	}

}
