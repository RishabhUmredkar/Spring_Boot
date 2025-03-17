package com.SpringBootLayer.SpringBootLayer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootLayer.SpringBootLayer.Entity.Company;
import com.SpringBootLayer.SpringBootLayer.Service.CompanyService;

@RestController
public class Controller {

	@Autowired
	CompanyService service;
	
	@PostMapping("/company")
	public ResponseEntity<Company> save(@RequestBody Company company)
	{
		return service.save(company);
	}
}
