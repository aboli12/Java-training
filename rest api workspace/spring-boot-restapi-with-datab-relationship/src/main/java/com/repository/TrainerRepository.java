package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Trainer;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer>{

}