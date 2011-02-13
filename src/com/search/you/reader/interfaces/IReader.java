package com.search.you.reader.interfaces;

import java.sql.ResultSet;

import org.json.JSONObject;

import com.search.you.processor.interfaces.IProcessor;

public interface IReader {
	
	public void init();
	
	public void read(IProcessor processor);
	
	public JSONObject obtainJSONObject(ResultSet re);
	
	

}
