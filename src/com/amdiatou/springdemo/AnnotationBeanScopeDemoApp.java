package com.amdiatou.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they are the same
		boolean result = theCoach == alphaCoach;
		
		// print the results
		System.out.println("\nPointing to the same object: "+ result);
		
		System.out.println("\nThe memory location for theCoach: "+ theCoach);
		
		System.out.println("\nThe memory location for alphaCoach: "+ alphaCoach);
		
		// close the context
		context.close();
		
	}

}
