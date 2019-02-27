package com.place4code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ChallengeDemoApp {

	public static void main(String[] args) {

		//read spring configuration file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ChallengeJavaConfig.class);
		
		//get the bean
		ChallengeCoach theCoach = context.getBean("challengeCoach", ChallengeCoach.class);
		
		//call some methods on the bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
