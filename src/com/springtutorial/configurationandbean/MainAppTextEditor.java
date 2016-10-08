package com.springtutorial.configurationandbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppTextEditor {
	public static void main(String[] args){
		ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);
		TextEditor te = ctx.getBean(TextEditor.class);
		te.spellChecker();
	}
}
