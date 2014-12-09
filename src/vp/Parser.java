package vp;

import java.util.*;
import java.io.*;

public class Parser {

	static Deque<String> formula;
	Deque<String> formulalg;
	
	List<String> eventstag = new ArrayList<String>();
	char op;

	
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
			//System.err.print("Unknown operator. Use '>', '<' or '='. Or use comma(s) to specify a set.");
			//System.exit(0);
			//return null;
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
					//System.err.print(;
					//return "";
				}			
			}
			else{
				throw new IOException("Wrong syntax of the formula: It should start with: P(...");
//				System.err.print("Wrong syntax of the formula: It should start with: P(...");
//				return "";
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

					//System.err.print("Wrong syntax of the formula: Missing right parenthesis.");
					//return "";
				}
			
				 switch (op) {   //  Apply the operator and return the result. 
			      case '&':  return leftEvent+"&"+rightEvent;
			      case '|':  return leftEvent+"|"+rightEvent;
			      default:   return "";  // can't occur 
			      }
			}
			else {
				throw new IOException("Encountered unexpected character.");
				//System.err.print("Encountered unexpected character.");
				//return "";
			}
		} // end expressionValue()
		
		static char getOperator(char op)
		throws IOException{
		   if ( op == '&' || op == '|' ) { 
		      return op;
		   }
		  else if (op == '\n'){
				throw new IOException("Missing operator at end of line.");
			  //System.err.print("Missing operator at end of line.");
			  //return ' ';
		  }
		   else{
			   throw new IOException("Missing operator.  Found \"" +op + "\" instead of &, |.");
			   //System.err.print("Missing operator.  Found \"" +
		           // op + "\" instead of &, |.");
				 // return ' ';
		   }
		} // end getOperator()
	
}
