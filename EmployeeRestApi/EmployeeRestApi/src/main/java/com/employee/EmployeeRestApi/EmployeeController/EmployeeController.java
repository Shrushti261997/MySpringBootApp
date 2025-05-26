package com.employee.EmployeeRestApi.EmployeeController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id ){
		return service.getEmployeeById(id);
	}
	
	@PostMapping()
	public Employee saveEmployee(@RequestBody Employee emp)
	{
		return service.saveEmployee(emp);
	}
	
	@PostMapping("/{id}")
	public Employee UpdateEmployee(@PathVariable int id,@RequestBody Employee emp)
	{
		return service.updateEmployee(id,emp);
	}
	
	@DeleteMapping("/{id}")
	public String DeleteEmployee(@PathVariable int id)
	{
		service.deleteEmployee(id);
		return "Employee Deleted Succesfully";
	}
}
