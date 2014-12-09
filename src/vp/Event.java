package vp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;
import java.io.*;
/*
 * 	Class Event that store all the required fields for each event.
 * 	Calls the Parser to parse through the event and check its syntax
 * 	Calls the ListGenerator to generate the event set
 * 	Calculates the probability of the event
 */
public class Event {
	
	Parser parseObj = new Parser();
	ListGenerator listgeneratorObj = new ListGenerator();
	List<String> eventList = new ArrayList<String>();
	int eventListSize;
	double eventProb;
	int star=0;
	
	List<String> inputtokens = new ArrayList<String>();
	String operator;
	String eventVal;
	
	
//	String eventPositions;	// e.g. 1, *, 2
//	int[] position;			// the positions where there's values, not * 
	
	
	public Event(String input)
	throws IOException{
		if(input.contains("*")) {
			star=1; 
			//input = parseObj.parseStar();
			inputtokens = Arrays.asList(input.split(","));
		}
		else{
			input = parseObj.parseEvent(input); //System.out.println(input);

			inputtokens = Arrays.asList(input.split(":"));
			//System.out.println(inputtokens.get(0)+""+inputtokens.get(1));
			operator = inputtokens.get(0);
			eventVal = inputtokens.get(1);
		}
		eventListSize = 0;
		eventProb = 0.0;
	}
	
	public void generateEventSets(List<String> sampleSets){
		if(star ==1)
			eventList = listgeneratorObj.generateEventPerm(sampleSets, inputtokens);
		else { //System.out.println("Generate events");
			eventList = listgeneratorObj.generateEventComb(sampleSets, operator, eventVal);
		}
		eventListSize = eventList.size();
		int sampleSetSize = sampleSets.size();
		eventProb = 1.0*eventListSize/sampleSetSize;
		//System.out.println("Events\n"+eventList.toString());
	}
	
	public String getEventStr(){
		String str="\n\nEvent lists:\n";
		for(int i=0 ; i<eventListSize;i++)
			str += eventList.get(i)+" , ";
		
		str = str.substring(0, str.length()-2);
		String prob = String.format("\n%.2f", eventProb);
		return str+prob+"\n";
	}
	
}
