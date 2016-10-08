package com.springtutorial;

public class TextEditorConstructorDI {
	private SpellChecker spellChecker;
	
	public TextEditorConstructorDI(SpellChecker spellChecker){
		System. out. println("**********Inside TextEditor constructor." );
		this.spellChecker = spellChecker;
	}
	
	public void spellChecking(){
		spellChecker.checkSpelling();
	}
	
	public String getVersionName(){
		return spellChecker.getVersionName();
	}
	
	public String getVersionNumber(){
		return spellChecker.getVersionNumber();
	}
}
