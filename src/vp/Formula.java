package vp;

import java.util.*;


public class Formula {
	String inputFormula;
	List<String> formulaList;
	Parser parse;
	ListGenerator generate;
	static Deque<String> formula;
	ListGenerator listgeneratorObj = new ListGenerator();
	double formulaProb;
	int formulaListSize;
	
	Formula(String s){
		
		inputFormula = s;
		formulaList = new ArrayList<String>();
		parse = new Parser();
		generate = new ListGenerator();
		parse.formulaParser(inputFormula.trim());
		formula = parse.formulalg;	
		formulaListSize=0;
		formulaProb=0.0;
	}
	
	public void formulaList(List<Event> events, double sampleSetSize){ //System.out.println("FORMULA: "+formula.peek());
		formulaList = listgeneratorObj.generateFormulaSet(formula, events);
		formulaListSize = formulaList.size();
		formulaProb = formulaListSize/sampleSetSize;
	}

	public String getFormulaStr(){
		String str = "\nFormula lists:\n";
		for(int i=0;i<formulaListSize;i++)
			str += formulaList.get(i)+" ; ";
		return str+"\n"+Double.toString(formulaProb);
	}
	
}
