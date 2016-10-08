package com.springtutorial;

public class TextEditorAutowiringByConstructor {
	
	private SpellChecker spellChecker;
	private String name;
	
	public TextEditorAutowiringByConstructor(SpellChecker spellChecker, String name){
		this.spellChecker = spellChecker;
		this.name = name;
	}

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
	
	public void spellCheck(){
		spellChecker.checkSpelling();
	}
}
