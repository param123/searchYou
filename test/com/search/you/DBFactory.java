package com.search.you;

public class DBFactory {

	public static IDBConfiguration getConfiguration() {
		String dbName = DBPropertyReader.getInstance().getDBProperties()
				.getProperty(IDBConfiguration.DBNAME);
		IDBConfiguration dbconf = null;
		if ("MSSQL".equalsIgnoreCase(dbName)) {
			dbconf = new MSSQLConfiguration();
		} else if ("MYSQL".equalsIgnoreCase(dbName)) {
			dbconf = new MYSQLConfiguration();
		}

		return dbconf;
	}

}
