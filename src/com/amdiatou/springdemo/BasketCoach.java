package com.amdiatou.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BasketCoach implements Coach {

	private FortuneService fortuneService;
	
	public BasketCoach() {
	}

	@Autowired
	public BasketCoach(FortuneService pFortuneService) {
		fortuneService = pFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice your dunks!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
}
