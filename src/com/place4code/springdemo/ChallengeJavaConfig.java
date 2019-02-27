package com.place4code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChallengeJavaConfig {

	@Bean
	FortuneService challengeFortune() {
		return new ChallengeFortune();
	}
	
	@Bean
	Coach challengeCoach(FortuneService challengeFortune) {
		return new ChallengeCoach(challengeFortune);
	}
}
