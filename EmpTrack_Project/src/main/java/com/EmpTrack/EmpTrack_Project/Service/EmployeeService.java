package com.EmpTrack.EmpTrack_Project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.EmpTrack.EmpTrack_Project.Dao.EmployeeDao;
import com.EmpTrack.EmpTrack_Project.Entity.Employee;
import com.EmpTrack.EmpTrack_Project.Repository.EmpRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	public ResponseEntity<Employee>save(Employee emp)
	{
		Employee save = dao.save(emp);
		return new ResponseEntity<Employee> (save,HttpStatus.CREATED);
	}
	
	public ResponseEntity<Employee> findById(int id)
	{
		Optional<Employee> byId = dao.getById(id);
		Employee employee = null;
		if(byId.isPresent())
		{
			employee = byId.get();
			return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		}
		else {
			return null;
		}
	}
	
	public ResponseEntity<String>  deleteByID(int id)
	{
		Optional<Employee> byId = dao.getById(id);
		if(byId.isPresent())
		{
			dao.deleteById(id);
			return new ResponseEntity<String>("Employee Is Deleted", HttpStatus.OK);
		}
		else {
			return null;
		}
	}
	
	public ResponseEntity<List<Employee>> findAll()
	{
		List<Employee> res = dao.getAll();
		return new ResponseEntity<List<Employee>>(res , HttpStatus.OK);
	}
}
