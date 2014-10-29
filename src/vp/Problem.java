package vp;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem {
	
	List<String> allSample = new ArrayList<String>();
	List<Sample> samples = new ArrayList<Sample>();

	public Problem(){
		
		Sample sample = new Sample();
		samples.add(sample);
		allSample.addAll(sample.list);
		Event event = new Event();
		
		Problem.checkAcS(event.listNoStar, allSample);
		
		boolean combineFlag = false; 
		List<String> combSample;
		List<String> permSample;
		DecimalFormat df = new DecimalFormat("0.00"); 
						
		if (combineFlag) {
			combine(samples);
		} else {
			permutate(0);

		}	
		
		
	}
	
	static List<String> tokenize(String x){
		return Arrays.asList(x.split(" *, *"));
	}
	
	static void checkAcS(List<String> a, List<String> s){
		List<String> noMatchList = new ArrayList<String>();
		boolean match = false;
		for (int i=0; i<a.size(); i++){
			for (int j = 0; j < s.size(); j++){
				if (s.get(j).equals(a.get(i))){
					match = true;
				}
			}
			if(!match){
				noMatchList.add(a.get(i));
			}
			match = false;
		}
		if(noMatchList.size() > 0){
			System.err.print("One or more elements in A does not match S: "+ noMatchList.get(0));
			for (int j = 1; j < noMatchList.size(); j++){
				System.err.print(", " + noMatchList.get(j));
			}
			System.err.println(".");
			System.exit(0);
		}
		
	}
	
	private void combine(List<Sample> samples2){
		
		
		
	}
	
	private void permutate(int indexSamples){
		
		int size = samples.get(indexSamples).getSize();

		for (int i = 0; i < size; i++) {

			samples.get(indexSamples).setIndex(i);

			if (indexSamples + 1 < samples.size()) { // Sample[] should be list to know how many samples
				permutate(indexSamples + 1);
			}
			else {
				for (int j = 0; j < samples.size(); j++) {
					System.out.print(samples.get(j).list.get(samples.get(j).tempIndex));
					if (j != samples.size()-1){
						System.out.print(",");
					}
				}
				System.out.println();

			}


		}

	}
}
