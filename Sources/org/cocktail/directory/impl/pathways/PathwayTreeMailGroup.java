// 23 f�vr. 07
//created by : Fran�ois Adour

// Project : Directory

package org.cocktail.directory.impl.pathways;

import org.cocktail.directory.eof.server.EOStructureUlr;
import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.impl.elements.DirectoryEntity;
import org.cocktail.directory.impl.elements.FieldItem;
import org.cocktail.directory.impl.elements.LinkFieldItem;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;


public class PathwayTreeMailGroup extends Pathway {
	
	public static final String code = "PWTMGroup";
	
	public PathwayTreeMailGroup(Directory dir) {
		super("path_tmgroup","PWMTreeGroupTitle");
		setDirectory(dir);
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
		LinkFieldItem linkField = new  LinkFieldItem("LMailAlias","adresseEmail",LinkFieldItem.MAILTO_LINK);
		linkField.setLinkValueId("grpAlias");
		addToSummaryFields(linkField);

		FieldItem field = new FieldItem("LMailAlias","mailtoEmail",null,false);
		field.setEscapeHTML(false);
		setFieldsForLevel(new NSArray(field), 2);
	}

	public String methodNameForLabel() {
		return "displayString";
	}

	public String fieldForSortingSummaryItems() {
		return "displayString";
	}

	public String methodNameGivingSons() {
		return EOStructureUlr.MGROUPS_SONS_METHOD;
	}

	public int nbNodesToExpand() {
		return 1;
	}

	public boolean needsAuthentication() {
		return needsAuthentication_DefaultImpl();
	}

	public NSArray processSimpleSearch(NSDictionary searchArgs,EOEditingContext eContext) {
		return new NSArray();
	}

	public NSArray searchResultFields() {
		return null;
	}

	public String specificClass() {
		return null;
	}

	public String typeRequestSearchResult() {
		// TODO Auto-generated method stub
		return null;
	}


	public DirectoryEntity fetchParentObjectWithId(EOEditingContext ctx,String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public NSArray summaryFieldsForMembers() {
		return getDirectory().getSummaryFields();
	}

}
