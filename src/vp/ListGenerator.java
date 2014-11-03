package vp;

import java.util.ArrayList;
import java.util.List;

public class ListGenerator {
	
	
	private void permutate(List<Sample> s){
		//call combine then permutate 
		
	}
	
	
	//permutate multiple samples
	static List<String> combineSamples(int indexSamples, List<Sample> samples, List<String> strlist){
		String str = "";
		int size = samples.get(indexSamples).getSize();
		
		for (int i = 0; i < size; i++) {	
			samples.get(indexSamples).setIndex(i);
			if (indexSamples + 1 < samples.size()) { // Sample[] should be list to know how many samples
				combineSamples(indexSamples + 1, samples, strlist);
			}
			else {
				for (int j = 0; j < samples.size(); j++) {
					str = str + samples.get(j).list.get(samples.get(j).tempIndex);
					if (j != samples.size()-1){
						str = str + ",";
					}
				}
				System.out.println(str);
				strlist.add(str);
				str = "";
			}
			
		}
		return strlist;
	}
	
	
	static List<String> generateEventSets(List<String> sampleSets, Event event) {
		String str ="";
		List<String> sets = new ArrayList<String>();
		if (event.set.size()>0){
			for (int j = 0; j < event.set.size(); j++) {
				if (!event.set.get(j).equals("*")) {
					str = str + event.set.get(j) + ",";
				}else{
					str = str + "[^,]+,";
				}
			}
			str = str.substring(0, str.length()-1);
			for(int i=0; i<sampleSets.size(); i++){
				if(sampleSets.get(i).matches(str)){
					sets.add(sampleSets.get(i));
					System.out.println(sampleSets.get(i));
				}
			}
			return sets;
		}else{
			//make the value thing
			
			return sets;
		}
	}
<<<<<<< Updated upstream
	
=======

>>>>>>> Stashed changes
	
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
<<<<<<< Updated upstream

=======
	
>>>>>>> Stashed changes
}
