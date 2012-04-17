package org.cocktail.directory.server.components;

// Generated by the WOLips Templateengine Plug-in at 11 janv. 2007 11:33:57

import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.impl.pathways.Pathway;
import org.cocktail.directory.server.Application;
import org.cocktail.directory.server.DirectAction;
import org.cocktail.directory.server.NavigationInfos;
import org.cocktail.directory.server.Session;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WODisplayGroup;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;



public class SimpleSearchResults extends WOComponent {
	
	public Application app = (Application)Application.application();
	
	public int dirIndex;
	//public String searchString;
	
	public NSDictionary searchArgs;
	
	public Directory currentDirectory;
	
	private String typeRequestItem = NavigationInfos.REQ_SPECIFIC_ITEM; // anciennement typeDisplayForItem
	
	private NSDictionary dicoSearchParams;
	public Directory directory;
	public Pathway currentPathway;
	
	private NSArray results;
	
	public WODisplayGroup displayGroup;
	public Session session;
	
	private boolean erase = false;
	
    public SimpleSearchResults(WOContext context) {
        super(context);
        session = (Session)session();
    }

    public NSArray listDirectories() {
    	if(directory!=null)
    		return new NSArray(directory);
    	else
    		return app.listDirectories;
    }
    
    public boolean isInitiallyCollapsed() {
    	return listDirectories().count()>1;
    }
    
	public NSDictionary getDicoSearchParams() {
		return dicoSearchParams;
	}

	public String getTypeRequestItem() {
		return typeRequestItem;
	}

    public void setDicoSearchParams(NSDictionary dico) {
    	if(dico==null) return;
    	directory = app.getDirectoryWithId( (String)dico.valueForKey(NavigationInfos.REQ_DIRECTORY) );
    	//searchString = (String)dico.valueForKey(DirectAction.SEARCH_STRING);
    	searchArgs = (NSDictionary)dico.valueForKey(DirectAction.SEARCH_ARGS);
    }

    public void setTypeRequestItem(String typeRequestItem) {
		this.typeRequestItem = typeRequestItem;
	}





    
}