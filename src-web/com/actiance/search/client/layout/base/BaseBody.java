package com.actiance.search.client.layout.base;

import com.actiance.search.client.util.SearchConstants;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CellPanel;
import com.google.gwt.user.client.ui.DockLayoutPanel;
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
//	private HTMLPanel howDidWeArrive = new HTMLPanel(SearchConstants.strConstants.howDidWeArrive());
//	private ListBox optionList = new ListBox(false);
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
//		HorizontalPanel parentPanel = new HorizontalPanel();
//		parentPanel.setSize("100%", "100%");
		HorizontalPanel textPanel = new HorizontalPanel();
		textPanel.setStyleName("search-box");
		textPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		textPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_LEFT);
		searchBox = new TextArea();
		searchBox.setStyleName("search-text-box");
		
		textPanel.add(searchBox);
		textPanel.setCellWidth(searchBox, "50%");
//		createOptions(textPanel);
		createButton(textPanel,"20%");
//		HorizontalPanel howDidPanel = new HorizontalPanel();
		howDidWeArrive(textPanel,"30%");
//		parentPanel.add(textPanel);
//		parentPanel.add(howDidPanel);
		searchPanel.add(textPanel);
		
		
		
//		SimplePanel searchButton = new SimplePanel();
//		searchButton.setStyleName("search-button");
//		searchButton.setSize("75px", "100%");
//		searchPanel.add(searchButton);
	}
	
//	private void createOptions(Panel parent){
//		optionList.setStyleName("option-list");
//		optionList.addItem("All");
//		optionList.addItem("People");
//		optionList.addItem("Document");
//		parent.add(optionList);
//	}
	
	private Button createButton(CellPanel parent,String width){
		Button askButton = new Button("Ask Now");
		askButton.setStyleName("ask-button button-font");
		parent.add(askButton);
		parent.setCellWidth(askButton, width);
		return askButton;
	}
	
	
	private void howDidWeArrive(CellPanel parent,String width){
		HowWeArrivedPanel hwap = new HowWeArrivedPanel();
		parent.add(hwap);
		parent.setCellWidth(hwap, width);
		
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
