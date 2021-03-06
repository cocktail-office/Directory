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

// DO NOT EDIT.  Make changes to EOAccordsTypeContrat.java instead.
package org.cocktail.directory.eof.server;

import java.util.Enumeration;
import java.util.NoSuchElementException;

import com.webobjects.eocontrol.EOAndQualifier;
import com.webobjects.eocontrol.EOClassDescription;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;



public abstract class _EOAccordsTypeContrat extends  DirectoryRecord {
	public static final String ENTITY_NAME = "AccordsTypeContrat";
	public static final String ENTITY_TABLE_NAME = "ACCORDS.TYPE_CONTRAT";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "tyconId";

	public static final String TYCON_ID_KEY = "tyconId";
	public static final String TYCON_ID_INTERNE_KEY = "tyconIdInterne";
	public static final String TYCON_ID_PERE_KEY = "tyconIdPere";
	public static final String TYCON_LIBELLE_KEY = "tyconLibelle";
	public static final String TYCON_NATURE_KEY = "tyconNature";
	public static final String TYCON_NIVEAU_KEY = "tyconNiveau";
	public static final String TYCON_RECHERCHE_KEY = "tyconRecherche";

// Attributs non visibles

//Colonnes dans la base de donnees
	public static final String TYCON_ID_COLKEY = "TYCON_ID";
	public static final String TYCON_ID_INTERNE_COLKEY = "TYCON_ID_INTERNE";
	public static final String TYCON_ID_PERE_COLKEY = "TYCON_ID_PERE";
	public static final String TYCON_LIBELLE_COLKEY = "TYCON_LIBELLE";
	public static final String TYCON_NATURE_COLKEY = "TYCON_NATURE";
	public static final String TYCON_NIVEAU_COLKEY = "TYCON_NIVEAU";
	public static final String TYCON_RECHERCHE_COLKEY = "TYCON_RECHERCHE";



	// Relationships
	public static final String PARENT_KEY = "parent";
	public static final String SONS_KEY = "sons";



	// Accessors methods
  public Double tyconId() {
    return (Double) storedValueForKey(TYCON_ID_KEY);
  }

  public void setTyconId(Double value) {
    takeStoredValueForKey(value, TYCON_ID_KEY);
  }

  public String tyconIdInterne() {
    return (String) storedValueForKey(TYCON_ID_INTERNE_KEY);
  }

  public void setTyconIdInterne(String value) {
    takeStoredValueForKey(value, TYCON_ID_INTERNE_KEY);
  }

  public Double tyconIdPere() {
    return (Double) storedValueForKey(TYCON_ID_PERE_KEY);
  }

  public void setTyconIdPere(Double value) {
    takeStoredValueForKey(value, TYCON_ID_PERE_KEY);
  }

  public String tyconLibelle() {
    return (String) storedValueForKey(TYCON_LIBELLE_KEY);
  }

  public void setTyconLibelle(String value) {
    takeStoredValueForKey(value, TYCON_LIBELLE_KEY);
  }

  public String tyconNature() {
    return (String) storedValueForKey(TYCON_NATURE_KEY);
  }

  public void setTyconNature(String value) {
    takeStoredValueForKey(value, TYCON_NATURE_KEY);
  }

  public Double tyconNiveau() {
    return (Double) storedValueForKey(TYCON_NIVEAU_KEY);
  }

  public void setTyconNiveau(Double value) {
    takeStoredValueForKey(value, TYCON_NIVEAU_KEY);
  }

  public String tyconRecherche() {
    return (String) storedValueForKey(TYCON_RECHERCHE_KEY);
  }

  public void setTyconRecherche(String value) {
    takeStoredValueForKey(value, TYCON_RECHERCHE_KEY);
  }

  public org.cocktail.directory.eof.server.EOAccordsTypeContrat parent() {
    return (org.cocktail.directory.eof.server.EOAccordsTypeContrat)storedValueForKey(PARENT_KEY);
  }
  
	public void setParent(org.cocktail.directory.eof.server.EOAccordsTypeContrat value) {
		takeStoredValueForKey(value,PARENT_KEY);
	}


  public void setParentRelationship(org.cocktail.directory.eof.server.EOAccordsTypeContrat value) {
    if (value == null) {
    	org.cocktail.directory.eof.server.EOAccordsTypeContrat oldValue = parent();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, PARENT_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, PARENT_KEY);
    }
  }
  
  public NSArray sons() {
    return (NSArray)storedValueForKey(SONS_KEY);
  }
  
  //ICI
  public void setSons(NSArray values) {
	  takeStoredValueForKey(values,SONS_KEY);
  }
  

  public NSArray sons(EOQualifier qualifier) {
    return sons(qualifier, null, false);
  }

  public NSArray sons(EOQualifier qualifier, boolean fetch) {
    return sons(qualifier, null, fetch);
  }

  public NSArray sons(EOQualifier qualifier, NSArray sortOrderings, boolean fetch) {
    NSArray results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.directory.eof.server.EOAccordsTypeContrat.PARENT_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.directory.eof.server.EOAccordsTypeContrat.fetchAll(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = sons();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToSonsRelationship(org.cocktail.directory.eof.server.EOAccordsTypeContrat object) {
    addObjectToBothSidesOfRelationshipWithKey(object, SONS_KEY);
  }

  public void removeFromSonsRelationship(org.cocktail.directory.eof.server.EOAccordsTypeContrat object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, SONS_KEY);
  }

  public org.cocktail.directory.eof.server.EOAccordsTypeContrat createSonsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("AccordsTypeContrat");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, SONS_KEY);
    return (org.cocktail.directory.eof.server.EOAccordsTypeContrat) eo;
  }

  public void deleteSonsRelationship(org.cocktail.directory.eof.server.EOAccordsTypeContrat object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, SONS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllSonsRelationships() {
    Enumeration objects = sons().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteSonsRelationship((org.cocktail.directory.eof.server.EOAccordsTypeContrat)objects.nextElement());
    }
  }


/**
 * Créer une instance de EOAccordsTypeContrat avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOAccordsTypeContrat createEOAccordsTypeContrat(EOEditingContext editingContext, Double tyconId
, String tyconIdInterne
			) {
    EOAccordsTypeContrat eo = (EOAccordsTypeContrat) createAndInsertInstance(editingContext, _EOAccordsTypeContrat.ENTITY_NAME);    
		eo.setTyconId(tyconId);
		eo.setTyconIdInterne(tyconIdInterne);
    return eo;
  }

  
	  public EOAccordsTypeContrat localInstanceIn(EOEditingContext editingContext) {
	  		return (EOAccordsTypeContrat)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOAccordsTypeContrat creerInstance(EOEditingContext editingContext) {
	  		EOAccordsTypeContrat object = (EOAccordsTypeContrat)createAndInsertInstance(editingContext, _EOAccordsTypeContrat.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOAccordsTypeContrat localInstanceIn(EOEditingContext editingContext, EOAccordsTypeContrat eo) {
    EOAccordsTypeContrat localInstance = (eo == null) ? null : (EOAccordsTypeContrat)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOAccordsTypeContrat#localInstanceIn a la place.
   */
	public static EOAccordsTypeContrat localInstanceOf(EOEditingContext editingContext, EOAccordsTypeContrat eo) {
		return EOAccordsTypeContrat.localInstanceIn(editingContext, eo);
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
	  public static EOAccordsTypeContrat fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOAccordsTypeContrat fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOAccordsTypeContrat eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOAccordsTypeContrat)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOAccordsTypeContrat fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOAccordsTypeContrat fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOAccordsTypeContrat eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOAccordsTypeContrat)eoObjects.objectAtIndex(0);
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
	  public static EOAccordsTypeContrat fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOAccordsTypeContrat eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOAccordsTypeContrat ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOAccordsTypeContrat fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
