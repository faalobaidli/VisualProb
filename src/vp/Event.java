package vp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Event {
	
	String txt;
	String rhs;
	String op;
	List<String> list= new ArrayList<String>();
	List<String> listNoStar= new ArrayList<String>();
	Scanner r = new Scanner(System.in);
	
	Event(){
		System.out.println("Insert A:");
		txt = r.nextLine();
		
		for (int i =0; i<1; i++){
			if (Arrays.asList(txt.split(" *, *")).size() > 1){
				list.addAll(Arrays.asList(txt.split(" *, *")));
				for (int j=0; j<list.size(); j++){
					if (!list.get(j).equals("*")){
						listNoStar.add(list.get(j));
					} 
				}
				//allSample needs to be populated
				Problem.checkAcS(listNoStar, Problem.allSample);
				break;
			}else if (txt.startsWith(">=")){
				rhs = txt.substring(2).trim();
				op = ">=";
				break;
			}else if (txt.startsWith("<=")){
				rhs = txt.substring(2).trim();
				op = "<=";
				break;
			}else if (txt.startsWith(">")){
				rhs = txt.substring(1).trim();
				op = ">";
				break;
			}else if (txt.startsWith("<")){
				rhs = txt.substring(1).trim();
				op = "<";
				break;
			}else if (txt.startsWith("=")){
				rhs = txt.substring(1).trim();
				op = "=";
				break;
			}else{
				System.err.print("Unknown operator. Use '>', '<' or '='. Or use comma(s) to specify a set.");
				System.exit(0);
			}
		}
	}
	
}
