package com.cogent.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.boot.entity.Customercare;
import com.cogent.boot.repository.CustomercareRepo;

@RestController

@RequestMapping("/api/customercare")
public class CustomercareController {

	
	@Autowired
	CustomercareRepo customercareRepo;
	
	@PostMapping("/addcustomercare")
	Customercare addCustomercare(@RequestBody Customercare customercare) {
		return customercareRepo.save(customercare);
	}
	
	//get opreation read of crud
	@GetMapping("/getcustomercare") //Endpoint
	List<Customercare> getAllCustomercare(){
		return customercareRepo.findAll();
	}
	
	@DeleteMapping("/deletecustomercare/{id}")
	String deleteCustomercare(@PathVariable("id") long id) {
		customercareRepo.deleteById(id);
		return "record deleted successfully";
	}
	
}
