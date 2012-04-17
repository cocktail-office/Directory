package org.cocktail.directory.impl.pathways;

import org.cocktail.directory.eof.server.EOStructureUlr;
import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.impl.elements.DirectoryEntity;
import org.cocktail.directory.impl.elements.FieldItem;
import org.cocktail.directory.impl.elements.LinkFieldItem;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;



public class PathwayDepartment extends Pathway {

	public static String code = "PWService";
	
	public PathwayDepartment(Directory dir) {
		super("path_department","PWDepartmentTitle");
		setDirectory(dir);
		setLStringDetails("LDetailService");
		setLStringExpand("LExpandService");
		initPathway();
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
		
		//FieldItem telFaxManager = new FieldItem("LTelFax","telFaxResponsable",null,true);
		FieldItem telFaxManager = new FieldItem("LTelephoneFax","telephoneFaxStructure",null,true);
		
		FieldItem adresseManager = new FieldItem("LAdress","adresseResponsable",null,true);
		grpManagerField.setSubFields( new Object[]{subMailManager,telFaxManager,adresseManager} );
		
		NSArray levelTwoFields = new NSArray(new Object[]{funcField,fieldUrl,adrField,grpManagerField});
		setFieldsForLevel(levelTwoFields,2);
	}

	public NSArray getSummaryFieldsForLevel(int level) {
		// TODO Auto-generated method stub
		return null;
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
		return "nomUsuel";
	}

}
