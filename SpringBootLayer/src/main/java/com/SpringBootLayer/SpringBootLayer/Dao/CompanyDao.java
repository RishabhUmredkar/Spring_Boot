package com.SpringBootLayer.SpringBootLayer.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringBootLayer.SpringBootLayer.Entity.Company;
import com.SpringBootLayer.SpringBootLayer.Repository.Repository;

@Component
public class CompanyDao {
	
	@Autowired 
	Repository repo;
	
	public Company save(Company company)
	{
		return repo.save(company);
	}

}
