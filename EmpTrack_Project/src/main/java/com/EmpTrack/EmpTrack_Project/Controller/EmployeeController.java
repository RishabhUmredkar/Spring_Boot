package com.EmpTrack.EmpTrack_Project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmpTrack.EmpTrack_Project.Entity.Company;
import com.EmpTrack.EmpTrack_Project.Entity.Employee;
import com.EmpTrack.EmpTrack_Project.Service.CompanyService;
import com.EmpTrack.EmpTrack_Project.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;

	@PostMapping
	public ResponseEntity<Employee>save(@RequestBody Employee emp)
	{
		return service.save(emp);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> findById(int id)
	{
		return service.findById(id);
	}
	
	@GetMapping
	public ResponseEntity<List<Employee>> getAll()
	{
		return service.findAll();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteById(int id)
	{
		return service.deleteByID(id);
	}
	
}
