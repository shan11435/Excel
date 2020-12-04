package com.excel;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testForMin {
	@Test
	//should be true
	void minTest1()  {
		
		Excel excel = new Excel();
		Double actual = excel.min(new Double[] {3d, 2d, 1d});
		Double expected = 1d;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	//should be true
	void minTest2()  {
		
		Excel excel = new Excel();
		Double actual = excel.min(new Double[] {.1d, .01d, .001d});
		Double expected = .001d;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	//should be true
	void minTest3()  {
		
		Excel excel = new Excel();
		Double actual = excel.min(new Double[] {4d, 7d, 1d});
		Double expected = 1d;
		
		assertEquals(expected, actual);
		
	}

}
