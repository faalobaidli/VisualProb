package vp;

import java.util.*;
//import frame.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1 = new String("1, 2, 3");
		String S2 = new String("coin");
		
		String A = new String("*,2");
		//String B = new String("=2");
		//String C = new String("=y");
				
		Scanner scan = new Scanner(System.in);
		String input;
		List<String> samples = new ArrayList<String>();
		List<String> events = new ArrayList<String>();
		String formula = null;

//		int flag;
		
		Problem problem1;
		
		
		samples.add(S1);
		samples.add(S2);
		
		events.add(A);
		//events.add(B);
		//events.add(C);
		
		formula = "P(A)";
		//formula = "P(A&B)";
		//formula = "P((A&B)|C))";		
		
		// ***** All the processes after clicking submit button *****
		// if add more sample
		//System.out.println("Choose: (1)Permutation, (2)Combination: ");
		//flag = scan.nextInt(); 
		
//		System.out.println("Enter sample 1: ");
//		input = scan.next(); 
//		samples.add(input);
////		problem1.createObjectSample(input);
////		
//		System.out.println("Enter sample 2: ");
//		input = scan.next(); 
//		samples.add(input);
////		problem1.createObjectSample(input);
////		
//		System.out.println("Enter event 1: ");
//		input = scan.next(); 
//		events.add(input);
////		problem1.createObjectEvent(input);
////		
//		System.out.println("Enter event 2: ");
//		input = scan.next(); 
//		events.add(input);
////		problem1.createObjectEvent(input);
////		
//		System.out.println("Enter formula: ");
//		formula = scan.next(); 
////		problem1.createObjectFormula(input);
//		
		problem1 = new Problem(samples, events, formula,1);
		//System.out.println(problem1.resultString());
		
//		if(flag==1)
//			problem1.permutation();
//		else if(flag==2)
//			problem1.combination();
//		else
//			System.out.println("Wrong input.");
		
//		System.out.println("\n\nproblem1.eventList(); ******");
//		problem1.eventList();
//		System.out.println("\n\nproblem1.formulaList(); ******");
//		problem1.formulaList();
		//System.out.println("\n\nproblem1.calculations(); ******");
		//problem1.calculations();

		System.out.println("\n***END***");
	}

}
