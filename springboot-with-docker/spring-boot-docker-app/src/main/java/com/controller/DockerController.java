package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {

	@GetMapping(value = "")
	public String greeting() {
		return "Welcome to Spring boot app running through Docker by Aboli";
	}
}