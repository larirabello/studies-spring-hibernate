package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeHelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myGolfCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		
		
		// retrieve bean from spring container	
		Coach alphaCoach = context.getBean("myGolfCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		// print out the results
		System.out.println("\nPointing to the same object "+ result);
		
		System.out.println("\nMemory location for theCoach "+ theCoach +"\n");
		
		System.out.println("\nMemory location for alphaCoach "+ alphaCoach +"\n");
		
		// close the context
		context.close(); 
	}

}
