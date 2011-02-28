package com.actiance.search.client.layout;

import com.actiance.search.client.layout.interfaces.ILayout;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class LayoutManager {
	
	
	private static LayoutManager LAYOUT_MANAGER = new LayoutManager();
	public static final int BASE = 0;
	private ILayout layOut = null;
	
	private LayoutManager(){
		
	}
	
	public static LayoutManager getLayoutManager(){
		return LAYOUT_MANAGER;
	}
	
	public void setLayout(ILayout layout){
		this.layOut = layout;
	}
	
	public void paintLayout(){
        layOut.makeLayout();
        RootLayoutPanel.get().clear();
        RootLayoutPanel.get().add(layOut.container());
	}
	
	public ILayout getLayout(){
		return layOut;
	}
	

}
