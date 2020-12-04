package com.excel;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class testForMax {
	@Test
	//should be true
	void maxTest1()  {
		
		Excel excel = new Excel();
		Double actual = excel.max(new Double[] {90d, 90d, 90d});
		Double expected = 90d;
		
		assertEquals(expected, actual);
		
	}

	@Test
	//should be true
	void maxTest2()  {
		
		Excel excel = new Excel();
		Double actual = excel.max(new Double[] {1d, 2d, 3d});
		Double expected = 3d;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	//should be true
	void maxTest3()  {
		
		Excel excel = new Excel();
		Double actual = excel.max(new Double[] {.001d, .01d, .1d});
		Double expected = .1d;
		
		assertEquals(expected, actual);
		
	}
}
