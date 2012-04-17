/*
 * Copyright COCKTAIL (www.cocktail.org), 1995, 2009 This software 
 * is governed by the CeCILL license under French law and abiding by the
 * rules of distribution of free software. You can use, modify and/or 
 * redistribute the software under the terms of the CeCILL license as 
 * circulated by CEA, CNRS and INRIA at the following URL 
 * "http://www.cecill.info". 
 * As a counterpart to the access to the source code and rights to copy, modify 
 * and redistribute granted by the license, users are provided only with a 
 * limited warranty and the software's author, the holder of the economic 
 * rights, and the successive licensors have only limited liability. In this 
 * respect, the user's attention is drawn to the risks associated with loading,
 * using, modifying and/or developing or reproducing the software by the user 
 * in light of its specific status of free software, that may mean that it
 * is complicated to manipulate, and that also therefore means that it is 
 * reserved for developers and experienced professionals having in-depth
 * computer knowledge. Users are therefore encouraged to load and test the 
 * software's suitability as regards their requirements in conditions enabling
 * the security of their systems and/or data to be ensured and, more generally, 
 * to use and operate it in the same conditions as regards security. The
 * fact that you are presently reading this means that you have had knowledge 
 * of the CeCILL license and that you accept its terms.
 */

// DO NOT EDIT.  Make changes to EOPays.java instead.
package org.cocktail.directory.eof.server;

import java.util.NoSuchElementException;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSTimestamp;



public abstract class _EOPays extends  DirectoryRecord {
	public static final String ENTITY_NAME = "Pays";
	public static final String ENTITY_TABLE_NAME = "PAYS";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "cPays";

	public static final String CODE_ISO_KEY = "codeIso";
	public static final String D_CREATION_KEY = "dCreation";
	public static final String D_DEB_VAL_KEY = "dDebVal";
	public static final String D_FIN_VAL_KEY = "dFinVal";
	public static final String D_MODIFICATION_KEY = "dModification";
	public static final String LC_PAYS_KEY = "lcPays";
	public static final String LL_PAYS_KEY = "llPays";
	public static final String L_NATIONALITE_KEY = "lNationalite";

// Attributs non visibles
	public static final String C_PAYS_KEY = "cPays";

//Colonnes dans la base de donnees
	public static final String CODE_ISO_COLKEY = "CODE_ISO";
	public static final String D_CREATION_COLKEY = "D_CREATION";
	public static final String D_DEB_VAL_COLKEY = "D_DEB_VAL";
	public static final String D_FIN_VAL_COLKEY = "D_FIN_VAL";
	public static final String D_MODIFICATION_COLKEY = "D_MODIFICATION";
	public static final String LC_PAYS_COLKEY = "LC_PAYS";
	public static final String LL_PAYS_COLKEY = "LL_PAYS";
	public static final String L_NATIONALITE_COLKEY = "L_NATIONALITE";

	public static final String C_PAYS_COLKEY = "C_PAYS";


	// Relationships



	// Accessors methods
  public String codeIso() {
    return (String) storedValueForKey(CODE_ISO_KEY);
  }

  public void setCodeIso(String value) {
    takeStoredValueForKey(value, CODE_ISO_KEY);
  }

  public NSTimestamp dCreation() {
    return (NSTimestamp) storedValueForKey(D_CREATION_KEY);
  }

  public void setDCreation(NSTimestamp value) {
    takeStoredValueForKey(value, D_CREATION_KEY);
  }

  public NSTimestamp dDebVal() {
    return (NSTimestamp) storedValueForKey(D_DEB_VAL_KEY);
  }

  public void setDDebVal(NSTimestamp value) {
    takeStoredValueForKey(value, D_DEB_VAL_KEY);
  }

  public NSTimestamp dFinVal() {
    return (NSTimestamp) storedValueForKey(D_FIN_VAL_KEY);
  }

  public void setDFinVal(NSTimestamp value) {
    takeStoredValueForKey(value, D_FIN_VAL_KEY);
  }

  public NSTimestamp dModification() {
    return (NSTimestamp) storedValueForKey(D_MODIFICATION_KEY);
  }

  public void setDModification(NSTimestamp value) {
    takeStoredValueForKey(value, D_MODIFICATION_KEY);
  }

  public String lcPays() {
    return (String) storedValueForKey(LC_PAYS_KEY);
  }

  public void setLcPays(String value) {
    takeStoredValueForKey(value, LC_PAYS_KEY);
  }

  public String llPays() {
    return (String) storedValueForKey(LL_PAYS_KEY);
  }

  public void setLlPays(String value) {
    takeStoredValueForKey(value, LL_PAYS_KEY);
  }

  public String lNationalite() {
    return (String) storedValueForKey(L_NATIONALITE_KEY);
  }

  public void setLNationalite(String value) {
    takeStoredValueForKey(value, L_NATIONALITE_KEY);
  }


/**
 * Créer une instance de EOPays avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOPays createEOPays(EOEditingContext editingContext, NSTimestamp dCreation
, NSTimestamp dModification
			) {
    EOPays eo = (EOPays) createAndInsertInstance(editingContext, _EOPays.ENTITY_NAME);    
		eo.setDCreation(dCreation);
		eo.setDModification(dModification);
    return eo;
  }

  
	  public EOPays localInstanceIn(EOEditingContext editingContext) {
	  		return (EOPays)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOPays creerInstance(EOEditingContext editingContext) {
	  		EOPays object = (EOPays)createAndInsertInstance(editingContext, _EOPays.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOPays localInstanceIn(EOEditingContext editingContext, EOPays eo) {
    EOPays localInstance = (eo == null) ? null : (EOPays)localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }

  /**
   * 
   * @param editingContext
   * @param eo
   * @return L'objet eo dans l'editingContext
   * @deprecated Utilisez EOPays#localInstanceIn a la place.
   */
	public static EOPays localInstanceOf(EOEditingContext editingContext, EOPays eo) {
		return EOPays.localInstanceIn(editingContext, eo);
	}
  
	
	
	
	
	
	
	/* Finders */

	  public static NSArray fetchAll(EOEditingContext editingContext) {
	    return fetchAll(editingContext, (EOQualifier)null);
	  }

	  public static NSArray fetchAll(EOEditingContext editingContext, NSArray sortOrderings) {
	    return fetchAll(editingContext, null, sortOrderings);
	  }
	  
	  public static NSArray fetchAll(EOEditingContext editingContext, EOQualifier qualifier) {
		  return fetchAll(editingContext, qualifier, null, false);
	  }

	  public static NSArray fetchAll(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
		return fetchAll(editingContext, qualifier, sortOrderings, false);
	  }

	  public static NSArray fetchAll(EOEditingContext editingContext, String keyName, Object value, NSArray sortOrderings) {
		return fetchAll(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value), sortOrderings, false);
	  }
	  
	  public static NSArray fetchAll(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings, boolean distinct) {
	    EOFetchSpecification fetchSpec = new EOFetchSpecification(ENTITY_NAME, qualifier, sortOrderings);
	    fetchSpec.setIsDeep(true);
	    fetchSpec.setUsesDistinct(distinct);
	    NSArray eoObjects = (NSArray)editingContext.objectsWithFetchSpecification(fetchSpec);
	    return eoObjects;
	  }

		/**
		* Renvoie un objet simple. Pour recuperer un tableau, utilisez fetchAll(EOEditingContext editingContext, String keyName, Object value, NSArray sortOrderings).
		* Une exception est declenchee si plusieurs objets sont trouves.
		* 
		* @return Renvoie l'objet correspondant a la paire cle/valeur
		* @throws IllegalStateException  
		*/
	  public static EOPays fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
	    return fetchByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	  }

	  
	  /**
	   * Renvoie l'objet correspondant au qualifier. Si plusieurs objets sont susceptibles d'etre trouves, utilisez fetchFirstByQualifier().
	   * Une exception est declenchee si plusieurs objets sont trouves.
	   * 
	 * @param editingContext
	 * @param qualifier
	 * @return L'objet qui correspond au qualifier passé en parametre. Si plusieurs objets sont trouve, une Exception est declenchee. Si aucun objet est trouve, null est renvoye.
	 * @throws IllegalStateException
	 */
	public static EOPays fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOPays eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOPays)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOPays fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOPays fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOPays eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOPays)eoObjects.objectAtIndex(0);
	    }
	    return eoObject;
	  }  

	  
	  /**
	   * Une exception est declenchee si aucun objet est trouve.
	   * 
	   * @param editingContext
	   * @param qualifier Le filtre
	   * @return L'objet correspondant au qualifier. Si l'objet n'est pas trouvé, une exception est declenchee. Pour ne pas avoir d'exception, utilisez fetchFirstByQualifier().
	   * @throws NoSuchElementException si aucun objet est trouve
	   */
	  public static EOPays fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOPays eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOPays ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOPays fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
