package com.amdiatou.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("restFortuneService")
public class RESTFortuneService implements FortuneService {

	private String[] data = {
			"You are in a Bad mood today!",
			"You are easily Angry today!",
			"Today is your lucky day!",
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	private Random rand = new Random(); 
	
	@Override
	public String getFortune() {
		int index = rand.nextInt(data.length);
		String theFortune = "RESTFortuneService: "+ data[index];
		
		return theFortune;
	}

}
