package com.allsol.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/hello")
	public String helloWorld(Model model) {
		
		model.addAttribute("todaysDate", new java.util.Date());
		
		return "helloworld";
	}

}
