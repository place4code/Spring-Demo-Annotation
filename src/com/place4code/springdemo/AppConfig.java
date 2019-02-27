package com.place4code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:options.properties")
//@ComponentScan("com.place4code.springdemo")
public class AppConfig {
	
	//define bean for our sad fortune service
	@Bean 
	public FortuneService sadFortuneService() { // sadFortuneService = id
		return new SadFortuneService();
	}
 	//define bean for our swimCoach and DI
	@Bean 
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
