package com.davidrt;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LogAnalyzerTest {
	
	private LogAnalyzer analyzer;
	
	@Before
	public void runBeforeAnyMethod(){
		analyzer = new LogAnalyzer();
	}
	
	@After
	public void runAfterAnyMethod(){
		analyzer = null;
	}
	
	@Test
	public void isValidFileName_validFileLowerCased_returnsTrue() {		
		// act
		boolean result = analyzer.isValidLogFileName("example.slf");
		
		// assert
		assertTrue("filename should be valid!", result);
	}
	
	@Test
	public void isValidFileName_validFileUpperCased_returnsTrue(){
		boolean result = analyzer.isValidLogFileName("example.SLF");
		assertTrue("Filename sould be valid", result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void isValidFileName_emptyFileName_throwsException(){
		analyzer.isValidLogFileName("");
	}
	
	@Test
	public void isValidFileName_valid_remembersTrue(){
		analyzer.isValidLogFileName("example.slf");
		assertTrue(analyzer.isWasLastFileNameValid());
	}
	
	@Test
	public void isValidFileName_nameShorterThan6CharsButSupportedExtension_returnsFalse(){
		StubExtensionManager fakeExtension = new StubExtensionManager();
		fakeExtension.setShouldExtensionBeValid(true);
		
		LogAnalyzer analyzer = new LogAnalyzer(fakeExtension);
		assertFalse(analyzer.isValidLogFileName("short.ext"));
	}

}
