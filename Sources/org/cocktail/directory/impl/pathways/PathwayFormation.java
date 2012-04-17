package org.cocktail.directory.impl.pathways;

import org.cocktail.directory.eof.server.EOStructureUlr;
import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.impl.elements.DirectoryEntity;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;


public class PathwayFormation extends Pathway {
	
	public static String code = "PWDiplome";
	
	public PathwayFormation(Directory dir) {
		super("path_diploma","PWDiplomaTitle");
		setLStringDetails("LDetailDiploma");
		setLStringExpand("LExpandDiploma");
		setDirectory(dir);
	}

	public void initPathway() {
		// TODO Auto-generated method stub
		
	}

	public NSArray getSummaryFieldsForLevel(int level) {
		// TODO Auto-generated method stub
		return null;
	}


	public String specificClass() {
		return needsAuthentication() ? "protected" : null;
	}

	public NSArray processSimpleSearch(NSDictionary searchArgs, EOEditingContext eContext) {
		// TODO Auto-generated method stub
		return null;
	}

	public NSArray searchResultFields() {
		return null;
	}

	public int dataListTypeFirstLevel() {
		return Pathway.HIERARCHICAL_LIST;
	}

	public String methodNameGivingSons() {
		return EOStructureUlr.DIPLOMA_SONS_METHOD;
	}

	public int nbNodesToExpand() {
		return 0;
	}

	public String methodNameForLabel() {
		return "displayString";
	}
	
	public String fieldForSortingSummaryItems() {
		return "nomUsuel";
	}
	
	public String typeRequestSearchResult() {
		return null;
	}

	public DirectoryEntity fetchParentObjectWithId(EOEditingContext ctx,String id) {
		return null;
	}

	public NSArray summaryFieldsForMembers() {
		return getDirectory().getSummaryFields();
	}
	
	
	public boolean needsAuthentication() {
		return needsAuthentication_DefaultImpl();
	}


}
