package com.employee.EmployeeRestApi.Employee;

import java.time.Instant;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	private int id;
	private String first_name;
	private String last_name;
	private String email;
	private LocalDate date_of_birth;
	private  Instant date_of_joining;
	private boolean status;
	private String role;
	
	public Employee() {
		super();
	}

	public Employee(int id, String first_name, String last_name, String email, LocalDate date_of_birth,
			Instant date_of_joining, boolean status, String role) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.date_of_birth = date_of_birth;
		this.date_of_joining = date_of_joining;
		this.status = status;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(LocalDate date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public Instant getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(Instant date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", date_of_birth=" + date_of_birth + ", date_of_joining=" + date_of_joining + ", status=" + status
				+ ", role=" + role + "]";
	}

	

	
	
	
	
	
	

}
