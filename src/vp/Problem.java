package vp;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * A class that contains all the problem's information
 * -samples
 * -events
 * -generated lists
 * -formula
 * -results
 * -etc
 * 
 */
public class Problem {

	// main fields required to keep track of the collection of elements
	List<String> allSample = new ArrayList<String>();
	List<String> sampleSets = new ArrayList<String>();
	List<Sample> samples = new ArrayList<Sample>();
	List<Event> events = new ArrayList<Event>();
	Formula formulaObj = new Formula("P(A&B)");

	// the main constructor acts as a main class and instanciate the necessary
	// lists and checks them
	public Problem() {
		Scanner c = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			// make new sample and add it to a list of samples
			samples.add(new Sample());
			// add its elements to a list of strings to later check with
			// conditions' elements
			allSample.addAll(samples.get(i).list);
			if (c.nextLine().equals("0")) {
				break;
			}
		}
		// combine or permutate?
		boolean combineFlag = true;
		List<String> combSample;
		List<String> permSample;
		// combine or permutate samples and add to list of sets
		List<String >emptyLits = new ArrayList<String>(); 
		if (combineFlag) {
			sampleSets.addAll(ListGenerator.combineSamples(0, samples, emptyLits));
		} else {
			
		}
		
		// make new event
		for (int i = 0; i < 10; i++) {
			events.add(new Event());
			checkAcS(events.get(i).setNoStar, allSample);
			events.get(i).generatedSets.addAll(ListGenerator.generateEventSets(sampleSets, events.get(i)));
			if (c.nextLine().equals("0")) {
				break;
			}
		}

	}
	
	//Salma: parse formula
			//Formula f = new Formula(string);
			
			public void formulaListGenerator(){
				String formula = formulaObj.getFormula();
				System.out.println(formula);
				int leftEvent;
				int rightEvent;
				
				for(int i=0 ; i<=2 ; i+=2){
					if(formula.charAt(i) == 'A')
						leftEvent=0;
					else if(formula.charAt(i) == 'B')
						leftEvent=1;
					else if(formula.charAt(i) == 'C')
						leftEvent=2;
					else if(formula.charAt(i) == 'D')
						leftEvent=3;
				}
//				for(int i=0 ; i<events.size() ; i++){		
//					if(events.get(i).getEventName() == formula.charAt(0)){
//						leftEvent = i; //System.out.println(i);
//					}
//					else if(events.get(i).getEventName() == formula.charAt(2)){
//						rightEvent = i; //System.out.println(i);
//					}
//				}
			}
			
			

	// tokenizer by comma delimiter
	static List<String> tokenize(String x) {
		return Arrays.asList(x.split(" *, *"));
	}
	
	// check containment of elements of list a in list s
	static void checkAcS(List<String> a, List<String> s) {
		List<String> noMatchList = new ArrayList<String>();
		boolean match = false;
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < s.size(); j++) {
				if (s.get(j).equals(a.get(i))) {
					match = true;
				}
			}
			if (!match) {
				noMatchList.add(a.get(i));
			}
			match = false;
		}
		if (noMatchList.size() > 0) {
			System.err.print("One or more elements in A does not match S: "
					+ noMatchList.get(0));
			for (int j = 1; j < noMatchList.size(); j++) {
				System.err.print(", " + noMatchList.get(j));
			}
			System.err.println(".");
			System.exit(0);
		}

	}

	// combine multiple samples
	
	
	

}
