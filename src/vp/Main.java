package vp;

import java.util.*;
import frame.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String S1 = new String("1, 2, 3");
//		String S2 = new String("x, y, z");
//		
//		String A = new String(">2");
//		String B = new String("=1");
//		
//		String F = new String("P(A&B)");
		
		Scanner scan = new Scanner(System.in);
		String input;

//		int flag;
		
		Problem problem1 = new Problem();
		
		// ***** All the processes after clicking submit button *****
		// if add more sample
		//System.out.println("Choose: (1)Permutation, (2)Combination: ");
		//flag = scan.nextInt(); 
		
		System.out.println("Enter sample 1: ");
		input = scan.next(); 
		problem1.createObjectSample(input);
		
		System.out.println("Enter sample 2: ");
		input = scan.next(); 
		problem1.createObjectSample(input);
		
		System.out.println("Enter event 1: ");
		input = scan.next(); 
		problem1.createObjectEvent(input);
		
		System.out.println("Enter event 2: ");
		input = scan.next(); 
		problem1.createObjectEvent(input);
		
		System.out.println("Enter formula: ");
		input = scan.next(); 
		problem1.createObjectFormula(input);
		
//		if(flag==1)
//			problem1.permutation();
//		else if(flag==2)
//			problem1.combination();
//		else
//			System.out.println("Wrong input.");
		
		System.out.println("\n\nproblem1.eventList(); ******");
		problem1.eventList();
		System.out.println("\n\nproblem1.formulaList(); ******");
		problem1.formulaList();
		//System.out.println("\n\nproblem1.calculations(); ******");
		//problem1.calculations();

		System.out.println("\n\n***END***");
//		List<String> S1 = new ArrayList<String>();
//		List<String> S2 = new ArrayList<String>();
//		List<String> S3 = new ArrayList<String>();
//		//List<String> S4 = new ArrayList<String>();
//		
//		S1.add("1");
//		S1.add("2");
//		S1.add("3");
//		
//		S2.add("x");
//		S2.add("y");
//		S2.add("z");
//		
//		S3.add("+");
//		S3.add("-");
//		S3.add("=");
		
//		S4.add("a");
//		S4.add("b");
//		S4.add("c");

		
//		String S = "11, 12, 13, 14";
		

	}

}
