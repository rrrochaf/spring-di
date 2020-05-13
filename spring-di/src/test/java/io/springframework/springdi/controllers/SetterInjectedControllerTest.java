package io.springframework.springdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.springframework.springdi.services.GreetingServiceImpl;
/*
 * Setter injection example
 */
class SetterInjectedControllerTest {

	SetterInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new SetterInjectedController();
		controller.setGreetingService(new GreetingServiceImpl());
	}
	
	@Test
	void getGreeting() {
		
		System.out.println(controller.getGreetingService());
		
	}
}