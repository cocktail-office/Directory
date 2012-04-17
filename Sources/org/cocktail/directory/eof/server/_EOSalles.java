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

// DO NOT EDIT.  Make changes to EOSalles.java instead.
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



public abstract class _EOSalles extends  DirectoryRecord {
	public static final String ENTITY_NAME = "Salles";
	public static final String ENTITY_TABLE_NAME = "SALLES";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "salNumero";

	public static final String C_LOCAL_KEY = "cLocal";
	public static final String D_CREATION_KEY = "dCreation";
	public static final String D_MODIFICATION_KEY = "dModification";
	public static final String SAL_CAPACITE_KEY = "salCapacite";
	public static final String SAL_CAPA_EXAM_KEY = "salCapaExam";
	public static final String SAL_DESCRIPTIF_KEY = "salDescriptif";
	public static final String SAL_ECRAN_KEY = "salEcran";
	public static final String SAL_ETAGE_KEY = "salEtage";
	public static final String SAL_IDENT_ACCES_KEY = "salIdentAcces";
	public static final String SAL_INSONORISEE_KEY = "salInsonorisee";
	public static final String SAL_NATURE_KEY = "salNature";
	public static final String SAL_NB_ARMOIRES_KEY = "salNbArmoires";
	public static final String SAL_NB_BUREAUX_KEY = "salNbBureaux";
	public static final String SAL_NB_CHAISES_KEY = "salNbChaises";
	public static final String SAL_NB_FENETRES_KEY = "salNbFenetres";
	public static final String SAL_NB_PLACES_EXAM_LIB_KEY = "salNbPlacesExamLib";
	public static final String SAL_NB_TABLES_KEY = "salNbTables";
	public static final String SAL_NO_POSTE_KEY = "salNoPoste";
	public static final String SAL_NUM_DEPART_KEY = "salNumDepart";
	public static final String SAL_OBSCUR_KEY = "salObscur";
	public static final String SAL_PAS_NUM_KEY = "salPasNum";
	public static final String SAL_PORTE_KEY = "salPorte";
	public static final String SAL_POUR_ADMINISTRATION_KEY = "salPourAdministration";
	public static final String SAL_POUR_DOCUMENTATION_KEY = "salPourDocumentation";
	public static final String SAL_POUR_ENSEIGNEMENT_KEY = "salPourEnseignement";
	public static final String SAL_POUR_RECHERCHE_KEY = "salPourRecherche";
	public static final String SAL_POUR_TECHNIQUE_KEY = "salPourTechnique";
	public static final String SAL_RESERVABLE_KEY = "salReservable";
	public static final String SAL_RETRO_KEY = "salRetro";
	public static final String SAL_SALLE_PROCHE_TEL_KEY = "salSalleProcheTel";
	public static final String SAL_SUPERFICIE_KEY = "salSuperficie";
	public static final String SAL_TABLEAU_KEY = "salTableau";
	public static final String SAL_TABLEAU_BLANC_KEY = "salTableauBlanc";
	public static final String SAL_TABLEAU_PAPIER_KEY = "salTableauPapier";
	public static final String SAL_TELEVISION_KEY = "salTelevision";
	public static final String SAL_TEM_EN_SERVICE_KEY = "salTemEnService";
	public static final String SAL_TEM_HANDICAP_KEY = "salTemHandicap";
	public static final String TSAL_NUMERO_KEY = "tsalNumero";

// Attributs non visibles
	public static final String SAL_NUMERO_KEY = "salNumero";

//Colonnes dans la base de donnees
	public static final String C_LOCAL_COLKEY = "C_LOCAL";
	public static final String D_CREATION_COLKEY = "D_CREATION";
	public static final String D_MODIFICATION_COLKEY = "D_MODIFICATION";
	public static final String SAL_CAPACITE_COLKEY = "SAL_CAPACITE";
	public static final String SAL_CAPA_EXAM_COLKEY = "SAL_CAPA_EXAM";
	public static final String SAL_DESCRIPTIF_COLKEY = "SAL_DESCRIPTIF";
	public static final String SAL_ECRAN_COLKEY = "SAL_ECRAN";
	public static final String SAL_ETAGE_COLKEY = "SAL_ETAGE";
	public static final String SAL_IDENT_ACCES_COLKEY = "SAL_IDENT_ACCES";
	public static final String SAL_INSONORISEE_COLKEY = "SAL_INSONORISEE";
	public static final String SAL_NATURE_COLKEY = "SAL_NATURE";
	public static final String SAL_NB_ARMOIRES_COLKEY = "SAL_NB_ARMOIRES";
	public static final String SAL_NB_BUREAUX_COLKEY = "SAL_NB_BUREAUX";
	public static final String SAL_NB_CHAISES_COLKEY = "SAL_NB_CHAISES";
	public static final String SAL_NB_FENETRES_COLKEY = "SAL_NB_FENETRES";
	public static final String SAL_NB_PLACES_EXAM_LIB_COLKEY = "SAL_NB_PLACES_EXAM_LIB";
	public static final String SAL_NB_TABLES_COLKEY = "SAL_NB_TABLES";
	public static final String SAL_NO_POSTE_COLKEY = "SAL_NO_POSTE";
	public static final String SAL_NUM_DEPART_COLKEY = "SAL_NUM_DEPART";
	public static final String SAL_OBSCUR_COLKEY = "SAL_OBSCUR";
	public static final String SAL_PAS_NUM_COLKEY = "SAL_PAS_NUM";
	public static final String SAL_PORTE_COLKEY = "SAL_PORTE";
	public static final String SAL_POUR_ADMINISTRATION_COLKEY = "SAL_POUR_ADMINISTRATION";
	public static final String SAL_POUR_DOCUMENTATION_COLKEY = "SAL_POUR_DOCUMENTATION";
	public static final String SAL_POUR_ENSEIGNEMENT_COLKEY = "SAL_POUR_ENSEIGNEMENT";
	public static final String SAL_POUR_RECHERCHE_COLKEY = "SAL_POUR_RECHERCHE";
	public static final String SAL_POUR_TECHNIQUE_COLKEY = "SAL_POUR_TECHNIQUE";
	public static final String SAL_RESERVABLE_COLKEY = "SAL_RESERVABLE";
	public static final String SAL_RETRO_COLKEY = "SAL_RETRO";
	public static final String SAL_SALLE_PROCHE_TEL_COLKEY = "SAL_SALLE_PROCHE_TEL";
	public static final String SAL_SUPERFICIE_COLKEY = "SAL_SUPERFICIE";
	public static final String SAL_TABLEAU_COLKEY = "SAL_TABLEAU";
	public static final String SAL_TABLEAU_BLANC_COLKEY = "SAL_TABLEAU_BLANC";
	public static final String SAL_TABLEAU_PAPIER_COLKEY = "SAL_TABLEAU_PAPIER";
	public static final String SAL_TELEVISION_COLKEY = "SAL_TELEVISION";
	public static final String SAL_TEM_EN_SERVICE_COLKEY = "SAL_TEM_EN_SERVICE";
	public static final String SAL_TEM_HANDICAP_COLKEY = "SAL_TEM_HANDICAP";
	public static final String TSAL_NUMERO_COLKEY = "TSAL_NUMERO";

	public static final String SAL_NUMERO_COLKEY = "SAL_NUMERO";


	// Relationships
	public static final String LOCAL_KEY = "local";
	public static final String REPART_BUREAUX_KEY = "repartBureaux";



	// Accessors methods
  public String cLocal() {
    return (String) storedValueForKey(C_LOCAL_KEY);
  }

  public void setCLocal(String value) {
    takeStoredValueForKey(value, C_LOCAL_KEY);
  }

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

  public Double salCapacite() {
    return (Double) storedValueForKey(SAL_CAPACITE_KEY);
  }

  public void setSalCapacite(Double value) {
    takeStoredValueForKey(value, SAL_CAPACITE_KEY);
  }

  public Double salCapaExam() {
    return (Double) storedValueForKey(SAL_CAPA_EXAM_KEY);
  }

  public void setSalCapaExam(Double value) {
    takeStoredValueForKey(value, SAL_CAPA_EXAM_KEY);
  }

  public String salDescriptif() {
    return (String) storedValueForKey(SAL_DESCRIPTIF_KEY);
  }

  public void setSalDescriptif(String value) {
    takeStoredValueForKey(value, SAL_DESCRIPTIF_KEY);
  }

  public String salEcran() {
    return (String) storedValueForKey(SAL_ECRAN_KEY);
  }

  public void setSalEcran(String value) {
    takeStoredValueForKey(value, SAL_ECRAN_KEY);
  }

  public String salEtage() {
    return (String) storedValueForKey(SAL_ETAGE_KEY);
  }

  public void setSalEtage(String value) {
    takeStoredValueForKey(value, SAL_ETAGE_KEY);
  }

  public String salIdentAcces() {
    return (String) storedValueForKey(SAL_IDENT_ACCES_KEY);
  }

  public void setSalIdentAcces(String value) {
    takeStoredValueForKey(value, SAL_IDENT_ACCES_KEY);
  }

  public String salInsonorisee() {
    return (String) storedValueForKey(SAL_INSONORISEE_KEY);
  }

  public void setSalInsonorisee(String value) {
    takeStoredValueForKey(value, SAL_INSONORISEE_KEY);
  }

  public String salNature() {
    return (String) storedValueForKey(SAL_NATURE_KEY);
  }

  public void setSalNature(String value) {
    takeStoredValueForKey(value, SAL_NATURE_KEY);
  }

  public Double salNbArmoires() {
    return (Double) storedValueForKey(SAL_NB_ARMOIRES_KEY);
  }

  public void setSalNbArmoires(Double value) {
    takeStoredValueForKey(value, SAL_NB_ARMOIRES_KEY);
  }

  public Double salNbBureaux() {
    return (Double) storedValueForKey(SAL_NB_BUREAUX_KEY);
  }

  public void setSalNbBureaux(Double value) {
    takeStoredValueForKey(value, SAL_NB_BUREAUX_KEY);
  }

  public Double salNbChaises() {
    return (Double) storedValueForKey(SAL_NB_CHAISES_KEY);
  }

  public void setSalNbChaises(Double value) {
    takeStoredValueForKey(value, SAL_NB_CHAISES_KEY);
  }

  public Double salNbFenetres() {
    return (Double) storedValueForKey(SAL_NB_FENETRES_KEY);
  }

  public void setSalNbFenetres(Double value) {
    takeStoredValueForKey(value, SAL_NB_FENETRES_KEY);
  }

  public Double salNbPlacesExamLib() {
    return (Double) storedValueForKey(SAL_NB_PLACES_EXAM_LIB_KEY);
  }

  public void setSalNbPlacesExamLib(Double value) {
    takeStoredValueForKey(value, SAL_NB_PLACES_EXAM_LIB_KEY);
  }

  public Double salNbTables() {
    return (Double) storedValueForKey(SAL_NB_TABLES_KEY);
  }

  public void setSalNbTables(Double value) {
    takeStoredValueForKey(value, SAL_NB_TABLES_KEY);
  }

  public String salNoPoste() {
    return (String) storedValueForKey(SAL_NO_POSTE_KEY);
  }

  public void setSalNoPoste(String value) {
    takeStoredValueForKey(value, SAL_NO_POSTE_KEY);
  }

  public Double salNumDepart() {
    return (Double) storedValueForKey(SAL_NUM_DEPART_KEY);
  }

  public void setSalNumDepart(Double value) {
    takeStoredValueForKey(value, SAL_NUM_DEPART_KEY);
  }

  public String salObscur() {
    return (String) storedValueForKey(SAL_OBSCUR_KEY);
  }

  public void setSalObscur(String value) {
    takeStoredValueForKey(value, SAL_OBSCUR_KEY);
  }

  public Long salPasNum() {
    return (Long) storedValueForKey(SAL_PAS_NUM_KEY);
  }

  public void setSalPasNum(Long value) {
    takeStoredValueForKey(value, SAL_PAS_NUM_KEY);
  }

  public String salPorte() {
    return (String) storedValueForKey(SAL_PORTE_KEY);
  }

  public void setSalPorte(String value) {
    takeStoredValueForKey(value, SAL_PORTE_KEY);
  }

  public java.math.BigDecimal salPourAdministration() {
    return (java.math.BigDecimal) storedValueForKey(SAL_POUR_ADMINISTRATION_KEY);
  }

  public void setSalPourAdministration(java.math.BigDecimal value) {
    takeStoredValueForKey(value, SAL_POUR_ADMINISTRATION_KEY);
  }

  public java.math.BigDecimal salPourDocumentation() {
    return (java.math.BigDecimal) storedValueForKey(SAL_POUR_DOCUMENTATION_KEY);
  }

  public void setSalPourDocumentation(java.math.BigDecimal value) {
    takeStoredValueForKey(value, SAL_POUR_DOCUMENTATION_KEY);
  }

  public java.math.BigDecimal salPourEnseignement() {
    return (java.math.BigDecimal) storedValueForKey(SAL_POUR_ENSEIGNEMENT_KEY);
  }

  public void setSalPourEnseignement(java.math.BigDecimal value) {
    takeStoredValueForKey(value, SAL_POUR_ENSEIGNEMENT_KEY);
  }

  public java.math.BigDecimal salPourRecherche() {
    return (java.math.BigDecimal) storedValueForKey(SAL_POUR_RECHERCHE_KEY);
  }

  public void setSalPourRecherche(java.math.BigDecimal value) {
    takeStoredValueForKey(value, SAL_POUR_RECHERCHE_KEY);
  }

  public java.math.BigDecimal salPourTechnique() {
    return (java.math.BigDecimal) storedValueForKey(SAL_POUR_TECHNIQUE_KEY);
  }

  public void setSalPourTechnique(java.math.BigDecimal value) {
    takeStoredValueForKey(value, SAL_POUR_TECHNIQUE_KEY);
  }

  public String salReservable() {
    return (String) storedValueForKey(SAL_RESERVABLE_KEY);
  }

  public void setSalReservable(String value) {
    takeStoredValueForKey(value, SAL_RESERVABLE_KEY);
  }

  public String salRetro() {
    return (String) storedValueForKey(SAL_RETRO_KEY);
  }

  public void setSalRetro(String value) {
    takeStoredValueForKey(value, SAL_RETRO_KEY);
  }

  public Double salSalleProcheTel() {
    return (Double) storedValueForKey(SAL_SALLE_PROCHE_TEL_KEY);
  }

  public void setSalSalleProcheTel(Double value) {
    takeStoredValueForKey(value, SAL_SALLE_PROCHE_TEL_KEY);
  }

  public java.math.BigDecimal salSuperficie() {
    return (java.math.BigDecimal) storedValueForKey(SAL_SUPERFICIE_KEY);
  }

  public void setSalSuperficie(java.math.BigDecimal value) {
    takeStoredValueForKey(value, SAL_SUPERFICIE_KEY);
  }

  public String salTableau() {
    return (String) storedValueForKey(SAL_TABLEAU_KEY);
  }

  public void setSalTableau(String value) {
    takeStoredValueForKey(value, SAL_TABLEAU_KEY);
  }

  public String salTableauBlanc() {
    return (String) storedValueForKey(SAL_TABLEAU_BLANC_KEY);
  }

  public void setSalTableauBlanc(String value) {
    takeStoredValueForKey(value, SAL_TABLEAU_BLANC_KEY);
  }

  public String salTableauPapier() {
    return (String) storedValueForKey(SAL_TABLEAU_PAPIER_KEY);
  }

  public void setSalTableauPapier(String value) {
    takeStoredValueForKey(value, SAL_TABLEAU_PAPIER_KEY);
  }

  public String salTelevision() {
    return (String) storedValueForKey(SAL_TELEVISION_KEY);
  }

  public void setSalTelevision(String value) {
    takeStoredValueForKey(value, SAL_TELEVISION_KEY);
  }

  public String salTemEnService() {
    return (String) storedValueForKey(SAL_TEM_EN_SERVICE_KEY);
  }

  public void setSalTemEnService(String value) {
    takeStoredValueForKey(value, SAL_TEM_EN_SERVICE_KEY);
  }

  public String salTemHandicap() {
    return (String) storedValueForKey(SAL_TEM_HANDICAP_KEY);
  }

  public void setSalTemHandicap(String value) {
    takeStoredValueForKey(value, SAL_TEM_HANDICAP_KEY);
  }

  public Double tsalNumero() {
    return (Double) storedValueForKey(TSAL_NUMERO_KEY);
  }

  public void setTsalNumero(Double value) {
    takeStoredValueForKey(value, TSAL_NUMERO_KEY);
  }

  public org.cocktail.directory.eof.server.EOLocal local() {
    return (org.cocktail.directory.eof.server.EOLocal)storedValueForKey(LOCAL_KEY);
  }
  
	public void setLocal(org.cocktail.directory.eof.server.EOLocal value) {
		takeStoredValueForKey(value,LOCAL_KEY);
	}


  public void setLocalRelationship(org.cocktail.directory.eof.server.EOLocal value) {
    if (value == null) {
    	org.cocktail.directory.eof.server.EOLocal oldValue = local();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, LOCAL_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, LOCAL_KEY);
    }
  }
  
  public NSArray repartBureaux() {
    return (NSArray)storedValueForKey(REPART_BUREAUX_KEY);
  }
  
  //ICI
  public void setRepartBureaux(NSArray values) {
	  takeStoredValueForKey(values,REPART_BUREAUX_KEY);
  }
  

  public NSArray repartBureaux(EOQualifier qualifier) {
    return repartBureaux(qualifier, null, false);
  }

  public NSArray repartBureaux(EOQualifier qualifier, boolean fetch) {
    return repartBureaux(qualifier, null, fetch);
  }

  public NSArray repartBureaux(EOQualifier qualifier, NSArray sortOrderings, boolean fetch) {
    NSArray results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.directory.eof.server.EORepartBureau.SALLE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.directory.eof.server.EORepartBureau.fetchAll(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = repartBureaux();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToRepartBureauxRelationship(org.cocktail.directory.eof.server.EORepartBureau object) {
    addObjectToBothSidesOfRelationshipWithKey(object, REPART_BUREAUX_KEY);
  }

  public void removeFromRepartBureauxRelationship(org.cocktail.directory.eof.server.EORepartBureau object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_BUREAUX_KEY);
  }

  public org.cocktail.directory.eof.server.EORepartBureau createRepartBureauxRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RepartBureau");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, REPART_BUREAUX_KEY);
    return (org.cocktail.directory.eof.server.EORepartBureau) eo;
  }

  public void deleteRepartBureauxRelationship(org.cocktail.directory.eof.server.EORepartBureau object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_BUREAUX_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartBureauxRelationships() {
    Enumeration objects = repartBureaux().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartBureauxRelationship((org.cocktail.directory.eof.server.EORepartBureau)objects.nextElement());
    }
  }


/**
 * Créer une instance de EOSalles avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOSalles createEOSalles(EOEditingContext editingContext, NSTimestamp dCreation
, NSTimestamp dModification
, String salEtage
, String salPorte
			) {
    EOSalles eo = (EOSalles) createAndInsertInstance(editingContext, _EOSalles.ENTITY_NAME);    
		eo.setDCreation(dCreation);
		eo.setDModification(dModification);
		eo.setSalEtage(salEtage);
		eo.setSalPorte(salPorte);
    return eo;
  }

  
	  public EOSalles localInstanceIn(EOEditingContext editingContext) {
	  		return (EOSalles)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOSalles creerInstance(EOEditingContext editingContext) {
	  		EOSalles object = (EOSalles)createAndInsertInstance(editingContext, _EOSalles.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOSalles localInstanceIn(EOEditingContext editingContext, EOSalles eo) {
    EOSalles localInstance = (eo == null) ? null : (EOSalles)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOSalles#localInstanceIn a la place.
   */
	public static EOSalles localInstanceOf(EOEditingContext editingContext, EOSalles eo) {
		return EOSalles.localInstanceIn(editingContext, eo);
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
	  public static EOSalles fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOSalles fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOSalles eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOSalles)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOSalles fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOSalles fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOSalles eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOSalles)eoObjects.objectAtIndex(0);
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
	  public static EOSalles fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOSalles eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOSalles ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOSalles fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
