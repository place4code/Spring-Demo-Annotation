package com.place4code.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "getFortune >> SadFortuneService";
	}

	@Override
	public String randomFortune() {
		// TODO Auto-generated method stub
		return "randomFortune() >> SadFortuneService";
	}

}
