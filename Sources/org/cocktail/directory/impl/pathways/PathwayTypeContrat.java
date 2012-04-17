// 14 mars 07
//created by : Fran�ois Adour

// Project : Directory

package org.cocktail.directory.impl.pathways;

import org.cocktail.directory.eof.server.EOAccordsTypeContrat;
import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.impl.elements.DirectoryEntity;
import org.cocktail.directory.impl.elements.FieldItem;
import org.cocktail.directory.tools.DirUtilities;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;

public class PathwayTypeContrat extends Pathway {

	public static final String code = "PWTypeContrat";

	public PathwayTypeContrat(Directory dir) {
		super("path_typct", "PWTypeContratTitle");
		setDirectory(dir);
		setLStringDetails("LDetailConvention");
		setLStringExpand("LExpandConvention");
		initPathway();
	}

	public int dataListTypeFirstLevel() {
		return Pathway.HIERARCHICAL_LIST;
	}

	public NSArray getSummaryFieldsForLevel(int level) {
		// TODO Auto-generated method stub
		return null;
	}

	public void initPathway() {
		// LinkFieldItem linkField = new LinkFieldItem("LMailAlias","adresseEmail",LinkFieldItem.MAILTO_LINK);
		// linkField.setLinkValueId("grpAlias");
		// addToSummaryFields(linkField);
		//
		FieldItem field = new FieldItem("LLabel", "conObjet", null, false);
		addToSummaryFields(field);

		// setFieldsForLevel(new NSArray(field), 2);
	}

	public String methodNameForLabel() {
		return "displayString";
	}

	public String fieldForSortingSummaryItems() {
		return "displayString";
	}

	public String methodNameGivingSons() {
		return EOAccordsTypeContrat.TYPE_CONTRAT_SONS_METHOD;
	}

	public int nbNodesToExpand() {
		return 0;
	}

	public boolean needsAuthentication() {
		return needsAuthentication_DefaultImpl();
	}

	public String specificClass() {
		return needsAuthentication() ? "protected" : null;
	}

	public NSArray processSimpleSearch(NSDictionary searchArgs, EOEditingContext eContext) {
		return new NSArray();
	}

	public NSArray searchResultFields() {
		return null;
	}

	public String typeRequestSearchResult() {
		return null;
	}

	public DirectoryEntity fetchParentObjectWithId(EOEditingContext ctx, String id) {
		return (DirectoryEntity) DirUtilities.fetchUniqueData(ctx, "AccordsTypeContrat", "tyconId", new Integer(id));
	}

	public NSArray summaryFieldsForMembers() {
		return getDirectory().getSummaryFields();
	}

}
