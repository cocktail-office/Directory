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

// DO NOT EDIT.  Make changes to EOVAgentFournisseur.java instead.
package org.cocktail.directory.eof.server;

import java.util.NoSuchElementException;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSTimestamp;



public abstract class _EOVAgentFournisseur extends  DirectoryRecord {
	public static final String ENTITY_NAME = "VAgentFournisseur";
	public static final String ENTITY_TABLE_NAME = "V_AGENT_FOURNISSEUR";



	// Attributes


	public static final String AGT_ANNEE_KEY = "agtAnnee";
	public static final String AGT_FOUCONS_KEY = "agtFoucons";
	public static final String AGT_FOUCR_KEY = "agtFoucr";
	public static final String AGT_FOUVAL_KEY = "agtFouval";
	public static final String AGT_LOGIN_KEY = "agtLogin";
	public static final String AGT_MAIL_KEY = "agtMail";
	public static final String AGT_NOM_KEY = "agtNom";
	public static final String AGT_ORDRE_KEY = "agtOrdre";
	public static final String AGT_PRENOM_KEY = "agtPrenom";
	public static final String UTL_FERMETURE_KEY = "utlFermeture";
	public static final String UTL_OUVERTURE_KEY = "utlOuverture";

// Attributs non visibles

//Colonnes dans la base de donnees
	public static final String AGT_ANNEE_COLKEY = "AGT_ANNEE";
	public static final String AGT_FOUCONS_COLKEY = "AGT_FOUCONS";
	public static final String AGT_FOUCR_COLKEY = "AGT_FOUCR";
	public static final String AGT_FOUVAL_COLKEY = "AGT_FOUVAL";
	public static final String AGT_LOGIN_COLKEY = "AGT_LOGIN";
	public static final String AGT_MAIL_COLKEY = "AGT_MAIL";
	public static final String AGT_NOM_COLKEY = "AGT_NOM";
	public static final String AGT_ORDRE_COLKEY = "AGT_ORDRE";
	public static final String AGT_PRENOM_COLKEY = "AGT_PRENOM";
	public static final String UTL_FERMETURE_COLKEY = "UTL_FERMETURE";
	public static final String UTL_OUVERTURE_COLKEY = "UTL_OUVERTURE";



	// Relationships



	// Accessors methods
  public String agtAnnee() {
    return (String) storedValueForKey(AGT_ANNEE_KEY);
  }

  public void setAgtAnnee(String value) {
    takeStoredValueForKey(value, AGT_ANNEE_KEY);
  }

  public String agtFoucons() {
    return (String) storedValueForKey(AGT_FOUCONS_KEY);
  }

  public void setAgtFoucons(String value) {
    takeStoredValueForKey(value, AGT_FOUCONS_KEY);
  }

  public String agtFoucr() {
    return (String) storedValueForKey(AGT_FOUCR_KEY);
  }

  public void setAgtFoucr(String value) {
    takeStoredValueForKey(value, AGT_FOUCR_KEY);
  }

  public String agtFouval() {
    return (String) storedValueForKey(AGT_FOUVAL_KEY);
  }

  public void setAgtFouval(String value) {
    takeStoredValueForKey(value, AGT_FOUVAL_KEY);
  }

  public String agtLogin() {
    return (String) storedValueForKey(AGT_LOGIN_KEY);
  }

  public void setAgtLogin(String value) {
    takeStoredValueForKey(value, AGT_LOGIN_KEY);
  }

  public String agtMail() {
    return (String) storedValueForKey(AGT_MAIL_KEY);
  }

  public void setAgtMail(String value) {
    takeStoredValueForKey(value, AGT_MAIL_KEY);
  }

  public String agtNom() {
    return (String) storedValueForKey(AGT_NOM_KEY);
  }

  public void setAgtNom(String value) {
    takeStoredValueForKey(value, AGT_NOM_KEY);
  }

  public Double agtOrdre() {
    return (Double) storedValueForKey(AGT_ORDRE_KEY);
  }

  public void setAgtOrdre(Double value) {
    takeStoredValueForKey(value, AGT_ORDRE_KEY);
  }

  public String agtPrenom() {
    return (String) storedValueForKey(AGT_PRENOM_KEY);
  }

  public void setAgtPrenom(String value) {
    takeStoredValueForKey(value, AGT_PRENOM_KEY);
  }

  public NSTimestamp utlFermeture() {
    return (NSTimestamp) storedValueForKey(UTL_FERMETURE_KEY);
  }

  public void setUtlFermeture(NSTimestamp value) {
    takeStoredValueForKey(value, UTL_FERMETURE_KEY);
  }

  public NSTimestamp utlOuverture() {
    return (NSTimestamp) storedValueForKey(UTL_OUVERTURE_KEY);
  }

  public void setUtlOuverture(NSTimestamp value) {
    takeStoredValueForKey(value, UTL_OUVERTURE_KEY);
  }


/**
 * Créer une instance de EOVAgentFournisseur avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOVAgentFournisseur createEOVAgentFournisseur(EOEditingContext editingContext, String agtAnnee
, String agtLogin
, Double agtOrdre
			) {
    EOVAgentFournisseur eo = (EOVAgentFournisseur) createAndInsertInstance(editingContext, _EOVAgentFournisseur.ENTITY_NAME);    
		eo.setAgtAnnee(agtAnnee);
		eo.setAgtLogin(agtLogin);
		eo.setAgtOrdre(agtOrdre);
    return eo;
  }

  
	  public EOVAgentFournisseur localInstanceIn(EOEditingContext editingContext) {
	  		return (EOVAgentFournisseur)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOVAgentFournisseur creerInstance(EOEditingContext editingContext) {
	  		EOVAgentFournisseur object = (EOVAgentFournisseur)createAndInsertInstance(editingContext, _EOVAgentFournisseur.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOVAgentFournisseur localInstanceIn(EOEditingContext editingContext, EOVAgentFournisseur eo) {
    EOVAgentFournisseur localInstance = (eo == null) ? null : (EOVAgentFournisseur)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOVAgentFournisseur#localInstanceIn a la place.
   */
	public static EOVAgentFournisseur localInstanceOf(EOEditingContext editingContext, EOVAgentFournisseur eo) {
		return EOVAgentFournisseur.localInstanceIn(editingContext, eo);
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
	  public static EOVAgentFournisseur fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOVAgentFournisseur fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOVAgentFournisseur eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOVAgentFournisseur)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOVAgentFournisseur fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOVAgentFournisseur fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOVAgentFournisseur eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOVAgentFournisseur)eoObjects.objectAtIndex(0);
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
	  public static EOVAgentFournisseur fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOVAgentFournisseur eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOVAgentFournisseur ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOVAgentFournisseur fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
