package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SecondMicroServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondMicroServiceClientApplication.class, args);
		System.err.println("second micro service project up on port number 8080");
	}

}
