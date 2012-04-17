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

// DO NOT EDIT.  Make changes to EOLot.java instead.
package org.cocktail.directory.eof.server;

import java.util.NoSuchElementException;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSTimestamp;



public abstract class _EOLot extends  DirectoryRecord {
	public static final String ENTITY_NAME = "Lot";
	public static final String ENTITY_TABLE_NAME = "JEFY_MARCHES.LOT";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "lotOrdre";

	public static final String LOT_CATALOGUE_KEY = "lotCatalogue";
	public static final String LOT_COTITULAIRES_KEY = "lotCotitulaires";
	public static final String LOT_DEBUT_KEY = "lotDebut";
	public static final String LOT_FIN_KEY = "lotFin";
	public static final String LOT_HT_KEY = "lotHt";
	public static final String LOT_INDEX_KEY = "lotIndex";
	public static final String LOT_LIBELLE_KEY = "lotLibelle";
	public static final String LOT_MONNAIE_KEY = "lotMonnaie";
	public static final String LOT_SOUSTRAITANTS_KEY = "lotSoustraitants";
	public static final String LOT_SUPPR_KEY = "lotSuppr";
	public static final String LOT_VALIDE_KEY = "lotValide";

// Attributs non visibles
	public static final String MAR_ORDRE_KEY = "marOrdre";
	public static final String LOT_ORDRE_KEY = "lotOrdre";

//Colonnes dans la base de donnees
	public static final String LOT_CATALOGUE_COLKEY = "LOT_CATALOGUE";
	public static final String LOT_COTITULAIRES_COLKEY = "LOT_COTITULAIRES";
	public static final String LOT_DEBUT_COLKEY = "LOT_DEBUT";
	public static final String LOT_FIN_COLKEY = "LOT_FIN";
	public static final String LOT_HT_COLKEY = "LOT_HT";
	public static final String LOT_INDEX_COLKEY = "LOT_INDEX";
	public static final String LOT_LIBELLE_COLKEY = "LOT_LIBELLE";
	public static final String LOT_MONNAIE_COLKEY = "LOT_MONNAIE";
	public static final String LOT_SOUSTRAITANTS_COLKEY = "LOT_SOUSTRAITANTS";
	public static final String LOT_SUPPR_COLKEY = "LOT_SUPPR";
	public static final String LOT_VALIDE_COLKEY = "LOT_VALIDE";

	public static final String MAR_ORDRE_COLKEY = "MAR_ORDRE";
	public static final String LOT_ORDRE_COLKEY = "LOT_ORDRE";


	// Relationships
	public static final String MARCHE_KEY = "marche";



	// Accessors methods
  public String lotCatalogue() {
    return (String) storedValueForKey(LOT_CATALOGUE_KEY);
  }

  public void setLotCatalogue(String value) {
    takeStoredValueForKey(value, LOT_CATALOGUE_KEY);
  }

  public String lotCotitulaires() {
    return (String) storedValueForKey(LOT_COTITULAIRES_KEY);
  }

  public void setLotCotitulaires(String value) {
    takeStoredValueForKey(value, LOT_COTITULAIRES_KEY);
  }

  public NSTimestamp lotDebut() {
    return (NSTimestamp) storedValueForKey(LOT_DEBUT_KEY);
  }

  public void setLotDebut(NSTimestamp value) {
    takeStoredValueForKey(value, LOT_DEBUT_KEY);
  }

  public NSTimestamp lotFin() {
    return (NSTimestamp) storedValueForKey(LOT_FIN_KEY);
  }

  public void setLotFin(NSTimestamp value) {
    takeStoredValueForKey(value, LOT_FIN_KEY);
  }

  public java.math.BigDecimal lotHt() {
    return (java.math.BigDecimal) storedValueForKey(LOT_HT_KEY);
  }

  public void setLotHt(java.math.BigDecimal value) {
    takeStoredValueForKey(value, LOT_HT_KEY);
  }

  public String lotIndex() {
    return (String) storedValueForKey(LOT_INDEX_KEY);
  }

  public void setLotIndex(String value) {
    takeStoredValueForKey(value, LOT_INDEX_KEY);
  }

  public String lotLibelle() {
    return (String) storedValueForKey(LOT_LIBELLE_KEY);
  }

  public void setLotLibelle(String value) {
    takeStoredValueForKey(value, LOT_LIBELLE_KEY);
  }

  public String lotMonnaie() {
    return (String) storedValueForKey(LOT_MONNAIE_KEY);
  }

  public void setLotMonnaie(String value) {
    takeStoredValueForKey(value, LOT_MONNAIE_KEY);
  }

  public String lotSoustraitants() {
    return (String) storedValueForKey(LOT_SOUSTRAITANTS_KEY);
  }

  public void setLotSoustraitants(String value) {
    takeStoredValueForKey(value, LOT_SOUSTRAITANTS_KEY);
  }

  public String lotSuppr() {
    return (String) storedValueForKey(LOT_SUPPR_KEY);
  }

  public void setLotSuppr(String value) {
    takeStoredValueForKey(value, LOT_SUPPR_KEY);
  }

  public String lotValide() {
    return (String) storedValueForKey(LOT_VALIDE_KEY);
  }

  public void setLotValide(String value) {
    takeStoredValueForKey(value, LOT_VALIDE_KEY);
  }

  public org.cocktail.directory.eof.server.EOMarche marche() {
    return (org.cocktail.directory.eof.server.EOMarche)storedValueForKey(MARCHE_KEY);
  }
  
	public void setMarche(org.cocktail.directory.eof.server.EOMarche value) {
		takeStoredValueForKey(value,MARCHE_KEY);
	}


  public void setMarcheRelationship(org.cocktail.directory.eof.server.EOMarche value) {
    if (value == null) {
    	org.cocktail.directory.eof.server.EOMarche oldValue = marche();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, MARCHE_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, MARCHE_KEY);
    }
  }
  

/**
 * Créer une instance de EOLot avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOLot createEOLot(EOEditingContext editingContext			) {
    EOLot eo = (EOLot) createAndInsertInstance(editingContext, _EOLot.ENTITY_NAME);    
    return eo;
  }

  
	  public EOLot localInstanceIn(EOEditingContext editingContext) {
	  		return (EOLot)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOLot creerInstance(EOEditingContext editingContext) {
	  		EOLot object = (EOLot)createAndInsertInstance(editingContext, _EOLot.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOLot localInstanceIn(EOEditingContext editingContext, EOLot eo) {
    EOLot localInstance = (eo == null) ? null : (EOLot)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOLot#localInstanceIn a la place.
   */
	public static EOLot localInstanceOf(EOEditingContext editingContext, EOLot eo) {
		return EOLot.localInstanceIn(editingContext, eo);
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
	  public static EOLot fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOLot fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOLot eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOLot)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOLot fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOLot fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOLot eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOLot)eoObjects.objectAtIndex(0);
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
	  public static EOLot fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOLot eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOLot ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOLot fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
