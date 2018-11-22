package com.amdiatou.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService fortuneService;

	
	public TennisCoach(FortuneService pFortuneService) {
		fortuneService = pFortuneService;
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
