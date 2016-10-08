package com.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppTextEditorAutowiringByConstructor {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditorAutowiringByConstructor te = (TextEditorAutowiringByConstructor) context.getBean("textEditorAutowiringByConstructor");
		te.spellCheck();
	}
}
