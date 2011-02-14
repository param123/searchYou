package com.search.you.storage;

import com.search.you.fatories.ProcessorFactory;
import com.search.you.processor.DBProcessor;
import com.search.you.reader.DBReader;
import com.search.you.reader.interfaces.IReader;

public class StartingPoint {
	
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		IReader reader = new DBReader();
		reader.init();
		reader.read(ProcessorFactory.getProcessor(DBProcessor.class));
		
		
	}
	
	

}
