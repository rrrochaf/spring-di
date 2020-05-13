package io.springframework.springdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import io.springframework.springdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Autowired
	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
