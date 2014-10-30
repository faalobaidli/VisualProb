package vp;

import java.util.*;

public class Calculation {
	
	// for combination
	String operator;
	String eventVal;
	
	// for permutation
	String eventPositions;	// e.g. 1, *, 2
	int[] position;			// the positions where there's values, not * 
	
	Problem problem;
	List<String> dataSet;	// permutations or combinations
	List<String> eventResult;
	
	public Calculation(){
		operator = null;
		eventVal = null;
		
		eventPositions = null;
		//position = new int[];
		
		problem = new Problem();
		dataSet = new ArrayList<String>();
		eventResult = new ArrayList<String>();
		
		// static set for test
		dataSet.add("1, 2, 3");
		dataSet.add("1, 2, 4");
		dataSet.add("1, 1, 4");
		dataSet.add("2, 4, 3");
	}
	
	public Calculation(String operator, String eventVal, Problem problem){
		this.operator = operator;
		this.eventVal = eventVal;
		this.problem = problem;
		//dataSet = problem.combSample;
	}
	
	public Calculation(String eventPositions, int[] position, Problem problem){
		this.eventPositions = eventPositions;
		this.position = new int[position.length];
		for(int i=0 ; i<position.length ; i++)
			this.position[i] = position[i];
		this.problem = problem;
		//dataSet = problem.permSample;
	}
	
	// generate the list (from the combinations) that match the event condition 
	public void generateEventComb(){	// if the problem was combination
		if(operator == "="){
			for(int i=0 ; i<dataSet.size() ; i++){
				if(dataSet.get(i).contains(eventVal)){
					eventResult.add(dataSet.get(i));
				}
					
			}
		}
		else if(operator == "<="){
			for(int i=0 ; i<dataSet.size() ; i++){
				for(int j=0; j<dataSet.get(i).length() ; j++){
					if((dataSet.get(i).charAt(j)) <= operator.charAt(0)){
						eventResult.add(dataSet.get(i));
					}
				}
					
			}
		}
		else if(operator == ">="){
			for(int i=0 ; i<dataSet.size() ; i++){
				for(int j=0; j<dataSet.get(i).length() ; j++){
					if((dataSet.get(i).charAt(j)) >= operator.charAt(0)){
						eventResult.add(dataSet.get(i));
					}
				}
					
			}
		}
		else if(operator == "<"){
			for(int i=0 ; i<dataSet.size() ; i++){
				for(int j=0; j<dataSet.get(i).length() ; j++){
					if((dataSet.get(i).charAt(j)) < operator.charAt(0)){
						eventResult.add(dataSet.get(i));
					}
				}
					
			}
		}
		else if(operator == ">"){
			for(int i=0 ; i<dataSet.size() ; i++){
				for(int j=0; j<dataSet.get(i).length() ; j++){
					if((dataSet.get(i).charAt(j)) > operator.charAt(0)){
						eventResult.add(dataSet.get(i));
					}
				}
					
			}
		}
	}
	
	
	// generate the list (from the permutations) that match the event condition 
	public void generateEventPerm(){	// if the problem was permutation
		for(int i=0 ; i<dataSet.size() ; i++){
			for(int j=0 ; j<position.length ; j++){
				if(dataSet.get(i).charAt(j) == eventPositions.charAt(j)){
					eventResult.add(dataSet.get(i));
					break; // break the inner loop only?
				}
			}
		}
	}
	
	// generate the list for formula
	/*	for(formula)
	 * 		if(formula(i) == AND)
	 * 			//formula(i-1) AND formula(i+1)
	 * 			if(formulalist.isEmpty)
	 * 				event1 = whichEvent(formula(i-1));
	 * 			else
	 * 				event1 = formulalist;
	 * 			event2 = whichEvent(formula(i+1));
	 * 			
	 * 			event1list = event(event1).get(eventlist);
	 *  		event2list = event(event2).get(eventlist);
	 *  
	 *  		// AND
	 * 			for(event1list.size)
	 * 				for(event1list.size)
	 * 					if( event1list(i) == event2list(j) )
	 * 						formulalist = event1list(i);
	 * 
	 * 			// OR
	 * 			for(event1list.size)
	 * 				for(event1list.size)
	 * 					if( event1list(i) == event2list(j) )
	 * 						formulalist.add(event1list(i));
	 * 					else{
	 * 						formulalist.add(event1list(i));
	 * 						formulalist.add(event2list(j));	
	 * 					}
	 * 			
	 * 
	 * 		else if(formula(i) == OR)
	 * 			formula(i-1) OR formula(i+1)
	 *			
	 *
	 *
	 ***********************
	 *  // Which event
	 *  public int whichEvent(String s){
	 *  	if(s == "A")
	 *  		return 0;
	 *  	if(s == "B")
	 *  		return 1;
	 *  	if(s == "C")
	 *  		return 2;
	 *  	if(s == "D")
	 *  		return 3;
	 *  	return 4; // error handling
	 *  }
	 */
	
}
