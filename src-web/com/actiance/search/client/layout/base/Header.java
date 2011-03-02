package com.actiance.search.client.layout.base;

import com.actiance.search.client.util.SearchConstants;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.layout.client.Layout.Alignment;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;

public class Header extends LayoutPanel{

	HTML test = new HTML("SearchHeader");
	HorizontalPanel rightPanel = new HorizontalPanel();
	
	public Header(){
        addStyleName("header-background-image");
        rightPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
        rightPanel.addStyleName("header-right");
        rightPanel.add(getLabel(SearchConstants.strConstants.welcome()));
        rightPanel.add(getLabel("Prabhat","label-padding-left"));
        rightPanel.add(SearchConstants.getSeperator());
        rightPanel.add(getLabel("My Space"));
        rightPanel.add(SearchConstants.getSeperator());
        rightPanel.add(getLabel("Logout"));
        add(rightPanel);
        setWidgetHorizontalPosition(rightPanel,Alignment.END);
        setWidgetTopHeight(rightPanel, 2, Unit.EM, 2, Unit.EM);
        
        
	}
	
	private Label getLabel(String value,String styleName){
		Label temp = new Label(value);
		String tmp = styleName!=null?"label-font "+styleName:"label-font";
		temp.setStyleName(tmp);
		return temp;
	}
	
	private Label getLabel(String value){
		return getLabel(value, null);
	}
	
	
	
}
