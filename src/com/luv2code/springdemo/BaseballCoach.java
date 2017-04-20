package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//Define field here
	private FortuneService fortuneService;
	
	//Define Constructor here
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
}
