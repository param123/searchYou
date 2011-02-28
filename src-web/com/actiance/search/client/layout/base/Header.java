package com.actiance.search.client.layout.base;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.layout.client.Layout.Alignment;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;

public class Header extends LayoutPanel{

	HTML test = new HTML("SearchHeader");
	HorizontalPanel rightPanel = new HorizontalPanel();
	public Header(){
        addStyleName("header-background-image");
        rightPanel.addStyleName("header-right");
        Label label = new Label("Welcome ");
        Label me = new Label("Prabhat");
        Label seperator = new Label("|");
        seperator.addStyleName("seperator-label");
        rightPanel.add(label);
        rightPanel.add(seperator);
        rightPanel.add(me);
        
//        rightPanel.add();
        add(rightPanel);
       // add(new Label("My Space"));
       // add(new Label("Logout"));
        setWidgetHorizontalPosition(rightPanel,Alignment.END);
        setWidgetBottomHeight(rightPanel, 3, Unit.EM, 1, Unit.EM);
        
      //  setWidgetRightWidth(rightPanel, 1, Unit.EM, 10, Unit.EM);
//        setWidgetVerticalPosition(rightPanel, Alignment.STRETCH);
//        setStyleName("header-bottom-right");
       // add(test);
      //  setWidgetLeftRight(test, 5, Unit.EM, 5, Unit.EM);     // Center panel
		//setWidgetTopBottom(test, 0, Unit.EM, 5, Unit.EM);
	}
	
	
	
}
