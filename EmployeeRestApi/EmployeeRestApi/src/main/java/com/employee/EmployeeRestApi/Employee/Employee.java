package com.employee.EmployeeRestApi.Employee;

import java.time.Instant;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	private int id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	private String email;
	@Column(name="date_of_birth")
	private LocalDate dateOfBirth;
	private Instant date_of_joining;
	private boolean status;
	private String role;

	public Employee() {
		super();
	}

	public Employee(int id, String firstName, String lastName, String email, LocalDate dateOfBirth,
			Instant date_of_joining, boolean status, String role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getdateOfBirth() {
		return dateOfBirth;
	}

	public void setdateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Instant getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(Instant date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public boolean getStatus() {
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
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", date_of_birth=" + dateOfBirth + ", date_of_joining=" + date_of_joining + ", status=" + status
				+ ", role=" + role + "]";
	}

}
