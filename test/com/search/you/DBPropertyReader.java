package com.search.you;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class DBPropertyReader {
	
	private static final String  propertyFileName = "db.properties";
	private static DBPropertyReader SINGLETON ;
	private static Properties properties ;
	static {
	   initInstance();
	}
	
	private DBPropertyReader() {
		
	}
	
	private static void initInstance(){
		try {
			InputStream inputStream = DBPropertyReader.class.getResourceAsStream(propertyFileName);
			if(inputStream == null){
				throw new ResourceInitializationException("Resource file "+propertyFileName+" cannot be loaded");
			}
			properties = new Properties();
			properties.load(inputStream);
			inputStream.close();
		} catch (IOException e) {
			throw new ResourceInitializationException(e);
		}
	}
	
	public static DBPropertyReader getInstance(){
		if(SINGLETON == null){
			SINGLETON = new DBPropertyReader();
		}
		return SINGLETON;
	}
	
	public Properties getDBProperties(){
		return properties;
	}

}
