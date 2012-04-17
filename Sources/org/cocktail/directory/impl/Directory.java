package org.cocktail.directory.impl;

import java.lang.reflect.Constructor;

import org.cocktail.directory.eof.server.EOIndividuUlr;
import org.cocktail.directory.impl.elements.FieldItem;
import org.cocktail.directory.impl.pathways.Pathway;
import org.cocktail.directory.tools.DirUtilities;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;

public abstract class Directory {

	public static final String VISIBILITY_OPEN = "open";
	public static final String VISIBILITY_LOGIN = "login";
	public static final String VISIBILITY_RESTRICTED = "restricted";

	String id;
	private String _localeIdForTitle;
	private String _woDirActionName;
	private String _cssIdOfDirectory;
	private String _mainEntity;
	private String localeIdSubTitle;
	private String visibilityType;

	private NSMutableArray pathwaysList;
	private NSMutableArray summaryFields;
	private int numberOfFieldsForSearch;
	private NSMutableArray searchItems;
	private String[] searchFieldslocaleIds;

	private NSMutableDictionary dicoLevelField;
	private NSArray sortOrderingsSimpleSearch;

	public Directory(String id) {
		this.id = id;
		pathwaysList = new NSMutableArray();
		summaryFields = new NSMutableArray();
		searchItems = new NSMutableArray();
		dicoLevelField = new NSMutableDictionary();
	}

	public String getCssIdOfDirectory() {
		return _cssIdOfDirectory;
	}

	public void setCssIdOfDirectory(String idOfDirectory) {
		_cssIdOfDirectory = idOfDirectory;
	}

	public String localeIdForTitle() {
		return _localeIdForTitle;
	}

	public void setLocaleIdForTitle(String id) {
		_localeIdForTitle = id;
	}

	public String getWoDirActionName() {
		return _woDirActionName;
	}

	public void setWoDirActionName(String dirActionName) {
		_woDirActionName = dirActionName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public NSArray pathways() {
		return pathwaysList;
	}

	public void setPathways(NSArray pathwaysList) {
		this.pathwaysList = pathwaysList.mutableClone();
	}

	public void addToPathways(Pathway pw) {
		if (!pathwaysList.containsObject(pw)) {
			pathwaysList.addObject(pw);
		}
	}

	public void removeFromPathways(Pathway pw) {
		pathwaysList.removeObject(pw);
	}

	public void addToSearchItems(SearchItem item) {
		if (!searchItems.containsObject(item)) {
			searchItems.addObject(item);
		}
	}

	public void removeFromSearchItems(SearchItem item) {
		searchItems.removeObject(item);
	}

	public boolean hasPathways() {
		return pathwaysList.count() > 0;
	}

	public Pathway getPathwayWithId(String id) {
		Pathway path;
		for (int i = 0; i < pathwaysList.count(); i++) {
			path = (Pathway) pathwaysList.objectAtIndex(i);
			if (path.getId().equals(id)) {
				return path;
			}
		}
		return null;
	}

	public String toString() {
		return super.toString() + " -> " + id;
	}

	public NSArray getSummaryFields() {
		return summaryFields;
	}

	public void setSummaryFields(NSArray summaryFields) {
		this.summaryFields = summaryFields.mutableClone();
	}

	public void addToSummaryFields(FieldItem field) {
		if (!summaryFields.containsObject(field)) {
			summaryFields.addObject(field);
		}
	}

	public void removeFromSummaryFields(FieldItem field) {
		for (int i = 0; i < summaryFields.count(); i++) {
			if (((FieldItem) summaryFields.objectAtIndex(i)).equals(field)) {
				summaryFields.removeObject(field);
			}
		}
	}

	public String getMainEntity() {
		return _mainEntity;
	}

	public void setMainEntity(String entity) {
		_mainEntity = entity;
	}

	public void setFieldsForLevel(NSArray fields, int level) {
		dicoLevelField.setObjectForKey(fields, new Integer(level));
	}

	public NSArray getFieldsForLevel(int level) {
		return (NSArray) dicoLevelField.objectForKey(new Integer(level));
	}

	public boolean hasFieldsForLevel(int level) {
		NSArray fields = (NSArray) dicoLevelField.objectForKey(new Integer(level));
		return fields != null && fields.count() > 0;
	}

	public abstract void initDirectory();

	public abstract boolean shouldDisplayListForFirstLevel();

	public abstract boolean processSearchAtPathwayLevel();

	public void createPathway(String pathName, String visibility) {

		try {
			Class pathClass = Class.forName("org.cocktail.directory.impl.pathways." + pathName);
			if (pathClass != null) {
				Constructor constructor = pathClass.getDeclaredConstructor(new Class[] { Directory.class });
				if (constructor != null) {
					Pathway pathway = (Pathway) constructor.newInstance(new Object[] { this });
					pathway.setVisibility(visibility);
					addToPathways(pathway);
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public abstract String componentNameForDetails();

	public abstract boolean areDetailsAvailable();

	public abstract NSArray processSimpleSearch(NSDictionary searchArgs, EOEditingContext eContext, EOIndividuUlr user);

	public abstract EOEnterpriseObject fetchObjectWithId(EOEditingContext ectx, String id);

	public abstract boolean supportsRevertSearch();

	public abstract NSArray searchResultFields();

	public NSArray getSortOrderingsSimpleSearch() {
		return sortOrderingsSimpleSearch;
	}

	public void setSortOrderingsSimpleSearch(NSArray sortOrderingsSimpleSearch) {
		this.sortOrderingsSimpleSearch = sortOrderingsSimpleSearch;
	}

	/**
	 * Constructs and sets the pathways to this directory. As a result, every pathway created has a parent directory
	 */
	public void initPathwayFromClasses(NSArray pathClasses) {
		for (int i = 0; i < pathClasses.count(); i++) {
			Class pathClass = (Class) pathClasses.objectAtIndex(i);
			if (pathClass != null) {
				try {
					Constructor constructor = pathClass.getDeclaredConstructor(new Class[] { Directory.class });
					if (constructor != null) {
						addToPathways((Pathway) constructor.newInstance(new Object[] { this }));
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	/** TODO : tenir compte des cas de figures qui contredisent le if */
	public abstract boolean canDetailAParentItem();

	public boolean hasProtectedPathways() {
		for (int i = 0; i < this.pathwaysList.count(); i++) {
			if (((Pathway) pathwaysList.objectAtIndex(i)).needsAuthentication()) {
				return true;
			}
		}
		return false;
	}

	public EOEnterpriseObject fetchObjectOfKindWithId(EOEditingContext ectx, String entityName, String idName, String idValue) {
		EOEnterpriseObject obj = null;
		try {
			obj = DirUtilities.fetchUniqueData(ectx, entityName, idName, new Integer(idValue));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return obj;

	}

	public int getPathwaysResultCount(NSDictionary searchArgs, EOEditingContext ectx) {
		int count = 0;
		for (int i = 0; i < this.pathwaysList.count(); i++) {
			count += ((Pathway) pathwaysList.objectAtIndex(i)).processSimpleSearch(searchArgs, ectx).count();
		}
		return count;
	}

	public String localeIdSubTitle() {
		return localeIdSubTitle;
	}

	public void setLocaleIdSubTitle(String localeIdSubTitle) {
		this.localeIdSubTitle = localeIdSubTitle;
	}

	public String getVisibilityType() {
		return visibilityType;
	}

	public void setVisibilityType(String visibilityType) {
		this.visibilityType = visibilityType;
	}

	public int getNumberOfFieldsForSearch() {
		return numberOfFieldsForSearch;
	}

	public void setNumberOfFieldsForSearch(int numberOfFieldsForSearch) {
		this.numberOfFieldsForSearch = numberOfFieldsForSearch;
	}

	public NSArray getSearchItems() {
		return searchItems;
	}

	public void setSearchItems(NSArray searchItems) {
		this.searchItems = new NSMutableArray(searchItems);
	}

	public boolean needsAuthentication() {
		return getVisibilityType().equals(VISIBILITY_LOGIN) || getVisibilityType().equals(VISIBILITY_RESTRICTED);
	}

	public String specificClass() {
		return needsAuthentication() ? "directorytitle protected_directory" : "directorytitle";
	}

}
