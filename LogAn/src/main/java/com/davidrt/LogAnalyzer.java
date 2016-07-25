package com.davidrt;

public class LogAnalyzer {

	private boolean wasLastFileNameValid;
	private ExtensionManager extensionManager;
	
	public LogAnalyzer() {
		extensionManager = new FileExtensionManager();
	}
	
	public LogAnalyzer(ExtensionManager extensionManager){
		this.extensionManager = extensionManager;
	}

	public boolean isValidLogFileName(String fileName) {
		
		boolean result = extensionManager.isValid(fileName);
		wasLastFileNameValid = result ? true : false;
		
		if (fileName.trim().split("\\.")[0].length() < 6) return false;
		return result;

	}

	public boolean isWasLastFileNameValid() {
		return wasLastFileNameValid;
	}

	public void setWasLastFileNameValid(boolean wasLastFileNameValid) {
		this.wasLastFileNameValid = wasLastFileNameValid;
	}

}
