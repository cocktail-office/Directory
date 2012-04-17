

// EOAssociation.java
// 

package org.cocktail.directory.eof.server;


import org.cocktail.directory.tools.DirUtilities;

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;


public class EOAssociation extends _EOAssociation
{
	
	public static final String EntityName = "Association";
	
    public EOAssociation() {
        super();
    }
    
    
    public String toString() {
    	return DirUtilities.strForReplacement( assLibelle() );
    }
    
    public static NSArray prepareFetchResultForDisplay(NSArray objets) {
    	NSMutableArray array = new NSMutableArray();
    	EOAssociation currentAssoc;
    	
    	for(int i=0;i<objets.count();i++) {
    		currentAssoc = (EOAssociation)objets.objectAtIndex(i);
    		array.addObject( DirUtilities.strForReplacement( currentAssoc.assLibelle() ) );
    	}
    	
    	return array;
    }

}
