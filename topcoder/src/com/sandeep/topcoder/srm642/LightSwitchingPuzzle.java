package com.sandeep.topcoder.srm642;

public class LightSwitchingPuzzle {
	
	public static void main(String args[]) {
		LightSwitchingPuzzle switching = new LightSwitchingPuzzle();
		String state = "NYNNYNNNYNNNNYNNNNNYNNNNNNYNNNNNNNY";
		System.out.println(switching.minFlips(state));
	}
		
	public int minFlips(String state) {
		char c[] = state.toCharArray();
		int count = 0;
		for(int i = 0; i < c.length; i++) {
			if(c[i] == 'Y') {
				for(int j = i + 1; j <= state.length(); j += i+1) {
					c[j-1] = (c[j-1] == 'Y') ? 'N':'Y';
				}
				count++;
			}
		}
		return count;
	}
}
