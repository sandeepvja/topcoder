package com.sandeep.topcoder.srm640;

public class ChristmasTreeDecorationDiv2 {
	public int solve(int[] col, int[] x, int[] y) {
		
		int count = 0;
		for(int i = 0; i < x.length; i++) {
			if(col[x[i] - 1] != col[y[i] - 1]) {
				count++; 
			}
		}
		return count;
	}
}
