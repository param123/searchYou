package com.actiance.search.client.layout.base;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextArea;

public class BaseBody extends DockLayoutPanel {

	private HorizontalPanel searchPanel = new HorizontalPanel();
	private TextArea searchBox = null;
	public BaseBody(Unit unit) {
		super(unit);
		
		searchPanel.setStyleName("search-panel");
		searchPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		//searchPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		addStyleName("body-layout");
		createSearchBox();
		createSearchButton();
		addNorth(searchPanel, 20);
//		setWidgetLeftRight(footerPanel, 5, Unit.EM, 5, Unit.EM);     // Center panel
//		setWidgetTopBottom(footerPanel, 5, Unit.EM, 5, Unit.EM);
	}
	
	
	private void createSearchBox(){
		SimplePanel textPanel = new SimplePanel();
		textPanel.setStyleName("search-box");
		textPanel.setSize("314px", "118px");
		searchBox = new TextArea();
		searchBox.setStyleName("search-text-box");
		searchBox.setSize("282px", "106px");
		textPanel.add(searchBox);
		searchPanel.add(textPanel);
	}
	
	private void createSearchButton(){
		SimplePanel searchButton = new SimplePanel();
		searchButton.setStyleName("search-button");
		searchButton.setSize("128px", "128px");
		searchPanel.add(searchButton);
	}
	
}
