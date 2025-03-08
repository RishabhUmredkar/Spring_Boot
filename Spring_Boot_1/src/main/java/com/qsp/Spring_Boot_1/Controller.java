package com.qsp.Spring_Boot_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
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

}
