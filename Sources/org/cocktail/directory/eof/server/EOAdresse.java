

// EOAdresse.java
// 

package org.cocktail.directory.eof.server;


import org.cocktail.directory.tools.DirUtilities;

public class EOAdresse extends _EOAdresse
{
    public EOAdresse() {
        super();
    }


    public String toString() {
    	StringBuffer bf = new StringBuffer();
		EOPays pays = pays();
		String tmp = adrAdresse1();
		if(tmp!=null && !tmp.equals(""))
			bf.append(DirUtilities.strForReplacement(tmp)).append("<br/>");
		
		tmp = adrAdresse2();
		if(tmp!=null && !tmp.equals(""))
			bf.append(DirUtilities.strForReplacement(tmp)).append("<br/>");
	
		StringBuffer ville = new StringBuffer();
		
		tmp = codePostal();
		if(tmp!=null && !tmp.equals(""))
			ville.append(tmp);
	
		tmp = ville();
		if(tmp!=null && !tmp.equals("")) {
			ville.append(" ");
			ville.append(tmp).append("<br/>");
		}
		if(!ville.toString().equals("")) {
			bf.append(ville.toString());
		}
		
		bf.append(pays.llPays());				
		return bf.toString();
    }
    
}
