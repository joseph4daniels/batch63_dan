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

import com.cogent.boot.entity.Purchase;
import com.cogent.boot.repository.PurchaseRepo;

@RestController

@RequestMapping("/api/purchase")
public class PurchaseController {
	
	@Autowired
	PurchaseRepo purchaseRepo;
	
	@PostMapping("/addpurchase")
	Purchase addPurchase(@RequestBody Purchase purchase) {
		return purchaseRepo.save(purchase);
	}
	
	//get opreation read of crud
	@GetMapping("/getpurchase") //Endpoint
	List<Purchase> getAllEmployee(){
		return purchaseRepo.findAll();
	}
	
	@DeleteMapping("/deletepurchase/{id}")
	String purchaseEmployee(@PathVariable("id") long id) {
		purchaseRepo.deleteById(id);
		return "record deleted successfully";
	}

}
