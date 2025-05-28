package com.employee.EmployeeRestApi.EmployeeService;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.EmployeeRestApi.Employee.Employee;
import com.employee.EmployeeRestApi.EmployeeRepository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;

	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	public Optional<Employee> getEmployeeById(int id) {
		return repo.findById(id);
	}

	public Employee saveEmployee(Employee emp) {
		return repo.save(emp);
	}

	public Employee updateEmployee(int id, Employee updatedEmp) {
		Employee emp = repo.findById(id).orElseThrow();
		emp.setFirstName(updatedEmp.getFirstName());
		emp.setLastName(updatedEmp.getLastName());
		emp.setEmail(updatedEmp.getEmail());
		emp.setdateOfBirth(updatedEmp.getdateOfBirth());
		emp.setDate_of_joining(updatedEmp.getDate_of_joining());
		emp.setRole(updatedEmp.getRole());
		emp.setStatus(updatedEmp.getStatus());
		return repo.save(emp);
	}

	public void deleteEmployee(int id) {
		repo.deleteById(id);
	}

	public List<Employee> getByEmail(String email) {
		return repo.findByEmail(email);
	}

	public List<Employee> getByName(String fname) {
		return repo.findByFirstName(fname);
	}

	public List<Employee> getByFnameandLname(String fname, String lname) {
		return repo.findByFirstNameAndLastName(fname,lname);
	}
	
	public List<Employee> getByFirstNameAndDateOfBirth(String fname,LocalDate dateOfBirth ){
		return repo.findByFirstNameAndDateOfBirth(fname, dateOfBirth);
	}

}
