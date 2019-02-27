package com.place4code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
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
	Special Note about @PostConstruct and @PreDestroy Method Signatures

	Access modifier
	The method can have any access modifier (public, protected, private)

	Return type
	The method can have any return type. However, "void' is most commonly used. If you give a return type just note that you will not be able to capture the return value. As a result, "void" is commonly used.

	Method name
	The method can have any method name.

	Arguments
	The method can not accept any arguments. The method should be no-arg.
*/

	@PostConstruct
	public void postConstruct() {
		System.out.println("postConstruct - StartUp stuff");
	}
	 
	@PreDestroy
	public void preDestroy() {
		System.out.println("postConstruct - CleanUp stuff");
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
