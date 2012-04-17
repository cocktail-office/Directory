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

// DO NOT EDIT.  Make changes to EOAccordsContrat.java instead.
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
import com.webobjects.foundation.NSTimestamp;



public abstract class _EOAccordsContrat extends  DirectoryRecord {
	public static final String ENTITY_NAME = "AccordsContrat";
	public static final String ENTITY_TABLE_NAME = "ACCORDS.CONTRAT";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "conOrdre";

	public static final String CON_CR_KEY = "conCr";
	public static final String CON_DATE_APUREMENT_KEY = "conDateApurement";
	public static final String CON_DATE_CLOTURE_KEY = "conDateCloture";
	public static final String CON_DATE_CREATION_KEY = "conDateCreation";
	public static final String CON_DATE_MODIF_KEY = "conDateModif";
	public static final String CON_DATE_VALID_ADM_KEY = "conDateValidAdm";
	public static final String CON_ETABLISSEMENT_KEY = "conEtablissement";
	public static final String CON_GROUPE_BUD_KEY = "conGroupeBud";
	public static final String CON_INDEX_KEY = "conIndex";
	public static final String CON_NATURE_KEY = "conNature";
	public static final String CON_OBJET_KEY = "conObjet";
	public static final String CON_OBJET_COURT_KEY = "conObjetCourt";
	public static final String CON_OBSERVATIONS_KEY = "conObservations";
	public static final String CON_ORDRE_KEY = "conOrdre";
	public static final String CON_REFERENCE_EXTERNE_KEY = "conReferenceExterne";
	public static final String CON_SUPPR_KEY = "conSuppr";
	public static final String EXE_ORDRE_KEY = "exeOrdre";
	public static final String TR_ORDRE_KEY = "trOrdre";
	public static final String UTL_ORDRE_CREATION_KEY = "utlOrdreCreation";
	public static final String UTL_ORDRE_MODIF_KEY = "utlOrdreModif";
	public static final String UTL_ORDRE_VALID_ADM_KEY = "utlOrdreValidAdm";

// Attributs non visibles

//Colonnes dans la base de donnees
	public static final String CON_CR_COLKEY = "CON_CR";
	public static final String CON_DATE_APUREMENT_COLKEY = "CON_DATE_APUREMENT";
	public static final String CON_DATE_CLOTURE_COLKEY = "CON_DATE_CLOTURE";
	public static final String CON_DATE_CREATION_COLKEY = "CON_DATE_CREATION";
	public static final String CON_DATE_MODIF_COLKEY = "CON_DATE_MODIF";
	public static final String CON_DATE_VALID_ADM_COLKEY = "CON_DATE_VALID_ADM";
	public static final String CON_ETABLISSEMENT_COLKEY = "CON_ETABLISSEMENT";
	public static final String CON_GROUPE_BUD_COLKEY = "CON_GROUPE_BUD";
	public static final String CON_INDEX_COLKEY = "CON_INDEX";
	public static final String CON_NATURE_COLKEY = "CON_NATURE";
	public static final String CON_OBJET_COLKEY = "CON_OBJET";
	public static final String CON_OBJET_COURT_COLKEY = "CON_OBJET_COURT";
	public static final String CON_OBSERVATIONS_COLKEY = "CON_OBSERVATIONS";
	public static final String CON_ORDRE_COLKEY = "CON_ORDRE";
	public static final String CON_REFERENCE_EXTERNE_COLKEY = "CON_REFERENCE_EXTERNE";
	public static final String CON_SUPPR_COLKEY = "CON_SUPPR";
	public static final String EXE_ORDRE_COLKEY = "EXE_ORDRE";
	public static final String TR_ORDRE_COLKEY = "TR_ORDRE";
	public static final String UTL_ORDRE_CREATION_COLKEY = "UTL_ORDRE_CREATION";
	public static final String UTL_ORDRE_MODIF_COLKEY = "UTL_ORDRE_MODIF";
	public static final String UTL_ORDRE_VALID_ADM_COLKEY = "UTL_ORDRE_VALID_ADM";



	// Relationships
	public static final String AVENANTS_KEY = "avenants";
	public static final String CENTRE_GESTION_KEY = "centreGestion";



	// Accessors methods
  public String conCr() {
    return (String) storedValueForKey(CON_CR_KEY);
  }

  public void setConCr(String value) {
    takeStoredValueForKey(value, CON_CR_KEY);
  }

  public NSTimestamp conDateApurement() {
    return (NSTimestamp) storedValueForKey(CON_DATE_APUREMENT_KEY);
  }

  public void setConDateApurement(NSTimestamp value) {
    takeStoredValueForKey(value, CON_DATE_APUREMENT_KEY);
  }

  public NSTimestamp conDateCloture() {
    return (NSTimestamp) storedValueForKey(CON_DATE_CLOTURE_KEY);
  }

  public void setConDateCloture(NSTimestamp value) {
    takeStoredValueForKey(value, CON_DATE_CLOTURE_KEY);
  }

  public NSTimestamp conDateCreation() {
    return (NSTimestamp) storedValueForKey(CON_DATE_CREATION_KEY);
  }

  public void setConDateCreation(NSTimestamp value) {
    takeStoredValueForKey(value, CON_DATE_CREATION_KEY);
  }

  public NSTimestamp conDateModif() {
    return (NSTimestamp) storedValueForKey(CON_DATE_MODIF_KEY);
  }

  public void setConDateModif(NSTimestamp value) {
    takeStoredValueForKey(value, CON_DATE_MODIF_KEY);
  }

  public NSTimestamp conDateValidAdm() {
    return (NSTimestamp) storedValueForKey(CON_DATE_VALID_ADM_KEY);
  }

  public void setConDateValidAdm(NSTimestamp value) {
    takeStoredValueForKey(value, CON_DATE_VALID_ADM_KEY);
  }

  public String conEtablissement() {
    return (String) storedValueForKey(CON_ETABLISSEMENT_KEY);
  }

  public void setConEtablissement(String value) {
    takeStoredValueForKey(value, CON_ETABLISSEMENT_KEY);
  }

  public String conGroupeBud() {
    return (String) storedValueForKey(CON_GROUPE_BUD_KEY);
  }

  public void setConGroupeBud(String value) {
    takeStoredValueForKey(value, CON_GROUPE_BUD_KEY);
  }

  public Double conIndex() {
    return (Double) storedValueForKey(CON_INDEX_KEY);
  }

  public void setConIndex(Double value) {
    takeStoredValueForKey(value, CON_INDEX_KEY);
  }

  public Double conNature() {
    return (Double) storedValueForKey(CON_NATURE_KEY);
  }

  public void setConNature(Double value) {
    takeStoredValueForKey(value, CON_NATURE_KEY);
  }

  public String conObjet() {
    return (String) storedValueForKey(CON_OBJET_KEY);
  }

  public void setConObjet(String value) {
    takeStoredValueForKey(value, CON_OBJET_KEY);
  }

  public String conObjetCourt() {
    return (String) storedValueForKey(CON_OBJET_COURT_KEY);
  }

  public void setConObjetCourt(String value) {
    takeStoredValueForKey(value, CON_OBJET_COURT_KEY);
  }

  public String conObservations() {
    return (String) storedValueForKey(CON_OBSERVATIONS_KEY);
  }

  public void setConObservations(String value) {
    takeStoredValueForKey(value, CON_OBSERVATIONS_KEY);
  }

  public Double conOrdre() {
    return (Double) storedValueForKey(CON_ORDRE_KEY);
  }

  public void setConOrdre(Double value) {
    takeStoredValueForKey(value, CON_ORDRE_KEY);
  }

  public String conReferenceExterne() {
    return (String) storedValueForKey(CON_REFERENCE_EXTERNE_KEY);
  }

  public void setConReferenceExterne(String value) {
    takeStoredValueForKey(value, CON_REFERENCE_EXTERNE_KEY);
  }

  public String conSuppr() {
    return (String) storedValueForKey(CON_SUPPR_KEY);
  }

  public void setConSuppr(String value) {
    takeStoredValueForKey(value, CON_SUPPR_KEY);
  }

  public Double exeOrdre() {
    return (Double) storedValueForKey(EXE_ORDRE_KEY);
  }

  public void setExeOrdre(Double value) {
    takeStoredValueForKey(value, EXE_ORDRE_KEY);
  }

  public Double trOrdre() {
    return (Double) storedValueForKey(TR_ORDRE_KEY);
  }

  public void setTrOrdre(Double value) {
    takeStoredValueForKey(value, TR_ORDRE_KEY);
  }

  public Double utlOrdreCreation() {
    return (Double) storedValueForKey(UTL_ORDRE_CREATION_KEY);
  }

  public void setUtlOrdreCreation(Double value) {
    takeStoredValueForKey(value, UTL_ORDRE_CREATION_KEY);
  }

  public Double utlOrdreModif() {
    return (Double) storedValueForKey(UTL_ORDRE_MODIF_KEY);
  }

  public void setUtlOrdreModif(Double value) {
    takeStoredValueForKey(value, UTL_ORDRE_MODIF_KEY);
  }

  public Double utlOrdreValidAdm() {
    return (Double) storedValueForKey(UTL_ORDRE_VALID_ADM_KEY);
  }

  public void setUtlOrdreValidAdm(Double value) {
    takeStoredValueForKey(value, UTL_ORDRE_VALID_ADM_KEY);
  }

  public org.cocktail.directory.eof.server.EOStructureUlr centreGestion() {
    return (org.cocktail.directory.eof.server.EOStructureUlr)storedValueForKey(CENTRE_GESTION_KEY);
  }
  
	public void setCentreGestion(org.cocktail.directory.eof.server.EOStructureUlr value) {
		takeStoredValueForKey(value,CENTRE_GESTION_KEY);
	}


  public void setCentreGestionRelationship(org.cocktail.directory.eof.server.EOStructureUlr value) {
    if (value == null) {
    	org.cocktail.directory.eof.server.EOStructureUlr oldValue = centreGestion();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, CENTRE_GESTION_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, CENTRE_GESTION_KEY);
    }
  }
  
  public NSArray avenants() {
    return (NSArray)storedValueForKey(AVENANTS_KEY);
  }
  
  //ICI
  public void setAvenants(NSArray values) {
	  takeStoredValueForKey(values,AVENANTS_KEY);
  }
  

  public NSArray avenants(EOQualifier qualifier) {
    return avenants(qualifier, null);
  }

  public NSArray avenants(EOQualifier qualifier, NSArray sortOrderings) {
    NSArray results;
      results = avenants();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToAvenantsRelationship(org.cocktail.directory.eof.server.EOAccordsAvenant object) {
    addObjectToBothSidesOfRelationshipWithKey(object, AVENANTS_KEY);
  }

  public void removeFromAvenantsRelationship(org.cocktail.directory.eof.server.EOAccordsAvenant object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, AVENANTS_KEY);
  }

  public org.cocktail.directory.eof.server.EOAccordsAvenant createAvenantsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("AccordsAvenant");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, AVENANTS_KEY);
    return (org.cocktail.directory.eof.server.EOAccordsAvenant) eo;
  }

  public void deleteAvenantsRelationship(org.cocktail.directory.eof.server.EOAccordsAvenant object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, AVENANTS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllAvenantsRelationships() {
    Enumeration objects = avenants().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteAvenantsRelationship((org.cocktail.directory.eof.server.EOAccordsAvenant)objects.nextElement());
    }
  }


/**
 * Créer une instance de EOAccordsContrat avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOAccordsContrat createEOAccordsContrat(EOEditingContext editingContext, String conCr
, Double conIndex
, String conObjet
, Double conOrdre
, Double exeOrdre
, Double utlOrdreCreation
			) {
    EOAccordsContrat eo = (EOAccordsContrat) createAndInsertInstance(editingContext, _EOAccordsContrat.ENTITY_NAME);    
		eo.setConCr(conCr);
		eo.setConIndex(conIndex);
		eo.setConObjet(conObjet);
		eo.setConOrdre(conOrdre);
		eo.setExeOrdre(exeOrdre);
		eo.setUtlOrdreCreation(utlOrdreCreation);
    return eo;
  }

  
	  public EOAccordsContrat localInstanceIn(EOEditingContext editingContext) {
	  		return (EOAccordsContrat)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOAccordsContrat creerInstance(EOEditingContext editingContext) {
	  		EOAccordsContrat object = (EOAccordsContrat)createAndInsertInstance(editingContext, _EOAccordsContrat.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOAccordsContrat localInstanceIn(EOEditingContext editingContext, EOAccordsContrat eo) {
    EOAccordsContrat localInstance = (eo == null) ? null : (EOAccordsContrat)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOAccordsContrat#localInstanceIn a la place.
   */
	public static EOAccordsContrat localInstanceOf(EOEditingContext editingContext, EOAccordsContrat eo) {
		return EOAccordsContrat.localInstanceIn(editingContext, eo);
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
	  public static EOAccordsContrat fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOAccordsContrat fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOAccordsContrat eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOAccordsContrat)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOAccordsContrat fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOAccordsContrat fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOAccordsContrat eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOAccordsContrat)eoObjects.objectAtIndex(0);
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
	  public static EOAccordsContrat fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOAccordsContrat eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOAccordsContrat ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOAccordsContrat fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
