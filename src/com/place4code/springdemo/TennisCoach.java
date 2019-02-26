package com.place4code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.name}")
	private String name;
	
	@Autowired
	@Qualifier("randomService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println(">> TennisCoach Constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout() from TennisCoach";
	}

	@Override
	public String getDailyFortune() {
		System.out.println("Values from property file: " + name + ", " + email);
		System.out.println(fortuneService.randomFortune());
		return fortuneService.getFortune();
	}

	 
	/*
	// setter injection, method injection
	// I can rename ...
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("setFortuneService - TennisCoach");
		this.fortuneService = fortuneService;
	}
	*/
	

}
