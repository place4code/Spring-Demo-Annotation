package com.place4code.springdemo;

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

}
