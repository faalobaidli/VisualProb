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
	//int formulaProb;
	
	public Problem(){
		iprob++;
	}
	
	public Problem( List<String> samplesList, List<String> eventsList, String formula){
		iprob++;
		//flag = 2; // Combination
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
	
//	public void createObjectSample(String input){
//		samples.add(new Sample(input.trim()));
//		iSample++;
//	}
//	
//	public void createObjectEvent(String input){
//		events.add(new Event(input.trim()));
//		iEvent++;
//	}
//	
//	public void createObjectFormula(String input){
//		formulaObj = new Formula(input.trim());
//	}
	
	public void permutation(){ 
		sampleSet = listgeneratorObj.permutation(0, iSample, samples);
	} 
	
	public void combination(){ 
		sampleSet = listgeneratorObj.combination(0, iSample, samples);
	}
	
	public void eventList(){
		for( int i=0 ; i<iEvent ; i++){ System.out.println("inside Problem.eventList");
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
		//System.out.println(events.get(leftEvent).eventProb);
		formulaObj.formulaList(events.get(leftEvent), events.get(rightEvent));

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
	
	public void calculations(){
		
		
		
		//int sampleSetSize = sampleSet.size();
		//for(int i=0 ; i<iEvent ; i++){
			//System.out.println("Sample set size: "+sampleSet.size());
			//events.get(i).eventProbability(sampleSet.size());
			//System.out.println("Problem.calculations: eventProb= "+events.get(i).eventProb);
		//}
		//System.out.println("\nProblem.calculation: formulaProb= "+formulaObj.formulaProb);
		
	}
	
}

