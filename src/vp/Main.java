package vp;

import java.io.IOException;
import java.util.*;
import java.io.*;

//import frame.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		String S1 = new String("1, 2, 3");
		String S2 = new String("x,y,z");
		
		//String A = new String("*,x");
		//String B = new String("=2");
		//String C = new String("=y");
				
		Scanner scan = new Scanner(System.in);
		String input=null;
		List<String> samples = new ArrayList<String>();
		List<String> events = new ArrayList<String>();
		String formula = null;

//		int flag;
		
		Problem problem1;
		
		
		samples.add(S1);
		samples.add(S2);
		
		//events.add(A);
		//events.add(B);
		//events.add(C);
		
		formula = "P(A)";
		//formula = "P(A&B)";
		//formula = "P((A&B)|C))";		
		
		// ***** All the processes after clicking submit button *****
		// if add more sample
		//System.out.println("Choose: (1)Permutation, (2)Combination: ");
		//flag = scan.nextInt(); 
		boolean success = false;
		
		while(!success){ 		//success=true;

		try{
			samples = new ArrayList<String>();
			events = new ArrayList<String>();

			samples.add(S1);
			samples.add(S2);
//		System.out.println("Enter sample 1: ");
//		input = scan.next(); 
//		samples.add(input);
////		problem1.createObjectSample(input);
		System.out.println("Enter event 1: ");
		input = scan.next(); 
		events.add(input);
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
		success=true;
	} catch(IOException e){
		success=false;
		System.out.println(e.getMessage());
	}
		}
//		finally {
//        if(input != null){
//            try {
//                //reader.close();
//            	System.out.println("Enter event 1: ");
//        		input = scan.next(); 
//        		events.add(input);
//        		problem1 = new Problem(samples, events, formula,1);
//            } catch (IOException e) {
//                //do something clever with the exception
//        		System.out.println(e.getMessage());
//            }
//        }
//	}

		System.out.println("\n***END***");
	}

}
