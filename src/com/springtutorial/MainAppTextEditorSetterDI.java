package com.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppTextEditorSetterDI {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditorSetterDI te = (TextEditorSetterDI) context.getBean("textEditorSetterDI");
		te.getSpellChecker();
	}
}
