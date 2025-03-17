package com.SpringBootLayer.SpringBootLayer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootLayer.SpringBootLayer.Entity.Company;

public interface Repository extends JpaRepository<Company, Integer>{

}
