package com.sandeep.topcoder.srm646;

import java.util.LinkedList;

public class TheGridDivTwo
{
	class Point{
		int x;
		int y;
		int dist;
		Point(int x, int y, int dist) {
			this.x = x;
			this.y = y;
			this.dist = dist;
		}
	}
	int grid[][] = new int[2001][2001];
	int moves[][] = {{1,0}, {-1, 0}, {0, 1}, {0, -1}};
	int origin = 1000;
	public int find(int[] x, int[] y, int k)
	{
		int maxDist = 0;
		int maxX = origin;
		
		for(int i = 0; i < x.length; i++) {
			grid[origin + x[i]][origin + y[i]] = -1;
		}
		
		LinkedList<Point> que = new LinkedList<Point>();
		que.add(new Point(origin, origin, 0));
		
		while(!que.isEmpty()) {
			
			Point cur = que.removeFirst();
			
			if(cur.x > maxX) {
				maxX = cur.x;
			}
			
			if(cur.dist < k) {
				for(int i = 0; i < moves.length; i++) {
					
					int newX = cur.x + moves[i][0];
					int newY = cur.y + moves[i][1];
					int newDist = cur.dist + 1;
					
					if(grid[newX][newY] != -1) {
						grid[newX][newY] = -1;
						que.add(new Point(newX, newY, newDist));
					}
				}
			}
		}
		return maxX - origin;
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
