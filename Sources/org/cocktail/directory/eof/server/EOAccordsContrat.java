

// EOAccordsContrat.java
// 

package org.cocktail.directory.eof.server;


import org.cocktail.directory.impl.elements.DirectoryEntity;
import org.cocktail.directory.tools.DirUtilities;

import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.NSArray;


public class EOAccordsContrat extends _EOAccordsContrat implements DirectoryEntity {

	public static final EOSortOrdering SORT_YEAR = EOSortOrdering.sortOrderingWithKey("exeOrdre",EOSortOrdering.CompareDescending);
	public static final EOSortOrdering SORT_OBJC = EOSortOrdering.sortOrderingWithKey("conObjetCourt",EOSortOrdering.CompareAscending);

	public String displayString() {
		return conObjet();
	}

	public String getPrimaryKey() {
		return String.valueOf(conOrdre().intValue());
	}
	
	public String exercice() {
		return String.valueOf(exeOrdre().intValue());
	}
	
	
	public String numConvention() {
		StringBuffer bf = new StringBuffer( getPrimaryKey() );
		bf.append("-").append( exercice() );
		return bf.toString();
	}
	
	
	public String contratInitCourt() {
		EOAccordsAvenant avt0 = getAvenant0();
		if(avt0!=null)
			return avt0.avtObjetCourt();
		else
			return "";
	}
	
	public String contratInitLong() {
		EOAccordsAvenant avt0 = getAvenant0();
		if(avt0!=null)
			return avt0.avtObjet();
		else
			return "";
	}
	
	public EOAccordsAvenant getAvenant0() {
		NSArray avt = this.avenants();
		avt = DirUtilities.filteredArray(avt,"avtIndex=0");
		if(avt.count()>0)
			return (EOAccordsAvenant)avt.objectAtIndex(0);
		else
			return null;
	}
	
	public String libPartenairePrincipal() {
		EOAccordsAvenant avt0 = getAvenant0();
		if(avt0!=null) {
			EOAccordsAvenantPartenaire par = avt0.partenairePrinc();
			if(par!=null)
				return par.displayString();
		}
		return null;
	}
	
	
	public String libCR() {
		EOStructureUlr cr = centreGestion();
		if(cr!=null)
			return cr.displayString();
		else
			return null;
	}
	
	
	public NSArray sortedByIndexAvenants() {
		return DirUtilities.sortAscendingArrayWithKey(avenants(),"avtIndex");
	}
	
	
	

}
