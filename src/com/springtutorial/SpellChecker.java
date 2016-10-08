package com.springtutorial;

public class SpellChecker {
	
	private String versionName;
	private String versionNumber;
	
	public SpellChecker(){
		System.out.println("Inside SpellChecker constructor");
	}
	
	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public String getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public void checkSpelling(){
		System.out.println("Inside checkSpelling method");
	}
}
