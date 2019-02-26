package com.place4code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class JavaCoach implements Coach {

	private FortuneService fortune;
	
	// constructor injection
	@Autowired // optional in Springs 4.3 ^
	
	public JavaCoach(@Qualifier("randomService")FortuneService fortune) {
		//super();
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		return "JavaCoach - getDailyWorkout";
	}

	@Override
	public String getDailyFortune() {
		return fortune.getFortune();
	}

}
