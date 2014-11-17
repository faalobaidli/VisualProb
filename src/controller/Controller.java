package controller;

import java.util.ArrayList;
import java.util.List;

import vp.*;

public class Controller {
	
	String stringList;

	private Controller() {}
	
	private static Controller instance;
	
	public static Controller getInstance()
	{
		if(instance == null) {
			instance = new Controller();
		}
		return instance;
	}

	public void setData(String data) {
		stringList = data;
	}
	
	public String getData() {
		return stringList;
	}
}
