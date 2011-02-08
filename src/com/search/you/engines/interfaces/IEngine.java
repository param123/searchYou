package com.search.you.engines.interfaces;

public interface IEngine {
	
	/**
	 * Different state of engine.
	 */
	public static int INIT = 0;
	public static int START = 1;
	public static int STOPPED = -1;
	
	public void initEngine();
	
	public boolean startEngine();
	
	public boolean stopEngine();
	
	public String getEngineId();
	
	public String getEngineName();
	
}
