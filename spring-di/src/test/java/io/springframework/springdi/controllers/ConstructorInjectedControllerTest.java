package io.springframework.springdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.springframework.springdi.services.GreetingServiceImpl;

/*
 * Constructor injection example - Most used
 */
class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new  ConstructorInjectedController(new GreetingServiceImpl());
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreetingService());
	}

}