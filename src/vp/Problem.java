package vp;

import java.util.*;

public class Problem {

	static int iprob=0;
	static int iSample=0;	// number of samples
	static int iEvent=0;	// number of events
	
	public List<Sample> samples = new ArrayList<Sample>();
	public List<Event> events = new ArrayList<Event>();
	Formula formulaObj;
	List<String> sampleSet = new ArrayList<String>();
	ListGenerator listgeneratorObj = new ListGenerator();
	
	// for calculations
	int leftEvent;
	int rightEvent;
	
	public Problem(){
		iprob++;
	}


	public Problem(List<String> samplesList, List<String> eventsList, String formula){
		iprob++;
	//	flag = 2; // Combination
		for(int i=0; i<samplesList.size() ; i++){
			samples.add(new Sample(samplesList.get(i).trim()));
			iSample++;
		}
		for(int i=0; i<eventsList.size() ; i++){
			events.add(new Event(eventsList.get(i).trim()));
			iEvent++;
		}
		
		formulaObj = new Formula(formula.trim());
		

		permutation();
		eventList();
		formulaList();
	}

	public void permutation(){ 
		sampleSet = listgeneratorObj.permutation(0, iSample, samples);
	} 
	
	public void combination(){ 
		sampleSet = listgeneratorObj.combination(0, iSample, samples);
	}
	
	public void eventList(){
		for( int i=0 ; i<iEvent ; i++){ //System.out.println("inside Problem.eventList");
			events.get(i).generateEventSets(sampleSet);
		}
	}
	
	
	public void formulaList(){
		formulaObj.formulaList(events, sampleSet.size());
	}
	
	public String resultString(){
		String str;
		
		str = "Sample sets:\n"+sampleSet.toString()+"\n\n";
		for(int i=0;i<iEvent ; i++){
			str+=(events.get(i).getEventStr());
		}
		str+=(formulaObj.getFormulaStr());
		
		return str;
	}
	
}

