package org.cocktail.directory.impl;

import org.cocktail.directory.eof.server.EOIndividuUlr;
import org.cocktail.directory.server.CommonDataHolder;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;

public class MarketsDirectory extends Directory {
	
	
	
	public MarketsDirectory() {
		super("mar");
		setLocaleIdForTitle("DMarketsTitle");
		setLocaleIdSubTitle("DMarketsSubTitle");
		super.setCssIdOfDirectory("marches");
		setWoDirActionName(CommonDataHolder.DIR_MAIN_ACTION);
		setMainEntity("Marche");
	}

	public void initDirectory() {
		// TODO Auto-generated method stub
		
	}

	/* used to make a link on an item to its details in the listing interface.
	@see SummaryItemsDisplay (shouldLinkToDetails) **/
	public boolean areDetailsAvailable() {
		return false;
	}

	public NSArray processSimpleSearch(NSDictionary searchArgs,EOEditingContext eContext,EOIndividuUlr user) {
		return null;
	}
	
	public boolean shouldDisplayListForFirstLevel() {
		return false;
	}

	public EOEnterpriseObject fetchObjectWithId(EOEditingContext ectx, String id) {
		EOEnterpriseObject obj =null;
//		try {
//			obj = DBHandler.fetchUniqueData(ectx,getMainEntity(),"persId",new Integer(id));
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		return obj;
	}

	public String componentNameForDetails() {
		return null;
	}

	public boolean canDetailAParentItem() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean processSearchAtPathwayLevel() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean supportsRevertSearch() {
		return false;
	}

	public NSArray searchResultFields() {
		return getSummaryFields();
	}


}
