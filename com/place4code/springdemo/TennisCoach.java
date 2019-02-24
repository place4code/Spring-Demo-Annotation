package com.place4code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout() from TennisCoach";
	}

}
