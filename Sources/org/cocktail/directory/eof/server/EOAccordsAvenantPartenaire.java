

// EOAccordsAvenantPartenaire.java
// 

package org.cocktail.directory.eof.server;


import org.cocktail.directory.impl.elements.DirectoryEntity;

import com.webobjects.foundation.NSArray;


public class EOAccordsAvenantPartenaire extends _EOAccordsAvenantPartenaire implements DirectoryEntity {

	public static final int PART_PERS_MORALE 	= 1;
	public static final int PART_PERS_PHYSIQUE 	= 2;
	
	public EOStructureUlr structure() {
		return structureUlr();
	}
	
	public EOIndividuUlr individu() {
		if(cStructure()!=null) // s'il y'a un cstructure, la jointure n'est pas destin�e � un individu_ulr
			return null;
		NSArray inds = individuUlr();
		if(inds.count()>0)
			return (EOIndividuUlr)inds.objectAtIndex(0);
		else
			return null;
	}
	
	
	
	public boolean isStructure() {
		return structure()!=null;
	}

	public String displayString() {
		
		DirectoryEntity par;
		if(isStructure())
			par = structure();
		else
		if(individu()!=null)
			par = individu();
		else
			par = null;
		
		if(par!=null)
			return par.displayString();
		else
			return null;
	}

	public String getPrimaryKey() {
		return String.valueOf(apOrdre().intValue());
	}
    

}
