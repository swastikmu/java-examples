package com.swastik.MavenProject;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;   
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;

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
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring.xml");
    	
    	Vehicle obj1 = (Vehicle)context.getBean("abc");
    	
    	car.drive();
    	
    	Vehicle bike = new Bike();
    	
    	bike.drive();   
    	}
}
