package com.place4code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		//read spring configuration file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get the bean
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		//call some methods on the bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		theCoach.methodSwimCoach();
		
		//close the context
		context.close();
	}

}
