package com.qsp.spring_db.Srping_DB;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;

	@PostMapping("/employee")
	public EmployeeSpring saveEmployee(@RequestBody EmployeeSpring employee) {
		EmployeeSpring e = repository.save(employee);
		return e;
	}

	@PutMapping("/employee")
	public EmployeeSpring updateEmployee(@RequestBody EmployeeSpring employee) {
		EmployeeSpring e = repository.save(employee);
		return e;
	}

	@DeleteMapping("/employee")
	public void deleteByID(@RequestParam int id) {
		Optional<EmployeeSpring> optional = repository.findById(id);
		if (optional.isPresent()) {
			EmployeeSpring e = optional.get();
			repository.delete(e);
		}
	}

	@GetMapping("/employee")
	public List<EmployeeSpring> findAllEmployee() {
		List<EmployeeSpring> list = repository.findAll();
		return list;
	}

	@GetMapping("/employee/{id}")
	public EmployeeSpring fetchById(@PathVariable int id)
	{
		Optional<EmployeeSpring> optional = repository.findById(id);
		if(optional.isPresent())
		{
			EmployeeSpring e = optional.get();
			return e;
		}
		return null;
	}

}
