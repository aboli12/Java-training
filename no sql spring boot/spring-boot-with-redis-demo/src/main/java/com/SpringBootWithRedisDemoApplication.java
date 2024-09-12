package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringBootWithRedisDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithRedisDemoApplication.class, args);
		System.out.println("redis spring boot up!");
	}

}