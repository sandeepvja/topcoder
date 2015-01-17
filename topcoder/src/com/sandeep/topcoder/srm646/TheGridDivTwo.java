package com.sandeep.topcoder.srm646;

import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class TheGridDivTwo {
	
	class Return {
		int x;
		int y;
		int k;
		boolean blocked;
		
		Return(int x, int y, int k, boolean blocked) {
			this.x = x;
			this.y = y;
			this.k = k;
			this.blocked = blocked;
		}
		public void ret(){
			blocked = true;
		}
		public int getX() {
			return x;
		}
		public int getY() {
			return y;
		}
		public int getK(){
			return k;
		}
		public boolean isRet() {
			return blocked;
		}
	}
	public int find(int[] x, int[] y, int k) {
		int curX = 0;
		int curY = 0;

		Set<String> points = new HashSet<String>();
		
		for(int i = 0; i < x.length; i++) {
			points.add(x[i]+","+y[i]);
		}
		
		Return ret = find2(points, 0, curX, curY, k);
		return ret.getK();
	}

	public Return find2(Set<String> points, int k, int curX, int curY, int reqK) {
		String curPoint = curX + ","+curY;
		if (points.contains(curPoint)) {
			return new Return(curX, curY, k, true);
		}
		if(reqK == k) {
			return new Return(curX, curY, k, true);
		}

		Return a = find2(points, k + 1, curX + 1, curY, reqK);
		Return b = find2(points, k + 1, curX - 1, curY, reqK);
		Return c = find2(points, k + 1, curX, curY + 1, reqK);
		Return d = find2(points, k + 1, curX, curY - 1, reqK);

		int max = max(a.getX(), b.getX(), c.getX(), d.getX());
		
		if(max == a.getX()) {
			return a;
		}
		else if(max == b.getX()) {
			return b;
		}
		else if(max == c.getX()) {
			return c;
		}
		else {
			return d;
		}
	}

	public int max(int a, int b, int c, int d) {
		int minab = max(a, b);
		int mincd = max(c, d);

		return max(minab, mincd);
	}

	public int max(int a, int b) {
		return a >= b ? a : b;
	}

	public static void main(String[] args) {
		long time;
		int answer;
		boolean errors = false;
		int desiredAnswer;

		time = System.currentTimeMillis();
		answer = new TheGridDivTwo().find(new int[] { 1, 1, 1, 1 }, new int[] {
				-2, -1, 0, 1 }, 4);
		System.out.println("Time: " + (System.currentTimeMillis() - time)
				/ 1000.0 + " seconds");
		desiredAnswer = 2;
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		System.out.println("Desired answer:");
		System.out.println("\t" + desiredAnswer);
		if (answer != desiredAnswer) {
			errors = true;
			System.out.println("DOESN'T MATCH!!!!");
		} else
			System.out.println("Match :-)");
		System.out.println();
		time = System.currentTimeMillis();
		answer = new TheGridDivTwo().find(new int[] { -1, 0, 0, 1 }, new int[] {
				0, -1, 1, 0 }, 9);
		System.out.println("Time: " + (System.currentTimeMillis() - time)
				/ 1000.0 + " seconds");
		desiredAnswer = 0;
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		System.out.println("Desired answer:");
		System.out.println("\t" + desiredAnswer);
		if (answer != desiredAnswer) {
			errors = true;
			System.out.println("DOESN'T MATCH!!!!");
		} else
			System.out.println("Match :-)");
		System.out.println();
		time = System.currentTimeMillis();
		answer = new TheGridDivTwo().find(new int[] {}, new int[] {}, 1000);
		System.out.println("Time: " + (System.currentTimeMillis() - time)
				/ 1000.0 + " seconds");
		desiredAnswer = 1000;
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		System.out.println("Desired answer:");
		System.out.println("\t" + desiredAnswer);
		if (answer != desiredAnswer) {
			errors = true;
			System.out.println("DOESN'T MATCH!!!!");
		} else
			System.out.println("Match :-)");
		System.out.println();
		time = System.currentTimeMillis();
		answer = new TheGridDivTwo().find(new int[] { 1, 0, 0, -1, -1, -2, -2,
				-3, -3, -4, -4 }, new int[] { 0, -1, 1, -2, 2, -3, 3, -4, 4,
				-5, 5 }, 47);
		System.out.println("Time: " + (System.currentTimeMillis() - time)
				/ 1000.0 + " seconds");
		desiredAnswer = 31;
		System.out.println("Your answer:");
		System.out.println("\t" + answer);
		System.out.println("Desired answer:");
		System.out.println("\t" + desiredAnswer);
		if (answer != desiredAnswer) {
			errors = true;
			System.out.println("DOESN'T MATCH!!!!");
		} else
			System.out.println("Match :-)");
		System.out.println();

		if (errors)
			System.out.println("Some of the test cases had errors :-(");
		else
			System.out
					.println("You're a stud (at least on the test data)! :-D ");
	}

}
// Powered by [KawigiEdit] 2.0!
