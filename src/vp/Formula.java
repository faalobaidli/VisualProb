package vp;

import java.util.ArrayList;
import java.util.List;


public class Formula {
	String inputFormula;
	List<String> formulaList;
	Parser parse;
	ListGenerator generate;
	String formula;
	ListGenerator listgeneratorObj = new ListGenerator();
	int formulaProb;
	
	Formula(String s){
		
		//list s = parser(s);
		inputFormula = s;
		formulaList = new ArrayList<String>();
		parse = new Parser();
		generate = new ListGenerator();
		formula = parse.formulaParser(inputFormula.trim());
		//System.out.println(formula);
	}
	
	public void formulaList(Event leftEvent, Event rightEvent){

		
		if (formula.charAt(1) == '&'){
			formulaList = listgeneratorObj.intersection(leftEvent.eventList, rightEvent.eventList);
			formulaProb = leftEvent.eventProb * rightEvent.eventProb;
		}
		else if (formula.charAt(1) == '|'){
			formulaList = listgeneratorObj.union(leftEvent.eventList, rightEvent.eventList);
			formulaProb = leftEvent.eventProb + rightEvent.eventProb;
		}
	}
	
	public String getFormula(){
		return formula;
	}
}
