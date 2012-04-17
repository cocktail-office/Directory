package org.cocktail.directory.impl.pathways;

import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.impl.elements.DirectoryEntity;
import org.cocktail.directory.impl.elements.FieldItem;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;


public abstract class Pathway implements Cloneable {

	public static final int HIERARCHICAL_LIST 	= 1;
	public static final int TABULAR_LIST 		= 2;
	public static final int SIMPLE_LIST 		= 3;
	
	private String localizationId,id;
	private NSDictionary dico;
	private String fetchSpecName;
	private String mainEntity;
	
	private String visibility;
	
	//private String visibilityType;
	
	// champs utilis�s pour indiquer les operations sur les treeviews de mani�re localis�e.
	private	String lStringDetails,lStringExpand;
	
	
	private NSMutableArray summaryFields;
	private NSMutableDictionary dicoLevelField;
	private Directory directory;
	
	private String searchString;
	private NSArray searchResults;
	
	public NSArray getSearchResults() {
		return searchResults;
	}


	public void setSearchResults(NSArray searchResults) {
		this.searchResults = searchResults;
	}


	public Pathway(String anId,String aLocalizationId) {
		this.localizationId = aLocalizationId;
		this.id = anId;
		summaryFields = new NSMutableArray();
		dicoLevelField = new NSMutableDictionary();
	}
	

	
	protected Object clone() throws CloneNotSupportedException {
		Pathway aClone = (Pathway)super.clone();
		aClone.localizationId = new String(localizationId);
		aClone.id = new String(id);
		aClone.fetchSpecName = new String(fetchSpecName);
		aClone.summaryFields = summaryFields.mutableClone();
		aClone.dicoLevelField = dicoLevelField.mutableClone();
		return aClone;
	}
	
	
	public String getFetchSpecName() {
		return fetchSpecName;
	}

	public void setFetchSpecName(String fetchSpecName) {
		this.fetchSpecName = fetchSpecName;
	}

	public String getLocalizationId() {
		return localizationId;
	}
	
	public void setLocalizationId(String localizationId) {
		this.localizationId = localizationId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setQueryDictionary(NSDictionary dico) {
		this.dico = dico;
	}
	
	public NSDictionary queryDictionary() {
		return dico;
	}

	public NSArray getSummaryFields() {
		return summaryFields;
	}

	public void setSummaryFields(NSArray summaryFields) {
		this.summaryFields = summaryFields.mutableClone();
	}
	
	public void addToSummaryFields(FieldItem field) {
		if(!summaryFields.containsObject(field)) {
			summaryFields.addObject(field);
		}
	}
	
	public void removeFromSummaryFields(FieldItem field) {
		for(int i=0;i<summaryFields.count();i++) {
			if(((FieldItem)summaryFields.objectAtIndex(i)).equals(field))
				summaryFields.removeObject(field);
		}
	}

	public void setFieldsForLevel(NSArray fields,int level) {
		dicoLevelField.setObjectForKey(fields,new Integer(level));
	}
	
	public NSArray getFieldsForLevel(int level) {
		return (NSArray)dicoLevelField.objectForKey(new Integer(level));
	}
	
	public boolean hasFieldsForLevel(int level) {
		NSArray fields = (NSArray)dicoLevelField.objectForKey(new Integer(level)); 
		return fields!=null && fields.count()>0;
	}
	
	public abstract void initPathway();
	public abstract NSArray getSummaryFieldsForLevel(int level);
	public abstract NSArray summaryFieldsForMembers();
	public abstract boolean needsAuthentication();
	public abstract String specificClass();
	public abstract NSArray processSimpleSearch(NSDictionary searchArgs,EOEditingContext eContext);
	public abstract NSArray searchResultFields();
	public abstract String typeRequestSearchResult();
	public abstract int dataListTypeFirstLevel();
	public abstract String methodNameGivingSons();
	public abstract String methodNameForLabel();
	
	public abstract String fieldForSortingSummaryItems();
	
	public abstract int nbNodesToExpand();
	
	public Directory getDirectory() {
		return directory;
	}
	
	public void setDirectory(Directory directory) {
		this.directory = directory;
	}


	public String getSearchString() {
		return searchString;
	}


	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}

	public abstract DirectoryEntity fetchParentObjectWithId(EOEditingContext ctx,String id);


	public String getMainEntity() {
		return mainEntity;
	}


	public void setMainEntity(String mainEntity) {
		this.mainEntity = mainEntity;
	}


	public String getLStringDetails() {
		return lStringDetails;
	}


	public void setLStringDetails(String stringDetails) {
		lStringDetails = stringDetails;
	}


	public String getLStringExpand() {
		return lStringExpand;
	}


	public void setLStringExpand(String stringExpand) {
		lStringExpand = stringExpand;
	}
	
	
	public String getVisibility() {
		return visibility;
	}


	public void setVisibility(String visibility) {
		this.visibility = visibility;
	}


	protected boolean needsAuthentication_DefaultImpl () {
		if(visibility!=null) {
			return getVisibility().equals(Directory.VISIBILITY_LOGIN) || getVisibility().equals(Directory.VISIBILITY_RESTRICTED);
		}
		else {
			return getDirectory().getVisibilityType().equals(Directory.VISIBILITY_LOGIN) || 
					getDirectory().getVisibilityType().equals(Directory.VISIBILITY_RESTRICTED);
		}
	}

//	public String getVisibilityType() {
//		return visibilityType;
//	}
//
//
//	public void setVisibilityType(String visibilityType) {
//		this.visibilityType = visibilityType;
//	}
//	
	
	
	
}

