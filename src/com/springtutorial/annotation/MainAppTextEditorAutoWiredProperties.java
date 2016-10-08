package com.springtutorial.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppTextEditorAutoWiredProperties {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		
		TextEditorAutowiredProperties te = (TextEditorAutowiredProperties) context.getBean("textEditorAutowireProperties");
		te.spellCheck();
	}
}
