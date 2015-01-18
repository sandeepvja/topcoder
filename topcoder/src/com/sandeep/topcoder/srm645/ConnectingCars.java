package com.sandeep.topcoder.srm645;

import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

import javax.annotation.PostConstruct;
import javax.crypto.spec.PSource;

public class ConnectingCars
{
	class Pair implements Comparable<Pair>{
		int x;
		int y;
		
		public Pair(int x, int y) {
			
			this.x = x;
			this.y = y;
		}

		@Override
		public int compareTo(Pair o) {
			if(x < o.x) {
				return -1;
			}
			else {
				return 1;
			}
		}

		@Override
		public String toString() {
			return "Pair [x=" + x + ", y=" + y + "]";
		}
		
	}
	public long minimizeCost(int[] positions, int[] lengths)
	{
		  	Pair list[] = new Pair[positions.length];
		    for (int i = 0; i < positions.length; ++i) {
		    	list[i] = new Pair(positions[i], positions[i] + lengths[i]);
		    }
		    
		    Arrays.sort(list);
		    long sum = 0L;
		    long n = positions.length;
		    for(int i = 0; i < n - 1; i++) {
		    	long leftDist = i + 1;
		    	long rightDist = n - i - 1;
		    	
		    	long gap = list[i + 1].x - list[i].y;
		    	
		    	long minDist = gap * Math.min(leftDist, rightDist);
		    	
		    	sum += minDist;
		    }
		    
		    return sum; 
	}
	
	public static void main(String[] args)
	{
		long time;
		long answer;
		boolean errors = false;
		long desiredAnswer;
		
		
		time = System.currentTimeMillis();
		answer = new ConnectingCars().minimizeCost(new int[]{1, 3, 10, 20}, new int[]{2, 2, 5, 3});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 15L;
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		System.out.println("Desired answer:");
		System.out.println("\t" + desiredAnswer);
		if (answer != desiredAnswer)
		{
			errors = true;
			System.out.println("DOESN'T MATCH!!!!");
		}
		else
			System.out.println("Match :-)");
		System.out.println();
		time = System.currentTimeMillis();
		answer = new ConnectingCars().minimizeCost(new int[]{100, 50, 1}, new int[]{10, 2, 1});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 96L;
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		System.out.println("Desired answer:");
		System.out.println("\t" + desiredAnswer);
		if (answer != desiredAnswer)
		{
			errors = true;
			System.out.println("DOESN'T MATCH!!!!");
		}
		else
			System.out.println("Match :-)");
		System.out.println();
		time = System.currentTimeMillis();
		answer = new ConnectingCars().minimizeCost(new int[]{4, 10, 100, 13, 80}, new int[]{5, 3, 42, 40, 9});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 66L;
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		System.out.println("Desired answer:");
		System.out.println("\t" + desiredAnswer);
		if (answer != desiredAnswer)
		{
			errors = true;
			System.out.println("DOESN'T MATCH!!!!");
		}
		else
			System.out.println("Match :-)");
		System.out.println();
		time = System.currentTimeMillis();
		answer = new ConnectingCars().minimizeCost(new int[]{5606451, 63581020, 81615191, 190991272, 352848147, 413795385, 468408016, 615921162, 760622952, 791438427}, new int[]{42643329, 9909484, 58137134, 99547272, 39849232, 15146704, 144630245, 604149, 15591965, 107856540});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 1009957100L;
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		System.out.println("Desired answer:");
		System.out.println("\t" + desiredAnswer);
		if (answer != desiredAnswer)
		{
			errors = true;
			System.out.println("DOESN'T MATCH!!!!");
		}
		else
			System.out.println("Match :-)");
		System.out.println();
		
		
		if (errors)
			System.out.println("Some of the test cases had errors :-(");
		else
			System.out.println("You're a stud (at least on the test data)! :-D ");
	}

}
//Powered by [KawigiEdit] 2.0!
