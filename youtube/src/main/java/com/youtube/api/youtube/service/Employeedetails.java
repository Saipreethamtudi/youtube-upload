package com.youtube.api.youtube.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.youtube.api.youtube.Entity.Employee;

@Component
public interface Employeedetails {
	
	List<Employee> getEmployee(Employee E1);

	Employee savedetails(Employee E1);
	
    Employee updatedetails(Employee E1);
    
	Optional<Employee> gettingById(Long id);

}
