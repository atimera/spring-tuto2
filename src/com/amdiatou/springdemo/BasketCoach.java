package com.amdiatou.springdemo;

import org.springframework.stereotype.Component;

@Component("jordan")
public class BasketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice your dunks!";
	}

}
