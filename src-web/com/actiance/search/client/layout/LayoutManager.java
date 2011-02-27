package com.actiance.search.client.layout;

import com.actiance.search.client.layout.base.BaseBody;
import com.actiance.search.client.layout.base.Footer;
import com.actiance.search.client.layout.base.Header;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class LayoutManager {
	
	
	private static LayoutManager LAYOUT_MANAGER = new LayoutManager();
	public static final int BASE = 0;
	
	
	private LayoutManager(){
		
	}
	
	public static LayoutManager getLayoutManager(){
		return LAYOUT_MANAGER;
	}
	
	public Widget getLayout(int i){
	
		Widget layoutWidget = null;
		
		switch(i){
		case BASE:
			 DockLayoutPanel dockPanel = new DockLayoutPanel(Unit.EM);
			 dockPanel.addNorth(Header.getHeader("Search"), 20);
			 dockPanel.addSouth(Footer.getFooter(), 20);
			 dockPanel.add(BaseBody.getBody());
			 layoutWidget = dockPanel;
			
		}
		
		return layoutWidget;
	}
	
	

}
