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

// DO NOT EDIT.  Make changes to EOCompteEmail.java instead.
package org.cocktail.directory.eof.server;

import java.util.NoSuchElementException;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;



public abstract class _EOCompteEmail extends  DirectoryRecord {
	public static final String ENTITY_NAME = "CompteEmail";
	public static final String ENTITY_TABLE_NAME = "COMPTE_EMAIL";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "cemKey";

	public static final String CEM_ALIAS_KEY = "cemAlias";
	public static final String CEM_DOMAINE_KEY = "cemDomaine";
	public static final String CEM_EMAIL_KEY = "cemEmail";
	public static final String CEM_PRIORITE_KEY = "cemPriorite";
	public static final String CPT_ORDRE_KEY = "cptOrdre";

// Attributs non visibles
	public static final String CEM_KEY_KEY = "cemKey";

//Colonnes dans la base de donnees
	public static final String CEM_ALIAS_COLKEY = "CEM_ALIAS";
	public static final String CEM_DOMAINE_COLKEY = "CEM_DOMAINE";
	public static final String CEM_EMAIL_COLKEY = "CEM_EMAIL";
	public static final String CEM_PRIORITE_COLKEY = "CEM_PRIORITE";
	public static final String CPT_ORDRE_COLKEY = "CPT_ORDRE";

	public static final String CEM_KEY_COLKEY = "CEM_KEY";


	// Relationships
	public static final String TO_COMPTE_KEY = "toCompte";



	// Accessors methods
  public String cemAlias() {
    return (String) storedValueForKey(CEM_ALIAS_KEY);
  }

  public void setCemAlias(String value) {
    takeStoredValueForKey(value, CEM_ALIAS_KEY);
  }

  public String cemDomaine() {
    return (String) storedValueForKey(CEM_DOMAINE_KEY);
  }

  public void setCemDomaine(String value) {
    takeStoredValueForKey(value, CEM_DOMAINE_KEY);
  }

  public String cemEmail() {
    return (String) storedValueForKey(CEM_EMAIL_KEY);
  }

  public void setCemEmail(String value) {
    takeStoredValueForKey(value, CEM_EMAIL_KEY);
  }

  public Integer cemPriorite() {
    return (Integer) storedValueForKey(CEM_PRIORITE_KEY);
  }

  public void setCemPriorite(Integer value) {
    takeStoredValueForKey(value, CEM_PRIORITE_KEY);
  }

  public Integer cptOrdre() {
    return (Integer) storedValueForKey(CPT_ORDRE_KEY);
  }

  public void setCptOrdre(Integer value) {
    takeStoredValueForKey(value, CPT_ORDRE_KEY);
  }

  public org.cocktail.directory.eof.server.EOCompte toCompte() {
    return (org.cocktail.directory.eof.server.EOCompte)storedValueForKey(TO_COMPTE_KEY);
  }
  
	public void setToCompte(org.cocktail.directory.eof.server.EOCompte value) {
		takeStoredValueForKey(value,TO_COMPTE_KEY);
	}


  public void setToCompteRelationship(org.cocktail.directory.eof.server.EOCompte value) {
    if (value == null) {
    	org.cocktail.directory.eof.server.EOCompte oldValue = toCompte();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, TO_COMPTE_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, TO_COMPTE_KEY);
    }
  }
  

/**
 * Créer une instance de EOCompteEmail avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOCompteEmail createEOCompteEmail(EOEditingContext editingContext, String cemAlias
, Integer cptOrdre
			) {
    EOCompteEmail eo = (EOCompteEmail) createAndInsertInstance(editingContext, _EOCompteEmail.ENTITY_NAME);    
		eo.setCemAlias(cemAlias);
		eo.setCptOrdre(cptOrdre);
    return eo;
  }

  
	  public EOCompteEmail localInstanceIn(EOEditingContext editingContext) {
	  		return (EOCompteEmail)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOCompteEmail creerInstance(EOEditingContext editingContext) {
	  		EOCompteEmail object = (EOCompteEmail)createAndInsertInstance(editingContext, _EOCompteEmail.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOCompteEmail localInstanceIn(EOEditingContext editingContext, EOCompteEmail eo) {
    EOCompteEmail localInstance = (eo == null) ? null : (EOCompteEmail)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOCompteEmail#localInstanceIn a la place.
   */
	public static EOCompteEmail localInstanceOf(EOEditingContext editingContext, EOCompteEmail eo) {
		return EOCompteEmail.localInstanceIn(editingContext, eo);
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
	  public static EOCompteEmail fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOCompteEmail fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOCompteEmail eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOCompteEmail)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOCompteEmail fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOCompteEmail fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOCompteEmail eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOCompteEmail)eoObjects.objectAtIndex(0);
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
	  public static EOCompteEmail fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOCompteEmail eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOCompteEmail ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOCompteEmail fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
