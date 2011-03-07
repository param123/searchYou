package com.actiance.search.client.layout.base;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.SimplePanel;

public class SidePanel extends SimplePanel {
	
	
	
	public SidePanel() {
       add(new HTML("I am a side panel"));
       setStyleName("side-panel");
	}

}
