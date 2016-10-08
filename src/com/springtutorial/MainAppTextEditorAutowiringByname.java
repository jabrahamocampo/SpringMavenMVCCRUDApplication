package com.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppTextEditorAutowiringByname {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditorAutowirngByname te = (TextEditorAutowirngByname) context.getBean("TextEditorAutowirngBynamee");
		te.spellChecking();
		System.out.println(te.getName());
	
		
	}
}
