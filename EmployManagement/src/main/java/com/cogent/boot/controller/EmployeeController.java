package com.cogent.boot.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.boot.entity.Employee;
import com.cogent.boot.repository.EmployeeRepo;
import com.cogent.boot.service.EmployeeService;

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
	Employee addEmployee(@Valid @RequestBody Employee employee) {
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
	
	@GetMapping("/getemployeesortedbyname") //Endpoint
	List<Employee> findAllSortedByName(){
		return employeeRepo.findAllSortedByName();
	}
	
	@GetMapping("/getemployeesortedbysalary")
	List<Employee> findAllSortedBySalary(){
		return employeeRepo.findAllSortedBySalary();
	}
	
	@GetMapping("/getemployeebyname/{id}")
	//@ResponseBody
	Employee findEmployeeByName(@PathVariable("id") String id) {
		//System.out.println(name);
		//System.out.println("something");
		return employeeRepo.findEmployeeByName(id);
	}
	
	@Autowired
	EmployeeService es;
	
	@GetMapping("/getsortedbyservice")
	List<Employee> findAllSortedByNameService(){
		return es.performSorting();
	}
	
	@PutMapping("/updateemployee/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee) {
		Employee original = employeeRepo.findById(id)
				.orElseThrow(() -> new RuntimeException("Employeee does not exist id:" + id));
		original.setDept(employee.getDept());
		original.setName(employee.getName());
		original.setSalary(employee.getSalary());
		
		employeeRepo.save(original);
		return ResponseEntity.ok(original);
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
