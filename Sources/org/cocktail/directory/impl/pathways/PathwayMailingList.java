// 9 f�vr. 07
//created by : Fran�ois Adour

// Project : Directory

package org.cocktail.directory.impl.pathways;

import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.impl.elements.DirectoryEntity;
import org.cocktail.directory.impl.elements.FieldItem;
import org.cocktail.directory.impl.elements.LinkFieldItem;
import org.cocktail.directory.server.NavigationInfos;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;


public class PathwayMailingList extends Pathway {

	public static String code = "PWMailingList";
	
	private NSMutableArray fielsForMembers = null;
	
	public PathwayMailingList(Directory dir) {
		super("path_mlist","PWMailingListTitle");
		setDirectory(dir);
		setFetchSpecName("listMailingLists");
		initPathway();
	}
	
	
	public void initPathway() {
//		FieldItem tmpField = new FieldItem("displayString","llStructure",null,false);
//		addToSummaryFields(tmpField);

		LinkFieldItem linkField = new  LinkFieldItem("LMailAlias","mailForum",LinkFieldItem.MAILTO_LINK);
		linkField.setLinkValueId("mailForum");
		addToSummaryFields(linkField);

		FieldItem field = new FieldItem("LMailAlias","mailtoForum",null,false);
		field.setEscapeHTML(false);
		
		FieldItem funcField = new FieldItem("LFunctions","fonctionsGroupe",null,false);
		
		setFieldsForLevel(new NSArray(new Object[]{field,funcField}), 2);
		
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
		CLog.log("MailingList:"+criterion);
		if(criterion==null) {
			setSearchResults(new NSArray());
		}
		else {
			String crt = DirUtilities.removeAccentsForString(criterion);
			String ss = getSearchString();
			if(ss==null || !ss.equals(crt)) {
				setSearchString(crt);
				NSDictionary args = new NSDictionary("*"+crt+"*","criterion");
				setSearchResults(EOUtilities.objectsWithFetchSpecificationAndBindings(eContext,getDirectory().getMainEntity(),"rechercheListeDiffusion",args));
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


	public String methodNameGivingSons() {
		// TODO Auto-generated method stub
		return null;
	}


	public int nbNodesToExpand() {
		// TODO Auto-generated method stub
		return 0;
	}


	public String methodNameForLabel() {
		return "displayString";
	}

	public String fieldForSortingSummaryItems() {
		return "displayString";
	}

	public String typeRequestSearchResult() {
		//return NavigationInfos.REQ_PARENT_ITEM;
		return NavigationInfos.REQ_SPECIFIC_ITEM;
	}


	public DirectoryEntity fetchParentObjectWithId(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	public DirectoryEntity fetchParentObjectWithId(EOEditingContext ctx, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public NSArray summaryFieldsForMembers() {
		if(fielsForMembers==null) {
			fielsForMembers = new NSMutableArray();
			fielsForMembers.addObjectsFromArray( getDirectory().getSummaryFields() );
			LinkFieldItem linkField = new  LinkFieldItem("LMailAlias","adresseEmail",LinkFieldItem.MAILTO_LINK);
			linkField.setLinkValueId("grpAlias");
			fielsForMembers.addObject(linkField);
		}
		return fielsForMembers;
	}

}
