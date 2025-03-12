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
public class StudentController {

	@Autowired
	StudentRepository repository;

	@PostMapping("/student")
	public StudentSpring saveEmployee(@RequestBody StudentSpring student) {
		StudentSpring e = repository.save(student);
		return e;
	}

	@PutMapping("/student")
	public StudentSpring updateEmployee(@RequestBody StudentSpring student) {
		StudentSpring e = repository.save(student);
		return e;
	}

	@DeleteMapping("/student")
	public void deleteByID(@RequestParam int id) {
		Optional<StudentSpring> optional = repository.findById(id);
		if (optional.isPresent()) {
			StudentSpring e = optional.get();
			repository.delete(e);
		}
	}

	@GetMapping("/student")
	public List<StudentSpring> findAllEmployee() {
		List<StudentSpring> list = repository.findAll();
		return list;
	}

	@GetMapping("/student/{id}")
	public StudentSpring fetchById(@PathVariable int id)
	{
		Optional<StudentSpring> optional = repository.findById(id);
		if(optional.isPresent())
		{
			StudentSpring e = optional.get();
			return e;
		}
		return null;
	}

}
