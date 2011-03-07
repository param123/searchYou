package com.actiance.search.client.layout.base;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ResultPanel extends VerticalPanel {

	private TabPanel people = new TabPanel();
	private HTMLPanel messagePanel = new HTMLPanel("We are recommending 15 people and 30 documents");
	public ResultPanel() {
	   setStyleName("result-panel");
//	   messagePanel.setHeight("30%");
	   add(messagePanel);
       add(people);
       setCellHeight(messagePanel, "55px");
       people.add(new HTML("List of people<br>asasd <br>asdasd<br>"),"People");
       people.add(new HTML("List of people<br>asasd <br>Kumadasdasd<br>"),"Document");
//       people.setSize("100%", "100%");
       people.selectTab(0);
	}
		
//	
//	@Override
//	public boolean remove(Widget child) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public Iterator<Widget> iterator() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
