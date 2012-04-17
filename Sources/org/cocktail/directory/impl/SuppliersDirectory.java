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

public class SuppliersDirectory extends Directory {

	public SuppliersDirectory() {
		super("fou");
		setLocaleIdForTitle("DSuppliersTitle");
		setLocaleIdSubTitle("DSuppliersSubTitle");
		setCssIdOfDirectory("fournis");
		setWoDirActionName(CommonDataHolder.DIR_MAIN_ACTION);
		setMainEntity("VFournisGrhum");
	}

	public void initDirectory() {
		// Pathway pathClients = new PathwayClient();
		// pathClients.setFetchSpecName("listeClients");
		//
		// Pathway pathSuppliers = new PathwaySupplier("PWSuppliersTitle");
		// pathSuppliers.setFetchSpecName("listeFournisseurs");
		//
		// Pathway pathClientsSuppliers = new PathwayClientSupplier();
		// pathClientsSuppliers.setFetchSpecName("listeClientsFournisseurs");

		// addToPathways(pathClients);
		// addToPathways(pathSuppliers);
		// addToPathways(pathClientsSuppliers);

		FieldItem tmpField;
		tmpField = new FieldItem("LLabel", "fouLibelle", null, false);
		addToSummaryFields(tmpField);

		tmpField = new FieldItem("LFouCode", "fouCode", null, false);
		addToSummaryFields(tmpField);

		tmpField = new FieldItem("LType", "fouType", null, false);
		addToSummaryFields(tmpField);

		tmpField = new FieldItem("LTel", "telephoneFournis", null, true);
		addToSummaryFields(tmpField);

		tmpField = new FieldItem("LFax", "faxFournis", null, true);
		addToSummaryFields(tmpField);

		tmpField = new FieldItem("LMail", "emails", null, true);
		addToSummaryFields(tmpField);

		SearchItem item = new SearchItem("LLabel", "fouNom", "fouNom");
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

	public NSArray processSimpleSearch(NSDictionary searchArgs, EOEditingContext eContext, EOIndividuUlr user) {
		String crt = DirUtilities.removeAccentsForString((String) searchArgs.objectForKey("fouNom"));

		NSDictionary args = new NSDictionary("*" + crt + "*", "criterion");
		return EOUtilities.objectsWithFetchSpecificationAndBindings(eContext, this.getMainEntity(), "rechercheFournisseurs", args);
	}

	public boolean shouldDisplayListForFirstLevel() {
		return false;
	}

	public EOEnterpriseObject fetchObjectWithId(EOEditingContext ectx, String id) {
		EOEnterpriseObject obj = null;
		try {
			obj = DirUtilities.fetchUniqueData(ectx, getMainEntity(), "persId", new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

	public String componentNameForDetails() {
		return "DetailSupplier";
	}

	public boolean canDetailAParentItem() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean processSearchAtPathwayLevel() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean supportsRevertSearch() {
		return false;
	}

	public NSArray searchResultFields() {
		return getSummaryFields();
	}

}
