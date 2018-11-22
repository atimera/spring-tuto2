package com.amdiatou.springdemo;

public interface Coach {
	
	public String getDailyWorkout();

	public String getDailyFortune();

	void setTeam(String team);

	String getTeam();

	void setEmailAddress(String emailAddress);

	String getEmailAddress();
}
