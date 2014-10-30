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
	
	//main fields required to keep track of the collection of elements
	List<String> allSample = new ArrayList<String>();
	List<Sample> samples = new ArrayList<Sample>();
	List<Event> events = new ArrayList<Event>();
	
	//the main constructor acts as a main class and instanciate the necessary lists and checks them 
	public Problem(){
		Scanner c = new Scanner(System.in);
		for(int i=0; i<10; i++){
			//make new sample and add it to a list of samples
			samples.add(new Sample());
			//add its elements to a list of strings to later check with conditions' elements
			allSample.addAll(samples.get(i).list);
			if (c.nextLine().equals("0")){
				break;
			}
		}
		//make new event
		Event event = new Event();
		
		//check if Event c Samples
		Problem.checkAcS(event.listNoStar, allSample);
		
		//combine or permutete?
		boolean combineFlag = true; 
		List<String> combSample;
		List<String> permSample;
		DecimalFormat df = new DecimalFormat("0.00"); 
						
		if (combineFlag) {
			combine(0);
		} else {
			
		}	
		
		
	}
	
	//tokenizer by comma delimiter
	static List<String> tokenize(String x){
		return Arrays.asList(x.split(" *, *"));
	}
	
	//check containment of elements of list a in list s
	static void checkAcS(List<String> a, List<String> s){
		List<String> noMatchList = new ArrayList<String>();
		boolean match = false;
		for (int i=0; i<a.size(); i++){
			for (int j = 0; j < s.size(); j++){
				if (s.get(j).equals(a.get(i))){
					match = true;
				}
			}
			if(!match){
				noMatchList.add(a.get(i));
			}
			match = false;
		}
		if(noMatchList.size() > 0){
			System.err.print("One or more elements in A does not match S: "+ noMatchList.get(0));
			for (int j = 1; j < noMatchList.size(); j++){
				System.err.print(", " + noMatchList.get(j));
			}
			System.err.println(".");
			System.exit(0);
		}
		
	}
	
	//combine multiple samples
	private void permutate(List<Sample> s){
		
	}
	
	//permutate multiple samples
	private void combine(int indexSamples){
		
		int size = samples.get(indexSamples).getSize();

		for (int i = 0; i < size; i++) {

			samples.get(indexSamples).setIndex(i);

			if (indexSamples + 1 < samples.size()) { // Sample[] should be list to know how many samples
				combine(indexSamples + 1);
			}
			else {
				for (int j = 0; j < samples.size(); j++) {
					System.out.print(samples.get(j).list.get(samples.get(j).tempIndex));
					if (j != samples.size()-1){
						System.out.print(",");
					}
				}
				System.out.println();

			}


		}

	}
}
