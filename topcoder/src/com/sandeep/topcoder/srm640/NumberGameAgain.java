package com.sandeep.topcoder.srm640;

import java.util.HashSet;
import java.util.Set;

public class NumberGameAgain {
	public static void main(String[] args) {
		NumberGameAgain game = new NumberGameAgain();
		int k = 40;
		long[] table = {2,4,8,16,32141531,2324577,1099511627775l,2222222222l,33333333333l,4444444444l,2135};
		System.out.println(game.solve(k, table));
	}
	public long solve(int k, long[] table) {
		long nums = (long) Math.pow(2, k) - 1;
		Set<Long> set = new HashSet<Long>();
		boolean forbidden = false;
		long count = 0;
		for(long ele : table) {
			set.add(ele);
		}
		
		for(long i = nums; i >= 1; i--) {
			long j = i;
			while(j > 1) {
				if(!set.contains(j)) {
					j = j/2;
					set.add(j);
				}
				else {
					forbidden = true;
					break;
				}
			}
			if(!forbidden) {
				count++;
			}
			forbidden = false;
		}
		return count;
	}
}
