package com.amdiatou.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanLifeCycleDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();

	}

}
