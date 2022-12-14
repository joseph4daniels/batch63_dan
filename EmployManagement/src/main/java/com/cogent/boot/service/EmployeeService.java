package com.cogent.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.boot.entity.Employee;
import com.cogent.boot.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;
	
	public List<Employee> performSorting() {
		System.out.println("using service layer to print records");
		return employeeRepo.findAllSortedByName();
	}
	
}
