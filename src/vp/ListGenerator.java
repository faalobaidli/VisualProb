package vp;

import java.util.ArrayList;
import java.util.List;

public class ListGenerator {

	private void permutate(List<Sample> s){
		//call combine then permutate
	}
	
	//permutate multiple samples
	static List<String> combine(int indexSamples, List<Sample> samples){
		String str = "";
		List<String> strlist = new ArrayList<String>();
		int size = samples.get(indexSamples).getSize();

		for (int i = 0; i < size; i++) {

			samples.get(indexSamples).setIndex(i);

			if (indexSamples + 1 < samples.size()) { // Sample[] should be list to know how many samples
				combine(indexSamples + 1, samples);
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
		if (event.list.size()>0){
			for (int j = 0; j < event.list.size(); j++) {
				if (!event.list.get(j).equals("*")) {
					str = str + event.list.get(j) + ",";
				}else{
					str = str + "[^,]+,";
				}
			}
			for(int i=0; i<sampleSets.size(); i++){
				if(sampleSets.get(i).matches(str)){
					sets.add(sampleSets.get(i));
				}
			}
			return sets;
		}else{
			//make the value thing
			
			return sets;
		}
	}
}
