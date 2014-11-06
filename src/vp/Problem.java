package vp;


import java.util.*;

public class Problem {

	static int iprob=0;
	static int iSample=0;	// number of samples
	static int iEvent=0;	// number of events
	
	List<Sample> samples = new ArrayList<Sample>();
	List<Event> events = new ArrayList<Event>();
	Formula formulaObj;
	List<String> sampleSet = new ArrayList<String>();
	ListGenerator listgeneratorObj = new ListGenerator();
	
	// for calculations
	int leftEvent;
	int rightEvent;
	int formulaProb;
	
	public Problem(){
		iprob++;
	}
	
	public void createObjectSample(String input){
		samples.add(new Sample(input.trim()));
		iSample++;
	}
	
	public void createObjectEvent(String input){
		events.add(new Event(input.trim()));
		iEvent++;
	}
	
	public void createObjectFormula(String input){
		formulaObj = new Formula(input.trim());
	}
	
	public void permutation(){ 
		sampleSet = listgeneratorObj.permutation(0, iSample, samples);
	} 
	
	public void combination(){ 
		sampleSet = listgeneratorObj.combination(0, iSample, samples);
	}
	
	public void eventList(){
		for( int i=0 ; i<iEvent ; i++){
			events.get(i).generateEventSets(sampleSet);
		}
	}
	
	
	public void formulaList(){
		String formula = formulaObj.getFormula();
		System.out.println(formula);
		
		
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
		
		formulaObj.formulaList(events.get(leftEvent), events.get(rightEvent));

	}
	
	public void calculations(){
		//int sampleSetSize = sampleSet.size();
		for(int i=0 ; i<iEvent ; i++){
			System.out.println(events.get(i).eventProb);
		}
		System.out.println(formulaObj.formulaProb);
		
	}
	
}

