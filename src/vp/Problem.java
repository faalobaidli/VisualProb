package vp;


import java.util.*;

public class Problem {

	static int iprob=0;
	static int iSample=0;	// number of samples
	static int iEvent=0;	// number of events
	
	List<Sample> samples = new ArrayList<Sample>();
	List<Event> events = new ArrayList<Event>();
<<<<<<< Updated upstream
	Formula formulaObj = new Formula("P(A&B)");
	static int id = 0;

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

=======
	Formula formulaObj;
	List<String> sampleSet = new ArrayList<String>();
	ListGenerator listgeneratorObj = new ListGenerator();
	
	// for calculations
	int leftEvent;
	int rightEvent;
	int formulaProb;
	
	public Problem(){
		iprob++;
>>>>>>> Stashed changes
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

