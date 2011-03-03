package com.actiance.search.client.layout.base;

import com.actiance.search.client.util.SearchConstants;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.VerticalPanel;

public class BaseBody extends DockLayoutPanel {

	private VerticalPanel searchPanel = new VerticalPanel();
	private TextArea searchBox = null;
	private double searchPanelHeight = 9;
	private HTMLPanel howDidWeArrive = new HTMLPanel(SearchConstants.strConstants.howDidWeArrive());
	public BaseBody(Unit unit) {
		super(unit);
		
		searchPanel.setStyleName("search-panel");
		searchPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		searchPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LOCALE_START);
		addStyleName("body-layout");
		questionPanel();
		createSearchBox();
		addNorth(searchPanel, searchPanelHeight);
	}
	
	
	private void createSearchBox(){
		HorizontalPanel textPanel = new HorizontalPanel();
		textPanel.setStyleName("search-box");
		textPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		searchBox = new TextArea();
		searchBox.setStyleName("search-text-box");
		textPanel.add(searchBox);
		createButton(textPanel);
		
		searchPanel.add(textPanel);
		
		
		
//		SimplePanel searchButton = new SimplePanel();
//		searchButton.setStyleName("search-button");
//		searchButton.setSize("75px", "100%");
//		searchPanel.add(searchButton);
	}
	
	private void createButton(Panel parent){
		Button askButton = new Button("Ask Now");
		askButton.setStyleName("ask-button button-font");
		parent.add(askButton);
	}
	
	
	private void howDidWeArrive(Panel parent){
		
		
	}
	
	private void questionPanel(){
		SimplePanel panel = new SimplePanel();
		panel.add(SearchConstants.getLabel(SearchConstants.strConstants.whatISURQuestion(), "question-font "));
		searchPanel.add(panel);
	}
	
	
	
//	private void createSearchButton(){
//		
//	}
	
}
