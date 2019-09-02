package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	//Create no-arg constructor
	
	public CricketCoach() {
		System.out.println("Cricket Coach: Inside the constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Cricket Coach: Inside the Setter for Fortune");
	}
	
	//Setters
	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 minutes a day";
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket Coach: Inside Setter for Email");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
