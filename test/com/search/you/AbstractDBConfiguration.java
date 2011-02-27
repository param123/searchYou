package com.search.you;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public abstract class AbstractDBConfiguration implements IDBConfiguration{

	protected Properties properties;

	public AbstractDBConfiguration(){
		properties = DBPropertyReader.getInstance().getDBProperties();
	}
	
	@Override
	public String getProperty(String key) {
		return properties.getProperty(key);
	}

	@Override
	public Connection initConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(properties.getProperty(DBURL),
					properties.getProperty(DBUSER),
					properties.getProperty(DBPASSWORD));

			if (!conn.isClosed())
				System.out.println("Successfully connected to "
						+ "MySQL server using TCP/IP...");
		} catch (SQLException e) {
			throw new DBException("Error occured while creating connection",e);
		}
		return conn;
	}

}
