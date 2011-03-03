package com.actiance.search.client.msg;

import com.google.gwt.i18n.client.Constants;

public interface StringConstants extends Constants {
	
	@DefaultStringValue("Welcome")
	String welcome();
	
	@DefaultStringValue("&copy; copy right")
	String copyright();
	
	@DefaultStringValue("Actiance")
	String actiance();
	
	@DefaultStringValue("What is your question?")
	String whatISURQuestion();
	
	@DefaultStringValue("How did we arrive at this result?")
	String howDidWeArrive();

}
