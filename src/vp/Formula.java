package vp;

import java.util.*;
import java.io.*;

public class Formula {
	String inputFormula;
	List<String> formulaList;
	Parser parse;
	ListGenerator generate;
	static Deque<String> formula;
	ListGenerator listgeneratorObj = new ListGenerator();
	double formulaProb;
	int formulaListSize;
	
	Formula(String s)
	throws IOException{
		
		inputFormula = s;
		formulaList = new ArrayList<String>();
		parse = new Parser();
		generate = new ListGenerator();
		parse.formulaParser(inputFormula.trim());
		formula = parse.formulalg;	
		formulaListSize=0;
		formulaProb=0.0;
	}
	
	public void formulaList(List<Event> events, double sampleSetSize)
		throws IOException{ //System.out.println("FORMULA: "+formula.peek());
		formulaList = listgeneratorObj.generateFormulaSet(formula, events);
		formulaListSize = formulaList.size();
		formulaProb = formulaListSize/sampleSetSize;
	}

	public String getFormulaStr(){
		String str = "\nFormula lists:\n";
		for(int i=0;i<formulaListSize;i++)
			str += formulaList.get(i)+" , ";
		str = str.substring(0, str.length()-2);
		String prob = String.format("\n%.2f", formulaProb);
		return str+prob;
	}
	
}
