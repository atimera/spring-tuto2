package com.amdiatou.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BasketCoach implements Coach {

	@Autowired
	@Qualifier("databaseFortuneService")
	private FortuneService fortuneService;
	
	@Value("${basketCoach.emailAdress}")
	private String emailAddress;
	
	@Value("${basketCoach.team}")
	private String team;
	
	public BasketCoach() {
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice your dunks!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getEmailAddress() {
		return emailAddress;
	}

	@Override
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String getTeam() {
		return team;
	}

	@Override
	public void setTeam(String team) {
		this.team = team;
	}

	
}
