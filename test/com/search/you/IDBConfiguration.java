package com.search.you;

import java.sql.Connection;

public interface IDBConfiguration {
	
	//Keys
	public static String DBPASSWORD= "password";
	public static String DBUSER = "user";
	public static String DBDRIVER = "driver";
	public static String DBURL = "url";
	public static String DBNAME = "name";
	
	
	public String getProperty(String key);
	
	public Connection initConnection();
	
//	public String getPassWord();
//	
//	public String getUser();
//	
//	public String getURL();
//	
//	public String getDriverName();
//	
	
}
