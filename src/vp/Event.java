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
	String rhs;
	String op;
	List<String> list = new ArrayList<String>();
	List<String> listNoStar = new ArrayList<String>();
	Scanner r = new Scanner(System.in);

	Event() {
		System.out.println("Insert A:");
		txt = r.nextLine();
		Parser p = new Parser();
		if (Arrays.asList(txt.split(" *, *")).size() > 1) {
			list.addAll(p.parseComma(txt));
			for (int j = 0; j < list.size(); j++) {
				if (!list.get(j).equals("*")) {
					listNoStar.add(list.get(j));
				}
			}
			// allSample needs to be populated
		} else {
			rhs = p.parseCondition(txt).get(0);
			op = p.parseCondition(txt).get(1);
		}
	}

}
