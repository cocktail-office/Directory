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

// DO NOT EDIT.  Make changes to EORepartPersonneAdresse.java instead.
package org.cocktail.directory.eof.server;

import java.util.NoSuchElementException;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;



public abstract class _EORepartPersonneAdresse extends  DirectoryRecord {
	public static final String ENTITY_NAME = "RepartPersonneAdresse";
	public static final String ENTITY_TABLE_NAME = "REPART_PERSONNE_ADRESSE";



	// Attributes


	public static final String E_MAIL_KEY = "eMail";
	public static final String RPA_PRINCIPAL_KEY = "rpaPrincipal";
	public static final String RPA_VALIDE_KEY = "rpaValide";

// Attributs non visibles
	public static final String TADR_CODE_KEY = "tadrCode";
	public static final String ADR_ORDRE_KEY = "adrOrdre";
	public static final String PERS_ID_KEY = "persId";

//Colonnes dans la base de donnees
	public static final String E_MAIL_COLKEY = "E_MAIL";
	public static final String RPA_PRINCIPAL_COLKEY = "RPA_PRINCIPAL";
	public static final String RPA_VALIDE_COLKEY = "RPA_VALIDE";

	public static final String TADR_CODE_COLKEY = "TADR_CODE";
	public static final String ADR_ORDRE_COLKEY = "ADR_ORDRE";
	public static final String PERS_ID_COLKEY = "PERS_ID";


	// Relationships
	public static final String ADRESSE_KEY = "adresse";



	// Accessors methods
  public String eMail() {
    return (String) storedValueForKey(E_MAIL_KEY);
  }

  public void setEMail(String value) {
    takeStoredValueForKey(value, E_MAIL_KEY);
  }

  public String rpaPrincipal() {
    return (String) storedValueForKey(RPA_PRINCIPAL_KEY);
  }

  public void setRpaPrincipal(String value) {
    takeStoredValueForKey(value, RPA_PRINCIPAL_KEY);
  }

  public String rpaValide() {
    return (String) storedValueForKey(RPA_VALIDE_KEY);
  }

  public void setRpaValide(String value) {
    takeStoredValueForKey(value, RPA_VALIDE_KEY);
  }

  public org.cocktail.directory.eof.server.EOAdresse adresse() {
    return (org.cocktail.directory.eof.server.EOAdresse)storedValueForKey(ADRESSE_KEY);
  }
  
	public void setAdresse(org.cocktail.directory.eof.server.EOAdresse value) {
		takeStoredValueForKey(value,ADRESSE_KEY);
	}


  public void setAdresseRelationship(org.cocktail.directory.eof.server.EOAdresse value) {
    if (value == null) {
    	org.cocktail.directory.eof.server.EOAdresse oldValue = adresse();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, ADRESSE_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, ADRESSE_KEY);
    }
  }
  

/**
 * Créer une instance de EORepartPersonneAdresse avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EORepartPersonneAdresse createEORepartPersonneAdresse(EOEditingContext editingContext, String rpaPrincipal
			) {
    EORepartPersonneAdresse eo = (EORepartPersonneAdresse) createAndInsertInstance(editingContext, _EORepartPersonneAdresse.ENTITY_NAME);    
		eo.setRpaPrincipal(rpaPrincipal);
    return eo;
  }

  
	  public EORepartPersonneAdresse localInstanceIn(EOEditingContext editingContext) {
	  		return (EORepartPersonneAdresse)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EORepartPersonneAdresse creerInstance(EOEditingContext editingContext) {
	  		EORepartPersonneAdresse object = (EORepartPersonneAdresse)createAndInsertInstance(editingContext, _EORepartPersonneAdresse.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EORepartPersonneAdresse localInstanceIn(EOEditingContext editingContext, EORepartPersonneAdresse eo) {
    EORepartPersonneAdresse localInstance = (eo == null) ? null : (EORepartPersonneAdresse)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EORepartPersonneAdresse#localInstanceIn a la place.
   */
	public static EORepartPersonneAdresse localInstanceOf(EOEditingContext editingContext, EORepartPersonneAdresse eo) {
		return EORepartPersonneAdresse.localInstanceIn(editingContext, eo);
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
	  public static EORepartPersonneAdresse fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EORepartPersonneAdresse fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EORepartPersonneAdresse eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EORepartPersonneAdresse)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EORepartPersonneAdresse fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EORepartPersonneAdresse fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EORepartPersonneAdresse eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EORepartPersonneAdresse)eoObjects.objectAtIndex(0);
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
	  public static EORepartPersonneAdresse fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EORepartPersonneAdresse eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EORepartPersonneAdresse ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EORepartPersonneAdresse fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
