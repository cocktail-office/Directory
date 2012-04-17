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

// DO NOT EDIT.  Make changes to EOVlans.java instead.
package org.cocktail.directory.eof.server;

import java.util.NoSuchElementException;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSTimestamp;



public abstract class _EOVlans extends  DirectoryRecord {
	public static final String ENTITY_NAME = "Vlans";
	public static final String ENTITY_TABLE_NAME = "VLANS";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "cVlan";

	public static final String D_CREATION_KEY = "dCreation";
	public static final String D_MODIFICATION_KEY = "dModification";
	public static final String DOMAINE_KEY = "domaine";
	public static final String LISTE_IP_KEY = "listeIp";
	public static final String LL_VLAN_KEY = "llVlan";
	public static final String PRIORITE_KEY = "priorite";
	public static final String PRISE_COMPTE_KEY = "priseCompte";
	public static final String TCRY_ORDRE_KEY = "tcryOrdre";
	public static final String TVPN_CODE_KEY = "tvpnCode";

// Attributs non visibles
	public static final String C_VLAN_KEY = "cVlan";

//Colonnes dans la base de donnees
	public static final String D_CREATION_COLKEY = "D_CREATION";
	public static final String D_MODIFICATION_COLKEY = "D_MODIFICATION";
	public static final String DOMAINE_COLKEY = "DOMAINE";
	public static final String LISTE_IP_COLKEY = "LISTE_IP";
	public static final String LL_VLAN_COLKEY = "LL_VLAN";
	public static final String PRIORITE_COLKEY = "PRIORITE";
	public static final String PRISE_COMPTE_COLKEY = "PRISE_COMPTE";
	public static final String TCRY_ORDRE_COLKEY = "TCRY_ORDRE";
	public static final String TVPN_CODE_COLKEY = "TVPN_CODE";

	public static final String C_VLAN_COLKEY = "C_VLAN";


	// Relationships



	// Accessors methods
  public NSTimestamp dCreation() {
    return (NSTimestamp) storedValueForKey(D_CREATION_KEY);
  }

  public void setDCreation(NSTimestamp value) {
    takeStoredValueForKey(value, D_CREATION_KEY);
  }

  public NSTimestamp dModification() {
    return (NSTimestamp) storedValueForKey(D_MODIFICATION_KEY);
  }

  public void setDModification(NSTimestamp value) {
    takeStoredValueForKey(value, D_MODIFICATION_KEY);
  }

  public String domaine() {
    return (String) storedValueForKey(DOMAINE_KEY);
  }

  public void setDomaine(String value) {
    takeStoredValueForKey(value, DOMAINE_KEY);
  }

  public String listeIp() {
    return (String) storedValueForKey(LISTE_IP_KEY);
  }

  public void setListeIp(String value) {
    takeStoredValueForKey(value, LISTE_IP_KEY);
  }

  public String llVlan() {
    return (String) storedValueForKey(LL_VLAN_KEY);
  }

  public void setLlVlan(String value) {
    takeStoredValueForKey(value, LL_VLAN_KEY);
  }

  public Double priorite() {
    return (Double) storedValueForKey(PRIORITE_KEY);
  }

  public void setPriorite(Double value) {
    takeStoredValueForKey(value, PRIORITE_KEY);
  }

  public String priseCompte() {
    return (String) storedValueForKey(PRISE_COMPTE_KEY);
  }

  public void setPriseCompte(String value) {
    takeStoredValueForKey(value, PRISE_COMPTE_KEY);
  }

  public Long tcryOrdre() {
    return (Long) storedValueForKey(TCRY_ORDRE_KEY);
  }

  public void setTcryOrdre(Long value) {
    takeStoredValueForKey(value, TCRY_ORDRE_KEY);
  }

  public String tvpnCode() {
    return (String) storedValueForKey(TVPN_CODE_KEY);
  }

  public void setTvpnCode(String value) {
    takeStoredValueForKey(value, TVPN_CODE_KEY);
  }


/**
 * Créer une instance de EOVlans avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOVlans createEOVlans(EOEditingContext editingContext, NSTimestamp dCreation
, NSTimestamp dModification
			) {
    EOVlans eo = (EOVlans) createAndInsertInstance(editingContext, _EOVlans.ENTITY_NAME);    
		eo.setDCreation(dCreation);
		eo.setDModification(dModification);
    return eo;
  }

  
	  public EOVlans localInstanceIn(EOEditingContext editingContext) {
	  		return (EOVlans)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOVlans creerInstance(EOEditingContext editingContext) {
	  		EOVlans object = (EOVlans)createAndInsertInstance(editingContext, _EOVlans.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOVlans localInstanceIn(EOEditingContext editingContext, EOVlans eo) {
    EOVlans localInstance = (eo == null) ? null : (EOVlans)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOVlans#localInstanceIn a la place.
   */
	public static EOVlans localInstanceOf(EOEditingContext editingContext, EOVlans eo) {
		return EOVlans.localInstanceIn(editingContext, eo);
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
	  public static EOVlans fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOVlans fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOVlans eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOVlans)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOVlans fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOVlans fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOVlans eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOVlans)eoObjects.objectAtIndex(0);
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
	  public static EOVlans fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOVlans eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOVlans ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOVlans fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
