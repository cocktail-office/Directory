// 14 mars 07
//created by : Fran�ois Adour

// Project : Directory

package org.cocktail.directory.impl;

import org.cocktail.directory.eof.server.EOIndividuUlr;
import org.cocktail.directory.impl.elements.FieldItem;
import org.cocktail.directory.server.CommonDataHolder;
import org.cocktail.directory.tools.DirUtilities;

import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;

public class ConventionsDirectory extends Directory {

	public ConventionsDirectory() {
		super("acc");
		setLocaleIdForTitle("DConventionsTitle");
		setLocaleIdSubTitle("DConventionsSubTitle");
		setCssIdOfDirectory("convention");
		setWoDirActionName(CommonDataHolder.DIR_MAIN_ACTION);
		setMainEntity("AccordsContrat");
	}

	public void initDirectory() {
		// FieldItem tmpField = new FieldItem("cCivilite","codeCivilite",null,false);
		// addToSummaryFields(tmpField);
		// tmpField = new FieldItem("LNomUsuel","indNom",null,false);
		// addToSummaryFields(tmpField);
		// tmpField = new FieldItem("LPrenom","indPrenom",null,false);
		// addToSummaryFields(tmpField);
		// tmpField = new FieldItem("LTel","telephoneIndividu",null,true);
		// addToSummaryFields(tmpField);
		// tmpField = new FieldItem("LFax","faxIndividu",null,true);
		// addToSummaryFields(tmpField);
		//
		// LinkFieldItem mailField = new LinkFieldItem("LMail","emailPrincipalIndividu",LinkFieldItem.MAILTO_LINK);
		// addToSummaryFields(mailField);
		//
		// LinkFieldItem field = new LinkFieldItem("LAgenda","LSee","urlAgendaPublic",LinkFieldItem.HREF_LINK);
		// addToSummaryFields(field);
		//
		// field = new LinkFieldItem("LICal","LStream","urlICSPublic",LinkFieldItem.HREF_LINK);
		// addToSummaryFields(field);

		FieldItem field = new FieldItem("LNumConvention", "numConvention", null, false);
		addToSummaryFields(field);

		field = new FieldItem("LRefExt", "conReferenceExterne", null, false);
		addToSummaryFields(field);

		field = new FieldItem("LLabel", "contratInitCourt", "contratInitLong", false);
		addToSummaryFields(field);

		field = new FieldItem("LPartPrinc", "libPartenairePrincipal", null, false);
		addToSummaryFields(field);

		field = new FieldItem("LManagementCenter", "libCR", null, false);
		addToSummaryFields(field);

		SearchItem item = new SearchItem("LLabel", "avtObjet", "avtObjet");
		addToSearchItems(item);

	}

	/*
	 * used to make a link on an item to its details in the listing interface.
	 * 
	 * @see SummaryItemsDisplay (shouldLinkToDetails) *
	 */
	public boolean areDetailsAvailable() {
		return true;
	}

	public boolean shouldDisplayListForFirstLevel() {
		return true;
	}

	public String componentNameForDetails() {
		return "DetailConvention";
	}

	public boolean canDetailAParentItem() {
		return true;
	}

	public EOEnterpriseObject fetchObjectWithId(EOEditingContext ectx, String id) {
		EOEnterpriseObject obj = null;
		try {
			obj = DirUtilities.fetchUniqueData(ectx, getMainEntity(), "conOrdre", new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

	public NSArray processSimpleSearch(NSDictionary searchArgs, EOEditingContext eContext, EOIndividuUlr user) {

		NSDictionary args = new NSDictionary("*" + searchArgs.objectForKey("avtObjet") + "*", "criterion");
		return EOUtilities.objectsWithFetchSpecificationAndBindings(eContext, getMainEntity(), "rechercherConvention", args);
	}

	public boolean processSearchAtPathwayLevel() {
		return false;
	}

	public boolean supportsRevertSearch() {
		return false;
	}

	public NSArray searchResultFields() {
		return getSummaryFields();
	}

}
