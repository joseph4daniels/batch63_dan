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

import com.cogent.boot.entity.Celebration;
import com.cogent.boot.entity.Employee;
import com.cogent.boot.repository.CelebrationRepo;
import com.cogent.boot.service.CelebrationService;
import com.cogent.boot.service.EmployeeService;


@RestController

@RequestMapping("/api/celebration")
public class CelebrationController {

	@Autowired
	CelebrationRepo celebrationRepo;
	
	@PostMapping("/addcelebration")
	Celebration addCelebration(@RequestBody Celebration celebration) {
		return celebrationRepo.save(celebration);
	}
	
	//get opreation read of crud
	@GetMapping("/getcelebration") //Endpoint
	List<Celebration> getAllEmployee(){
		return celebrationRepo.findAll();
	}
	
	@DeleteMapping("/deletecelebration/{id}")
	String deleteCelebration(@PathVariable("id") long id) {
		celebrationRepo.deleteById(id);
		return "record deleted successfully";
	}
	
	@Autowired
	CelebrationService cs;
	
	@GetMapping("/getdisplayrecord")
	List<Celebration> findAllSortedByNameService(){
		return cs.displayRecord();
	}
	
}
