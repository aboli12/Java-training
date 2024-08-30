package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.MediaTypeEditor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Trainer;
import com.service.TrainerService;

@RestController
public class TrainerController {

	@Autowired
	TrainerService trainerService;
	// http://localhost:8080/trainers 
	@RequestMapping(value = "trainers",
			produces = MediaType.APPLICATION_JSON_VALUE,
			method = RequestMethod.GET)
	public List<Trainer> findAll() {
		return trainerService.findAll();
	}
}