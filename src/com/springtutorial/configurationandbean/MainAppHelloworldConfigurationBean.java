package com.springtutorial.configurationandbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppHelloworldConfigurationBean {
	public static void main(String[] args){
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		
		helloWorld.setMessage("Vamos bien con Dios!");
		String msg = helloWorld.getMessage();
		System.out.println(msg);
	}
}
