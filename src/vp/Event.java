package vp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Event {
	List<String> inputtokens = new ArrayList<String>();
	Parser parseObj = new Parser();
	ListGenerator listgeneratorObj = new ListGenerator();
	List<String> eventList = new ArrayList<String>();
	int eventListSize;
	int eventProb;
	
	public Event(String input){
		parseObj.parseEvent(input);
		eventListSize = 0;
		eventProb = 0;
	}
	
	public void generateEventSets(List<String> sampleSets){
		eventList = listgeneratorObj.generateEventSets(sampleSets, inputtokens);
		eventListSize = eventList.size();
	}
	
	public void eventProbability(int sampleSetSize){
		eventProb = eventListSize/sampleSetSize;
	}
	
}
