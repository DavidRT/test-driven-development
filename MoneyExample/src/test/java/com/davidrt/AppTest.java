package com.davidrt;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void multiplication() {
		Dollar five = new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15), five.times(3));
	}
	
	@Test
	public void twoSameValueDollarsShouldBeEquals(){
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}

}
