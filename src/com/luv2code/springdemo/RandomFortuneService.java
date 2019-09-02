package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private String[] randomLuck = {"Unlucky", "Neutral", "Lucky"};
	
	@Override
	public String getFortune() {
		Random r = new Random();
		int i = r.nextInt(3);
		return randomLuck[i];
	}

}
