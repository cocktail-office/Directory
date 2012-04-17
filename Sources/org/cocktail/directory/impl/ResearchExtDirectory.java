// 20 mars 07
//created by : Fran�ois Adour

// Project : Directory

package org.cocktail.directory.impl;

import org.cocktail.directory.eof.server.EOIndividuUlr;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;


public class ResearchExtDirectory extends ExternalDirectory {

	public ResearchExtDirectory() {
		super();
		setLocaleIdForTitle("DResearchTitle");
		setLocaleIdSubTitle("DResearchSubTitle");
		setCssIdOfDirectory("recherche");
	}
	
	public NSArray processSimpleSearch(NSDictionary searchArgs,EOEditingContext eContext,EOIndividuUlr user) {
		return null;
	}
	
	public NSArray searchResultFields() {
		return null;
	}


}
