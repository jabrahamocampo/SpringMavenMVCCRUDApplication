package com.springtutorial.configurationandbean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppEventHandler {
	public static void main(String[] args){
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		
		//Let us raise a start event
		context.start();
		
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		
		//Let us raise a stop event
		context.stop();
	}
}
