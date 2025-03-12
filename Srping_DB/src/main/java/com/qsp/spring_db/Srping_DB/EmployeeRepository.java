package com.qsp.spring_db.Srping_DB;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<EmployeeSpring, Integer>{

	List<EmployeeSpring> findByName(String name);
	List<EmployeeSpring> findBySal(double sal);
	List<EmployeeSpring> findByNameAndSal(String name, double sal);
	EmployeeSpring findByNameAndPhone(String name, long phone);
	
	@Query("Select e from EmployeeSpring e where e.name = : name")
	List<EmployeeSpring> fetchByName(String name);
	
	@Query("Select e from EmployeeSpring e where e.name = : name and e.phone = : phone")
	EmployeeSpring FetchByNameAndPhone(String name, long phone);
}
