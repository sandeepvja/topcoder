package com.sandeep.topcoder.srm641;

/*
 * Div2 250-point problem
 */

public class BuyingTshirts {
	public int meet(int T, int[] Q, int[] P) {
		int length = Q.length;
		int count1=0;
		int count2=0;
		boolean person1 = false;
		boolean person2 = false;
		int together = 0;
		for(int i = 0; i < length; i++) {
			count1 += Q[i];
			count2 += P[i];
			if(count1 >= T) {
				count1 -= T;
				person1 = true;
			}
			if(count2 >= T) {
				count2 -= T;
				person2 = true;
			}
			if(person1&&person2) {
				together++;
			}
			person1 = false;
			person2 = false;
		}
		return together;
	}
}