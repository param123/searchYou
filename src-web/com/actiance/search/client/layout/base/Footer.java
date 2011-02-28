package com.actiance.search.client.layout.base;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.LayoutPanel;

public class Footer extends LayoutPanel {

	
	private final HTML footerPanel = new HTML("@Copy right reserved to me");
	private static Footer SINGLETON = new Footer();
	public Footer(){
		add(footerPanel);
		//setWidgetLeftRight(footerPanel, 5, Unit.EM, 5, Unit.EM);     // Center panel
		//setWidgetTopBottom(footerPanel, 5, Unit.EM, 0, Unit.EM);
		//getStyleElement().setAttribute("border", "1 thick solid");
	}
	
	public static Footer getFooter(){
		return SINGLETON;
	}
}
