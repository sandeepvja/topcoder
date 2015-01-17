package com.sandeep.topcoder.srn643;

import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class TheKingsArmyDiv2
{
	public int getNumber(String[] state)
	{
		boolean atleastOneHappy = false, adjHappy  = false;
		for(int i = 0; i < state.length; i++) {
			for(int j = 0; j < state[i].length(); j++) {
				if(j+1 < state[i].length() && state[i].charAt(j) == 'H' && state[i].charAt(j + 1) == 'H') {
					adjHappy = true;
					break;
				}
				else if(j - 1 >=0 && state[i].charAt(j) == 'H' && state[i].charAt(j - 1) == 'H') {
					adjHappy = true;
					break;
				}
				else if(i - 1 >= 0 && state[i].charAt(j) == 'H' && state[i - 1].charAt(j) == 'H') {
					adjHappy = true;
					break;
				}
				else if(i + 1 < state.length && state[i].charAt(j) == 'H' && state[i + 1].charAt(j) == 'H') {
					adjHappy = true;
					break;
				}
				else if(state[i].charAt(j) == 'H') {
					atleastOneHappy = true;
				}
			}
		}
		if(adjHappy) {
			return 0;
		}
		else if(atleastOneHappy) {
			return 1;
		}
		else {
			return 2;
		}
	}
	
	public static void main(String[] args)
	{
		long time;
		int answer;
		boolean errors = false;
		int desiredAnswer;
		
		
		time = System.currentTimeMillis();
		answer = new TheKingsArmyDiv2().getNumber(new String[]{"HSSSS", "HSSSS", "SSSSS"});
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
		answer = new TheKingsArmyDiv2().getNumber(new String[]{"SSSSS", "SSHSH", "HSSSS"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 1;
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
		answer = new TheKingsArmyDiv2().getNumber(new String[]{"SSS", "SSS", "SSS"});
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
		answer = new TheKingsArmyDiv2().getNumber(new String[]{"HSHSHSH", "SSSHSSS", "SSHSHSS", "SHSHSHS"});
		System.out.println("Time: " + (System.currentTimeMillis()-time)/1000.0 + " seconds");
		desiredAnswer = 1;
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
		answer = new TheKingsArmyDiv2().getNumber(new String[]{"HHSH", "HHHS", "HSSS", "SHSH", "HHHS", "HSHH", "SSSH"});
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
		
		
		if (errors)
			System.out.println("Some of the test cases had errors :-(");
		else
			System.out.println("You're a stud (at least on the test data)! :-D ");
	}

}
//Powered by [KawigiEdit] 2.0!
