package io.springframework.springdi.controllers;

import org.springframework.stereotype.Controller;

import io.springframework.springdi.services.GreetingService;
@Controller
public class ConstructorInjectedController {
	
	private final GreetingService greetingService;

	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreetingService() {
		return greetingService.sayGreeting();
	}
}
