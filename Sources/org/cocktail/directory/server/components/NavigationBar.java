package org.cocktail.directory.server.components;

// Generated by the WOLips Templateengine Plug-in at 8 d�c. 2006 10:20:39

import org.cocktail.directory.server.NavigationPath;
import org.cocktail.directory.server.Session;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSArray;



public class NavigationBar extends WOComponent {

	private static final long serialVersionUID = 4192895759833300962L;

	public NavigationPath currentPath;
	public Session session;
	public int pathIndex;
	
    public NavigationBar(WOContext context) {
        super(context);
        session = (Session)session();
    }
    
   
    public String getLiStyle() {
    	if(pathIndex>0)
    		return "afterindex";
    	else
    		return null;
    }
    
    
    public String currentPathDisplayString() {
    	if(currentPath.getDisplayString()!=null)
    		return currentPath.getDisplayString();
    	else
    		return session.getLocalizedString(currentPath.localizationId());
    }
    
    public NSArray listPaths() {
    	return session.navInfosHolder.getListPaths();
    }
   
 
}