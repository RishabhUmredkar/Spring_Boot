package com.EmpTrack.EmpTrack_Project.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.EmpTrack.EmpTrack_Project.Entity.Company;
import com.EmpTrack.EmpTrack_Project.Entity.Employee;
import com.EmpTrack.EmpTrack_Project.Repository.ComRepository;

@Component
public class CompanyDao {

	@Autowired
	ComRepository repo;

	public Company save(Company emp) {
		return repo.save(emp);
	}

	public Optional<Company> getById(int id) {
		return repo.findById(id);
	}

	public List<Company> getAll() {
		return repo.findAll();
	}

	public void deleteById(int id) {
		repo.deleteById(id);
	}
	
}