package com.sandeep.topcoder.srm646;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


public class TheGridDivTwo
{
	
	class Pair{
		int x;
		int y;
		int k;
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}
		public Pair(int x, int y, int k) {
			super();
			this.x = x;
			this.y = y;
			this.k = k;
		}
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
		public int getK() {
			return k;
		}
		public void setK(int k) {
			this.k = k;
		}
		private TheGridDivTwo getOuterType() {
			return TheGridDivTwo.this;
		}
		
	}
	public int find(int[] x, int[] y, int k)
	{
		this.k = k;
		Set<Pair> blocked = new HashSet<Pair>();
		for(int i = 0; i < x.length; i++) {
			Pair p = new Pair(x[i], y[i], 0);
			blocked.add(p);
		}
		
		Pair cur = new Pair(0, 0, 0);
		int maxX = Integer.MIN_VALUE;
		LinkedList<Pair> queue = new LinkedList<>();
		queue.add(cur);
		
		Set<Pair> visited = new HashSet<Pair>();
		while(!queue.isEmpty()) {
			
			cur = queue.removeFirst();
			maxX = Math.max(cur.getX(), maxX);
			
			if(!visited.contains(cur)) {
			
				visited.add(cur);
				
				Pair east = new Pair(cur.getX() + 1, cur.getY(), cur.getK() + 1);
				Pair west = new Pair(cur.getX() - 1, cur.getY(), cur.getK() + 1);
				Pair north = new Pair(cur.getX(), cur.getY() + 1, cur.getK() + 1);
				Pair south = new Pair(cur.getX(), cur.getY() - 1, cur.getK() + 1);
				
				addToQueue(blocked, queue, east);
				addToQueue(blocked, queue, west);
				addToQueue(blocked, queue, north);
				addToQueue(blocked, queue, south);
			}
		}
		return maxX;
	}
	int k;
	private void addToQueue(Set<Pair> blocked, LinkedList<Pair> queue, Pair pair) {
		if(!blocked.contains(pair) && pair.getK() <= k) {
			queue.add(pair);
		}
	}

	public static void main(String[] args)
	{
		long time;
		int answer;
		boolean errors = false;
		int desiredAnswer;
		
		
		time = System.currentTimeMillis();
		answer = new TheGridDivTwo().find(new int[]{1,1,1,1}, new int[]{-2,-1,0,1}, 4);
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 2;
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
		answer = new TheGridDivTwo().find(new int[]{-1, 0, 0, 1}, new int[]{0, -1, 1, 0}, 9);
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 0;
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
		answer = new TheGridDivTwo().find(new int[]{}, new int[]{}, 1000);
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 1000;
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
		answer = new TheGridDivTwo().find(new int[]{1,0,0,-1,-1,-2,-2,-3,-3,-4,-4}, new int[]{0,-1,1,-2,2,-3,3,-4,4,-5,5}, 47);
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 31;
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
