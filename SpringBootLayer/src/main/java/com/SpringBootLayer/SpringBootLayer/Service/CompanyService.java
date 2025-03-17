package com.SpringBootLayer.SpringBootLayer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.SpringBootLayer.SpringBootLayer.Dao.CompanyDao;
import com.SpringBootLayer.SpringBootLayer.Entity.Company;

@Service
public class CompanyService {

	@Autowired
	CompanyDao dao;
	
	public ResponseEntity<Company> save(Company company)
	{
		return new ResponseEntity<Company>(dao.save(company), HttpStatus.CREATED);
	}

    public List<Company> findAll() {
        return dao.findAll();
    }
}
