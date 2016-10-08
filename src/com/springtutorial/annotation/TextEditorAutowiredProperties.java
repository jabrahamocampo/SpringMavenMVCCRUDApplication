package com.springtutorial.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import com.springtutorial.SpellChecker;

public class TextEditorAutowiredProperties {
	
	@Autowired
	private SpellChecker spellChecker;
	
	public TextEditorAutowiredProperties(){
		System.out.println("Inside Text Editor Constructor");
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	
	public void spellCheck(){
		spellChecker.checkSpelling();
	}
}
