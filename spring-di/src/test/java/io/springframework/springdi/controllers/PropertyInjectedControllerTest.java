package io.springframework.springdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.springframework.springdi.controllers.PropertyInjectedController;
import io.springframework.springdi.services.GreetingServiceImpl;
/*
 * Property Injection example - least used
 */
class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		
		controller.greetingService = new GreetingServiceImpl();
		
	}
	
	@Test
	void getGreeting() {
		
		System.out.println(controller.getGreeting());
		
	}

}
