package com.employee.EmployeeRestApi.EmployeeController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.EmployeeRestApi.Employee.Employee;
import com.employee.EmployeeRestApi.EmployeeService.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> emp = service.getAllEmployees();
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
		Optional<Employee> allEmployees = service.getEmployeeById(id);
		if (allEmployees.isPresent()) {
			return new ResponseEntity<>(allEmployees.get(), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp) {
		try {
			service.saveEmployee(emp);
			return new ResponseEntity<>(emp, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> UpdateEmployee(@PathVariable int id, @RequestBody Employee emp) {

		Employee updatedEmp = service.updateEmployee(id, emp);

		if (updatedEmp != null) {
			return new ResponseEntity<>(updatedEmp, HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Employee not Found", HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> DeleteEmployee(@PathVariable int id) {
		service.deleteEmployee(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@GetMapping("/by-email")
	public ResponseEntity<?> GetByEmail(@RequestParam(required = false) String email) {
		List<Employee> emp = service.getByEmail(email);
		if (emp.isEmpty()) {
			return new ResponseEntity<String>("Employee not found with email:" + email, HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<List<Employee>>(emp, HttpStatus.OK);

		}
	}
	
	@GetMapping("/by-fname")
	public ResponseEntity<?> GetByName(@RequestParam String fname) {
		List<Employee> emp = service.getByName(fname);
		if(emp.isEmpty())
		{
			return new ResponseEntity<String>("Employee not found with fname:"+fname,HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<List<Employee>>(emp,HttpStatus.OK);
		}
	}
	
	@GetMapping("/by-fname/by-lname")
	public ResponseEntity<?> GetByFirstNameandLastName(@RequestParam String fname,@RequestParam String lname)
	{
		List <Employee> emp = service.getByFnameandLname(fname,lname);
		if(emp.isEmpty())
		{
			return new ResponseEntity<String>("Employee not found with first name:"+fname +" and last name:"+lname,HttpStatus.NOT_FOUND); 
		}else
		{
			return new ResponseEntity<List<Employee>>(emp,HttpStatus.OK);
		}
	}

	
}
