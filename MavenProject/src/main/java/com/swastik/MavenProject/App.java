package com.swastik.MavenProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	Vehicle car = new Car();
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext();
    	
    	Vehicle obj1 = (Vehicle)context.getBean("vehicle");

    	
    	car.drive();
    	
    	Vehicle bike = new Bike();
    	
    	bike.drive();   
    	}
}
