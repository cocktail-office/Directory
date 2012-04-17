package org.cocktail.directory.impl.pathways;

import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.impl.elements.DirectoryEntity;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;


public class PathwayCategory extends Pathway {

	public static String code = "PWCategorie";
	
	public PathwayCategory(Directory directory) {
		super("path_category","PWCategoryTitle");
		setDirectory(directory);
	}

	public void initPathway() {
		// TODO Auto-generated method stub
		
	}

	public NSArray getSummaryFieldsForLevel(int level) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean needsAuthentication() {
		return needsAuthentication_DefaultImpl();
	}

	public String specificClass() {
		// TODO Auto-generated method stub
		return null;
	}

	public NSArray processSimpleSearch(NSDictionary searchArgs, EOEditingContext eContext) {
		// TODO Auto-generated method stub
		return null;
	}

	public NSArray searchResultFields() {
		return getDirectory().getSummaryFields().arrayByAddingObjectsFromArray(getSummaryFields());
	}


	public int dataListTypeFirstLevel() {
		return Pathway.SIMPLE_LIST;
	}

	public String methodNameGivingSons() {
		return null;
	}

	public int nbNodesToExpand() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String methodNameForLabel() {
		// TODO Auto-generated method stub
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

	public String fieldForSortingSummaryItems() {
		// TODO Auto-generated method stub
		return null;
	}

}
