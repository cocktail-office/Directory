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

// DO NOT EDIT.  Make changes to EOCompte.java instead.
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



public abstract class _EOCompte extends  DirectoryRecord {
	public static final String ENTITY_NAME = "Compte";
	public static final String ENTITY_TABLE_NAME = "COMPTE";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "cptOrdre";

	public static final String CPT_CHARTE_KEY = "cptCharte";
	public static final String CPT_CONNEXION_KEY = "cptConnexion";
	public static final String CPT_DOMAINE_KEY = "cptDomaine";
	public static final String CPT_EMAIL_KEY = "cptEmail";
	public static final String CPT_LOGIN_KEY = "cptLogin";
	public static final String CPT_PASSWD_KEY = "cptPasswd";
	public static final String CPT_UID_GID_KEY = "cptUidGid";
	public static final String CPT_VALIDE_KEY = "cptValide";
	public static final String CPT_VLAN_KEY = "cptVlan";

// Attributs non visibles
	public static final String PERS_ID_KEY = "persId";
	public static final String CPT_ORDRE_KEY = "cptOrdre";

//Colonnes dans la base de donnees
	public static final String CPT_CHARTE_COLKEY = "CPT_CHARTE";
	public static final String CPT_CONNEXION_COLKEY = "CPT_CONNEXION";
	public static final String CPT_DOMAINE_COLKEY = "CPT_DOMAINE";
	public static final String CPT_EMAIL_COLKEY = "CPT_EMAIL";
	public static final String CPT_LOGIN_COLKEY = "CPT_LOGIN";
	public static final String CPT_PASSWD_COLKEY = "CPT_PASSWD";
	public static final String CPT_UID_GID_COLKEY = "CPT_UID_GID";
	public static final String CPT_VALIDE_COLKEY = "CPT_VALIDE";
	public static final String CPT_VLAN_COLKEY = "CPT_VLAN";

	public static final String PERS_ID_COLKEY = "PERS_ID";
	public static final String CPT_ORDRE_COLKEY = "CPT_ORDRE";


	// Relationships
	public static final String REPART_COMPTE_KEY = "repartCompte";
	public static final String TO_COMPTE_EMAILS_KEY = "toCompteEmails";



	// Accessors methods
  public String cptCharte() {
    return (String) storedValueForKey(CPT_CHARTE_KEY);
  }

  public void setCptCharte(String value) {
    takeStoredValueForKey(value, CPT_CHARTE_KEY);
  }

  public String cptConnexion() {
    return (String) storedValueForKey(CPT_CONNEXION_KEY);
  }

  public void setCptConnexion(String value) {
    takeStoredValueForKey(value, CPT_CONNEXION_KEY);
  }

  public String cptDomaine() {
    return (String) storedValueForKey(CPT_DOMAINE_KEY);
  }

  public void setCptDomaine(String value) {
    takeStoredValueForKey(value, CPT_DOMAINE_KEY);
  }

  public String cptEmail() {
    return (String) storedValueForKey(CPT_EMAIL_KEY);
  }

  public void setCptEmail(String value) {
    takeStoredValueForKey(value, CPT_EMAIL_KEY);
  }

  public String cptLogin() {
    return (String) storedValueForKey(CPT_LOGIN_KEY);
  }

  public void setCptLogin(String value) {
    takeStoredValueForKey(value, CPT_LOGIN_KEY);
  }

  public String cptPasswd() {
    return (String) storedValueForKey(CPT_PASSWD_KEY);
  }

  public void setCptPasswd(String value) {
    takeStoredValueForKey(value, CPT_PASSWD_KEY);
  }

  public Double cptUidGid() {
    return (Double) storedValueForKey(CPT_UID_GID_KEY);
  }

  public void setCptUidGid(Double value) {
    takeStoredValueForKey(value, CPT_UID_GID_KEY);
  }

  public String cptValide() {
    return (String) storedValueForKey(CPT_VALIDE_KEY);
  }

  public void setCptValide(String value) {
    takeStoredValueForKey(value, CPT_VALIDE_KEY);
  }

  public String cptVlan() {
    return (String) storedValueForKey(CPT_VLAN_KEY);
  }

  public void setCptVlan(String value) {
    takeStoredValueForKey(value, CPT_VLAN_KEY);
  }

  public NSArray repartCompte() {
    return (NSArray)storedValueForKey(REPART_COMPTE_KEY);
  }
  
  //ICI
  public void setRepartCompte(NSArray values) {
	  takeStoredValueForKey(values,REPART_COMPTE_KEY);
  }
  

  public NSArray repartCompte(EOQualifier qualifier) {
    return repartCompte(qualifier, null, false);
  }

  public NSArray repartCompte(EOQualifier qualifier, boolean fetch) {
    return repartCompte(qualifier, null, fetch);
  }

  public NSArray repartCompte(EOQualifier qualifier, NSArray sortOrderings, boolean fetch) {
    NSArray results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.directory.eof.server.EORepartCompte.COMPTE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.directory.eof.server.EORepartCompte.fetchAll(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = repartCompte();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToRepartCompteRelationship(org.cocktail.directory.eof.server.EORepartCompte object) {
    addObjectToBothSidesOfRelationshipWithKey(object, REPART_COMPTE_KEY);
  }

  public void removeFromRepartCompteRelationship(org.cocktail.directory.eof.server.EORepartCompte object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_COMPTE_KEY);
  }

  public org.cocktail.directory.eof.server.EORepartCompte createRepartCompteRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RepartCompte");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, REPART_COMPTE_KEY);
    return (org.cocktail.directory.eof.server.EORepartCompte) eo;
  }

  public void deleteRepartCompteRelationship(org.cocktail.directory.eof.server.EORepartCompte object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_COMPTE_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartCompteRelationships() {
    Enumeration objects = repartCompte().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartCompteRelationship((org.cocktail.directory.eof.server.EORepartCompte)objects.nextElement());
    }
  }

  public NSArray toCompteEmails() {
    return (NSArray)storedValueForKey(TO_COMPTE_EMAILS_KEY);
  }
  
  //ICI
  public void setToCompteEmails(NSArray values) {
	  takeStoredValueForKey(values,TO_COMPTE_EMAILS_KEY);
  }
  

  public NSArray toCompteEmails(EOQualifier qualifier) {
    return toCompteEmails(qualifier, null, false);
  }

  public NSArray toCompteEmails(EOQualifier qualifier, boolean fetch) {
    return toCompteEmails(qualifier, null, fetch);
  }

  public NSArray toCompteEmails(EOQualifier qualifier, NSArray sortOrderings, boolean fetch) {
    NSArray results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.directory.eof.server.EOCompteEmail.TO_COMPTE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.directory.eof.server.EOCompteEmail.fetchAll(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = toCompteEmails();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToToCompteEmailsRelationship(org.cocktail.directory.eof.server.EOCompteEmail object) {
    addObjectToBothSidesOfRelationshipWithKey(object, TO_COMPTE_EMAILS_KEY);
  }

  public void removeFromToCompteEmailsRelationship(org.cocktail.directory.eof.server.EOCompteEmail object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, TO_COMPTE_EMAILS_KEY);
  }

  public org.cocktail.directory.eof.server.EOCompteEmail createToCompteEmailsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("CompteEmail");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, TO_COMPTE_EMAILS_KEY);
    return (org.cocktail.directory.eof.server.EOCompteEmail) eo;
  }

  public void deleteToCompteEmailsRelationship(org.cocktail.directory.eof.server.EOCompteEmail object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, TO_COMPTE_EMAILS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllToCompteEmailsRelationships() {
    Enumeration objects = toCompteEmails().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteToCompteEmailsRelationship((org.cocktail.directory.eof.server.EOCompteEmail)objects.nextElement());
    }
  }


/**
 * Créer une instance de EOCompte avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOCompte createEOCompte(EOEditingContext editingContext, String cptCharte
, String cptConnexion
, Double cptUidGid
, String cptValide
, String cptVlan
			) {
    EOCompte eo = (EOCompte) createAndInsertInstance(editingContext, _EOCompte.ENTITY_NAME);    
		eo.setCptCharte(cptCharte);
		eo.setCptConnexion(cptConnexion);
		eo.setCptUidGid(cptUidGid);
		eo.setCptValide(cptValide);
		eo.setCptVlan(cptVlan);
    return eo;
  }

  
	  public EOCompte localInstanceIn(EOEditingContext editingContext) {
	  		return (EOCompte)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOCompte creerInstance(EOEditingContext editingContext) {
	  		EOCompte object = (EOCompte)createAndInsertInstance(editingContext, _EOCompte.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOCompte localInstanceIn(EOEditingContext editingContext, EOCompte eo) {
    EOCompte localInstance = (eo == null) ? null : (EOCompte)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOCompte#localInstanceIn a la place.
   */
	public static EOCompte localInstanceOf(EOEditingContext editingContext, EOCompte eo) {
		return EOCompte.localInstanceIn(editingContext, eo);
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
	  public static EOCompte fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOCompte fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOCompte eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOCompte)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOCompte fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOCompte fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOCompte eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOCompte)eoObjects.objectAtIndex(0);
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
	  public static EOCompte fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOCompte eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOCompte ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOCompte fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
