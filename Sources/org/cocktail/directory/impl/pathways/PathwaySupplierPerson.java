package org.cocktail.directory.impl.pathways;

import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.impl.elements.DirectoryEntity;
import org.cocktail.directory.tools.DirUtilities;

import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;


public class PathwaySupplierPerson extends Pathway {
	
	public static String code = "SuppliersPersons";
	
	public PathwaySupplierPerson(Directory dir) {
		super("path_suppers", "PWSuppliersPersonsTitle");
		setDirectory(dir);
		setFetchSpecName("listeFournisseursIndividus");
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
		String crt = DirUtilities.removeAccentsForString((String)searchArgs.objectForKey("fouNom"));
		
		NSDictionary args = new NSDictionary("*"+crt+"*","criterion");
		return EOUtilities.objectsWithFetchSpecificationAndBindings(
							eContext,getDirectory().getMainEntity(),"rechercheFournisseursPhysiques",args
						  );	
	}

	public NSArray searchResultFields() {
		return getDirectory().searchResultFields();
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

	public String fieldForSortingSummaryItems() {
		return "fouNom";
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
