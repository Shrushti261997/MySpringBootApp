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
	private int Emp_id;
	private String first_name;
	private String last_name;
	private String email_id;
	private LocalDate DOB;
	private  Instant DOJ;
	private boolean status;
	private String role;
	
	public Employee() {
		super();
	}

	

	public Employee(int emp_id, String first_name, String last_name, String email_id, LocalDate dOB, Instant dOJ,
			boolean status, String role) {
		super();
		Emp_id = emp_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email_id = email_id;
		DOB = dOB;
		DOJ = dOJ;
		this.status = status;
		this.role = role;
	}



	public int getEmp_id() {
		return Emp_id;
	}

	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}

	public String getFirstName() {
		return first_name;
	}

	public void setFirstName(String firstName) {
		this.first_name = first_name;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String lastName) {
		this.last_name = last_name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public Instant getDOJ() {
		return DOJ;
	}

	public void setDOJ(Instant dOJ) {
		DOJ = dOJ;
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
		return "Employee [Emp_id=" + Emp_id + ", firstName=" + first_name + ", lastName=" + last_name + ", email_id="
				+ email_id + ", DOB=" + DOB + ", DOJ=" + DOJ + ", status=" + status + ", role=" + role + "]";
	}




	
	
	
	
	
	
	

}
