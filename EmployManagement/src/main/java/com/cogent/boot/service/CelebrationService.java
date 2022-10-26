package com.cogent.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.boot.entity.Celebration;
import com.cogent.boot.repository.CelebrationRepo;

@Service
public class CelebrationService {

	@Autowired
	CelebrationRepo celebrationRepo;
	
	public List<Celebration> displayRecord() {
		System.out.println("using service layer to print records");
		return celebrationRepo.displayAll();
	}
	
}
