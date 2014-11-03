package vp;

import java.util.*;
import java.io.*;
import java.util.IllegalFormatException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * Parser is a utility class for parsing conditions' and formulas' information
 */
public class Parser {
	
	static Deque<String> formula;
	
	Parser(){
		formula = new ArrayDeque<String>();
	}
	
	//use this when parsing a condition of specific position
	List<String> parseComma(String txt){
		return Arrays.asList(txt.split(" *, *"));
	}
	
	//use this if parsing a condition with an operator
	List<String> parseCondition(String txt){
		if (txt.startsWith(">=")){
			return Arrays.asList(txt.substring(2).trim(), ">=");
		}else if (txt.startsWith("<=")){
			return Arrays.asList(txt.substring(2).trim(), "<=");
		}else if (txt.startsWith(">")){
			return Arrays.asList(txt.substring(1).trim(), ">");
		}else if (txt.startsWith("<")){
			return Arrays.asList(txt.substring(1).trim(), "<");
		}else if (txt.startsWith("=")){
			return Arrays.asList(txt.substring(1).trim(), "=");
		}else{
			System.err.print("Unknown operator. Use '>', '<' or '='. Or use comma(s) to specify a set.");
			System.exit(0);
			return null;
		}		
	}
	
	
	
	// Salma
	public String formulaParser(String f){
		//StringTokenizer formula = new StringTokenizer(f);
		//Deque<String> formula = new ArrayDeque<String>();
		//formula.add(f.toCharArray());
		for(int i=0 ; i<f.length() ; i++)
			if(f.charAt(i) != ' ')
				formula.add(Character.toString(f.charAt(i)));
		
		if(formula.peek().equalsIgnoreCase("P")){
			formula.pop();
			return expression(formula);
		
		}
		else{
			System.err.print("Wrong syntax of the formula, it should start with: P(...");
			return "";
		}
	}
	
	// Salma
	private String expression(Deque<String> formula){
			
		List<String> events = new ArrayList<String>();
		events.add("A"); events.add("B"); events.add("C"); events.add("D"); 

	   if ( events.contains(formula.peek())) { 
		   return formula.pop();
	   }
	   else if ( formula.peek().equals("(") ) {
		   // Read the "("
		   formula.pop();
		   String leftEvent = expression(formula);  // Read and evaluate first operand.	      
		   char op = getOperator((formula.pop()).charAt(0));             // Read the operator.
		   String rightEvent = expression(formula); // Read and evaluate second operand.

	      if ( !formula.peek().equals(")") ) {
	         System.err.print("Missing right parenthesis.");
	      }

	      // Read the ")"
	      switch (op) {   //  Apply the operator and return the result. 
	      case '&':  return leftEvent+"&"+rightEvent;
	      case '|':  return leftEvent+"|"+rightEvent;
	      default:   return "";  // Can't occur 
	      }
	   // if(!formula.isEmpty())    // P(A&B)|C
	   }
	   else {  
		   System.err.print("Encountered unexpected character");
		   return "";
	   }
	} // end expressionValue()
	
	
	// Salma
	static char getOperator(char op){
	   if ( op == '&' || op == '|' ) { 
	      return op;
	   }
	  else if (op == '\n'){
		  System.err.print("Missing operator at end of line.");
		  return ' ';
	  }
	   else{
		   System.err.print("Missing operator.  Found \"" +
	            op + "\" instead of &, |.");
			  return ' ';
	   }
	} // end getOperator()
	
}
