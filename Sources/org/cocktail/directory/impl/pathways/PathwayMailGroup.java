package org.cocktail.directory.impl.pathways;

import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.impl.elements.DirectoryEntity;
import org.cocktail.directory.server.NavigationInfos;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;

public class PathwayMailGroup extends Pathway {
	
	public static String code = "PWMGroup";
	
	private NSMutableArray fielsForMembers = null;
	
	public PathwayMailGroup(Directory dir) {
		super("path_mgroup","PWMGroupTitle");
		setDirectory(dir);
		setFetchSpecName("listMailGroups");
		initPathway();
	}
	
	
	public void initPathway() {
	}


	public NSArray getSummaryFieldsForLevel(int level) {
		NSMutableArray fields = new NSMutableArray();
		switch(level) {
		case 1:
			fields.addObjectsFromArray( getDirectory().getSummaryFields() );
			fields.addObjectsFromArray( getSummaryFields() );
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
/*
		if(criterion==null) {
			setSearchResults(new NSArray());
		}
		else {
			String crt = DirUtilities.removeAccentsForString(criterion);
			
			String ss = getSearchString();
			if(ss==null || !ss.equals(crt)) {
				setSearchString(crt);
				NSDictionary args = new NSDictionary("*"+crt+"*","criterion");
				setSearchResults(EOUtilities.objectsWithFetchSpecificationAndBindings(eContext,getDirectory().getMainEntity(),"rechercheGroupeMail",args));
			}
		}
		return getSearchResults();
	*/
		return null;
	}

	/** renvoie les field items utilis�s pour afficher la table de resultat d'une recherche effectu�e sur ce pathway */
	public NSArray searchResultFields() {
		return getDirectory().getSummaryFields().arrayByAddingObjectsFromArray(getSummaryFields());	
	}

	public int dataListTypeFirstLevel() {
	return Pathway.SIMPLE_LIST;
}

	// non utilis� ici car pas de treecontrol
	public String methodNameGivingSons() {
		return null;
	}
	
	// idem
	public int nbNodesToExpand() {
		return 0;
	}

	public String methodNameForLabel() {
		return "displayString";
	}

	public String fieldForSortingSummaryItems() {
		return "displayString";
	}

	public String typeRequestSearchResult() {
		return NavigationInfos.REQ_SPECIFIC_ITEM;
	}

	public DirectoryEntity fetchParentObjectWithId(EOEditingContext ctx,String id) {
		return null;
	}
	
	public NSArray summaryFieldsForMembers() {
		return getDirectory().getSummaryFields();
		
//		if(fielsForMembers==null) {
//			fielsForMembers = new NSMutableArray();
//			
//			fielsForMembers.addObjectsFromArray( getDirectory().getSummaryFields() );
//			
//			LinkFieldItem linkField = new  LinkFieldItem("LMailAlias","adresseEmail",LinkFieldItem.MAILTO_LINK);
//			linkField.setLinkValueId("grpAlias");
//			fielsForMembers.addObject(linkField);
//		}
//		return fielsForMembers;
	}



}
