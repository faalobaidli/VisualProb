package vp;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;



public class ListGenerator {

	List<String> permut = new ArrayList<String>();
	List<String> comb = new ArrayList<String>();
	String oneelement = new String();
	
	List<String> eventSet = new ArrayList<String>();
	List<String> formulaSet = new ArrayList<String>();
	
	List<Event> events;
	static Deque<String> formula;
	List<String> eventstag = new ArrayList<String>();
	
	public List<String> permutation(int indexSamples, int iSample, List<Sample> samples){
		int size = samples.get(indexSamples).getSize();
	
		for(int i=0; i<size; i++){
			samples.get(indexSamples).setIndex(i);
			if(indexSamples+1 < iSample){				
				permutation(indexSamples+1, iSample, samples);
			}
			else{
				oneelement = new String();
				//int q=0;
					
				for (int j=0; j<iSample; j++){
					// store to list
					oneelement= oneelement+(samples.get(j).inputtokens.get(samples.get(j).getIndex()).toString());
					
				}
				swap("",oneelement);	
			}
		}
		return permut;
	}
	
	public void swap(String e, String perm){
		int s=perm.length();
		if(s == 0){
			permut.add(e);
		}
		else{
			for (int i=0; i<s; i++)
				swap(e+perm.charAt(i), perm.substring(0,i)+perm.substring(i+1,s));  
		}
	}
	
	public List<String> combination(int indexSamples, int iSample, List<Sample> samples){
		int size = samples.get(indexSamples).getSize();
	
		for(int i=0; i<size; i++){
			samples.get(indexSamples).setIndex(i);
			if(indexSamples+1 < iSample){				
				combination(indexSamples+1, iSample, samples);
			}
			else{
				oneelement = new String();
	
				for (int j=0; j<iSample; j++){
					// store to list
					oneelement= oneelement+(samples.get(j).inputtokens.get(samples.get(j).getIndex()).toString());
					
				}
				comb.add(oneelement);				
			}
		}
		return comb;
	}

	public List<String> generateEventSets(List<String> sampleSets, List<String> inputtokens) {
		String str =""; System.out.println("inputtokens"+inputtokens.get(1));
		List<String> sets = new ArrayList<String>();
		int inputtokensSize = inputtokens.size();
		if (inputtokensSize>0){ System.out.println("if (inputtokensSize>0)");
			for (int j = 0; j < inputtokensSize; j++) {
				if (!inputtokens.get(j).equals("*")) {System.out.println("if (!inputtokens.get("+j+").equals(\"*\")");
					str = str + inputtokens.get(j) + ","; 
				}else{ System.out.println("if (!inputtokens.get("+j+").equals(\"*\")   #### else");
					str = str + "[^,]+,";
				}
			} System.out.println("str"+str);
			str = str.substring(0, str.length()-1); System.out.println("substring"+str);
			int sampleSetsSize = sampleSets.size();
			for(int i=0; i<sampleSetsSize; i++){ System.out.println("for(int i=0; i<sampleSetsSize; i++)");			
				if(sampleSets.get(i).matches(str)){ System.out.println("if(sampleSets.get(i).matches(str)");
					sets.add(sampleSets.get(i));
				}
			}
			return sets;
		}else{
			//make the value thing			
			return sets;
		}
	}
	
	// generate the list (from the combinations) that match the event condition 
	public List<String> generateEventComb(List<String> sampleSets, String operator, String eventVal){	// if the problem was combination

		if(operator.equals("=")){ 
			for(int i=0 ; i<sampleSets.size() ; i++){ //System.out.println(sampleSets.get(i)+"=="+eventVal);
				if(sampleSets.get(i).contains(eventVal)){
					eventSet.add(sampleSets.get(i)); //System.out.println("Event list: "+sampleSets.get(i));
				}				
			}
		}
		else if(operator.equals("<=")){
			for(int i=0 ; i<sampleSets.size() ; i++){
				for(int j=0; j<sampleSets.get(i).length() ; j++){
					if((sampleSets.get(i).charAt(j)) <= eventVal.charAt(0)){
						eventSet.add(sampleSets.get(i)); //System.out.println("Event list: "+sampleSets.get(i));
						break;
					}
				}
			}
		}
		else if(operator.equals(">=")){
			for(int i=0 ; i<sampleSets.size() ; i++){
				for(int j=0; j<sampleSets.get(i).length() ; j++){
					if((sampleSets.get(i).charAt(j)) >= eventVal.charAt(0)){
						eventSet.add(sampleSets.get(i)); //System.out.println("Event list: "+sampleSets.get(i));
						break;
					}
				}					
			}
		}
		else if(operator.equals("<")){
			for(int i=0 ; i<sampleSets.size() ; i++){
				for(int j=0; j<sampleSets.get(i).length() ; j++){
					if((sampleSets.get(i).charAt(j)) < eventVal.charAt(0)){
						eventSet.add(sampleSets.get(i)); //System.out.println("Event list: "+sampleSets.get(i));
						break;
					}
				}					
			}
		}
		else if(operator.equals(">")){
			for(int i=0 ; i<sampleSets.size() ; i++){
				for(int j=0; j<sampleSets.get(i).length() ; j++){
					if((sampleSets.get(i).charAt(j)) > eventVal.charAt(0)){
						eventSet.add(sampleSets.get(i));//System.out.println("Event list: "+sampleSets.get(i));
						break;
					}
				}	
			}
		}
		return eventSet;
	}
	
//	public List<String> generateEventPerm(List<String> sampleSets, List<String> inputtokens){	// if the problem was permutation
//		for(int i=0 ; i<sampleSets.size() ; i++){
//			for(int j=0 ; j<position.length ; j++){
//				if(sampleSets.get(i).charAt(j) == eventPositions.charAt(j)){
//					eventSet.add(sampleSets.get(i));
//					break; // break the inner loop only?
//				}
//			}
//		}
//		return eventSet;
//	}


	public List<String> generateFormulaSet(Deque<String> formula, List<Event> events){
		this.events = events;
		this.formula = formula;
		formula = new ArrayDeque<String>();
		eventstag.add("A"); eventstag.add("B"); eventstag.add("C"); eventstag.add("D");
		return expression(this.formula, formulaSet);
	}
	
	public List<String> expression(Deque<String> formula, List<String> formulaSet){ 
		if ( eventstag.contains(formula.peek())) { 
			   return events.get(eventstag.indexOf(formula.pop())).eventList;
		   }
		else if ( formula.pop().equals("(")) { 
			List<String> leftEvent = expression(formula, formulaSet);  // Read and evaluate first operand.
			if ( formula.peek().equals(")") ) { 
				return leftEvent;
			}
			
			char op = formula.pop().charAt(0);             // Read the operator.
			List<String> rightEvent = expression(formula, formulaSet);
		
			formula.pop();
		
			 switch (op) {   //  Apply the operator and return the result. 
		      case '&':  return intersection(leftEvent, rightEvent);
		      case '|':  return union(leftEvent, rightEvent);
		      default:   return null;  // can't occur 
		      }
		}
		else {
			System.err.print("Encountered unexpected character.");
			return null;
		}
	}
	
	public List<String> intersection(List<String> leftEvent, List<String> rightEvent){
		List<String> results = new ArrayList<String>();
		for(int i=0 ; i<leftEvent.size() ; i++){
			for(int j=0 ; j<rightEvent.size() ; j++){
				if(leftEvent.get(i) == rightEvent.get(j)){
					results.add(leftEvent.get(i));
				}
			}
		}
		return results;
	}
	
	public List<String> union(List<String> leftEvent, List<String> rightEvent){
		List<String> results = new ArrayList<String>();
		for(int i=0 ; i<leftEvent.size() ; i++)
			results.add(leftEvent.get(i));
		
		for(int i=0 ; i<rightEvent.size() ; i++)
			results.add(rightEvent.get(i));
		
		return results;
	}

}
