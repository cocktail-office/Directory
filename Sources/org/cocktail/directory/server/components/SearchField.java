package org.cocktail.directory.server.components;

// Generated by the WOLips Templateengine Plug-in at 12 juil. 2007 10:36:50

import org.cocktail.directory.server.Session;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;


public class SearchField extends WOComponent {
	
	private static final long serialVersionUID = 1647136473622873560L;
	
	public String inputName;
	public String localeId;
	
    public SearchField(WOContext context) {
        super(context);
    }
    
    public String fieldValue() {
    	return "";
    }
    
    public String fieldLabel() {
    	return ((Session)session()).getLocalizedString(localeId);
    }

}