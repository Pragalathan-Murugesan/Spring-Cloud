package com.example.home_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HomeMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeMicroserviceApplication.class, args);
	}
}
