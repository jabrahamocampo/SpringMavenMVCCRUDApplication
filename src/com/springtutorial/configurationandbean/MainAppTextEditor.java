package com.springtutorial.configurationandbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springtutorial.SpellChecker;

public class MainAppTextEditor {
	public static void main(String[] args){
		ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);
		TextEditor te = ctx.getBean(TextEditor.class);
		te.spellChecker();
		
	}
}
