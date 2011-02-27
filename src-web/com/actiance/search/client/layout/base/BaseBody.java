package com.actiance.search.client.layout.base;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HTML;

public class BaseBody extends DockLayoutPanel {

	
	public BaseBody(Unit unit) {
		super(unit);
		add(new HTML("BODY"));
//		setWidgetLeftRight(footerPanel, 5, Unit.EM, 5, Unit.EM);     // Center panel
//		setWidgetTopBottom(footerPanel, 5, Unit.EM, 5, Unit.EM);
	}
	
	
	public static BaseBody getBody(){
		return new BaseBody(Unit.EM);
	}

}
