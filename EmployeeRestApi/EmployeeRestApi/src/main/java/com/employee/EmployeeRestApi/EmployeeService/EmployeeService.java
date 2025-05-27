package com.employee.EmployeeRestApi.EmployeeService;

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
		emp.setFirst_name(updatedEmp.getFirst_name());
		emp.setLast_name(updatedEmp.getLast_name());
		emp.setEmail(updatedEmp.getEmail());
		emp.setDate_of_birth(updatedEmp.getDate_of_birth());
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

//	public String getByEmail(String email) {
//		return repo.findByEmail(email);
//	}

}
