package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		System.out.println("Swastik");
		
//		Alien a1 = new Alien(); //hard coupling. avoid it
		Alien a2 = context.getBean(Alien.class); //using context
		
//		Alien a3 = context.getBean(Alien.class);
		
//		a1.show();
		a2.show();
//		a3.show();
	
		
	}

}
