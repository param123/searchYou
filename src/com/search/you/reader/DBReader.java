package com.search.you.reader;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import org.json.JSONException;
import org.json.JSONObject;

import com.search.you.DBException;
import com.search.you.DBFactory;
import com.search.you.ReadFromDB;
import com.search.you.processor.interfaces.IProcessor;
import com.search.you.reader.interfaces.IReader;

public class DBReader implements IReader {

	private PreparedStatement statement = null;
	private ReadFromDB rdb = new ReadFromDB();

	public DBReader() {

	}

	@Override
	public void init() {
		rdb.initConnection(DBFactory.getConfiguration());
		statement = rdb.getStatement("Select * from Messages");
	}

	@Override
	public void read(IProcessor processor) {
		try {
			ResultSet resultSet = statement.executeQuery();
			ResultSetMetaData metaData = resultSet.getMetaData();
			String columnName[] = new String[metaData.getColumnCount()];
			for (int i = 0; i < columnName.length; i++) {
				columnName[i] = metaData.getColumnLabel(i);
			}
			JSONObject jsonObject = null;
			while (resultSet.next()) {
				jsonObject = new JSONObject();
				try {
					for (int i = 0; i < columnName.length; i++) {
						jsonObject.put(columnName[i],resultSet.getObject(columnName[i]));
					}
					processor.processData(jsonObject);
				} catch (JSONException e) {
					e.printStackTrace();
				}
			}

		} catch (SQLException e) {
			throw new DBException("Error while querying from message table", e);
		}

	}

}
