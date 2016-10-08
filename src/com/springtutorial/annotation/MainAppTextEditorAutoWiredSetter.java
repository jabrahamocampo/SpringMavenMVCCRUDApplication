package com.springtutorial.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppTextEditorAutoWiredSetter {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		
		TextEditorAutoWiredSetter te = (TextEditorAutoWiredSetter) context.getBean("textEditorAutoWiredSetter");
		te.spellChecker();
	}
}
