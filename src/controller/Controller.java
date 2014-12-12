package controller;

//import java.util.ArrayList;

import java.util.List;

import Model.*;
import java.io.*;

public class Controller {
	
	private Problem problem;
	private static Controller instance;
	
	private Controller() {}
	
	public static Controller getInstance()
	{
		if(instance == null) {
			instance = new Controller();
		}
		return instance;
	}

	public void setData(List<String> samples, List<String> events, String formula, int comb)
			throws IOException{
		problem = new Problem(samples, events, formula, comb);
	}
	
	public Problem getData() {
		return problem;
	}
}
