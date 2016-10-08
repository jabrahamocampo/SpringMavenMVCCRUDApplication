package com.springtutorial.configurationandbean;

import com.springtutorial.SpellChecker;

public class TextEditor {
	
	private SpellChecker spellChecker;
	
	public TextEditor(SpellChecker spellChecker){
		System.out.println("Inside text editor constructor");
		this.spellChecker = spellChecker;
	}
	
	public void spellChecker(){
		spellChecker.checkSpelling();
	}
}
