package com.sandeep.topcoder.srm645;

import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

import javax.annotation.PostConstruct;

public class ConnectingCars
{
	class Point implements Comparable<Point>{
		int x;
		int y;
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		@Override
		public int compareTo(Point that) {
			if(this.x > that.x) {
				return 1;
			}
			else if(this.x < that.x) {
				return -1;
			}
			else {
				return 0;
			}
		}
		public int distance(Point that) {
			return Math.abs(this.y - that.x);
		}
	}
	public long minimizeCost(int[] positions, int[] lengths)
	{
		int size = positions.length;
		int middle = size % 2 == 0 ? size/2 - 1 : size/2 ;
		
		long energy = 0;
		List<Point> points = new ArrayList<Point>();
		for(int i = 0; i < positions.length; i++) {
			Point p = new Point();
			p.setX(positions[i]);
			p.setY(positions[i] + lengths[i]);
			
			points.add(p);
		}
		
		Collections.sort(points);
		
		long leftDist = 0;
		for(int i = 1; i <= middle; i++) {
			Point p1 = points.get(i - 1);
			Point p2 = points.get(i);
			leftDist = leftDist + i * p1.distance(p2);
		}
		
		long rightDist = 0;

		for(int i = middle + 1; i < positions.length - 1; i++) {
			Point p1 = points.get(i);
			Point p2 = points.get(i + 1);
			rightDist = rightDist + (i + 1 - middle) * p1.distance(p2);
		}
		
		return rightDist + leftDist;
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
