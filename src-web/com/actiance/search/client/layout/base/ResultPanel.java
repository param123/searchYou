package com.actiance.search.client.layout.base;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class ResultPanel extends VerticalPanel {

	private TabPanel people = new TabPanel();
	private HTMLPanel messagePanel = new HTMLPanel("We are recommending 15 people and 30 documents");
	private Image backgroundImage = new Image("images/result-background.gif");
//	private Image activeImage = new Image("images/active.gif");
//	private Image inActiveImage = new Image("images/non-active.gif");
	public ResultPanel() {
	   setStyleName("result-panel");
	   add(messagePanel);
       add(people);
//       activeImage.setAltText("People");
//       inActiveImage.setAltText("Document");
       messagePanel.setStyleName("message-font");
       people.add(new HTML("List of people<br>asasd <br>asdasd<br>"),"People");
       people.add(new HTML("List of people<br>asasd <br>Kumadasdasd<br>"),"Document");
       people.selectTab(0);
//       people.getTabBar().setStyleName("gwt-tabBar");
//       people.getTabBar().getTab(0).
       setCellHeight(messagePanel, "12%");
       setCellHeight(people, "88%");
	}
	
	public void updateBackgroundImage(){
		getElement().getParentElement().insertFirst(backgroundImage.getElement());
	}
		
}
