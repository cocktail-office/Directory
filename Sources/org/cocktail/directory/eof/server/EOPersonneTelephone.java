package org.cocktail.directory.eof.server;

import org.cocktail.directory.tools.DirUtilities;

import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;

public class EOPersonneTelephone extends _EOPersonneTelephone {
	
	
	private static final NSArray sortTypeNo = new NSArray (
				EOSortOrdering.sortOrderingWithKey("typeNo",EOSortOrdering.CompareDescending)
			);
	
	
	public String cleanNoTelephone() {
		String no = noTelephone();
		if(no!=null) {
			return no.replaceAll("\\D","");
		}
		else
			return null;
	}
	
	
	public static NSArray prepareFetchResultForDisplay(NSArray numbers,boolean distinctTypeNo) {
		EOPersonneTelephone currentTel;
		NSMutableArray list = new NSMutableArray();
		String tel;
		
		NSArray results;
		if(distinctTypeNo)
			results = EOSortOrdering.sortedArrayUsingKeyOrderArray(numbers,sortTypeNo);
		else
			results = numbers;
		
		for(int i=0;i<results.count();i++) {
			currentTel = (EOPersonneTelephone)results.objectAtIndex(i);
			tel = currentTel.cleanNoTelephone();
			if(!tel.equals("")) {
				if(distinctTypeNo) {
					StringBuffer bf = new StringBuffer( currentTel.typeNo().toLowerCase() );
					bf.append(" : ");
					bf.append( DirUtilities.insertRepeatedChar(tel,'.',2) );
					list.addObject( bf.toString() );
				}
				else				
					list.addObject( DirUtilities.insertRepeatedChar(tel,'.',2,DirUtilities.STARTING_RIGHT) );
			}
		}
		return list;
	}

}
