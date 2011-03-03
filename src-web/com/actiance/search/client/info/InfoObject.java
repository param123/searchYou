package com.actiance.search.client.info;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONObject;

public class InfoObject {
	
	JSONObject jsonObject = null;
	
	public InfoObject(JavaScriptObject jso){
		jsonObject = new JSONObject(jso);
	}

}
