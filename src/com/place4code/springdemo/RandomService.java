package com.place4code.springdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	@Override
	public String getFortune() {
		return "Random service";
	}
	
	@Override
	public String randomFortune() {
		
		List<String> fortunes = new ArrayList<String>();
		String line;
		
		try(BufferedReader br = new BufferedReader(new FileReader("fortune.txt"))) {
			
			while((line = br.readLine()) != null) {
				fortunes.add(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		for(String value: fortunes) {
			System.out.println("Value from List: " + value);
		}
		
		Random random = new Random();
		
		
		
		return fortunes.get(random.nextInt(fortunes.size()));
	}
	
	

}
