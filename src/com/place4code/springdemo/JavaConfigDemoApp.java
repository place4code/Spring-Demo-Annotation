package com.place4code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		//read spring configuration file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get the bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//call some methods on the bean
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
