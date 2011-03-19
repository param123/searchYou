package com.search.you.reader.interfaces;

import java.sql.SQLException;

import com.search.you.processor.interfaces.IProcessor;

public interface IReader {
	
	public void init() throws SQLException;
	
	public void read(IProcessor processor);
	

}
