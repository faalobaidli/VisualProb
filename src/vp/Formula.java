package vp;

import java.util.*;

public class Formula {
	
	String inputFormula;
	List<String> formulaList;
	Parser parse;
	ListGenerator generate;
	String formula;
	
	Formula(String s){
		
		//list s = parser(s);
		inputFormula = s;
		formulaList = new ArrayList<String>();
		parse = new Parser();
		generate = new ListGenerator();
		formula = parse.formulaParser(inputFormula.trim());
		//System.out.println(formula);
	}
	
	public String getFormula(){
		return formula;
	}
//	public void listGenerator(){
//		formula = parse.formulaParser(inputFormula);
//		if(formula.charAt(1) == '&')
//			formulaList = generate.intersection();
//		else if(formula.charAt(1) == '|')
//			formulaList = generate.union();
//		else 
//			System.err.print("Undefined operator.");
//		
//	}

}
