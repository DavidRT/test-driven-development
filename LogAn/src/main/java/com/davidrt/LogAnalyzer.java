package com.davidrt;

public class LogAnalyzer {
	
	private boolean wasLastFileNameValid;
	
	public boolean isValidLogFileName(String fileName){
		
		if (fileName.trim().length() == 0){
			throw new IllegalArgumentException("No filename provided!");
		}
		
		if (!fileName.toLowerCase().endsWith(".slf")){
			wasLastFileNameValid = false;
			return false;
		}
		
		wasLastFileNameValid = true;
		return true;
	}

	public boolean isWasLastFileNameValid() {
		return wasLastFileNameValid;
	}

	public void setWasLastFileNameValid(boolean wasLastFileNameValid) {
		this.wasLastFileNameValid = wasLastFileNameValid;
	}

}
