package com.davidrt;

public class FileExtensionManager implements ExtensionManager{
	
	public boolean isValid(String fileName){
		
		if (fileName.trim().length() == 0){
			throw new IllegalArgumentException("No filename provided!");
		}
		
		if (!fileName.toLowerCase().endsWith(".slf")){
			return false;
		}
		
		return true;
	}

}
