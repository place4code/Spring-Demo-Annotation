package com.place4code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//call some methods on the bean
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
