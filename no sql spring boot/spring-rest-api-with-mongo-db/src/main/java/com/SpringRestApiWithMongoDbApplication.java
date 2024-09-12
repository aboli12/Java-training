package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EnableMongoRepositories(basePackages = "com.repository")
public class SpringRestApiWithMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiWithMongoDbApplication.class, args);
		System.out.println("spring boot with mongo db ");
	}

}