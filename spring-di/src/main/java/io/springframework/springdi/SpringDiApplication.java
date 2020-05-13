package io.springframework.springdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import io.springframework.springdi.controllers.ConstructorInjectedController;
import io.springframework.springdi.controllers.MyController;
import io.springframework.springdi.controllers.PropertyInjectedController;
import io.springframework.springdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);
		
		MyController bean = (MyController)ctx.getBean("myController");
		
		System.out.println(bean.sayHello());
		
		System.out.println("Property injection ------------------------");
		
		PropertyInjectedController propertyInjectedControllerBean = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		
		System.out.println(propertyInjectedControllerBean.getGreeting());
		
		System.out.println("Setter injection ---------------------");
		
		SetterInjectedController setterInjectedControllerBean = (SetterInjectedController)ctx.getBean("setterInjectedController");
		
		System.out.println(setterInjectedControllerBean.getGreetingService());
		
		System.out.println("Constructor injection ---------------------");
		
		ConstructorInjectedController constructorInjectedControllerBean = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		
		System.out.println(constructorInjectedControllerBean.getGreetingService());

	}
}