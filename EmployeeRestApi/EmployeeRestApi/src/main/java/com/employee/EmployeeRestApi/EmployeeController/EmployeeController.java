package com.employee.EmployeeRestApi.EmployeeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.EmployeeRestApi.Employee.Employee;
import com.employee.EmployeeRestApi.EmployeeService.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;

	@GetMapping("/all")
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}
	
}
