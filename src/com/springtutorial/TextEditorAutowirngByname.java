package com.springtutorial;

public class TextEditorAutowirngByname {
	
	private SpellChecker spellChecker;
	private String name;
	
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void spellChecking(){
		spellChecker.checkSpelling();
	}
	
}
