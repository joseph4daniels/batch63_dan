package com.cogent.boot;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cogent.boot.controller.EmployeeController;
import static org.junit.Assert.*;


@SpringBootTest
class EmployManagementApplicationTests {

	@Test
	void contextLoads() {
	}
	
	//TDD - test driven development

	@Test
	void testingOne() {
		
		EmployeeController emp = new EmployeeController();
		
		assertEquals(30, emp.addition());
		
		
	}
	
	@Test
	void testingString() {
		EmployeeController emp = new EmployeeController();
		
		assertEquals("Hello", emp.hello());
	}
	
	@Test
	void testingSubtraction() {
		EmployeeController emp = new EmployeeController();
		
		assertEquals(-1, emp.subtraction(0, 1));
	}
	
	@AfterEach
	public void afterTest() {
		System.out.println("After Test case it executes");
	}
	
}
