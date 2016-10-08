package com.springtutorial.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import com.springtutorial.SpellChecker;

public class TextEditorAutoWiredSetter {
	private SpellChecker spellChecker;

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	
	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public void spellChecker(){
		spellChecker.checkSpelling();
	}
	
}
