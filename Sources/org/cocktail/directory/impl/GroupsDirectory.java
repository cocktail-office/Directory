package org.cocktail.directory.impl;

import org.cocktail.directory.eof.server.EOIndividuUlr;
import org.cocktail.directory.impl.elements.FieldItem;
import org.cocktail.directory.impl.elements.LinkFieldItem;
import org.cocktail.directory.server.CommonDataHolder;
import org.cocktail.directory.tools.DirUtilities;

import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;

public class GroupsDirectory extends Directory {

	FieldItem fieldTypeGrp;

	public GroupsDirectory() {
		super("grp");
		setLocaleIdForTitle("DGroupsTitle");
		setLocaleIdSubTitle("DGroupsSubTitle");
		setCssIdOfDirectory("groupe");
		setWoDirActionName(CommonDataHolder.DIR_MAIN_ACTION);
		setMainEntity("StructureUlr");
		fieldTypeGrp = new FieldItem("LTypeGrp", "allTypesGroupe", null, true);
	}

	public boolean shouldDisplayListForFirstLevel() {
		return false;
	}

	public boolean areDetailsAvailable() {
		return true;
	}

	public String componentNameForDetails() {
		return "DetailGroupe";
	}

	public EOEnterpriseObject fetchObjectWithId(EOEditingContext ectx, String id) {
		return DirUtilities.fetchUniqueData(ectx, getMainEntity(), "cStructure", id);
	}

	public void initDirectory() {
		FieldItem tmpField = new FieldItem("LLibStructure", "displayString", null, false);
		addToSummaryFields(tmpField);
		LinkFieldItem linkField = new LinkFieldItem("LMailAlias", "adresseEmail", LinkFieldItem.MAILTO_LINK);
		linkField.setLinkValueId("grpAlias");
		addToSummaryFields(linkField);

		// champs pour la recherche
		SearchItem item = new SearchItem("LLabel", "llStructure", "llStructure");
		addToSearchItems(item);
	}

	public NSArray processSimpleSearch(NSDictionary searchArgs, EOEditingContext eContext, EOIndividuUlr user) {
		String label = (String) searchArgs.objectForKey("llStructure");
		label = "*" + DirUtilities.removeAccentsForString(label) + "*";
		NSDictionary args = new NSDictionary("*" + label + "*", "criterion");

		return EOUtilities.objectsWithFetchSpecificationAndBindings(eContext, getMainEntity(), "rechercheGroupeMail", args);
	}

	// public NSArray processSimpleSearch(String criterion,EOEditingContext eContext,EOIndividuUlr user) {
	//
	// String crt = DirUtilities.removeAccentsForString(criterion);
	//
	// NSDictionary args = new NSDictionary("*"+crt+"*","criterion");
	// return EOUtilities.objectsWithFetchSpecificationAndBindings(
	// eContext,
	// getMainEntity(),
	// "rechercheGroupeMail",
	// args);
	// }

	public boolean canDetailAParentItem() {
		return true;
	}

	public boolean processSearchAtPathwayLevel() {
		return false;
	}

	public boolean supportsRevertSearch() {
		return false;
	}

	public NSArray searchResultFields() {
		NSMutableArray fields = new NSMutableArray(getSummaryFields());
		fields.addObject(fieldTypeGrp);
		return fields;
		// return getSummaryFields();
	}

}
