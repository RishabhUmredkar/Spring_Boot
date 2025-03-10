package com.qsp.Spring_Boot_1;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qsp/deccan/student")
public class Controller {
	
	@GetMapping("/hi")
	public String welcome()
	{
		return "Hello";
	}
	
//---------------------------------------------------------
	
	@GetMapping("/student")
	public String getStudentId(@RequestParam int id)
	{
		return "Id : "+id;
	}
	
	@GetMapping("/studentName")
	public String getStudentIdName(@RequestParam int id, @RequestParam String name)
	{
		return "Id : "+id+" Name : "+name;
	}
	
	
//----------------------------------------------------------------
	
	@GetMapping("/employee/{id}")
	public String getEmployeeId(@PathVariable int id)
	{
		return "id "+id;
	}
	
	
	@GetMapping("/employee/{id}/{name}")
	public String getEmployeeIdName(@PathVariable int id, @PathVariable String name)
	{
		return "Id : "+id+" Name : "+name;
	}
	
	//----------------------------------------------------------------

	@GetMapping("/header")
	public String getHeaderData(@RequestHeader int id, @RequestHeader String name)
	{
		return "Id : "+id+" Name : "+name;
	}
	
	//----------------------------------------------------------------

	@GetMapping("/RequesrJSON")
	public Student getStrudnet(@RequestBody Student student)
	{
		return student;
	}
	
	
	//----------------------------------------------------------------
	@GetMapping("/findByID")
	public Employee findBYIDmoloyee(@RequestBody List<Employee> list)
	{
		for(Employee emp : list)
		{
			if(emp.getId() == 101)
			{
				return emp;
			}
		}
		return null;
	}
	
	
	//----------------------------------------------------------------

	@PostMapping("/save")
	public String saveStudent() {
		return "Student Saved";
	}

	@RequestMapping("/update")
	public String updateStudent() {
		return "Student Updated";
	}
	

	@PostMapping("/delete")
	public String deleteStudent() {
		return "Student delete";
	}
	
}