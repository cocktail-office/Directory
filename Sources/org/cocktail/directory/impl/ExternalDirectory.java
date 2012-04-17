// 20 mars 07
//created by : François Adour

// Project : Directory

package org.cocktail.directory.impl;

import org.cocktail.directory.eof.server.EOIndividuUlr;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.foundation.NSArray;



/**
 * Cette classe represente un annuaire externe à l'application : un simple lien vers une application existante
 * */

public abstract class ExternalDirectory extends Directory {

	
	private String externalUrl;
	
	public ExternalDirectory() {
		super("ext");
	}

	public boolean areDetailsAvailable() {
		return false;
	}

	public boolean canDetailAParentItem() {
		return false;
	}

	public String componentNameForDetails() {
		return null;
	}

	public EOEnterpriseObject fetchObjectWithId(EOEditingContext ectx, String id) {
		return null;
	}

	public void initDirectory() {
	}

	public boolean processSearchAtPathwayLevel() {
		return false;
	}

	public NSArray processSimpleSearch(String criterion,
			EOEditingContext eContext, EOIndividuUlr user) {
		return null;
	}

	public boolean shouldDisplayListForFirstLevel() {
		return false;
	}

	public boolean supportsRevertSearch() {
		return false;
	}

	public String getExternalUrl() {
		return externalUrl;
	}

	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
	}

}
