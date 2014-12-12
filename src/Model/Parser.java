package Model;

import java.util.*;
import java.io.*;

public class Parser {

	private static Deque<String> formula;
	private Deque<String> formulalg;
	private List<String> eventstag = new ArrayList<String>();
	
	Parser(){
		formula = new ArrayDeque<String>();
		formulalg = new ArrayDeque<String>();
		eventstag.add("A"); eventstag.add("B"); eventstag.add("C"); eventstag.add("D");
	}
	
	public String parseEventStar(String txt){
		return txt;
	}
	
	public String parseEvent(String txt) 
			throws IOException { //System.out.println("ParseEvent"+txt);
		
		if (txt.startsWith(">=")){
			return ">="+ ":"+ txt.substring(2).trim();
		}else if (txt.startsWith("<=")){
			return "<="+ ":"+ txt.substring(2).trim();
		}else if (txt.startsWith(">")){
			return ">"+ ":"+ txt.substring(1).trim();
		}else if (txt.startsWith("<")){
			return "<"+ ":"+ txt.substring(1).trim();
		}else if (txt.startsWith("=")){ 
			return "="+ ":"+ txt.substring(1).trim();
		}else{
			throw new IOException("Unknown operator. Use '>', '<' or '='. Or use comma(s) to specify a set.");
		}		
	}
	
		public String formulaParser(String f)
			throws IOException{
			for(int i=0 ; i<f.length() ; i++)
				if(f.charAt(i) != ' ')
					formula.add(Character.toString(f.charAt(i)));
			
			if(formula.pop().equalsIgnoreCase("P")){
				formulalg.addAll(formula);
				if ( formula.peek().equals("(") )	{
					String cf = expression(formula);
					return cf;}
				else{ 
					throw new IOException("Wrong syntax of the formula: It should start with: P(...");
				}			
			}
			else{
				throw new IOException("Wrong syntax of the formula: It should start with: P(...");
			}
		}

		private String expression(Deque<String> formula)
		throws IOException{

			if ( eventstag.contains(formula.peek())) { 
				   return formula.pop();
			   }
			else if ( formula.pop().equals("(")) {
				String leftEvent = expression(formula);  // Read and evaluate first operand.
				if ( formula.peek().equals(")") ) { 
					return leftEvent;
				}
				
				char op = getOperator(formula.pop().charAt(0));             // Read the operator.
				String rightEvent = expression(formula);
			
				if ( !formula.pop().equals(")") ) {   
					throw new IOException("Wrong syntax of the formula: Missing right parenthesis.");
				}
			
				 switch (op) {   //  Apply the operator and return the result. 
			      case '&':  return leftEvent+"&"+rightEvent;
			      case '|':  return leftEvent+"|"+rightEvent;
			      default:   return "";  // can't occur 
			      }
			}
			else {
				throw new IOException("Encountered unexpected character.");
			}
		} // end expressionValue()
		
		private static char getOperator(char op)
		throws IOException{
		   if ( op == '&' || op == '|' ) { 
		      return op;
		   }
		  else if (op == '\n'){
				throw new IOException("Missing operator at end of line.");
		  }
		   else{
			   throw new IOException("Missing operator.  Found \"" +op + "\" instead of &, |.");
		   }
		} // end getOperator()
	
		public Deque<String> getformulalg(){
			return formulalg;
		}
}
