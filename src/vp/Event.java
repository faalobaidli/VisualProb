package vp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Event is the class that stores all the contition's information
 * -list of elements
 * -list of sets
 * -etc
 */
public class Event {

	String txt;
	String conditloinVal;
	String conditionOp;
	char eventName;
	List<String> set = new ArrayList<String>();
	List<String> setNoStar = new ArrayList<String>();
	List<String> generatedSets = new ArrayList<String>();
	Scanner r = new Scanner(System.in);

	Event() {
		System.out.println("Insert A:");
		txt = r.nextLine().trim();
		Parser p = new Parser();
		//if looking for 1 element user should use '='
		if (txt.contains(",")) {
			set.addAll(p.parseComma(txt));
			for (int j = 0; j < set.size(); j++) {
				if (!set.get(j).equals("*")) {
					setNoStar.add(set.get(j));
				}
			}
			// allSample needs to be populated
		} else {
			conditloinVal = p.parseCondition(txt).get(0);
			conditionOp = p.parseCondition(txt).get(1);
		}
	}
	
	// Salma
//	public Event(char e){
//		eventName = e;
//	}
	
	// Salma
//	public char getEventName(){
//		return eventName;
//	}

}
