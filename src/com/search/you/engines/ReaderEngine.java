package com.search.you.engines;

import com.search.you.engines.interfaces.IEngine;

public class ReaderEngine implements IEngine{
	
	private static String name = "Reader Engine";
	private static String id   = "com.search.you.engines.ReaderEngine";
	

	@Override
	public String getEngineId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getEngineName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void initEngine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean startEngine() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean stopEngine() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
