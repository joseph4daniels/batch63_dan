package com.cogent.boot.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.boot.entity.Employee;
import com.cogent.boot.repository.EmployeeRepo;

@RestController

@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	EmployeeRepo employeeRepo;
	
	//http method to create rest api endpoints
	//get
	//post
	//put
	//delete
	
	@PostMapping("/addemployee")
	Employee addEmployee(@RequestBody Employee employee) {
		return employeeRepo.save(employee);
	}
	
	//get opreation read of crud
	@GetMapping("/getemployee") //Endpoint
	List<Employee> getAllEmployee(){
		return employeeRepo.findAll();
	}
	
	@DeleteMapping("/deleteemployee/{id}")
	String deleteEmployee(@PathVariable("id") long id) {
		employeeRepo.deleteById(id);
		return "record deleted successfully";
	}
	
	
	//testing
	public int addition() {
		int a = 10;
		int b = 20;
		
		return (a+b);
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	public int subtraction(int a, int b) {
		return a - b;
	}
	
}
