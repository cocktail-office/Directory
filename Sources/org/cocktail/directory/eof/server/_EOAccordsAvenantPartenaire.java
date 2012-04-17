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

// DO NOT EDIT.  Make changes to EOAccordsAvenantPartenaire.java instead.
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



public abstract class _EOAccordsAvenantPartenaire extends  DirectoryRecord {
	public static final String ENTITY_NAME = "AccordsAvenantPartenaire";
	public static final String ENTITY_TABLE_NAME = "ACCORDS.AVENANT_PARTENAIRE";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "apOrdre";

	public static final String AP_MONTANT_KEY = "apMontant";
	public static final String AP_ORDRE_KEY = "apOrdre";
	public static final String AP_PRINCIPAL_KEY = "apPrincipal";
	public static final String AVT_ORDRE_KEY = "avtOrdre";
	public static final String C_STRUCTURE_KEY = "cStructure";
	public static final String PERS_ID_KEY = "persId";
	public static final String TYPE_PART_ORDRE_KEY = "typePartOrdre";

// Attributs non visibles

//Colonnes dans la base de donnees
	public static final String AP_MONTANT_COLKEY = "AP_MONTANT";
	public static final String AP_ORDRE_COLKEY = "AP_ORDRE";
	public static final String AP_PRINCIPAL_COLKEY = "AP_PRINCIPAL";
	public static final String AVT_ORDRE_COLKEY = "AVT_ORDRE";
	public static final String C_STRUCTURE_COLKEY = "C_STRUCTURE";
	public static final String PERS_ID_COLKEY = "PERS_ID";
	public static final String TYPE_PART_ORDRE_COLKEY = "TYPE_PART_ORDRE";



	// Relationships
	public static final String AVENANT_KEY = "avenant";
	public static final String INDIVIDU_ULR_KEY = "individuUlr";
	public static final String STRUCTURE_ULR_KEY = "structureUlr";



	// Accessors methods
  public java.math.BigDecimal apMontant() {
    return (java.math.BigDecimal) storedValueForKey(AP_MONTANT_KEY);
  }

  public void setApMontant(java.math.BigDecimal value) {
    takeStoredValueForKey(value, AP_MONTANT_KEY);
  }

  public Double apOrdre() {
    return (Double) storedValueForKey(AP_ORDRE_KEY);
  }

  public void setApOrdre(Double value) {
    takeStoredValueForKey(value, AP_ORDRE_KEY);
  }

  public String apPrincipal() {
    return (String) storedValueForKey(AP_PRINCIPAL_KEY);
  }

  public void setApPrincipal(String value) {
    takeStoredValueForKey(value, AP_PRINCIPAL_KEY);
  }

  public Double avtOrdre() {
    return (Double) storedValueForKey(AVT_ORDRE_KEY);
  }

  public void setAvtOrdre(Double value) {
    takeStoredValueForKey(value, AVT_ORDRE_KEY);
  }

  public String cStructure() {
    return (String) storedValueForKey(C_STRUCTURE_KEY);
  }

  public void setCStructure(String value) {
    takeStoredValueForKey(value, C_STRUCTURE_KEY);
  }

  public Integer persId() {
    return (Integer) storedValueForKey(PERS_ID_KEY);
  }

  public void setPersId(Integer value) {
    takeStoredValueForKey(value, PERS_ID_KEY);
  }

  public Double typePartOrdre() {
    return (Double) storedValueForKey(TYPE_PART_ORDRE_KEY);
  }

  public void setTypePartOrdre(Double value) {
    takeStoredValueForKey(value, TYPE_PART_ORDRE_KEY);
  }

  public org.cocktail.directory.eof.server.EOAccordsAvenant avenant() {
    return (org.cocktail.directory.eof.server.EOAccordsAvenant)storedValueForKey(AVENANT_KEY);
  }
  
	public void setAvenant(org.cocktail.directory.eof.server.EOAccordsAvenant value) {
		takeStoredValueForKey(value,AVENANT_KEY);
	}


  public void setAvenantRelationship(org.cocktail.directory.eof.server.EOAccordsAvenant value) {
    if (value == null) {
    	org.cocktail.directory.eof.server.EOAccordsAvenant oldValue = avenant();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, AVENANT_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, AVENANT_KEY);
    }
  }
  
  public org.cocktail.directory.eof.server.EOStructureUlr structureUlr() {
    return (org.cocktail.directory.eof.server.EOStructureUlr)storedValueForKey(STRUCTURE_ULR_KEY);
  }
  
	public void setStructureUlr(org.cocktail.directory.eof.server.EOStructureUlr value) {
		takeStoredValueForKey(value,STRUCTURE_ULR_KEY);
	}


  public void setStructureUlrRelationship(org.cocktail.directory.eof.server.EOStructureUlr value) {
    if (value == null) {
    	org.cocktail.directory.eof.server.EOStructureUlr oldValue = structureUlr();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, STRUCTURE_ULR_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, STRUCTURE_ULR_KEY);
    }
  }
  
  public NSArray individuUlr() {
    return (NSArray)storedValueForKey(INDIVIDU_ULR_KEY);
  }
  
  //ICI
  public void setIndividuUlr(NSArray values) {
	  takeStoredValueForKey(values,INDIVIDU_ULR_KEY);
  }
  

  public NSArray individuUlr(EOQualifier qualifier) {
    return individuUlr(qualifier, null);
  }

  public NSArray individuUlr(EOQualifier qualifier, NSArray sortOrderings) {
    NSArray results;
      results = individuUlr();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToIndividuUlrRelationship(org.cocktail.directory.eof.server.EOIndividuUlr object) {
    addObjectToBothSidesOfRelationshipWithKey(object, INDIVIDU_ULR_KEY);
  }

  public void removeFromIndividuUlrRelationship(org.cocktail.directory.eof.server.EOIndividuUlr object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, INDIVIDU_ULR_KEY);
  }

  public org.cocktail.directory.eof.server.EOIndividuUlr createIndividuUlrRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("IndividuUlr");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, INDIVIDU_ULR_KEY);
    return (org.cocktail.directory.eof.server.EOIndividuUlr) eo;
  }

  public void deleteIndividuUlrRelationship(org.cocktail.directory.eof.server.EOIndividuUlr object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, INDIVIDU_ULR_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllIndividuUlrRelationships() {
    Enumeration objects = individuUlr().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteIndividuUlrRelationship((org.cocktail.directory.eof.server.EOIndividuUlr)objects.nextElement());
    }
  }


/**
 * Créer une instance de EOAccordsAvenantPartenaire avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOAccordsAvenantPartenaire createEOAccordsAvenantPartenaire(EOEditingContext editingContext, Double apOrdre
, String apPrincipal
, Double avtOrdre
, Integer persId
			) {
    EOAccordsAvenantPartenaire eo = (EOAccordsAvenantPartenaire) createAndInsertInstance(editingContext, _EOAccordsAvenantPartenaire.ENTITY_NAME);    
		eo.setApOrdre(apOrdre);
		eo.setApPrincipal(apPrincipal);
		eo.setAvtOrdre(avtOrdre);
		eo.setPersId(persId);
    return eo;
  }

  
	  public EOAccordsAvenantPartenaire localInstanceIn(EOEditingContext editingContext) {
	  		return (EOAccordsAvenantPartenaire)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOAccordsAvenantPartenaire creerInstance(EOEditingContext editingContext) {
	  		EOAccordsAvenantPartenaire object = (EOAccordsAvenantPartenaire)createAndInsertInstance(editingContext, _EOAccordsAvenantPartenaire.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOAccordsAvenantPartenaire localInstanceIn(EOEditingContext editingContext, EOAccordsAvenantPartenaire eo) {
    EOAccordsAvenantPartenaire localInstance = (eo == null) ? null : (EOAccordsAvenantPartenaire)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOAccordsAvenantPartenaire#localInstanceIn a la place.
   */
	public static EOAccordsAvenantPartenaire localInstanceOf(EOEditingContext editingContext, EOAccordsAvenantPartenaire eo) {
		return EOAccordsAvenantPartenaire.localInstanceIn(editingContext, eo);
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
	  public static EOAccordsAvenantPartenaire fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOAccordsAvenantPartenaire fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOAccordsAvenantPartenaire eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOAccordsAvenantPartenaire)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOAccordsAvenantPartenaire fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOAccordsAvenantPartenaire fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOAccordsAvenantPartenaire eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOAccordsAvenantPartenaire)eoObjects.objectAtIndex(0);
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
	  public static EOAccordsAvenantPartenaire fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOAccordsAvenantPartenaire eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOAccordsAvenantPartenaire ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOAccordsAvenantPartenaire fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
