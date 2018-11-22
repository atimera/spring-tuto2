package com.amdiatou.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println(">> inside default constructor");
	}
	
	/*
	@Autowired
	public TennisCoach(FortuneService pFortuneService) {
		System.out.println("TennisCoach: inside contructor");
		fortuneService = pFortuneService;
	}
	*/
	
	/*
	// define setter method for dependency injection
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> inside method setFortuneService");
		this.fortuneService = fortuneService;
	}
	*/
	
	// define any method for dependency injection
	@Autowired
	public void doSomeCrazySuff(FortuneService fortuneService) {
		System.out.println(">> inside method doSomeCrazySuff");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
