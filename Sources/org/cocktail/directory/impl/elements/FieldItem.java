package org.cocktail.directory.impl.elements;

import com.webobjects.foundation.NSArray;

public class FieldItem implements Comparable<FieldItem>,Cloneable {
	
	private String id,tooltipId,localizationId;
	private boolean isList,isLink = false;
	private boolean capitalizeItem = true;
	private boolean capitalizeTooltip = true;
	private boolean isTitle;
	private boolean escapeHTML = true;
	Object[] otherParameters;
	Class[] typeParameters;
	
	private NSArray subFields;
	
	
	
	public FieldItem(String id) {
		this.id = id;
	}

	public FieldItem(String localizationId,String id,String tooltipId,boolean isList) {
		this.localizationId = localizationId;
		this.id = id;
		this.tooltipId = tooltipId;
		this.isList = isList;
	}

	public Object clone() throws CloneNotSupportedException {
		
		FieldItem aClone = (FieldItem)super.clone();
		if(id!=null) aClone.id = new String(id);
		if(tooltipId!=null) aClone.tooltipId = new String(tooltipId);
		if(localizationId!=null) aClone.localizationId = new String(localizationId);
		aClone.isList = isList;
		aClone.isLink = isLink;
		aClone.capitalizeItem = capitalizeItem;
		aClone.capitalizeTooltip = capitalizeTooltip;
		aClone.isTitle = isTitle;
		
		if(otherParameters!=null) {
			aClone.otherParameters = new Object[otherParameters.length];
			System.arraycopy(otherParameters,0,aClone.otherParameters,0,otherParameters.length);
		}
		
	    if(typeParameters!=null) {
	    	aClone.typeParameters = new Class[typeParameters.length];
	    	System.arraycopy(typeParameters,0,aClone.typeParameters,0,typeParameters.length);
	    }
	    return aClone;
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTooltipId() {
		return tooltipId;
	}

	public void setTooltipId(String tooltipId) {
		this.tooltipId = tooltipId;
	}

	public String toString() {
		return id;
	}

	public boolean isList() {
		return isList;
	}

	public void setList(boolean isList) {
		this.isList = isList;
	}

	public Object[] getAdditionalParameters() {
		return otherParameters;
	}

	public void setAdditionalParameters(Object[] otherParameters,Class[] typeParameters) {
		this.otherParameters = otherParameters;
		this.typeParameters = typeParameters;
	}

	public Class[] getTypeParameters() {
		return typeParameters;
	}

	public String getLocalizationId() {
		return localizationId;
	}

	public void setLocalizationId(String localizationId) {
		this.localizationId = localizationId;
	}
	
	// TODO: this is an optimistic comparator : use more fields to compare in the future.
	public int compareTo(FieldItem other) {
		if(other.getId().equals(id)) {
			return 0;
		}
		else {
			return -1;
		}
	}

	public boolean isCapitalizeItem() {
		return capitalizeItem;
	}

	public void setCapitalizeItem(boolean capitalizeItem) {
		this.capitalizeItem = capitalizeItem;
	}

	public boolean isCapitalizeTooltip() {
		return capitalizeTooltip;
	}

	public void setCapitalizeTooltip(boolean capitalizeTooltip) {
		this.capitalizeTooltip = capitalizeTooltip;
	}

	public boolean hasSubFields() {
		return subFields!=null && subFields.count()>0;
	}
	
	public NSArray getSubFields() {
		return subFields;
	}
	
	public void setSubFields(Object[] someSubFields) {
		setSubFields(new NSArray(someSubFields));
	}
	
	public void setSubFields(NSArray someSubFields) {
		this.subFields = someSubFields;
	}

	public boolean isTitle() {
		return isTitle;
	}

	public void setIsTitle(boolean isTitle) {
		this.isTitle = isTitle;
	}

	public boolean isLink() {
		return isLink;
	}

	public void setIsLink(boolean isLink) {
		this.isLink = isLink;
	}

	public boolean escapeHTML() {
		return escapeHTML;
	}

	public void setEscapeHTML(boolean escapeHTML) {
		this.escapeHTML = escapeHTML;
	}

	


}
