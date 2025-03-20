package com.EmpTrack.EmpTrack_Project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.EmpTrack.EmpTrack_Project.Dao.CompanyDao;
import com.EmpTrack.EmpTrack_Project.Entity.Company;
import com.EmpTrack.EmpTrack_Project.Exception.IdNotExistException;
import com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider;

@Service
public class CompanyService {

	@Autowired
	CompanyDao dao;
	
	public ResponseEntity<Company> save(Company company)
	{
		return new ResponseEntity<Company>(dao.save(company),HttpStatus.CREATED);
	}
	
	public ResponseEntity<Company>findById(int id)
	{
		Optional<Company> byId = dao.getById(id);
		Company company = null;
		if(byId.isPresent())
		{
			company = byId.get();
			return new ResponseEntity<Company>(company,HttpStatus.OK);
		}
		else {
			throw new IdNotExistException("Company with Id : "+id+" does Not exist");
		}
	}
	
	public ResponseEntity<String> deleteById(int id)
	{
		Optional<Company> byId = dao.getById(id);
		if(byId.isPresent())
		{
			dao.deleteById(id);
			return new ResponseEntity<String>("Company Is deleted",HttpStatus.OK);
		}
		throw new IdNotExistException("Company with Id : "+id+" does Not exist");
	}
	
	public ResponseEntity<List<Company>> findAll()
	{
		List<Company> all = dao.getAll();
		return new ResponseEntity<List<Company>>(all, HttpStatus.OK);
	}
		
}
