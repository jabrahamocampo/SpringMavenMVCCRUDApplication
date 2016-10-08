package com.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppTextEditorAutowiringByType {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		TextEditorAutowiringByType te = (TextEditorAutowiringByType)context.getBean("textEditorAutowiringByType");
		
		te.spellChecking();
		System.out.println(te.getName());
		SpellChecker sp = te.getSpellchecker();
		System.out.println(sp.getVersionName());
	}
}
