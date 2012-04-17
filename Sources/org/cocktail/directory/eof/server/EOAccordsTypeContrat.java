

// EOAccordsTypeContrat.java
// 

package org.cocktail.directory.eof.server;


import org.cocktail.directory.impl.elements.DirectoryEntity;
import org.cocktail.directory.tools.DirUtilities;

import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;


public class EOAccordsTypeContrat extends _EOAccordsTypeContrat implements DirectoryEntity {
	
	public static final String TYPE_CONTRAT_SONS_METHOD = "orderedSons";

	public String displayString() {
		return tyconLibelle();
	}
	
	
	public NSArray orderedSons() {
		return DirUtilities.sortAscendingArrayWithKey(sons(),"tyconLibelle");
	}
	

	public String getPrimaryKey() {
		return String.valueOf( tyconId().intValue() );
	}
	
	
	public static EOAccordsTypeContrat fetchRootRecord(EOEditingContext ctx) {
		NSArray records = EOUtilities.objectsWithFetchSpecificationAndBindings(
										ctx,"AccordsTypeContrat","fetchRootRecord",null);
		if(records.count()>0)
			return (EOAccordsTypeContrat)records.objectAtIndex(0);
		else
			return null;
	}
	
    
    
    
    
    
}
