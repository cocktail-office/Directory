

// EOCompte.java
// 

package org.cocktail.directory.eof.server;


import org.cocktail.directory.server.CommonDataHolder;

import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;

public class EOCompte extends _EOCompte
{
	
	
	public static final EOQualifier QUAL_VALIDE = new EOKeyValueQualifier(EOCompte.CPT_VALIDE_KEY,EOQualifier.QualifierOperatorEqual,"O");
	
    public EOCompte() {
        super();
    }


    public static String completeMailWithMainDomain(String mail) {
    	return completeMailWithDomain(mail,CommonDataHolder.mainDomain);
    }
    
    public static String completeMailWithDomain(String mail,String domaine) {
    	if(mail!=null && mail.indexOf('@')==-1) {
    		StringBuffer bf = new StringBuffer(mail);
    		bf.append("@").append(domaine);
    		return bf.toString();
    	}
    	else
    		return mail;
    }
   
    
    
}
