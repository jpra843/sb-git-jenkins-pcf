package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deplomentDemo")
public class MainController {

	@RequestMapping("/pivotalCloud")
	public String getInfo() {
		return "This Simple SpringBoot Application Demo for Pivotal Deployment";
	}
	
}
