package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Trainer;
import com.repository.TrainerRepository;

@Service
public class TrainerService {

	@Autowired
	TrainerRepository trainerRepository;
	
	
	public List<Trainer> findAll() {
		return trainerRepository.findAll();
	}
}