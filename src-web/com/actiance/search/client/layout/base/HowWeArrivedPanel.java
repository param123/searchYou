package com.actiance.search.client.layout.base;

import com.actiance.search.client.util.SearchConstants;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;

public class HowWeArrivedPanel extends HorizontalPanel{
	
    private Label line = new Label("");
    private Label msg = new Label(SearchConstants.strConstants.howDidWeArrive());
//    private Image lineImg = new Image();
    
    public HowWeArrivedPanel(){
    	setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
    	setStyleName("how-did-panel");
    	
    	line.setStyleName("how-did");
    	add(line);
    	msg.setStyleName("query-font label-padding-right");
    	add(msg);
    	setCellWidth(line, "20%");
    }
    

}
