package com.actiance.search.client.layout.interfaces;

import com.google.gwt.user.client.ui.Widget;

public interface ILayout {
	
	public Widget getBody();
	
	public Widget header();
	
	public Widget footer();

	public Widget container();
	
	public void makeLayout();
	
	public void resetComponent(Widget widget,double size);
}
