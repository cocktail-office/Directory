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

// DO NOT EDIT.  Make changes to EOPersonne.java instead.
package org.cocktail.directory.eof.server;

import java.util.Enumeration;
import java.util.NoSuchElementException;

import com.webobjects.eocontrol.EOClassDescription;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.NSArray;



public abstract class _EOPersonne extends  DirectoryRecord {
	public static final String ENTITY_NAME = "Personne";
	public static final String ENTITY_TABLE_NAME = "PERSONNE";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "persId";

	public static final String PERS_LC_KEY = "persLc";
	public static final String PERS_LIBELLE_KEY = "persLibelle";
	public static final String PERS_NOMPTR_KEY = "persNomptr";
	public static final String PERS_ORDRE_KEY = "persOrdre";
	public static final String PERS_TYPE_KEY = "persType";

// Attributs non visibles
	public static final String PERS_ID_KEY = "persId";

//Colonnes dans la base de donnees
	public static final String PERS_LC_COLKEY = "PERS_LC";
	public static final String PERS_LIBELLE_COLKEY = "PERS_LIBELLE";
	public static final String PERS_NOMPTR_COLKEY = "PERS_NOMPTR";
	public static final String PERS_ORDRE_COLKEY = "PERS_ORDRE";
	public static final String PERS_TYPE_COLKEY = "PERS_TYPE";

	public static final String PERS_ID_COLKEY = "PERS_ID";


	// Relationships
	public static final String INDIVIDU_ULRS_KEY = "individuUlrs";
	public static final String STRUCTURE_ULRS_KEY = "structureUlrs";



	// Accessors methods
  public String persLc() {
    return (String) storedValueForKey(PERS_LC_KEY);
  }

  public void setPersLc(String value) {
    takeStoredValueForKey(value, PERS_LC_KEY);
  }

  public String persLibelle() {
    return (String) storedValueForKey(PERS_LIBELLE_KEY);
  }

  public void setPersLibelle(String value) {
    takeStoredValueForKey(value, PERS_LIBELLE_KEY);
  }

  public String persNomptr() {
    return (String) storedValueForKey(PERS_NOMPTR_KEY);
  }

  public void setPersNomptr(String value) {
    takeStoredValueForKey(value, PERS_NOMPTR_KEY);
  }

  public Double persOrdre() {
    return (Double) storedValueForKey(PERS_ORDRE_KEY);
  }

  public void setPersOrdre(Double value) {
    takeStoredValueForKey(value, PERS_ORDRE_KEY);
  }

  public String persType() {
    return (String) storedValueForKey(PERS_TYPE_KEY);
  }

  public void setPersType(String value) {
    takeStoredValueForKey(value, PERS_TYPE_KEY);
  }

  public NSArray individuUlrs() {
    return (NSArray)storedValueForKey(INDIVIDU_ULRS_KEY);
  }
  
  //ICI
  public void setIndividuUlrs(NSArray values) {
	  takeStoredValueForKey(values,INDIVIDU_ULRS_KEY);
  }
  

  public NSArray individuUlrs(EOQualifier qualifier) {
    return individuUlrs(qualifier, null);
  }

  public NSArray individuUlrs(EOQualifier qualifier, NSArray sortOrderings) {
    NSArray results;
      results = individuUlrs();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToIndividuUlrsRelationship(org.cocktail.directory.eof.server.EOIndividuUlr object) {
    addObjectToBothSidesOfRelationshipWithKey(object, INDIVIDU_ULRS_KEY);
  }

  public void removeFromIndividuUlrsRelationship(org.cocktail.directory.eof.server.EOIndividuUlr object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, INDIVIDU_ULRS_KEY);
  }

  public org.cocktail.directory.eof.server.EOIndividuUlr createIndividuUlrsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("IndividuUlr");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, INDIVIDU_ULRS_KEY);
    return (org.cocktail.directory.eof.server.EOIndividuUlr) eo;
  }

  public void deleteIndividuUlrsRelationship(org.cocktail.directory.eof.server.EOIndividuUlr object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, INDIVIDU_ULRS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllIndividuUlrsRelationships() {
    Enumeration objects = individuUlrs().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteIndividuUlrsRelationship((org.cocktail.directory.eof.server.EOIndividuUlr)objects.nextElement());
    }
  }

  public NSArray structureUlrs() {
    return (NSArray)storedValueForKey(STRUCTURE_ULRS_KEY);
  }
  
  //ICI
  public void setStructureUlrs(NSArray values) {
	  takeStoredValueForKey(values,STRUCTURE_ULRS_KEY);
  }
  

  public NSArray structureUlrs(EOQualifier qualifier) {
    return structureUlrs(qualifier, null);
  }

  public NSArray structureUlrs(EOQualifier qualifier, NSArray sortOrderings) {
    NSArray results;
      results = structureUlrs();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToStructureUlrsRelationship(org.cocktail.directory.eof.server.EOStructureUlr object) {
    addObjectToBothSidesOfRelationshipWithKey(object, STRUCTURE_ULRS_KEY);
  }

  public void removeFromStructureUlrsRelationship(org.cocktail.directory.eof.server.EOStructureUlr object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, STRUCTURE_ULRS_KEY);
  }

  public org.cocktail.directory.eof.server.EOStructureUlr createStructureUlrsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("StructureUlr");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, STRUCTURE_ULRS_KEY);
    return (org.cocktail.directory.eof.server.EOStructureUlr) eo;
  }

  public void deleteStructureUlrsRelationship(org.cocktail.directory.eof.server.EOStructureUlr object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, STRUCTURE_ULRS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllStructureUlrsRelationships() {
    Enumeration objects = structureUlrs().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteStructureUlrsRelationship((org.cocktail.directory.eof.server.EOStructureUlr)objects.nextElement());
    }
  }


/**
 * Créer une instance de EOPersonne avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOPersonne createEOPersonne(EOEditingContext editingContext, String persLibelle
, Double persOrdre
, String persType
			) {
    EOPersonne eo = (EOPersonne) createAndInsertInstance(editingContext, _EOPersonne.ENTITY_NAME);    
		eo.setPersLibelle(persLibelle);
		eo.setPersOrdre(persOrdre);
		eo.setPersType(persType);
    return eo;
  }

  
	  public EOPersonne localInstanceIn(EOEditingContext editingContext) {
	  		return (EOPersonne)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOPersonne creerInstance(EOEditingContext editingContext) {
	  		EOPersonne object = (EOPersonne)createAndInsertInstance(editingContext, _EOPersonne.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOPersonne localInstanceIn(EOEditingContext editingContext, EOPersonne eo) {
    EOPersonne localInstance = (eo == null) ? null : (EOPersonne)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOPersonne#localInstanceIn a la place.
   */
	public static EOPersonne localInstanceOf(EOEditingContext editingContext, EOPersonne eo) {
		return EOPersonne.localInstanceIn(editingContext, eo);
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
	  public static EOPersonne fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOPersonne fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOPersonne eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOPersonne)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOPersonne fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOPersonne fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOPersonne eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOPersonne)eoObjects.objectAtIndex(0);
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
	  public static EOPersonne fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOPersonne eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOPersonne ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOPersonne fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
