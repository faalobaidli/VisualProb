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
	double eventProb;
	String operator;
	String eventVal;
	
	public Event(String input){
		input = parseObj.parseEvent(input); //System.out.println(input);
		inputtokens = Arrays.asList(input.split(":"));
		//System.out.println(inputtokens.get(0)+"??????"+inputtokens.get(1));
		operator = inputtokens.get(0);
		eventVal = inputtokens.get(1);
		eventListSize = 3;
		eventProb = 0.0;
	}
	
	public void generateEventSets(List<String> sampleSets){ //System.out.println("#####inputTokens"+inputtokens.get(1));
		eventList = listgeneratorObj.generateEventComb(sampleSets, operator, eventVal);
		eventListSize = eventList.size();
		int sampleSetSize = sampleSets.size();
		eventProb = 1.0*eventListSize/sampleSetSize;
		System.out.println("EventProb = "+eventProb);
		//System.out.println("Event List Size: "+eventListSize);
	}
	
	public String getEventStr(){
		return "Event lists:\n"+eventList.toString()+"\n\n";
	}
	
//	public void eventProbability(int sampleSetSize){
//		System.out.print("eventListSize: "+eventListSize);
//		System.out.print(" / SampleSetSize: "+sampleSetSize);
//		
//		eventProb = 1.0*eventListSize/sampleSetSize;
//		System.out.print(" = EventProb = "+eventProb);
//	}
	
}
