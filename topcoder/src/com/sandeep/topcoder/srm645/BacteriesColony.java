package com.sandeep.topcoder.srm645;

import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class BacteriesColony
{
	public int[] performTheExperiment(int[] colonies)
	{
		boolean changed = true;
		while(changed) {
			changed = false;
			int[] newColonies = new int[colonies.length];
			for(int i = 0; i < colonies.length; i++) {
				
				if(i == 0 || i == colonies.length - 1) {
					newColonies[i] = colonies[i];
				}
				else {
					if(colonies[i - 1] > colonies[i] && colonies[i + 1] > colonies[i]) {
						newColonies[i] = colonies[i] + 1;
						changed = true;
					}
					else if(colonies[i - 1] < colonies[i] && colonies[i + 1] < colonies[i]) {
						newColonies[i] = colonies[i] - 1;
						changed = true;
					}
					else {
						newColonies[i] = colonies[i];
					}
				}
			}
			colonies = newColonies;
		}
		return colonies;
	}
	
	public static void main(String[] args)
	{
		long time;
		int[] answer;
		boolean errors = false;
		int[] desiredAnswer;
		
		boolean same;
		
		time = System.currentTimeMillis();
		answer = new BacteriesColony().performTheExperiment(new int[]{5, 3, 4, 6, 1 });
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = new int[]{5, 4, 4, 4, 1 };
		System.out.println("Your answer:");
		if (answer.length > 0)
		{
			System.out.print("\t{ " + answer[0]);
			for (int i=1; i<answer.length; i++)
				System.out.print(", " + answer[i]);
			System.out.println(" }");
		}
		else
			System.out.println("\t{ }");
		System.out.println("Desired answer:");
		if (desiredAnswer.length > 0)
		{
			System.out.print("\t{ " + desiredAnswer[0]);
			for (int i=1; i<desiredAnswer.length; i++)
				System.out.print(", " + desiredAnswer[i]);
			System.out.println(" }");
		}
		else
			System.out.println("\t{ }");
		same = desiredAnswer.length == answer.length;
		for (int i=0; i<answer.length && same; i++)
			if (answer[i] != desiredAnswer[i])
				same = false;
		if (!same)
		{
			errors = true;
			System.out.println("DOESN'T MATCH!!!!");
		}
		else
			System.out.println("Match :-)");
		System.out.println();
		time = System.currentTimeMillis();
		answer = new BacteriesColony().performTheExperiment(new int[]{1, 5, 4, 9 });
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = new int[]{1, 4, 5, 9 };
		System.out.println("Your answer:");
		if (answer.length > 0)
		{
			System.out.print("\t{ " + answer[0]);
			for (int i=1; i<answer.length; i++)
				System.out.print(", " + answer[i]);
			System.out.println(" }");
		}
		else
			System.out.println("\t{ }");
		System.out.println("Desired answer:");
		if (desiredAnswer.length > 0)
		{
			System.out.print("\t{ " + desiredAnswer[0]);
			for (int i=1; i<desiredAnswer.length; i++)
				System.out.print(", " + desiredAnswer[i]);
			System.out.println(" }");
		}
		else
			System.out.println("\t{ }");
		same = desiredAnswer.length == answer.length;
		for (int i=0; i<answer.length && same; i++)
			if (answer[i] != desiredAnswer[i])
				same = false;
		if (!same)
		{
			errors = true;
			System.out.println("DOESN'T MATCH!!!!");
		}
		else
			System.out.println("Match :-)");
		System.out.println();
		time = System.currentTimeMillis();
		answer = new BacteriesColony().performTheExperiment(new int[]{78, 34, 3, 54, 44, 99 });
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = new int[]{78, 34, 34, 49, 49, 99 };
		System.out.println("Your answer:");
		if (answer.length > 0)
		{
			System.out.print("\t{ " + answer[0]);
			for (int i=1; i<answer.length; i++)
				System.out.print(", " + answer[i]);
			System.out.println(" }");
		}
		else
			System.out.println("\t{ }");
		System.out.println("Desired answer:");
		if (desiredAnswer.length > 0)
		{
			System.out.print("\t{ " + desiredAnswer[0]);
			for (int i=1; i<desiredAnswer.length; i++)
				System.out.print(", " + desiredAnswer[i]);
			System.out.println(" }");
		}
		else
			System.out.println("\t{ }");
		same = desiredAnswer.length == answer.length;
		for (int i=0; i<answer.length && same; i++)
			if (answer[i] != desiredAnswer[i])
				same = false;
		if (!same)
		{
			errors = true;
			System.out.println("DOESN'T MATCH!!!!");
		}
		else
			System.out.println("Match :-)");
		System.out.println();
		time = System.currentTimeMillis();
		answer = new BacteriesColony().performTheExperiment(new int[]{32, 68, 50, 89, 34, 56, 47, 30, 82, 7, 21, 16, 82, 24, 91 });
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = new int[]{32, 59, 59, 59, 47, 47, 47, 47, 47, 18, 18, 19, 53, 53, 91 };
		System.out.println("Your answer:");
		if (answer.length > 0)
		{
			System.out.print("\t{ " + answer[0]);
			for (int i=1; i<answer.length; i++)
				System.out.print(", " + answer[i]);
			System.out.println(" }");
		}
		else
			System.out.println("\t{ }");
		System.out.println("Desired answer:");
		if (desiredAnswer.length > 0)
		{
			System.out.print("\t{ " + desiredAnswer[0]);
			for (int i=1; i<desiredAnswer.length; i++)
				System.out.print(", " + desiredAnswer[i]);
			System.out.println(" }");
		}
		else
			System.out.println("\t{ }");
		same = desiredAnswer.length == answer.length;
		for (int i=0; i<answer.length && same; i++)
			if (answer[i] != desiredAnswer[i])
				same = false;
		if (!same)
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
