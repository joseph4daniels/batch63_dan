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

import com.cogent.boot.entity.Plans;
import com.cogent.boot.repository.PlansRepo;

@RestController

@RequestMapping("/api/plans")
public class PlansController {

	@Autowired
	PlansRepo plansRepo;
	
	@PostMapping("/addplans")
	Plans addPlans(@RequestBody Plans plans) {
		return plansRepo.save(plans);
	}
	
	//get opreation read of crud
	@GetMapping("/getplans") //Endpoint
	List<Plans> getAllPlans(){
		return plansRepo.findAll();
	}
	
	@DeleteMapping("/deleteplans/{id}")
	String deletePlans(@PathVariable("id") long id) {
		plansRepo.deleteById(id);
		return "record deleted successfully";
	}
	
}
