package com.cogent.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.boot.entity.Employee;
import com.cogent.boot.entity.Payroll;
import com.cogent.boot.repository.PayrollRepo;

@RestController

@RequestMapping("/api/payroll")
public class PayrollController {

	@Autowired
	PayrollRepo payrollRepo;
	
	@PostMapping("/addpayroll")
	Payroll addPayroll(@RequestBody Payroll payroll) {
		return payrollRepo.save(payroll);
	}
	
	//get opreation read of crud
	@GetMapping("/getpayroll") //Endpoint
	List<Payroll> getAllEmployee(){
		return payrollRepo.findAll();
	}
	
}
