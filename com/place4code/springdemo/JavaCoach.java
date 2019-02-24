package com.place4code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class JavaCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "JavaCoach - getDailyWorkout";
	}

}
