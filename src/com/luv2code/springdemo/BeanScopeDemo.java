package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		
		//LOAD CONFIG FILE
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//RETRIEVE BEAN FROM CONTAINER
		Coach coach1 = ctx.getBean("myCoach", Coach.class);
		Coach coach2 = ctx.getBean("myCoach", Coach.class);
		
		boolean result = coach1 == coach2;
		System.out.println("\nAre they the same object? " + result);
		System.out.println("MEM LOC OF COACH1: " + coach1);
		System.out.println("MEM LOC OF COACH2: " + coach2);
		
		//CLOSE THE CONTEXT
		ctx.close();
		
		
	}

}
