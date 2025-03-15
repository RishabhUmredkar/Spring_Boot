package com.trainer.Trainer_CRUD;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;


public interface TrainerRepo extends JpaRepository<Trainer, Integer>{

	List<Trainer> findByName(String name);

	List<Trainer> findBySubject(String subject);


	@Query("select e from Trainer e where e.name = :name")
	List<Trainer> fetchByName(String name);

	@Query("select e from Trainer e where e.subject = :subject")
	List<Trainer> FetchBySub(String subject);
	
	
	@Transactional
	int deleteByName(String name);


}
