package com.youtube.api.youtube.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.api.youtube.Entity.Employee;
import com.youtube.api.youtube.repository.detailsrepository;


@Service
public  class Serviceclass implements Employeedetails {

	@Autowired
	private detailsrepository d1;
	
	


	@Override
	public Employee savedetails(Employee E1) {
	return d1.save(E1);
	}


	 @Override
	public Optional<Employee> gettingById(Long id) {
        return d1.findById(id);
    }



	@Override
	public Employee updatedetails(Employee E1) {
		return d1.save(E1);
	}



	@Override
	public List<Employee> getEmployee(Employee E1) {
		return d1.findAll();
	}

}
