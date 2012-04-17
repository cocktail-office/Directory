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

// DO NOT EDIT.  Make changes to EOAssociation.java instead.
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
import com.webobjects.foundation.NSTimestamp;



public abstract class _EOAssociation extends  DirectoryRecord {
	public static final String ENTITY_NAME = "Association";
	public static final String ENTITY_TABLE_NAME = "ASSOCIATION";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "assId";

	public static final String ASS_LIBELLE_KEY = "assLibelle";
	public static final String D_CREATION_KEY = "dCreation";
	public static final String D_MODIFICATION_KEY = "dModification";

// Attributs non visibles
	public static final String ASS_ID_KEY = "assId";

//Colonnes dans la base de donnees
	public static final String ASS_LIBELLE_COLKEY = "ASS_LIBELLE";
	public static final String D_CREATION_COLKEY = "D_CREATION";
	public static final String D_MODIFICATION_COLKEY = "D_MODIFICATION";

	public static final String ASS_ID_COLKEY = "ASS_ID";


	// Relationships
	public static final String REPART_ASSOCIATIONS_KEY = "repartAssociations";



	// Accessors methods
  public String assLibelle() {
    return (String) storedValueForKey(ASS_LIBELLE_KEY);
  }

  public void setAssLibelle(String value) {
    takeStoredValueForKey(value, ASS_LIBELLE_KEY);
  }

  public NSTimestamp dCreation() {
    return (NSTimestamp) storedValueForKey(D_CREATION_KEY);
  }

  public void setDCreation(NSTimestamp value) {
    takeStoredValueForKey(value, D_CREATION_KEY);
  }

  public NSTimestamp dModification() {
    return (NSTimestamp) storedValueForKey(D_MODIFICATION_KEY);
  }

  public void setDModification(NSTimestamp value) {
    takeStoredValueForKey(value, D_MODIFICATION_KEY);
  }

  public NSArray repartAssociations() {
    return (NSArray)storedValueForKey(REPART_ASSOCIATIONS_KEY);
  }
  
  //ICI
  public void setRepartAssociations(NSArray values) {
	  takeStoredValueForKey(values,REPART_ASSOCIATIONS_KEY);
  }
  

  public NSArray repartAssociations(EOQualifier qualifier) {
    return repartAssociations(qualifier, null, false);
  }

  public NSArray repartAssociations(EOQualifier qualifier, boolean fetch) {
    return repartAssociations(qualifier, null, fetch);
  }

  public NSArray repartAssociations(EOQualifier qualifier, NSArray sortOrderings, boolean fetch) {
    NSArray results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.directory.eof.server.EORepartAssociation.ASSOCIATION_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.directory.eof.server.EORepartAssociation.fetchAll(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = repartAssociations();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToRepartAssociationsRelationship(org.cocktail.directory.eof.server.EORepartAssociation object) {
    addObjectToBothSidesOfRelationshipWithKey(object, REPART_ASSOCIATIONS_KEY);
  }

  public void removeFromRepartAssociationsRelationship(org.cocktail.directory.eof.server.EORepartAssociation object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_ASSOCIATIONS_KEY);
  }

  public org.cocktail.directory.eof.server.EORepartAssociation createRepartAssociationsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RepartAssociation");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, REPART_ASSOCIATIONS_KEY);
    return (org.cocktail.directory.eof.server.EORepartAssociation) eo;
  }

  public void deleteRepartAssociationsRelationship(org.cocktail.directory.eof.server.EORepartAssociation object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_ASSOCIATIONS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartAssociationsRelationships() {
    Enumeration objects = repartAssociations().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartAssociationsRelationship((org.cocktail.directory.eof.server.EORepartAssociation)objects.nextElement());
    }
  }


/**
 * Créer une instance de EOAssociation avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOAssociation createEOAssociation(EOEditingContext editingContext, String assLibelle
			) {
    EOAssociation eo = (EOAssociation) createAndInsertInstance(editingContext, _EOAssociation.ENTITY_NAME);    
		eo.setAssLibelle(assLibelle);
    return eo;
  }

  
	  public EOAssociation localInstanceIn(EOEditingContext editingContext) {
	  		return (EOAssociation)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOAssociation creerInstance(EOEditingContext editingContext) {
	  		EOAssociation object = (EOAssociation)createAndInsertInstance(editingContext, _EOAssociation.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOAssociation localInstanceIn(EOEditingContext editingContext, EOAssociation eo) {
    EOAssociation localInstance = (eo == null) ? null : (EOAssociation)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOAssociation#localInstanceIn a la place.
   */
	public static EOAssociation localInstanceOf(EOEditingContext editingContext, EOAssociation eo) {
		return EOAssociation.localInstanceIn(editingContext, eo);
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
	  public static EOAssociation fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOAssociation fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOAssociation eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOAssociation)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOAssociation fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOAssociation fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOAssociation eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOAssociation)eoObjects.objectAtIndex(0);
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
	  public static EOAssociation fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOAssociation eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOAssociation ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOAssociation fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
