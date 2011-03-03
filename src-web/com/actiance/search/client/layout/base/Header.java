package com.actiance.search.client.layout.base;

import com.actiance.search.client.util.SearchConstants;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.layout.client.Layout.Alignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;

public class Header extends LayoutPanel{

	HorizontalPanel rightPanel = new HorizontalPanel();
    	
	public Header(){
        addStyleName("header");
        rightPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
        rightPanel.addStyleName("header-right");
        rightPanel.add(SearchConstants.getLabel(SearchConstants.strConstants.welcome()));
        rightPanel.add(SearchConstants.getLabel("Prabhat","label-padding-left"));
        rightPanel.add(SearchConstants.getSeperator());
        rightPanel.add(SearchConstants.getLabel("My Space"));
        rightPanel.add(SearchConstants.getSeperator());
        rightPanel.add(SearchConstants.getLabel("Logout"));
        add(rightPanel);
        
        HorizontalPanel actiance = new HorizontalPanel();
        actiance.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
        actiance.add(SearchConstants.getLabel(SearchConstants.strConstants.actiance(),"header-font"));//,"label-padding-left"));
        
        add(actiance);
        setWidgetHorizontalPosition(rightPanel,Alignment.END);
        setWidgetTopHeight(rightPanel, 2, Unit.EM, 2, Unit.EM);
        setWidgetHorizontalPosition(actiance,Alignment.BEGIN);
        setWidgetLeftWidth(actiance, 5, Unit.EM, 20, Unit.EM);
        
        
	}
	
	
	
	
}
