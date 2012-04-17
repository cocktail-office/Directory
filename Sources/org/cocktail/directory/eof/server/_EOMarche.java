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

// DO NOT EDIT.  Make changes to EOMarche.java instead.
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



public abstract class _EOMarche extends  DirectoryRecord {
	public static final String ENTITY_NAME = "Marche";
	public static final String ENTITY_TABLE_NAME = "JEFY_MARCHES.MARCHE";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "marOrdre";

	public static final String EXE_ORDRE_KEY = "exeOrdre";
	public static final String MAR_CLAUSES_KEY = "marClauses";
	public static final String MAR_DEBUT_KEY = "marDebut";
	public static final String MAR_FIN_KEY = "marFin";
	public static final String MAR_INDEX_KEY = "marIndex";
	public static final String MAR_LIBELLE_KEY = "marLibelle";
	public static final String MAR_PASSATION_KEY = "marPassation";
	public static final String MAR_SUPPR_KEY = "marSuppr";
	public static final String MAR_VALIDE_KEY = "marValide";

// Attributs non visibles
	public static final String MAR_ORDRE_KEY = "marOrdre";

//Colonnes dans la base de donnees
	public static final String EXE_ORDRE_COLKEY = "EXE_ORDRE";
	public static final String MAR_CLAUSES_COLKEY = "MAR_CLAUSES";
	public static final String MAR_DEBUT_COLKEY = "MAR_DEBUT";
	public static final String MAR_FIN_COLKEY = "MAR_FIN";
	public static final String MAR_INDEX_COLKEY = "MAR_INDEX";
	public static final String MAR_LIBELLE_COLKEY = "MAR_LIBELLE";
	public static final String MAR_PASSATION_COLKEY = "MAR_PASSATION";
	public static final String MAR_SUPPR_COLKEY = "MAR_SUPPR";
	public static final String MAR_VALIDE_COLKEY = "MAR_VALIDE";

	public static final String MAR_ORDRE_COLKEY = "MAR_ORDRE";


	// Relationships
	public static final String LOTS_KEY = "lots";



	// Accessors methods
  public Double exeOrdre() {
    return (Double) storedValueForKey(EXE_ORDRE_KEY);
  }

  public void setExeOrdre(Double value) {
    takeStoredValueForKey(value, EXE_ORDRE_KEY);
  }

  public String marClauses() {
    return (String) storedValueForKey(MAR_CLAUSES_KEY);
  }

  public void setMarClauses(String value) {
    takeStoredValueForKey(value, MAR_CLAUSES_KEY);
  }

  public NSTimestamp marDebut() {
    return (NSTimestamp) storedValueForKey(MAR_DEBUT_KEY);
  }

  public void setMarDebut(NSTimestamp value) {
    takeStoredValueForKey(value, MAR_DEBUT_KEY);
  }

  public NSTimestamp marFin() {
    return (NSTimestamp) storedValueForKey(MAR_FIN_KEY);
  }

  public void setMarFin(NSTimestamp value) {
    takeStoredValueForKey(value, MAR_FIN_KEY);
  }

  public String marIndex() {
    return (String) storedValueForKey(MAR_INDEX_KEY);
  }

  public void setMarIndex(String value) {
    takeStoredValueForKey(value, MAR_INDEX_KEY);
  }

  public String marLibelle() {
    return (String) storedValueForKey(MAR_LIBELLE_KEY);
  }

  public void setMarLibelle(String value) {
    takeStoredValueForKey(value, MAR_LIBELLE_KEY);
  }

  public String marPassation() {
    return (String) storedValueForKey(MAR_PASSATION_KEY);
  }

  public void setMarPassation(String value) {
    takeStoredValueForKey(value, MAR_PASSATION_KEY);
  }

  public String marSuppr() {
    return (String) storedValueForKey(MAR_SUPPR_KEY);
  }

  public void setMarSuppr(String value) {
    takeStoredValueForKey(value, MAR_SUPPR_KEY);
  }

  public String marValide() {
    return (String) storedValueForKey(MAR_VALIDE_KEY);
  }

  public void setMarValide(String value) {
    takeStoredValueForKey(value, MAR_VALIDE_KEY);
  }

  public NSArray lots() {
    return (NSArray)storedValueForKey(LOTS_KEY);
  }
  
  //ICI
  public void setLots(NSArray values) {
	  takeStoredValueForKey(values,LOTS_KEY);
  }
  

  public NSArray lots(EOQualifier qualifier) {
    return lots(qualifier, null, false);
  }

  public NSArray lots(EOQualifier qualifier, boolean fetch) {
    return lots(qualifier, null, fetch);
  }

  public NSArray lots(EOQualifier qualifier, NSArray sortOrderings, boolean fetch) {
    NSArray results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.directory.eof.server.EOLot.MARCHE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.directory.eof.server.EOLot.fetchAll(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = lots();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToLotsRelationship(org.cocktail.directory.eof.server.EOLot object) {
    addObjectToBothSidesOfRelationshipWithKey(object, LOTS_KEY);
  }

  public void removeFromLotsRelationship(org.cocktail.directory.eof.server.EOLot object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, LOTS_KEY);
  }

  public org.cocktail.directory.eof.server.EOLot createLotsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Lot");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, LOTS_KEY);
    return (org.cocktail.directory.eof.server.EOLot) eo;
  }

  public void deleteLotsRelationship(org.cocktail.directory.eof.server.EOLot object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, LOTS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllLotsRelationships() {
    Enumeration objects = lots().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteLotsRelationship((org.cocktail.directory.eof.server.EOLot)objects.nextElement());
    }
  }


/**
 * Créer une instance de EOMarche avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOMarche createEOMarche(EOEditingContext editingContext, Double exeOrdre
			) {
    EOMarche eo = (EOMarche) createAndInsertInstance(editingContext, _EOMarche.ENTITY_NAME);    
		eo.setExeOrdre(exeOrdre);
    return eo;
  }

  
	  public EOMarche localInstanceIn(EOEditingContext editingContext) {
	  		return (EOMarche)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOMarche creerInstance(EOEditingContext editingContext) {
	  		EOMarche object = (EOMarche)createAndInsertInstance(editingContext, _EOMarche.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOMarche localInstanceIn(EOEditingContext editingContext, EOMarche eo) {
    EOMarche localInstance = (eo == null) ? null : (EOMarche)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOMarche#localInstanceIn a la place.
   */
	public static EOMarche localInstanceOf(EOEditingContext editingContext, EOMarche eo) {
		return EOMarche.localInstanceIn(editingContext, eo);
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
	  public static EOMarche fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOMarche fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOMarche eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOMarche)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOMarche fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOMarche fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOMarche eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOMarche)eoObjects.objectAtIndex(0);
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
	  public static EOMarche fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOMarche eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOMarche ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOMarche fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
