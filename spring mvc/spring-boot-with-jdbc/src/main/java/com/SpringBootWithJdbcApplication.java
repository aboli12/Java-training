package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringBootWithJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithJdbcApplication.class, args);
		System.out.println("spring boot up");
	}

}
