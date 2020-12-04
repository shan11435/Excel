package com.excel;

import edu.learning.ds.IExcel;

public class Excel implements IExcel {

	public Double sum(Double[] arg0) {
		Double sum = 0.0;
		for(int i = 0; i < arg0.length; i++) {
			sum = sum + arg0[i];
		}
		return sum;
	}

	@Override
	public Double avg(Double[] arg0) {
		Double avg = 0.0;
		for(int i = 0; i < arg0.length; i++) {
			avg = avg + arg0[i] / arg0.length;
		}
		return avg;
	}

	@Override
	public Double max(Double[] arg0) {
		 double maxValue = arg0[0]; 
		    for(int i=1;i < arg0.length;i++){ 
		      if(arg0[i] > maxValue){ 
		         maxValue = arg0[i]; 
		      } 
		    } 
		    return maxValue; 
		  }
	

	@Override
	public Double min(Double[] arg0) {
		 double minValue = arg0[0]; 
		    for(int i=1;i < arg0.length;i++){ 
		      if(arg0[i] < minValue){ 
		         minValue = arg0[i]; 
		      } 
		    } 
		    return minValue; 
		  }
	}


