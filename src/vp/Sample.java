package vp;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sample {

	String txt;
	List<String> list = new ArrayList<String>();
	Scanner r = new Scanner(System.in);
	int tempIndex;
	static int i=1;

	Sample(){
		System.out.println("Insert S" + i +":");
		txt = r.nextLine();
		i++;
	}
	
	int getSize(){
		return list.size();
	}
	
	void setIndex(int x){
		tempIndex = x;
	}
	
}
