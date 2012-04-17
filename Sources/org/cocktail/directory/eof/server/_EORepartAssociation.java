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

// DO NOT EDIT.  Make changes to EORepartAssociation.java instead.
package org.cocktail.directory.eof.server;

import java.util.NoSuchElementException;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSTimestamp;



public abstract class _EORepartAssociation extends  DirectoryRecord {
	public static final String ENTITY_NAME = "RepartAssociation";
	public static final String ENTITY_TABLE_NAME = "REPART_ASSOCIATION";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "rasId";

	public static final String ASS_LIBELLE_KEY = "assLibelle";
	public static final String PERS_ID_KEY = "persId";
	public static final String RAS_COMMENTAIRE_KEY = "rasCommentaire";
	public static final String RAS_D_FERMETURE_KEY = "rasDFermeture";
	public static final String RAS_D_OUVERTURE_KEY = "rasDOuverture";
	public static final String RAS_RANG_KEY = "rasRang";

// Attributs non visibles
	public static final String ASS_ID_KEY = "assId";
	public static final String C_STRUCTURE_KEY = "cStructure";
	public static final String RAS_ID_KEY = "rasId";

//Colonnes dans la base de donnees
	public static final String ASS_LIBELLE_COLKEY = "$attribute.columnName";
	public static final String PERS_ID_COLKEY = "PERS_ID";
	public static final String RAS_COMMENTAIRE_COLKEY = "RAS_COMMENTAIRE";
	public static final String RAS_D_FERMETURE_COLKEY = "RAS_D_FERMETURE";
	public static final String RAS_D_OUVERTURE_COLKEY = "RAS_D_OUVERTURE";
	public static final String RAS_RANG_COLKEY = "RAS_RANG";

	public static final String ASS_ID_COLKEY = "ASS_ID";
	public static final String C_STRUCTURE_COLKEY = "C_STRUCTURE";
	public static final String RAS_ID_COLKEY = "RAS_ID";


	// Relationships
	public static final String ASSOCIATION_KEY = "association";
	public static final String STRUCTURE_ULR_KEY = "structureUlr";



	// Accessors methods
  public String assLibelle() {
    return (String) storedValueForKey(ASS_LIBELLE_KEY);
  }

  public void setAssLibelle(String value) {
    takeStoredValueForKey(value, ASS_LIBELLE_KEY);
  }

  public Integer persId() {
    return (Integer) storedValueForKey(PERS_ID_KEY);
  }

  public void setPersId(Integer value) {
    takeStoredValueForKey(value, PERS_ID_KEY);
  }

  public String rasCommentaire() {
    return (String) storedValueForKey(RAS_COMMENTAIRE_KEY);
  }

  public void setRasCommentaire(String value) {
    takeStoredValueForKey(value, RAS_COMMENTAIRE_KEY);
  }

  public NSTimestamp rasDFermeture() {
    return (NSTimestamp) storedValueForKey(RAS_D_FERMETURE_KEY);
  }

  public void setRasDFermeture(NSTimestamp value) {
    takeStoredValueForKey(value, RAS_D_FERMETURE_KEY);
  }

  public NSTimestamp rasDOuverture() {
    return (NSTimestamp) storedValueForKey(RAS_D_OUVERTURE_KEY);
  }

  public void setRasDOuverture(NSTimestamp value) {
    takeStoredValueForKey(value, RAS_D_OUVERTURE_KEY);
  }

  public Double rasRang() {
    return (Double) storedValueForKey(RAS_RANG_KEY);
  }

  public void setRasRang(Double value) {
    takeStoredValueForKey(value, RAS_RANG_KEY);
  }

  public org.cocktail.directory.eof.server.EOAssociation association() {
    return (org.cocktail.directory.eof.server.EOAssociation)storedValueForKey(ASSOCIATION_KEY);
  }
  
	public void setAssociation(org.cocktail.directory.eof.server.EOAssociation value) {
		takeStoredValueForKey(value,ASSOCIATION_KEY);
	}


  public void setAssociationRelationship(org.cocktail.directory.eof.server.EOAssociation value) {
    if (value == null) {
    	org.cocktail.directory.eof.server.EOAssociation oldValue = association();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, ASSOCIATION_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, ASSOCIATION_KEY);
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
 * Créer une instance de EORepartAssociation avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EORepartAssociation createEORepartAssociation(EOEditingContext editingContext, String assLibelle
, Integer persId
, Double rasRang
			) {
    EORepartAssociation eo = (EORepartAssociation) createAndInsertInstance(editingContext, _EORepartAssociation.ENTITY_NAME);    
		eo.setAssLibelle(assLibelle);
		eo.setPersId(persId);
		eo.setRasRang(rasRang);
    return eo;
  }

  
	  public EORepartAssociation localInstanceIn(EOEditingContext editingContext) {
	  		return (EORepartAssociation)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EORepartAssociation creerInstance(EOEditingContext editingContext) {
	  		EORepartAssociation object = (EORepartAssociation)createAndInsertInstance(editingContext, _EORepartAssociation.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EORepartAssociation localInstanceIn(EOEditingContext editingContext, EORepartAssociation eo) {
    EORepartAssociation localInstance = (eo == null) ? null : (EORepartAssociation)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EORepartAssociation#localInstanceIn a la place.
   */
	public static EORepartAssociation localInstanceOf(EOEditingContext editingContext, EORepartAssociation eo) {
		return EORepartAssociation.localInstanceIn(editingContext, eo);
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
	  public static EORepartAssociation fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EORepartAssociation fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EORepartAssociation eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EORepartAssociation)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EORepartAssociation fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EORepartAssociation fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EORepartAssociation eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EORepartAssociation)eoObjects.objectAtIndex(0);
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
	  public static EORepartAssociation fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EORepartAssociation eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EORepartAssociation ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EORepartAssociation fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
