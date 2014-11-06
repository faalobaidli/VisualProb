package vp;

import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1 = new String("1, 2, 3");
		String S2 = new String("x, y, z");
		
		String A = new String("=2");
		String B = new String(">1");
		
		String F = new String("P(A&B)");
		
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
		
		Problem problem1 = new Problem();
		
		// ***** All the processes after clicking submit button *****
		// if add more sample
		problem1.createObjectSample(S1);
		problem1.createObjectSample(S2);
		
		problem1.createObjectEvent(A);
		problem1.createObjectEvent(B);
		
		problem1.createObjectFormula(F);
		
		
		problem1.permutation();
		
		problem1.eventList();
		problem1.formulaList();
		
		problem1.calculations();

	}

}
