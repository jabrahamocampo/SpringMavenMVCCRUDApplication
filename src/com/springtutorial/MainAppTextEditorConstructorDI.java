package com.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppTextEditorConstructorDI {
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditorConstructorDI te = (TextEditorConstructorDI)context.getBean("textEditorConstructorDI");
		te.spellChecking();
		
		System.out.println(te.getVersionName());
		System.out.println(te.getVersionNumber());
		
	}
}
