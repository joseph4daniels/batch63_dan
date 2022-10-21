package com.cogent.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.boot.entity.Complaint;
import com.cogent.boot.repository.ComplaintRepo;

@RestController

@RequestMapping("/api/complaint")
public class ComplaintController {

	@Autowired
	ComplaintRepo complaintRepo;
	
	@GetMapping("/getcomplaint")
	List<Complaint> getAllComplaints(){
		return complaintRepo.findAll();
	}
	
	@PostMapping("/addcomplaint")
	Complaint addComplaint(@RequestBody Complaint complaint) {
		return complaintRepo.save(complaint);
	}

}
