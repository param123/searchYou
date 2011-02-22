package com.search.you.processor;

import org.json.JSONException;
import org.json.JSONObject;

import com.search.you.processor.interfaces.IProcessor;

public class DBProcessor implements IProcessor {

	@Override
	public void processData(JSONObject data) {

		try {
			System.out.println(data.toString(2));
		} catch (JSONException e) {
			e.printStackTrace();
			//TODO: don't know what to do ??
		}
		
	}

}
