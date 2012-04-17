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

// DO NOT EDIT.  Make changes to EOPersonneTelephone.java instead.
package org.cocktail.directory.eof.server;

import java.util.NoSuchElementException;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSTimestamp;



public abstract class _EOPersonneTelephone extends  DirectoryRecord {
	public static final String ENTITY_NAME = "PersonneTelephone";
	public static final String ENTITY_TABLE_NAME = "PERSONNE_TELEPHONE";



	// Attributes


	public static final String C_STRUCTURE_KEY = "cStructure";
	public static final String D_DEB_VAL_KEY = "dDebVal";
	public static final String D_FIN_VAL_KEY = "dFinVal";
	public static final String INDICATIF_KEY = "indicatif";
	public static final String LISTE_ROUGE_KEY = "listeRouge";
	public static final String NO_TELEPHONE_KEY = "noTelephone";
	public static final String TYPE_NO_KEY = "typeNo";
	public static final String TYPE_TEL_KEY = "typeTel";

// Attributs non visibles
	public static final String PERS_ID_KEY = "persId";

//Colonnes dans la base de donnees
	public static final String C_STRUCTURE_COLKEY = "C_STRUCTURE";
	public static final String D_DEB_VAL_COLKEY = "D_DEB_VAL";
	public static final String D_FIN_VAL_COLKEY = "D_FIN_VAL";
	public static final String INDICATIF_COLKEY = "INDICATIF";
	public static final String LISTE_ROUGE_COLKEY = "LISTE_ROUGE";
	public static final String NO_TELEPHONE_COLKEY = "NO_TELEPHONE";
	public static final String TYPE_NO_COLKEY = "TYPE_NO";
	public static final String TYPE_TEL_COLKEY = "TYPE_TEL";

	public static final String PERS_ID_COLKEY = "PERS_ID";


	// Relationships
	public static final String STRUCTURE_ULR_KEY = "structureUlr";



	// Accessors methods
  public String cStructure() {
    return (String) storedValueForKey(C_STRUCTURE_KEY);
  }

  public void setCStructure(String value) {
    takeStoredValueForKey(value, C_STRUCTURE_KEY);
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

  public Double indicatif() {
    return (Double) storedValueForKey(INDICATIF_KEY);
  }

  public void setIndicatif(Double value) {
    takeStoredValueForKey(value, INDICATIF_KEY);
  }

  public String listeRouge() {
    return (String) storedValueForKey(LISTE_ROUGE_KEY);
  }

  public void setListeRouge(String value) {
    takeStoredValueForKey(value, LISTE_ROUGE_KEY);
  }

  public String noTelephone() {
    return (String) storedValueForKey(NO_TELEPHONE_KEY);
  }

  public void setNoTelephone(String value) {
    takeStoredValueForKey(value, NO_TELEPHONE_KEY);
  }

  public String typeNo() {
    return (String) storedValueForKey(TYPE_NO_KEY);
  }

  public void setTypeNo(String value) {
    takeStoredValueForKey(value, TYPE_NO_KEY);
  }

  public String typeTel() {
    return (String) storedValueForKey(TYPE_TEL_KEY);
  }

  public void setTypeTel(String value) {
    takeStoredValueForKey(value, TYPE_TEL_KEY);
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
 * Créer une instance de EOPersonneTelephone avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOPersonneTelephone createEOPersonneTelephone(EOEditingContext editingContext, String noTelephone
, String typeNo
, String typeTel
			) {
    EOPersonneTelephone eo = (EOPersonneTelephone) createAndInsertInstance(editingContext, _EOPersonneTelephone.ENTITY_NAME);    
		eo.setNoTelephone(noTelephone);
		eo.setTypeNo(typeNo);
		eo.setTypeTel(typeTel);
    return eo;
  }

  
	  public EOPersonneTelephone localInstanceIn(EOEditingContext editingContext) {
	  		return (EOPersonneTelephone)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOPersonneTelephone creerInstance(EOEditingContext editingContext) {
	  		EOPersonneTelephone object = (EOPersonneTelephone)createAndInsertInstance(editingContext, _EOPersonneTelephone.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOPersonneTelephone localInstanceIn(EOEditingContext editingContext, EOPersonneTelephone eo) {
    EOPersonneTelephone localInstance = (eo == null) ? null : (EOPersonneTelephone)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOPersonneTelephone#localInstanceIn a la place.
   */
	public static EOPersonneTelephone localInstanceOf(EOEditingContext editingContext, EOPersonneTelephone eo) {
		return EOPersonneTelephone.localInstanceIn(editingContext, eo);
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
	  public static EOPersonneTelephone fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOPersonneTelephone fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOPersonneTelephone eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOPersonneTelephone)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOPersonneTelephone fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOPersonneTelephone fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOPersonneTelephone eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOPersonneTelephone)eoObjects.objectAtIndex(0);
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
	  public static EOPersonneTelephone fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOPersonneTelephone eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOPersonneTelephone ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOPersonneTelephone fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
