package vp;

import java.util.Arrays;
import java.util.List;

public class Parser {

	Parser(){
		
	}
	List<String> parseComma(String txt){
		return Arrays.asList(txt.split(" *, *"));
	}
	
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
	
	
	
}
