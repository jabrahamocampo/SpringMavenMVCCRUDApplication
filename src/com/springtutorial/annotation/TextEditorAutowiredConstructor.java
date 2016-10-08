package com.springtutorial.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import com.springtutorial.SpellChecker;

public class TextEditorAutowiredConstructor {
	
	private SpellChecker spellChecker;
	
	@Autowired
	public TextEditorAutowiredConstructor(SpellChecker spellChecker){
		this.spellChecker = spellChecker;
		System.out.println("Inside Text Editor Constructor****");
	}
	
	public void spellCheck(){
		spellChecker.checkSpelling();
	}
}
