package com.springtutorial.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppTextEditorAutowiredConstructor {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		TextEditorAutowiredConstructor te = (TextEditorAutowiredConstructor)context.getBean("textEditorAutowireConstructor");
		te.spellCheck();
	}
}
