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

// DO NOT EDIT.  Make changes to EOSupannCategorie.java instead.
package org.cocktail.directory.eof.server;

import java.util.NoSuchElementException;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;



public abstract class _EOSupannCategorie extends  DirectoryRecord {
	public static final String ENTITY_NAME = "SupannCategorie";
	public static final String ENTITY_TABLE_NAME = "SUPANN_CATEGORIE";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "catNumero";

	public static final String CAT_LIBELLE_KEY = "catLibelle";
	public static final String CAT_LIBELLE2_KEY = "catLibelle2";
	public static final String CAT_LISTE_ROUGE_KEY = "catListeRouge";

// Attributs non visibles
	public static final String CAT_NUMERO_KEY = "catNumero";

//Colonnes dans la base de donnees
	public static final String CAT_LIBELLE_COLKEY = "CAT_LIBELLE";
	public static final String CAT_LIBELLE2_COLKEY = "CAT_LIBELLE2";
	public static final String CAT_LISTE_ROUGE_COLKEY = "CAT_LISTE_ROUGE";

	public static final String CAT_NUMERO_COLKEY = "CAT_NUMERO";


	// Relationships



	// Accessors methods
  public String catLibelle() {
    return (String) storedValueForKey(CAT_LIBELLE_KEY);
  }

  public void setCatLibelle(String value) {
    takeStoredValueForKey(value, CAT_LIBELLE_KEY);
  }

  public String catLibelle2() {
    return (String) storedValueForKey(CAT_LIBELLE2_KEY);
  }

  public void setCatLibelle2(String value) {
    takeStoredValueForKey(value, CAT_LIBELLE2_KEY);
  }

  public String catListeRouge() {
    return (String) storedValueForKey(CAT_LISTE_ROUGE_KEY);
  }

  public void setCatListeRouge(String value) {
    takeStoredValueForKey(value, CAT_LISTE_ROUGE_KEY);
  }


/**
 * Créer une instance de EOSupannCategorie avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOSupannCategorie createEOSupannCategorie(EOEditingContext editingContext			) {
    EOSupannCategorie eo = (EOSupannCategorie) createAndInsertInstance(editingContext, _EOSupannCategorie.ENTITY_NAME);    
    return eo;
  }

  
	  public EOSupannCategorie localInstanceIn(EOEditingContext editingContext) {
	  		return (EOSupannCategorie)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOSupannCategorie creerInstance(EOEditingContext editingContext) {
	  		EOSupannCategorie object = (EOSupannCategorie)createAndInsertInstance(editingContext, _EOSupannCategorie.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOSupannCategorie localInstanceIn(EOEditingContext editingContext, EOSupannCategorie eo) {
    EOSupannCategorie localInstance = (eo == null) ? null : (EOSupannCategorie)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOSupannCategorie#localInstanceIn a la place.
   */
	public static EOSupannCategorie localInstanceOf(EOEditingContext editingContext, EOSupannCategorie eo) {
		return EOSupannCategorie.localInstanceIn(editingContext, eo);
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
	  public static EOSupannCategorie fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOSupannCategorie fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOSupannCategorie eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOSupannCategorie)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOSupannCategorie fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOSupannCategorie fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOSupannCategorie eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOSupannCategorie)eoObjects.objectAtIndex(0);
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
	  public static EOSupannCategorie fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOSupannCategorie eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOSupannCategorie ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOSupannCategorie fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
