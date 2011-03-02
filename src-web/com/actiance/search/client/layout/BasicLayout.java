package com.actiance.search.client.layout;

import com.actiance.search.client.layout.base.AbstractLayout;
import com.actiance.search.client.layout.base.BaseBody;
import com.actiance.search.client.layout.base.Footer;
import com.actiance.search.client.layout.base.Header;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.Widget;

public class BasicLayout extends AbstractLayout {

	
	private DockLayoutPanel container = null;
	private LayoutPanel     footer = null;
	private LayoutPanel     header = null;
	private Panel     body   = null;
	
	public BasicLayout(Unit unit,LayoutManager manager){
		super(manager);
		container = new DockLayoutPanel(unit);
	    footer = Footer.getFooter();
	    header = new Header();
	    body = new BaseBody(unit);
	}
	
	@Override
	public Widget container() {
		return container;
	}

	@Override
	public Widget footer() {
		return footer;
	}

	@Override
	public Widget getBody() {
		return body;
	}

	@Override
	public Widget header() {
		return header;
	}

	@Override
	public void makeLayout() {
		
		container.addNorth(header, 6.491);
		container.addSouth(footer, 1);
		container.add(body);
		
	}

	@Override
	public void resetComponent(Widget widget,double size) {
		container.setWidgetSize(widget, size);
	}
	
	

}
