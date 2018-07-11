package com.accenture.docker1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Docker1Controller {
	
	@GetMapping("/")
	public String hello() {
		return "hello";
	}
	
	@PostMapping("/")
	public String sayHello() {
		return "hello";
	}

}
