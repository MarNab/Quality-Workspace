package com.accenture.docker1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Docker1Controller {
	
	@GetMapping("/")
	public String hello() {
	return "hello";
	}

	@PostMapping("/user")
	public String helloSomeone(@RequestParam String user, Model model) {
	model.addAttribute("user", user);
	return "hello";
	}

}
