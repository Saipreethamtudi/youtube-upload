package com.youtube.api.youtube.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.youtube.api.youtube.Entity.Employee;
import com.youtube.api.youtube.service.Employeedetails;

@RestController
public class Controller {
	
	
	@Autowired
	private Employeedetails Eservice;
	
	@PostMapping("/sai")
	public Employee savedetails(@RequestBody Employee E1 ) {
		return Eservice.savedetails(E1);
	}
	
	@PutMapping("/sai")
	public Employee updatedetails(@RequestBody Employee E1 ) {
		return Eservice.updatedetails(E1);
	}
		
		
	@GetMapping("/sai")
	public List<Employee> getdetails() {
		return Eservice.getEmployee(null);
	}
	
	@GetMapping("/sai/{id}")
	public Optional<Employee> getdetails(@PathVariable long id) {
		return Eservice.gettingById(id);
	}
	
	@DeleteMapping("/sai")
	public String deletedetails(@RequestParam String T1) {
		return "Deleting the item" +T1;
	 
	}

	
	
	@PutMapping("/ew/{id}")
	public Employee updatedetails(@PathVariable long id, @RequestBody Employee E2 ) {
		return E2;
		
	}

}
