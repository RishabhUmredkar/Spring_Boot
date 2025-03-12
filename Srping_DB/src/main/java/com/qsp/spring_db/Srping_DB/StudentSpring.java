package com.qsp.spring_db.Srping_DB;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentSpring {

	@Id
	private int id;
	private String name;
	private long phone;

	public StudentSpring() {
		// TODO Auto-generated constructor stub
	}

	public StudentSpring(int id, String name, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
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

	public double getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

}
