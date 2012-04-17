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

// DO NOT EDIT.  Make changes to EOListeForums.java instead.
package org.cocktail.directory.eof.server;

import java.util.NoSuchElementException;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;



public abstract class _EOListeForums extends  DirectoryRecord {
	public static final String ENTITY_NAME = "ListeForums";
	public static final String ENTITY_TABLE_NAME = "FORUMS.LISTE_FORUMS";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "lisCode";

	public static final String C_STRUCTURE_KEY = "cStructure";
	public static final String C_STRUCTURE_PERE_KEY = "cStructurePere";
	public static final String LIS_ACTIVE_KEY = "lisActive";
	public static final String LIS_CODE_SUJET_KEY = "lisCodeSujet";
	public static final String LIS_DESCRIPTION_KEY = "lisDescription";
	public static final String LIS_EMAIL_KEY = "lisEmail";
	public static final String LIS_LIBELLE_KEY = "lisLibelle";
	public static final String LIS_MODE_REPONSE_KEY = "lisModeReponse";
	public static final String LIS_PRIVEE_KEY = "lisPrivee";
	public static final String LIS_RENVOI_ORIGINAL_KEY = "lisRenvoiOriginal";
	public static final String LIS_VALIDE_KEY = "lisValide";

// Attributs non visibles
	public static final String LIS_CODE_KEY = "lisCode";

//Colonnes dans la base de donnees
	public static final String C_STRUCTURE_COLKEY = "C_STRUCTURE";
	public static final String C_STRUCTURE_PERE_COLKEY = "C_STRUCTURE_PERE";
	public static final String LIS_ACTIVE_COLKEY = "LIS_ACTIVE";
	public static final String LIS_CODE_SUJET_COLKEY = "LIS_CODE_SUJET";
	public static final String LIS_DESCRIPTION_COLKEY = "LIS_DESCRIPTION";
	public static final String LIS_EMAIL_COLKEY = "LIS_EMAIL";
	public static final String LIS_LIBELLE_COLKEY = "LIS_LIBELLE";
	public static final String LIS_MODE_REPONSE_COLKEY = "LIS_MODE_REPONSE";
	public static final String LIS_PRIVEE_COLKEY = "LIS_PRIVEE";
	public static final String LIS_RENVOI_ORIGINAL_COLKEY = "LIS_RENVOI_ORIGINAL";
	public static final String LIS_VALIDE_COLKEY = "LIS_VALIDE";

	public static final String LIS_CODE_COLKEY = "LIS_CODE";


	// Relationships



	// Accessors methods
  public String cStructure() {
    return (String) storedValueForKey(C_STRUCTURE_KEY);
  }

  public void setCStructure(String value) {
    takeStoredValueForKey(value, C_STRUCTURE_KEY);
  }

  public String cStructurePere() {
    return (String) storedValueForKey(C_STRUCTURE_PERE_KEY);
  }

  public void setCStructurePere(String value) {
    takeStoredValueForKey(value, C_STRUCTURE_PERE_KEY);
  }

  public String lisActive() {
    return (String) storedValueForKey(LIS_ACTIVE_KEY);
  }

  public void setLisActive(String value) {
    takeStoredValueForKey(value, LIS_ACTIVE_KEY);
  }

  public String lisCodeSujet() {
    return (String) storedValueForKey(LIS_CODE_SUJET_KEY);
  }

  public void setLisCodeSujet(String value) {
    takeStoredValueForKey(value, LIS_CODE_SUJET_KEY);
  }

  public String lisDescription() {
    return (String) storedValueForKey(LIS_DESCRIPTION_KEY);
  }

  public void setLisDescription(String value) {
    takeStoredValueForKey(value, LIS_DESCRIPTION_KEY);
  }

  public String lisEmail() {
    return (String) storedValueForKey(LIS_EMAIL_KEY);
  }

  public void setLisEmail(String value) {
    takeStoredValueForKey(value, LIS_EMAIL_KEY);
  }

  public String lisLibelle() {
    return (String) storedValueForKey(LIS_LIBELLE_KEY);
  }

  public void setLisLibelle(String value) {
    takeStoredValueForKey(value, LIS_LIBELLE_KEY);
  }

  public String lisModeReponse() {
    return (String) storedValueForKey(LIS_MODE_REPONSE_KEY);
  }

  public void setLisModeReponse(String value) {
    takeStoredValueForKey(value, LIS_MODE_REPONSE_KEY);
  }

  public String lisPrivee() {
    return (String) storedValueForKey(LIS_PRIVEE_KEY);
  }

  public void setLisPrivee(String value) {
    takeStoredValueForKey(value, LIS_PRIVEE_KEY);
  }

  public String lisRenvoiOriginal() {
    return (String) storedValueForKey(LIS_RENVOI_ORIGINAL_KEY);
  }

  public void setLisRenvoiOriginal(String value) {
    takeStoredValueForKey(value, LIS_RENVOI_ORIGINAL_KEY);
  }

  public String lisValide() {
    return (String) storedValueForKey(LIS_VALIDE_KEY);
  }

  public void setLisValide(String value) {
    takeStoredValueForKey(value, LIS_VALIDE_KEY);
  }


/**
 * Créer une instance de EOListeForums avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOListeForums createEOListeForums(EOEditingContext editingContext, String lisCodeSujet
, String lisModeReponse
, String lisRenvoiOriginal
			) {
    EOListeForums eo = (EOListeForums) createAndInsertInstance(editingContext, _EOListeForums.ENTITY_NAME);    
		eo.setLisCodeSujet(lisCodeSujet);
		eo.setLisModeReponse(lisModeReponse);
		eo.setLisRenvoiOriginal(lisRenvoiOriginal);
    return eo;
  }

  
	  public EOListeForums localInstanceIn(EOEditingContext editingContext) {
	  		return (EOListeForums)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOListeForums creerInstance(EOEditingContext editingContext) {
	  		EOListeForums object = (EOListeForums)createAndInsertInstance(editingContext, _EOListeForums.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOListeForums localInstanceIn(EOEditingContext editingContext, EOListeForums eo) {
    EOListeForums localInstance = (eo == null) ? null : (EOListeForums)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOListeForums#localInstanceIn a la place.
   */
	public static EOListeForums localInstanceOf(EOEditingContext editingContext, EOListeForums eo) {
		return EOListeForums.localInstanceIn(editingContext, eo);
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
	  public static EOListeForums fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOListeForums fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOListeForums eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOListeForums)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOListeForums fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOListeForums fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOListeForums eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOListeForums)eoObjects.objectAtIndex(0);
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
	  public static EOListeForums fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOListeForums eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOListeForums ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOListeForums fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
