package com.excel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testForSum {
	@Test
	//should be true
	void sumTest1()  {
		
		Excel excel = new Excel();
		Double actual = excel.sum(new Double[] {90d, 90d, 90d});
		Double expected = 270d;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	//should be false
	void sumTest2()  {
		
		Excel excel = new Excel();
		Double actual = excel.sum(new Double[] {90d, 90d, 90d});
		Double expected = 260d;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void sumTest3() {
		
		Excel excel = new Excel();
		Double actual = excel.sum(new Double[] {90.01d, 90.02d, 90.07d});
		Double expected = 270.1d;
		
		assertEquals(expected, actual);
		
	}
	
	
}
