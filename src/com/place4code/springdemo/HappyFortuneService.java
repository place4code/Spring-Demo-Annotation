package com.place4code.springdemo;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "HappyFortuneService - getFortune";
	}

	@Override
	public String randomFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@PostConstruct
	public void test() {
		System.out.println("test postConstruct HappyFortuneService");
	}
	
}
