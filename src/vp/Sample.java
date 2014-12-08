package vp;


import java.util.*;

/*	
 * 	Class Sample that store all the required fields for each sample.
 * 	Also it tokenize the sample and split the elements
 */
public class Sample {

	int samplesize;	// Number of elements in the sample
	int index=0;	// Used for generating permutation and combination
	public List<String> inputtokens = new ArrayList<String>();	// To store the input sample, each element as a token

	// Constructor
	Sample(String input){
		input= input.trim();
		//if(input.equalsIgnoreCase("dice"))
			//for(int i=0; i<6 ;i++)
				
		inputtokens.addAll(tokenizer(input));	// Takes the input and add it to the list "inputtokens"
		samplesize = inputtokens.size();		// Store the size of the sample
	}
	
	// Tokenize the sample and split the elements by the comma ','
	public static List<String> tokenizer(String x) { 
		return Arrays.asList(x.split(" *, *"));
	}
	
	// Get the sample size
	int getSize(){
		return samplesize;
	}
	
	// Used for generating permutation and combination
	void setIndex(int i){
		index = i;
	}
	int getIndex(){
		return index;
	}

}
