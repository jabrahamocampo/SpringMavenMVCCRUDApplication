package com.springtutorial;

public class HelloWorld {
	private String message;
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public void getMessage(){
		System.out.println("Your Message : " + message);
	}
	
	public void init(){
		System.out.println("Initialized bean using init property in xml bean");
	}
	
	public void destroy(){
		System.out.println("Destroy bean using init property in xml bean");
	}
	
}
