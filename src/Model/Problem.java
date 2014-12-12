package Model;

import java.util.*;
import java.io.*;

public class Problem {

	//static int iprob=0;		// for multiple programs, ID for each program
	static private int iSample;	// number of samples
	static private int iEvent;	// number of events
	
	private List<Sample> samples = new ArrayList<Sample>(); // Create array of class Sample to store each sample in it
	private List<Event> events = new ArrayList<Event>();		// Create array of class Event to store each event in it
	private Formula formulaObj;		// Create object of class Formula to store the formula in it
	private List<String> sampleSet = new ArrayList<String>();	// List of String to store the set of the samples (permutations or combinations)
	private ListGenerator listgeneratorObj = new ListGenerator();	// Object of class ListGenerator to generate all the required lists
	//private int comb;
	//private int sampleSetSize;


	// Constructor with all parameters: samples, events, and formula
	public Problem(List<String> samplesList, List<String> eventsList, String formula, int comb)
	throws IOException{
		iSample=0;
		iEvent=0;
		//this.comb = comb;
		//iprob++;	// the ID of the program
//		flag = 2; // Combination
		//System.out.println("SamplesListSize: "+samplesList.size());
		for(int i=0; i<samplesList.size() ; i++){ // To initialize each Sample array element  
			samples.add(new Sample(samplesList.get(i).trim()));	// Add the input sample to the array of Sample
			iSample++;		// Increment the size of the samples
		}
		for(int i=0; i<eventsList.size() ; i++){ // To initialize each Event array element 
			events.add(new Event(eventsList.get(i).trim()));	// Add the input event to the array of Event
			iEvent++;		// Increment the size of the events
		}
		
		formulaObj = new Formula(formula.trim());	// Initialize and add the input formula to the Formula object
		if(comb==1)
			permutation();	// To generate permutations set
		else
			combination();	// To generate combinations set
		
		eventList();	// To generate the events lists
		formulaList();	// To generate the formula list
		resultString();
	}

	// To generate the permutation set for the sample(s)
	private void permutation(){ 
		sampleSet = listgeneratorObj.permutation(iSample, samples);  // Return the permutation set for samples
		//System.out.println("Samples perm:\n"+sampleSet.toString());
	} 
	
	// To generate the combination set for the sample(s)
	private void combination(){ 
		sampleSet = listgeneratorObj.combination(iSample, samples);	// Return the combination set for samples
		//System.out.println("Samples comb:\n"+sampleSet.toString());
	}
	
	// To generate the set of each input event
	private void eventList(){
		for( int i=0 ; i<iEvent ; i++){ 
			events.get(i).generateEventSets(sampleSet);
		}
	}	
	
	// To generate the set of input formula
	private void formulaList() 
		throws IOException{
		formulaObj.formulaList(events, sampleSet.size());
	}
	
	// Return String of all the results
	public String resultString(){
		String str;
		//sampleSetSize = sampleSet.size();
		str = "Sample sets:\n"+sampleSet.toString();
//		for(int i=0;i<sampleSetSize;i++)
//			str += sampleSet.get(i)+" , ";
//		str = str.substring(0, str.length()-2);
		for(int i=0;i<iEvent ; i++){
			str+=(events.get(i).getEventStr());
		}
		str+=(formulaObj.getFormulaStr());
		System.out.println(str);
		return str;
	}
	
}

