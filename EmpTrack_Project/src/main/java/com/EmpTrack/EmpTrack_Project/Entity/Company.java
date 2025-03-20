package com.EmpTrack.EmpTrack_Project.Entity;

import java.util.List;

import com.EmpTrack.EmpTrack_Project.util.Loc;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private Loc loc;
	
	@OneToMany(mappedBy = "com")
	private List<Employee> emp;
	
	public Company() {
	}

	public Company(int id, String name, Loc loc, List<Employee> emp) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.emp = emp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Loc getLoc() {
		return loc;
	}

	public void setLoc(Loc loc) {
		this.loc = loc;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	
}
