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
	
	Formula(String s){
		
		inputFormula = s;
		formulaList = new ArrayList<String>();
		parse = new Parser();
		generate = new ListGenerator();
		parse.formulaParser(inputFormula.trim());
		formula = parse.formulalg;	
	}
	
	public void formulaList(List<Event> events, double sampleSetSize){ //System.out.println("FORMULA: "+formula.peek());
		formulaList = listgeneratorObj.generateFormulaSet(formula, events);
		formulaProb = formulaList.size()/sampleSetSize;
	}

	public String getFormulaStr(){
		return "Formula lists:\n"+formulaList.toString()+"\n"+Double.toString(formulaProb);
	}
	
}
