package com.sandeep.topcoder.srm643;

public class OkonomiyakiShop {
	public int count(int[] osize, int K) {
		int count=0;
		for(int i = 0; i < osize.length; i++) {
			for(int j = i + 1; j < osize.length; j++) {
				if(Math.abs(osize[i] - osize[j]) <= K) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String args[]) {
		OkonomiyakiShop sh = new OkonomiyakiShop();
		int[] osize = {1,1,3,3,3};
		System.out.println(sh.count(osize, 2));
	}
}
