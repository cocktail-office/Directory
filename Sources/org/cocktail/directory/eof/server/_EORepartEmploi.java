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

// DO NOT EDIT.  Make changes to EORepartEmploi.java instead.
package org.cocktail.directory.eof.server;

import java.util.NoSuchElementException;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSTimestamp;



public abstract class _EORepartEmploi extends  DirectoryRecord {
	public static final String ENTITY_NAME = "RepartEmploi";
	public static final String ENTITY_TABLE_NAME = "REPART_EMPLOI";



	// Attributes


	public static final String DATE_ENTREE_KEY = "dateEntree";
	public static final String DATE_SORTIE_KEY = "dateSortie";
	public static final String INTERET_CONTACT_KEY = "interetContact";
	public static final String PRIORITE_KEY = "priorite";
	public static final String RESPONSABILITE_KEY = "responsabilite";
	public static final String SERVICE_KEY = "service";
	public static final String TITRE_KEY = "titre";

// Attributs non visibles
	public static final String C_STRUCTURE_KEY = "cStructure";
	public static final String NO_INDIVIDU_KEY = "noIndividu";

//Colonnes dans la base de donnees
	public static final String DATE_ENTREE_COLKEY = "DATE_ENTREE";
	public static final String DATE_SORTIE_COLKEY = "DATE_SORTIE";
	public static final String INTERET_CONTACT_COLKEY = "INTERET_CONTACT";
	public static final String PRIORITE_COLKEY = "PRIORITE";
	public static final String RESPONSABILITE_COLKEY = "RESPONSABILITE";
	public static final String SERVICE_COLKEY = "SERVICE";
	public static final String TITRE_COLKEY = "TITRE";

	public static final String C_STRUCTURE_COLKEY = "C_STRUCTURE";
	public static final String NO_INDIVIDU_COLKEY = "NO_INDIVIDU";


	// Relationships
	public static final String INDIVIDU_ULR_KEY = "individuUlr";
	public static final String STRUCTURE_ULR_KEY = "structureUlr";



	// Accessors methods
  public NSTimestamp dateEntree() {
    return (NSTimestamp) storedValueForKey(DATE_ENTREE_KEY);
  }

  public void setDateEntree(NSTimestamp value) {
    takeStoredValueForKey(value, DATE_ENTREE_KEY);
  }

  public NSTimestamp dateSortie() {
    return (NSTimestamp) storedValueForKey(DATE_SORTIE_KEY);
  }

  public void setDateSortie(NSTimestamp value) {
    takeStoredValueForKey(value, DATE_SORTIE_KEY);
  }

  public String interetContact() {
    return (String) storedValueForKey(INTERET_CONTACT_KEY);
  }

  public void setInteretContact(String value) {
    takeStoredValueForKey(value, INTERET_CONTACT_KEY);
  }

  public Double priorite() {
    return (Double) storedValueForKey(PRIORITE_KEY);
  }

  public void setPriorite(Double value) {
    takeStoredValueForKey(value, PRIORITE_KEY);
  }

  public String responsabilite() {
    return (String) storedValueForKey(RESPONSABILITE_KEY);
  }

  public void setResponsabilite(String value) {
    takeStoredValueForKey(value, RESPONSABILITE_KEY);
  }

  public String service() {
    return (String) storedValueForKey(SERVICE_KEY);
  }

  public void setService(String value) {
    takeStoredValueForKey(value, SERVICE_KEY);
  }

  public String titre() {
    return (String) storedValueForKey(TITRE_KEY);
  }

  public void setTitre(String value) {
    takeStoredValueForKey(value, TITRE_KEY);
  }

  public org.cocktail.directory.eof.server.EOIndividuUlr individuUlr() {
    return (org.cocktail.directory.eof.server.EOIndividuUlr)storedValueForKey(INDIVIDU_ULR_KEY);
  }
  
	public void setIndividuUlr(org.cocktail.directory.eof.server.EOIndividuUlr value) {
		takeStoredValueForKey(value,INDIVIDU_ULR_KEY);
	}


  public void setIndividuUlrRelationship(org.cocktail.directory.eof.server.EOIndividuUlr value) {
    if (value == null) {
    	org.cocktail.directory.eof.server.EOIndividuUlr oldValue = individuUlr();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, INDIVIDU_ULR_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, INDIVIDU_ULR_KEY);
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
  

/**
 * Créer une instance de EORepartEmploi avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EORepartEmploi createEORepartEmploi(EOEditingContext editingContext			) {
    EORepartEmploi eo = (EORepartEmploi) createAndInsertInstance(editingContext, _EORepartEmploi.ENTITY_NAME);    
    return eo;
  }

  
	  public EORepartEmploi localInstanceIn(EOEditingContext editingContext) {
	  		return (EORepartEmploi)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EORepartEmploi creerInstance(EOEditingContext editingContext) {
	  		EORepartEmploi object = (EORepartEmploi)createAndInsertInstance(editingContext, _EORepartEmploi.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EORepartEmploi localInstanceIn(EOEditingContext editingContext, EORepartEmploi eo) {
    EORepartEmploi localInstance = (eo == null) ? null : (EORepartEmploi)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EORepartEmploi#localInstanceIn a la place.
   */
	public static EORepartEmploi localInstanceOf(EOEditingContext editingContext, EORepartEmploi eo) {
		return EORepartEmploi.localInstanceIn(editingContext, eo);
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
	  public static EORepartEmploi fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EORepartEmploi fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EORepartEmploi eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EORepartEmploi)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EORepartEmploi fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EORepartEmploi fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EORepartEmploi eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EORepartEmploi)eoObjects.objectAtIndex(0);
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
	  public static EORepartEmploi fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EORepartEmploi eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EORepartEmploi ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EORepartEmploi fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
