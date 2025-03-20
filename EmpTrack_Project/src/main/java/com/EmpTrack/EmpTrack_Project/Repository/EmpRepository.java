package com.EmpTrack.EmpTrack_Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EmpTrack.EmpTrack_Project.Entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer>{

}
