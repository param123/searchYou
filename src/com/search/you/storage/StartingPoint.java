package com.search.you.storage;

import java.sql.SQLException;

import com.search.you.fatories.ProcessorFactory;
import com.search.you.processor.DBProcessor;
import com.search.you.reader.DBReader;
import com.search.you.reader.interfaces.IReader;

public class StartingPoint {
	
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		
		IReader reader = new DBReader();
		reader.init();
		reader.read(ProcessorFactory.getProcessor(DBProcessor.class));
		
		
	}
	
	

}
