package com.EmpTrack.EmpTrack_Project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmpTrack.EmpTrack_Project.Entity.Company;
import com.EmpTrack.EmpTrack_Project.Service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyService service;
	
	@PostMapping
	public ResponseEntity<Company> save(@RequestBody Company company)
	{
		return service.save(company);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Company> getById(int id)
	{
		return service.findById(id);
	}
	
	@GetMapping
	public ResponseEntity<List<Company>>getAll()
	{
		return service.findAll();
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteById(int id)
	{
		return service.deleteById(id);
	}
	
}
