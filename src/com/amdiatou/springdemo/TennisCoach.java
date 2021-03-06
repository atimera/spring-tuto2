package com.amdiatou.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("restFortuneService")
	private FortuneService fortuneService;

	@Value("${tennisCoach.emailAdress}")
	private String emailAddress;
	
	@Value("${tennisCoach.team}")
	private String team;
	
	public TennisCoach() {
	}
	
	@PostConstruct
	public void doThisOnInit() {
		System.out.println(">> inside doThisOnInit() method");		
	}
	
	@PreDestroy
	public void doThisOnDestroy() {
		System.out.println(">> inside doThisOnDestroy() method");
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
	
	/*
	// define any method for dependency injection
	@Autowired
	public void doSomeCrazySuff(FortuneService fortuneService) {
		System.out.println(">> inside method doSomeCrazySuff");
		this.fortuneService = fortuneService;
	}
	*/


	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley!";
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
