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
	double formulaProb;
	
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

		//System.out.println("DID YOU HERE");
		if (formula.charAt(1) == '&'){//System.out.println("DID YOU HERE"+leftEvent.eventProb+leftEvent.eventListSize);
			formulaList = listgeneratorObj.intersection(leftEvent.eventList, rightEvent.eventList);
			formulaProb = leftEvent.eventProb * rightEvent.eventProb;
			System.out.println("FormulaProb: &: "+formulaProb);
		}
		else if (formula.charAt(1) == '|'){
			formulaList = listgeneratorObj.union(leftEvent.eventList, rightEvent.eventList);
			formulaProb = leftEvent.eventProb + rightEvent.eventProb;
			System.out.println("FormulaProb: | :"+formulaProb);
		}
	}
	
	public String getFormula(){
		return formula;
	}
	
	public String getFormulaStr(){
		return "Formula lists:\n"+formulaList.toString()+Double.toString(formulaProb);
	}
	
}
