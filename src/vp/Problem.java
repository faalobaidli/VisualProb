package vp;

import java.util.*;

public class Problem {

	static int iprob=0;		// for multiple programs, ID for each program
	static int iSample=0;	// number of samples
	static int iEvent=0;	// number of events
	
	public List<Sample> samples = new ArrayList<Sample>(); // Create array of class Sample to store each sample in it
	public List<Event> events = new ArrayList<Event>();		// Create array of class Event to store each event in it
	Formula formulaObj;		// Create object of class Formula to store the formula in it
	List<String> sampleSet = new ArrayList<String>();	// List of String to store the set of the samples (permutations or combinations)
	ListGenerator listgeneratorObj = new ListGenerator();	// Object of class ListGenerator to generate all the required lists
	int comb=0;
	int sampleSetSize;
//	// Constructor
//	public Problem(){
//		iprob++;	// the ID of the program
//	}

	// Constructor with all parameters: samples, events, and formula
	public Problem(List<String> samplesList, List<String> eventsList, String formula, int comb){
		//this.comb = comb;
		iprob++;	// the ID of the program
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
	public void permutation(){ 
		sampleSet = listgeneratorObj.permutation(iSample, samples);  // Return the permutation set for samples
		System.out.println("Samples perm:\n"+sampleSet.toString());
	} 
	
	// To generate the combination set for the sample(s)
	public void combination(){ 
		sampleSet = listgeneratorObj.combination(iSample, samples);	// Return the combination set for samples
		System.out.println("Samples comb:\n"+sampleSet.toString());
	}
	
	// To generate the set of each input event
	public void eventList(){
		for( int i=0 ; i<iEvent ; i++){ 
			events.get(i).generateEventSets(sampleSet);
		}
	}	
	
	// To generate the set of input formula
	public void formulaList(){
		formulaObj.formulaList(events, sampleSet.size());
	}
	
	// Return String of all the results
	public String resultString(){
		String str;
		sampleSetSize = sampleSet.size();
		str = "Sample sets:\n";
		for(int i=0;i<sampleSetSize;i++)
			str += sampleSet.get(i)+" ; ";
		for(int i=0;i<iEvent ; i++){
			str+=(events.get(i).getEventStr());
		}
		str+=(formulaObj.getFormulaStr());
		System.out.println(str);
		return str;
	}
	
}

