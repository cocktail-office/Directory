// 20 f�vr. 07
//created by : Fran�ois Adour

// Project : Directory

package org.cocktail.directory.impl.pathways;

import org.cocktail.directory.eof.server.EOStructureUlr;
import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.impl.elements.DirectoryEntity;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;


public class PathwayCodeMarche extends Pathway {

	public static String code = "PWCodeMarche";
	
	public PathwayCodeMarche(Directory directory) {
		super("path_cmarche","PWCodeMarcheTitle");
		setDirectory(directory);
	}

	public void initPathway() {
/*
 		FieldItem funcField = new FieldItem("LFunctions","fonctionsGroupe",null,false);
		FieldItem grpManagerField = new FieldItem("LGroupManager","identResponsableGroupe",null,false);
		grpManagerField.setIsTitle(true);
		
		LinkFieldItem subMailManager = new  LinkFieldItem("LMail","mailResponsable",LinkFieldItem.MAILTO_LINK);
		FieldItem telFaxManager = new FieldItem("LTelFax","telFaxResponsable",null,true);
		FieldItem adresseManager = new FieldItem("LAdress","adresseResponsable",null,true);
		grpManagerField.setSubFields( new Object[]{subMailManager,telFaxManager,adresseManager} );
		
		NSArray levelTwoFields = new NSArray(new Object[]{funcField,grpManagerField});
		setFieldsForLevel(levelTwoFields,2);
*/
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
		return new NSArray();
	}

	public NSArray searchResultFields() {
		return null;
	}

	public int dataListTypeFirstLevel() {
		return Pathway.HIERARCHICAL_LIST;
	}

	public String methodNameGivingSons() {
		return EOStructureUlr.SERVICES_SONS_METHOD;
	}

	public int nbNodesToExpand() {
		return 0;
	}

	public String methodNameForLabel() {
		return "displayString";
	}

	public String typeRequestSearchResult() {
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
