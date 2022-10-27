package com.cogent.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerSecurity {
	
	@RequestMapping("/")   //default Endpoint
	public ModelAndView defaultHome() {
		return new ModelAndView("home"); //JSP home.jsp
	}

}
