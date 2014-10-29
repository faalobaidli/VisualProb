package vp;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * A sample class contains all of the sample information. Mainly list of elemnts.
*/
public class Sample {

	String txt;
	List<String> list = new ArrayList<String>();
	Scanner r = new Scanner(System.in);
	int tempIndex;
	static int i=1;

	Sample(){
		System.out.println("Insert S" + i +":");
		txt = r.nextLine();
		list.addAll(Problem.tokenize(txt));
		i++;
	}
	
	int getSize(){
		return list.size();
	}
	
	void setIndex(int x){
		tempIndex = x;
	}
	
}
