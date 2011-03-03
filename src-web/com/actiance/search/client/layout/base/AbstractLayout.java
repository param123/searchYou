package com.actiance.search.client.layout.base;

import com.actiance.search.client.layout.LayoutManager;
import com.actiance.search.client.layout.interfaces.ILayout;

public abstract class AbstractLayout implements ILayout{
	
	protected LayoutManager lMgr = null;
	
	public AbstractLayout(LayoutManager manager){
		this.lMgr = manager;
	}

}
