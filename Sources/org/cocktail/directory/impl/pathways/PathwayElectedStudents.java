// 30 mars 07
//created by : Fran�ois Adour

// Project : Directory

package org.cocktail.directory.impl.pathways;

import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.impl.elements.DirectoryEntity;
import org.cocktail.directory.impl.elements.FieldItem;
import org.cocktail.directory.impl.elements.LinkFieldItem;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;


public class PathwayElectedStudents extends Pathway {

	public static String code = "PWElectedStudents";
	
	public PathwayElectedStudents(Directory dir) {
		super("path_els","PWElectedStudentsTitle");
		setDirectory(dir);
		setMainEntity("StructureUlr");
		setFetchSpecName("listElectedStudentsStructs");
		initPathway();
	}

	public int dataListTypeFirstLevel() {
		return Pathway.SIMPLE_LIST;
	}

	public DirectoryEntity fetchParentObjectWithId(EOEditingContext ctx, String id) {
		return null;
	}

	public String fieldForSortingSummaryItems() {
		return "displayString";
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

	public void initPathway() {
		FieldItem funcField = new FieldItem("LFunctions","fonctionsGroupe",null,false);
		
		FieldItem fieldUrl = new FieldItem("TWebSite","htmlLinkWebSiteStructure",null,false);
		fieldUrl.setEscapeHTML(false);
		
		FieldItem adrField = new FieldItem("LAdress","adresseGroupe",null,false);
		adrField.setEscapeHTML(false);
		
		FieldItem grpManagerField = new FieldItem("LGroupManager","identResponsableGroupe",null,false);
		grpManagerField.setIsTitle(true);
		
		LinkFieldItem subMailManager = new  LinkFieldItem("LMail","mailResponsable",LinkFieldItem.MAILTO_LINK);
		
		FieldItem telFaxManager = new FieldItem("LTelephoneFax","telephoneFaxStructure",null,true);
		
		FieldItem adresseManager = new FieldItem("LAdress","adresseResponsable",null,true);
		grpManagerField.setSubFields( new Object[]{subMailManager,telFaxManager,adresseManager} );
		
		NSArray levelTwoFields = new NSArray(new Object[]{funcField,fieldUrl,adrField,grpManagerField});
		setFieldsForLevel(levelTwoFields,2);
	}

	public String methodNameForLabel() {
		return "displayString";
	}

	public String methodNameGivingSons() {
		return null;
	}

	public int nbNodesToExpand() {
		return 0;
	}

	public boolean needsAuthentication() {
		return needsAuthentication_DefaultImpl();
	}

	public NSArray processSimpleSearch(NSDictionary searchArgs,EOEditingContext eContext) {
		return null;
	}

	public NSArray searchResultFields() {
		return null;
	}

	public String specificClass() {
		return needsAuthentication() ? "protected" : null;
	}

	public NSArray summaryFieldsForMembers() {
		return getDirectory().getSummaryFields();
	}

	public String typeRequestSearchResult() {
		return null;
	}

}
