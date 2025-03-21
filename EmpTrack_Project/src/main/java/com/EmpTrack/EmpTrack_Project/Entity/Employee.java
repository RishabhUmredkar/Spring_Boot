package com.EmpTrack.EmpTrack_Project.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double sal;
	private String mail;
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn
	@JsonIgnore
	private Company com;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double sal, String mail, Company com) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.mail = mail;
		this.com = com;
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

	public Company getCom() {
		return com;
	}

	public void setCom(Company com) {
		this.com = com;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
