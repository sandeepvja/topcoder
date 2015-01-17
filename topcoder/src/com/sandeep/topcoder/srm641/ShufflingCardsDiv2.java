package com.sandeep.topcoder.srm641;

public class ShufflingCardsDiv2 {
	public static void main(String args[]) {
		ShufflingCardsDiv2 shuffle = new ShufflingCardsDiv2();
		int[] permutation = new int[]{8, 5, 4, 9, 1, 7, 6, 10, 3, 2};
		System.out.println(shuffle.shuffle(permutation));
	}
	public String shuffle(int[] permutation){
		
		for(long i = 0; i < Math.pow(2, 40); i++) {
			
		}
		int n2 = permutation.length;
		int n = n2/2;
		int oddcount=0, evencount=0;
		int oddcount2=0, evencount2=0;
		//even
		if(n % 2 == 0) {
			oddcount = n/2;
			evencount = n/2;
		}
		else {
			oddcount = n/2 + 1;
			evencount = n/2 ;
		}
		
		for(int i = 0; i < n2; i++) {
			if(permutation[i] > n) {
				if(i % 2 == 0) {
					evencount2++;
				}
				else {
					oddcount2++;
				}
			}
		}
		if(evencount == evencount2 && oddcount == oddcount2) {
			return "Possible";
		}
		else {
			return "Impossible";
		}
	}
}
 