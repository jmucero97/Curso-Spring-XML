package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		
		//LOAD CONFIG FILE
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		//RETRIEVE BEAN FROM CONTAINER
		Coach coach1 = ctx.getBean("myCoach", Coach.class);

		
		//CLOSE THE CONTEXT
		ctx.close();
		
		
	}

}
