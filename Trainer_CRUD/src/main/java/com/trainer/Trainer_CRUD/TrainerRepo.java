package com.trainer.Trainer_CRUD;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TrainerRepo extends JpaRepository<Trainer, Integer>{

	List<Trainer> findByName(String name);

	List<Trainer> findBySubject(String subject);


}
