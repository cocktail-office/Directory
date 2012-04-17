

// EOTypeGroupe.java
// 

package org.cocktail.directory.eof.server;


import org.cocktail.directory.impl.elements.DirectoryEntity;

public class EOTypeGroupe extends _EOTypeGroupe implements DirectoryEntity {

	public static final String TGRP_CODE_FORUM 		= "F";
	public static final String TGRP_CODE_DIPLOME 	= "D";
	
	public String displayString() {
		return tgrpLibelle();
	}

	public String getPrimaryKey() {
		return tgrpCode();
	}


}
