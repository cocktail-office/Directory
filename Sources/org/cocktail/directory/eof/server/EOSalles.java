

// EOSalles.java
// 

package org.cocktail.directory.eof.server;


import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;

public class EOSalles extends _EOSalles
{
    
	
	public String displayString() {
		StringBuffer bfr = new StringBuffer();
		EOLocal loc = local();
		if(loc!=null) {
			bfr.append(loc.appellation());
			bfr.append(" - ");
		}
		bfr.append(salPorte());
		return bfr.toString();
	}

    public static NSArray prepareFetchResultForDisplay(NSArray array) {
    	NSMutableArray preparedArray = new NSMutableArray();
    	EOSalles curSalle;
    	for(int i=0;i<array.count();i++) {
    		curSalle = (EOSalles)array.objectAtIndex(i);
    		preparedArray.addObject( curSalle.displayString() );
    	}
    	return preparedArray;
    }

}
