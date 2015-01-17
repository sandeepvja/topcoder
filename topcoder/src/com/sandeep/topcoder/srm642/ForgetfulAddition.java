package com.sandeep.topcoder.srm642;

public class ForgetfulAddition {
	public static void main(String args[]) {
		ForgetfulAddition add = new ForgetfulAddition();
		System.out.println(add.minNumber("123"));
	}
	public int minNumber(String expression) {
		int length = expression.length();
		int min = Integer.MAX_VALUE;
		for(int i = 1; i < length; i++) {
			String addend1 = expression.substring(0, i);
			String addend2 = expression.substring(i);
			
			min = Math.min(Integer.parseInt(addend1) +Integer.parseInt(addend2), min);
			
		}
		return min;
	}
}
