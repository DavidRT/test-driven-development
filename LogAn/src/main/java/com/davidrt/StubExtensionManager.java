package com.davidrt;

public class StubExtensionManager  implements ExtensionManager{
	
	private boolean shouldExtensionBeValid;

	public boolean isValid(String fileName) {
		return shouldExtensionBeValid;
	}

	public void setShouldExtensionBeValid(boolean shouldExtensionBeValid) {
		this.shouldExtensionBeValid = shouldExtensionBeValid;
	}
	

}
