package com.actiance.search.client.layout.base;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.LayoutPanel;

public class Header extends LayoutPanel{

	
		
	
	//searchToken
	HTML test = new HTML("SearchHeader");
	
	public static Header getHeader(String token){
		return new Header();
	}
	
	public Header(){
        add(test);
       // setWidgetLeftRight(test, 5, Unit.EM, 5, Unit.EM);     // Center panel
		setWidgetTopBottom(test, 0, Unit.EM, 5, Unit.EM);
	}
	
}
