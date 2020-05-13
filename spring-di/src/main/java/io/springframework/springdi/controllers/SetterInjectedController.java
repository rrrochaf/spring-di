package io.springframework.springdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import io.springframework.springdi.services.GreetingService;

@Controller
public class SetterInjectedController {
	
	private GreetingService greetingService;

	public String getGreetingService() {
		return greetingService.sayGreeting();
	}

	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
