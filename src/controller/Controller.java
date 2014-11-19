package controller;

import java.util.ArrayList;
import java.util.List;

import vp.*;

public class Controller {
	
	public Problem problem;

	private Controller() {}
	
	private static Controller instance;
	
	public static Controller getInstance()
	{
		if(instance == null) {
			instance = new Controller();
		}
		return instance;
	}

	public void setData(Problem p) {
		problem = p;
	}
	
	public Problem getData() {
		return problem;
	}
}
