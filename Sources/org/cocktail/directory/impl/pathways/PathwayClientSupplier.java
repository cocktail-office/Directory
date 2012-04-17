package org.cocktail.directory.impl.pathways;

import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.impl.elements.DirectoryEntity;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;


public class PathwayClientSupplier extends Pathway {
	
	public static String code = "PWClientFournis";
	
	public PathwayClientSupplier(Directory dir) {
		super("path_clientsupp", "PWClientsAndSuppliersTitle");
		setDirectory(dir);
		setFetchSpecName("listeClientsFournisseurs");
	}

	public void initPathway() {
		// TODO Auto-generated method stub
		
	}

	public NSArray getSummaryFieldsForLevel(int level) {
		NSMutableArray fields = new NSMutableArray();
		switch(level) {
		case 1:
			fields.addObjectsFromArray(getDirectory().getSummaryFields());
			break;
		case 2:
			break;
		case 3:
			break;
		}
		return fields;
	}

	public boolean needsAuthentication() {
		return needsAuthentication_DefaultImpl();
	}

	public String specificClass() {
		return needsAuthentication() ? "protected" : null;
	}

	public NSArray processSimpleSearch(NSDictionary searchArgs, EOEditingContext eContext) {
		// TODO Auto-generated method stub
		return null;
	}

	public NSArray searchResultFields() {
		// TODO Auto-generated method stub
		return null;
	}

	public int dataListTypeFirstLevel() {
		return Pathway.TABULAR_LIST;
	}

	public String methodNameGivingSons() {
		// TODO Auto-generated method stub
		return null;
	}

	public int nbNodesToExpand() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String methodNameForLabel() {
		return "fouLibelle";
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
		return "fouNom";
	}

}
