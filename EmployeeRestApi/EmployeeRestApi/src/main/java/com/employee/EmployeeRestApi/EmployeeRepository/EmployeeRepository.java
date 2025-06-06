package com.employee.EmployeeRestApi.EmployeeRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.EmployeeRestApi.Employee.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByEmail(String email);

	List<Employee> findByFirstName(String fname);

	List<Employee> findByFirstNameAndLastName(String fname, String lname);
	
	List<Employee> findByFirstNameAndDateOfBirth(String fname,LocalDate dateOfBirth);

}
