package org.cocktail.directory.server.components;

// Generated by the WOLips Templateengine Plug-in at 7 d�c. 2006 17:05:57

import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.impl.ExternalDirectory;
import org.cocktail.directory.impl.pathways.Pathway;
import org.cocktail.directory.server.Application;
import org.cocktail.directory.server.NavigationInfos;
import org.cocktail.directory.server.Session;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableDictionary;



public class DirectoryListing extends WOComponent {
	
	private static final String CSS_CLASS_REF_hrefDirectory = "directory";
	private static final String CSS_CLASS_REF_divIndexElements = "indexElements";
	private static final String CSS_CLASS_REF_divPathForFilters = "filters";

	public Application app = (Application)Application.application();
	public Session session;
	
	public Directory currentDirectory;
	public Pathway currentPathway;
	public String specificClass, mainClass;
	private NSArray directories;
	public Directory specificDirectory;
	
    public DirectoryListing(WOContext context) {
        super(context);
        session = (Session)session();
    }

	public NSDictionary queryParameters() {
		NSMutableDictionary qDictionary = new NSMutableDictionary();
		qDictionary.setObjectForKey(currentDirectory.getId(),NavigationInfos.REQ_DIRECTORY);
		if(currentPathway!=null) {
			qDictionary.setObjectForKey(currentPathway.getId(), NavigationInfos.REQ_PATHWAY);
			if(currentPathway.needsAuthentication())
				qDictionary.setObjectForKey("1", NavigationInfos.REQ_AUTOCONNECT);
		}
		return (NSDictionary)qDictionary;
	}    
	
	public NSArray getDirectories() {
		if(specificDirectory!=null)
			return new NSArray(specificDirectory);
		else
			return app.listDirectories;
	}
	
	public boolean useSpecificDirectory() {
		return specificDirectory==null;
	}
	
	
	public boolean isExternalDirectory() {
		return (currentDirectory instanceof ExternalDirectory);
	}
	
	
	public String getLocalizationOfDirectoryTitle() {
		return session.getLocalizedString(currentDirectory.localeIdForTitle());
	}
	
	public String getLocalizedDirSubTitle() {
		return session.getLocalizedString(currentDirectory.localeIdSubTitle());
	}
	
	public String getPathwayLocalizedTitle() {
		return session.getLocalizedString(currentPathway.getLocalizationId());
	}

	public String getCSS_CLASS_REF_hrefDirectory() { return CSS_CLASS_REF_hrefDirectory; }
	public String getCSS_CLASS_REF_divIndexElements() { return CSS_CLASS_REF_divIndexElements; }
	public String getCSS_CLASS_REF_divPathForFilters() { return CSS_CLASS_REF_divPathForFilters; }

	public String externalDirectoryUrl() {
		return ((ExternalDirectory)currentDirectory).getExternalUrl();
	}

}