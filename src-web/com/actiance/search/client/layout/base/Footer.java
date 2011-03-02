package com.actiance.search.client.layout.base;

import com.actiance.search.client.util.SearchConstants;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.LayoutPanel;

public class Footer extends LayoutPanel {

	
	private static Footer SINGLETON = new Footer();
	private Footer(){
		HTML footerPanel = new HTML(SearchConstants.strConstants.copyright());
		footerPanel.setAutoHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		add(footerPanel);
	}
	
	public static Footer getFooter(){
		return SINGLETON;
	}
}
