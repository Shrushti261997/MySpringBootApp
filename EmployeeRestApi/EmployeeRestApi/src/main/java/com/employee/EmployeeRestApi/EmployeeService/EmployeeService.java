package com.employee.EmployeeRestApi.EmployeeService;

import java.util.List;

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

}
