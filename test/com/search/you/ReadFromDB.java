package com.search.you;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class ReadFromDB {
		
	private static Connection conn;
	
	static{
		initDriver();
	}
	
	
	private static void initDriver() {
		try {
			Class.forName(DBPropertyReader.getInstance().getDBProperties().getProperty(IDBConfiguration.DBDRIVER)).newInstance();
		} catch (Throwable e) {
           throw new DBException("Error while Database initialization",e);
		}
	   
	}
	
	public void initConnection(IDBConfiguration dbConfiguration){
		 conn = dbConfiguration.initConnection();
	}
	
	public PreparedStatement getStatement(String query) throws SQLException{
		return conn.prepareStatement(query);
	}
	
	
	/**
	 * Test method
	 * @param query
	 * @return
	 */
	
	private ResultSet getResult(String query){
		ResultSet rs = null;
		try {
			PreparedStatement statement = conn.prepareStatement(query);
			rs = statement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		ReadFromDB rfdb = new ReadFromDB();
		rfdb.initConnection(new MYSQLConfiguration());
		ResultSet rs = rfdb.getResult("Select * from Message");
		
		System.out.println("------------------------------------------------------------------");
		while(rs.next()){
			int id = rs.getInt("id");
			String message = rs.getString("message");
			Timestamp ts = rs.getTimestamp("insertTime");
			System.out.println("| "+id+"   |"+message+"          |       "+ts+"               |");
		}
		System.out.println("------------------------------------------------------------------");
	}

	public PreparedStatement getStatement(String string) {

		try {
			return conn.prepareStatement(string);
		} catch (SQLException e) {
            throw new DBException("Error while executing command "+string, e);
		}
	}

}
