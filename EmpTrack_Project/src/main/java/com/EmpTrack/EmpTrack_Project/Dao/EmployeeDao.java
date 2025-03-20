package com.EmpTrack.EmpTrack_Project.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.EmpTrack.EmpTrack_Project.Entity.Employee;
import com.EmpTrack.EmpTrack_Project.Repository.EmpRepository;

@Component
public class EmployeeDao {

	@Autowired
	EmpRepository repo;

	public Employee save(Employee emp) {
		return repo.save(emp);
	}

	public Optional<Employee> getById(int id) {
		return repo.findById(id);
	}

	public List<Employee> getAll() {
		return repo.findAll();
	}

	public void deleteById(int id) {
		repo.deleteById(id);
	}
}
