package com.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppSingleton {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld objectA = (HelloWorld)context.getBean("helloWorldSingleton");
		objectA.setMessage("This is object A");
		objectA.getMessage();
		HelloWorld objectb = (HelloWorld)context.getBean("helloWorldSingleton");
		objectb.getMessage();
	}
}
