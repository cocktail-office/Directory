// 10 juil. 07
//created by : Fran�ois Adour

// Project : Directory

package org.cocktail.directory.impl;

import com.webobjects.eocontrol.EOQualifier;

public class SearchItem {
	
	private String localId,inputName,qualifier;
	private String searchColumn;
	
	//	pour faire la recherche avec la meme valeur sur plusieurs colonnes
	//	exemple : repartAssociation.assLibelle et indQualite
	
	String[] searchColumns;
	
	private boolean removeAccents = false;
	private boolean newLine = false;
	
	public boolean isNewLine() {
		return newLine;
	}

	public void setNewLine(boolean newLine) {
		this.newLine = newLine;
	}

	public boolean isRemoveAccents() {
		return removeAccents;
	}

	public void setRemoveAccents(boolean removeAccents) {
		this.removeAccents = removeAccents;
	}
	
	
	public SearchItem(String localId,String inputName,String searchColumn) {
		this.localId = localId;
		this.inputName = inputName;
		this.searchColumn = searchColumn;
	}
	
	
	public SearchItem(String localId,String inputName,String[] searchColumns) {
		this.localId = localId;
		this.inputName = inputName;
		this.searchColumns = searchColumns;
	}
	
	
	
	
	public String localId() {
		return localId;
	}

	public void setLocalId(String localId) {
		this.localId = localId;
	}
	
	
	public String searchColumn() {
		return searchColumn;
	}

	public void setSearchColumn(String searchColumn) {
		this.searchColumn = searchColumn;
	}
	
	// ajout du 11/09/2007
	public void setStringQualifier(String qual) {
		qualifier = qual;
	}
	
	public EOQualifier getQualifierForValue(Object obj) {
		return null;
	}
	
	public String toString() {
		return 	searchColumns+" - "+localId;	
	}

	public String inputName() {
		return inputName;
	}

	public void setInputName(String inputName) {
		this.inputName = inputName;
	}

	public String[] searchColumns() {
		return searchColumns;
	}

	public void setSearchColumns(String[] searchColumns) {
		this.searchColumns = searchColumns;
	}

}
