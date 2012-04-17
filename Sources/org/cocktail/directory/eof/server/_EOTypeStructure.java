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

// DO NOT EDIT.  Make changes to EOTypeStructure.java instead.
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



public abstract class _EOTypeStructure extends  DirectoryRecord {
	public static final String ENTITY_NAME = "TypeStructure";
	public static final String ENTITY_TABLE_NAME = "TYPE_STRUCTURE";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "cTypeStructure";

	public static final String D_CREATION_KEY = "dCreation";
	public static final String D_DEB_VAL_KEY = "dDebVal";
	public static final String D_FIN_VAL_KEY = "dFinVal";
	public static final String D_MODIFICATION_KEY = "dModification";
	public static final String L_TYPE_STRUCTURE_KEY = "lTypeStructure";

// Attributs non visibles
	public static final String C_TYPE_STRUCTURE_KEY = "cTypeStructure";

//Colonnes dans la base de donnees
	public static final String D_CREATION_COLKEY = "D_CREATION";
	public static final String D_DEB_VAL_COLKEY = "D_DEB_VAL";
	public static final String D_FIN_VAL_COLKEY = "D_FIN_VAL";
	public static final String D_MODIFICATION_COLKEY = "D_MODIFICATION";
	public static final String L_TYPE_STRUCTURE_COLKEY = "L_TYPE_STRUCTURE";

	public static final String C_TYPE_STRUCTURE_COLKEY = "C_TYPE_STRUCTURE";


	// Relationships
	public static final String STRUCTURE_ULRS_KEY = "structureUlrs";



	// Accessors methods
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

  public String lTypeStructure() {
    return (String) storedValueForKey(L_TYPE_STRUCTURE_KEY);
  }

  public void setLTypeStructure(String value) {
    takeStoredValueForKey(value, L_TYPE_STRUCTURE_KEY);
  }

  public NSArray structureUlrs() {
    return (NSArray)storedValueForKey(STRUCTURE_ULRS_KEY);
  }
  
  //ICI
  public void setStructureUlrs(NSArray values) {
	  takeStoredValueForKey(values,STRUCTURE_ULRS_KEY);
  }
  

  public NSArray structureUlrs(EOQualifier qualifier) {
    return structureUlrs(qualifier, null, false);
  }

  public NSArray structureUlrs(EOQualifier qualifier, boolean fetch) {
    return structureUlrs(qualifier, null, fetch);
  }

  public NSArray structureUlrs(EOQualifier qualifier, NSArray sortOrderings, boolean fetch) {
    NSArray results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.directory.eof.server.EOStructureUlr.TYPE_STRUCTURE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.directory.eof.server.EOStructureUlr.fetchAll(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = structureUlrs();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
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
 * Créer une instance de EOTypeStructure avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOTypeStructure createEOTypeStructure(EOEditingContext editingContext, NSTimestamp dCreation
, NSTimestamp dModification
			) {
    EOTypeStructure eo = (EOTypeStructure) createAndInsertInstance(editingContext, _EOTypeStructure.ENTITY_NAME);    
		eo.setDCreation(dCreation);
		eo.setDModification(dModification);
    return eo;
  }

  
	  public EOTypeStructure localInstanceIn(EOEditingContext editingContext) {
	  		return (EOTypeStructure)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOTypeStructure creerInstance(EOEditingContext editingContext) {
	  		EOTypeStructure object = (EOTypeStructure)createAndInsertInstance(editingContext, _EOTypeStructure.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOTypeStructure localInstanceIn(EOEditingContext editingContext, EOTypeStructure eo) {
    EOTypeStructure localInstance = (eo == null) ? null : (EOTypeStructure)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOTypeStructure#localInstanceIn a la place.
   */
	public static EOTypeStructure localInstanceOf(EOEditingContext editingContext, EOTypeStructure eo) {
		return EOTypeStructure.localInstanceIn(editingContext, eo);
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
	  public static EOTypeStructure fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOTypeStructure fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOTypeStructure eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOTypeStructure)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOTypeStructure fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOTypeStructure fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOTypeStructure eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOTypeStructure)eoObjects.objectAtIndex(0);
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
	  public static EOTypeStructure fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOTypeStructure eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOTypeStructure ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOTypeStructure fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
