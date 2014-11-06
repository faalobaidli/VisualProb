package vp;


import java.util.*;

public class Sample {

	int samplesize;
	int index=0;
	List<String> inputtokens = new ArrayList<String>();

	Sample(String input){
		inputtokens.addAll(tokenizer(input));
		samplesize = inputtokens.size();
	}
	
	public static List<String> tokenizer(String x) { 
		return Arrays.asList(x.split(" *, *"));
	}
	
	void setIndex(int i){
		index = i;
	}
	
	int getIndex(){
		return index;
	}
	
	int getSize(){
		return samplesize;
	}
}
