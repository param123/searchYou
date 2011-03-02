package com.actiance.search.client.util;

import com.actiance.search.client.msg.StringConstants;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Label;

public class SearchConstants {
	
	public static StringConstants strConstants = (StringConstants)GWT.create(StringConstants.class);
	
	public static Label getSeperator(){
		Label seperator = new Label("|");
		seperator.setStyleName("label-padding-left label-padding-right seperator");
		return seperator;
	}
	
}
