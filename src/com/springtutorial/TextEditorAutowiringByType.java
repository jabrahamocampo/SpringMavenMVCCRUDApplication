package com.springtutorial;

public class TextEditorAutowiringByType {
	
	private SpellChecker spellchecker;
	private String name;
	public SpellChecker getSpellchecker() {
		return spellchecker;
	}
	public void setSpellchecker(SpellChecker spellchecker) {
		this.spellchecker = spellchecker;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void spellChecking(){
		spellchecker.checkSpelling();
	}
	
}
