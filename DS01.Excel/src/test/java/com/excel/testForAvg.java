package com.excel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import edu.learning.ds.ExcelChecker;

public class testForAvg {
	
	@Test
	//should be true
	void avgTest1()  {
		
		Excel excel = new Excel();
		Double actual = excel.avg(new Double[] {90d, 90d, 90d});
		Double expected = 90d;
		
		assertEquals(expected, actual);
		
	}
	

	@Test
	//should be true
	void avgTest2()  {
		
		Excel excel = new Excel();
		Double actual = excel.avg(new Double[] {90.5d, 90.5d, 90.5d});
		Double expected = 90.5d;
		
		assertEquals(expected, actual);
		
	}
	

	@Test
	//should be false
	void avgTest3()  {
		
		Excel excel = new Excel();
		Double actual = excel.avg(new Double[] {90.3d, 90.2d, 90.2d, 90.2, 90.5});
		Double expected = 70.24d;
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	void getResults() {
		Excel excel = new Excel();
		ExcelChecker.check(excel,"/Users/tahsinahmed/Desktop/CST3650/data/ahmed.tahsin");
	}
}
