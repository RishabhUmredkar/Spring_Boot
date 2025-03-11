package com.qsp.spring_db.Srping_DB;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeSpring {

	@Id
	private int id;
	private String name;
	private double sal;

	public EmployeeSpring() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeSpring(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

}
