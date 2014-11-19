package vp;

import java.util.ArrayList;
import java.util.List;



public class ListGenerator {

	//List<Sample> samples = new ArrayList<Sample>();
	List<String> permut = new ArrayList<String>();
	List<String> comb = new ArrayList<String>();
	String oneelement = new String();
	
	List<String> eventSet = new ArrayList<String>();
	
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
				//System.out.print(onepermut);
				//permut.add(onepermut);
				swap("",oneelement);
				
			}
			//System.out.println();
		}
		return permut;
	}
	
	public void swap(String e, String perm){
		int s=perm.length();
		if(s == 0){
			//System.out.println("Sample set: "+e);
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
				//int q=0;
					
				for (int j=0; j<iSample; j++){
					// store to list
					oneelement= oneelement+(samples.get(j).inputtokens.get(samples.get(j).getIndex()).toString());
					
				}
				//System.out.print("Sample set: "+oneelement);
				comb.add(oneelement);				
			}
			//System.out.println();
		}
		return comb;
	}

	public List<String> generateEventSets(List<String> sampleSets, List<String> inputtokens) {
		String str =""; //System.out.println("inputtokens"+inputtokens.get(1));
		List<String> sets = new ArrayList<String>();
		int inputtokensSize = inputtokens.size();
		if (inputtokensSize>0){ //System.out.println("if (inputtokensSize>0)");
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
					System.out.println("Event list: "+sampleSets.get(i));
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
		//String operator = inputtokens.get(0);
		//String eventVal = inputtokens.get(1);
		
		if(operator.equals("=")){ //System.out.println("DID IT ENTER HERE? "+operator);
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
					}
				}
					
			}
		}
		else if(operator.equals(">=")){
			for(int i=0 ; i<sampleSets.size() ; i++){
				for(int j=0; j<sampleSets.get(i).length() ; j++){
					if((sampleSets.get(i).charAt(j)) >= eventVal.charAt(0)){
						eventSet.add(sampleSets.get(i)); //System.out.println("Event list: "+sampleSets.get(i));
					}
				}
					
			}
		}
		else if(operator.equals("<")){
			for(int i=0 ; i<sampleSets.size() ; i++){
				for(int j=0; j<sampleSets.get(i).length() ; j++){
					if((sampleSets.get(i).charAt(j)) < eventVal.charAt(0)){
						eventSet.add(sampleSets.get(i)); //System.out.println("Event list: "+sampleSets.get(i));
					}
				}
					
			}
		}
		else if(operator.equals(">")){
			for(int i=0 ; i<sampleSets.size() ; i++){
				for(int j=0; j<sampleSets.get(i).length() ; j++){
					if((sampleSets.get(i).charAt(j)) > eventVal.charAt(0)){
						eventSet.add(sampleSets.get(i)); //System.out.println("Event list: "+sampleSets.get(i));
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


	public List<String> intersection(List<String> leftEvent, List<String> rightEvent){
		List<String> results = new ArrayList<String>();
		for(int i=0 ; i<leftEvent.size() ; i++){
			for(int j=0 ; j<rightEvent.size() ; j++){
				if(leftEvent.get(i) == rightEvent.get(j)){
					results.add(leftEvent.get(i));
					System.out.println(leftEvent.get(i));
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
