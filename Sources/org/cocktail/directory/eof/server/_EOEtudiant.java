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

// DO NOT EDIT.  Make changes to EOEtudiant.java instead.
package org.cocktail.directory.eof.server;

import java.util.NoSuchElementException;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;



public abstract class _EOEtudiant extends  DirectoryRecord {
	public static final String ENTITY_NAME = "Etudiant";
	public static final String ENTITY_TABLE_NAME = "ETUDIANT";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "etudNumero";

	public static final String ACAD_CODE_BAC_KEY = "acadCodeBac";
	public static final String BAC_CODE_KEY = "bacCode";
	public static final String C_DEPARTEMENT_ETAB_BAC_KEY = "cDepartementEtabBac";
	public static final String C_DEPARTEMENT_PARENT_KEY = "cDepartementParent";
	public static final String C_PAYS_ETAB_BAC_KEY = "cPaysEtabBac";
	public static final String ETAB_CODE_BAC_KEY = "etabCodeBac";
	public static final String ETAB_CODE_SUP_KEY = "etabCodeSup";
	public static final String ETUD_ANBAC_KEY = "etudAnbac";
	public static final String ETUD_ANNEE1_INSC_SUP_KEY = "etudAnnee1InscSup";
	public static final String ETUD_ANNEE1_INSC_ULR_KEY = "etudAnnee1InscUlr";
	public static final String ETUD_ANNEE1_INSC_UNIV_KEY = "etudAnnee1InscUniv";
	public static final String ETUD_CODE_INE_KEY = "etudCodeIne";
	public static final String ETUD_NUMERO_KEY = "etudNumero";
	public static final String ETUD_REIMMATRICULATION_KEY = "etudReimmatriculation";
	public static final String ETUD_SITFAM_KEY = "etudSitfam";
	public static final String ETUD_SN_ATTESTATION_KEY = "etudSnAttestation";
	public static final String ETUD_SN_CERTIFICATION_KEY = "etudSnCertification";
	public static final String ETUD_SPORT_HN_KEY = "etudSportHn";
	public static final String ETUD_VILLE_BAC_KEY = "etudVilleBac";
	public static final String MENT_CODE_KEY = "mentCode";
	public static final String NO_INDIVIDU_KEY = "noIndividu";
	public static final String PRO_CODE_KEY = "proCode";
	public static final String THEB_CODE_KEY = "thebCode";

// Attributs non visibles

//Colonnes dans la base de donnees
	public static final String ACAD_CODE_BAC_COLKEY = "ACAD_CODE_BAC";
	public static final String BAC_CODE_COLKEY = "BAC_CODE";
	public static final String C_DEPARTEMENT_ETAB_BAC_COLKEY = "C_DEPARTEMENT_ETAB_BAC";
	public static final String C_DEPARTEMENT_PARENT_COLKEY = "C_DEPARTEMENT_PARENT";
	public static final String C_PAYS_ETAB_BAC_COLKEY = "C_PAYS_ETAB_BAC";
	public static final String ETAB_CODE_BAC_COLKEY = "ETAB_CODE_BAC";
	public static final String ETAB_CODE_SUP_COLKEY = "ETAB_CODE_SUP";
	public static final String ETUD_ANBAC_COLKEY = "ETUD_ANBAC";
	public static final String ETUD_ANNEE1_INSC_SUP_COLKEY = "ETUD_ANNEE_1INSC_SUP";
	public static final String ETUD_ANNEE1_INSC_ULR_COLKEY = "ETUD_ANNEE_1INSC_ULR";
	public static final String ETUD_ANNEE1_INSC_UNIV_COLKEY = "ETUD_ANNEE_1INSC_UNIV";
	public static final String ETUD_CODE_INE_COLKEY = "ETUD_CODE_INE";
	public static final String ETUD_NUMERO_COLKEY = "ETUD_NUMERO";
	public static final String ETUD_REIMMATRICULATION_COLKEY = "ETUD_REIMMATRICULATION";
	public static final String ETUD_SITFAM_COLKEY = "ETUD_SITFAM";
	public static final String ETUD_SN_ATTESTATION_COLKEY = "ETUD_SN_ATTESTATION";
	public static final String ETUD_SN_CERTIFICATION_COLKEY = "ETUD_SN_CERTIFICATION";
	public static final String ETUD_SPORT_HN_COLKEY = "ETUD_SPORT_HN";
	public static final String ETUD_VILLE_BAC_COLKEY = "ETUD_VILLE_BAC";
	public static final String MENT_CODE_COLKEY = "MENT_CODE";
	public static final String NO_INDIVIDU_COLKEY = "NO_INDIVIDU";
	public static final String PRO_CODE_COLKEY = "PRO_CODE";
	public static final String THEB_CODE_COLKEY = "THEB_CODE";



	// Relationships



	// Accessors methods
  public String acadCodeBac() {
    return (String) storedValueForKey(ACAD_CODE_BAC_KEY);
  }

  public void setAcadCodeBac(String value) {
    takeStoredValueForKey(value, ACAD_CODE_BAC_KEY);
  }

  public String bacCode() {
    return (String) storedValueForKey(BAC_CODE_KEY);
  }

  public void setBacCode(String value) {
    takeStoredValueForKey(value, BAC_CODE_KEY);
  }

  public String cDepartementEtabBac() {
    return (String) storedValueForKey(C_DEPARTEMENT_ETAB_BAC_KEY);
  }

  public void setCDepartementEtabBac(String value) {
    takeStoredValueForKey(value, C_DEPARTEMENT_ETAB_BAC_KEY);
  }

  public String cDepartementParent() {
    return (String) storedValueForKey(C_DEPARTEMENT_PARENT_KEY);
  }

  public void setCDepartementParent(String value) {
    takeStoredValueForKey(value, C_DEPARTEMENT_PARENT_KEY);
  }

  public String cPaysEtabBac() {
    return (String) storedValueForKey(C_PAYS_ETAB_BAC_KEY);
  }

  public void setCPaysEtabBac(String value) {
    takeStoredValueForKey(value, C_PAYS_ETAB_BAC_KEY);
  }

  public String etabCodeBac() {
    return (String) storedValueForKey(ETAB_CODE_BAC_KEY);
  }

  public void setEtabCodeBac(String value) {
    takeStoredValueForKey(value, ETAB_CODE_BAC_KEY);
  }

  public String etabCodeSup() {
    return (String) storedValueForKey(ETAB_CODE_SUP_KEY);
  }

  public void setEtabCodeSup(String value) {
    takeStoredValueForKey(value, ETAB_CODE_SUP_KEY);
  }

  public Long etudAnbac() {
    return (Long) storedValueForKey(ETUD_ANBAC_KEY);
  }

  public void setEtudAnbac(Long value) {
    takeStoredValueForKey(value, ETUD_ANBAC_KEY);
  }

  public Long etudAnnee1InscSup() {
    return (Long) storedValueForKey(ETUD_ANNEE1_INSC_SUP_KEY);
  }

  public void setEtudAnnee1InscSup(Long value) {
    takeStoredValueForKey(value, ETUD_ANNEE1_INSC_SUP_KEY);
  }

  public Long etudAnnee1InscUlr() {
    return (Long) storedValueForKey(ETUD_ANNEE1_INSC_ULR_KEY);
  }

  public void setEtudAnnee1InscUlr(Long value) {
    takeStoredValueForKey(value, ETUD_ANNEE1_INSC_ULR_KEY);
  }

  public Long etudAnnee1InscUniv() {
    return (Long) storedValueForKey(ETUD_ANNEE1_INSC_UNIV_KEY);
  }

  public void setEtudAnnee1InscUniv(Long value) {
    takeStoredValueForKey(value, ETUD_ANNEE1_INSC_UNIV_KEY);
  }

  public String etudCodeIne() {
    return (String) storedValueForKey(ETUD_CODE_INE_KEY);
  }

  public void setEtudCodeIne(String value) {
    takeStoredValueForKey(value, ETUD_CODE_INE_KEY);
  }

  public Double etudNumero() {
    return (Double) storedValueForKey(ETUD_NUMERO_KEY);
  }

  public void setEtudNumero(Double value) {
    takeStoredValueForKey(value, ETUD_NUMERO_KEY);
  }

  public String etudReimmatriculation() {
    return (String) storedValueForKey(ETUD_REIMMATRICULATION_KEY);
  }

  public void setEtudReimmatriculation(String value) {
    takeStoredValueForKey(value, ETUD_REIMMATRICULATION_KEY);
  }

  public Long etudSitfam() {
    return (Long) storedValueForKey(ETUD_SITFAM_KEY);
  }

  public void setEtudSitfam(Long value) {
    takeStoredValueForKey(value, ETUD_SITFAM_KEY);
  }

  public Long etudSnAttestation() {
    return (Long) storedValueForKey(ETUD_SN_ATTESTATION_KEY);
  }

  public void setEtudSnAttestation(Long value) {
    takeStoredValueForKey(value, ETUD_SN_ATTESTATION_KEY);
  }

  public Long etudSnCertification() {
    return (Long) storedValueForKey(ETUD_SN_CERTIFICATION_KEY);
  }

  public void setEtudSnCertification(Long value) {
    takeStoredValueForKey(value, ETUD_SN_CERTIFICATION_KEY);
  }

  public Long etudSportHn() {
    return (Long) storedValueForKey(ETUD_SPORT_HN_KEY);
  }

  public void setEtudSportHn(Long value) {
    takeStoredValueForKey(value, ETUD_SPORT_HN_KEY);
  }

  public String etudVilleBac() {
    return (String) storedValueForKey(ETUD_VILLE_BAC_KEY);
  }

  public void setEtudVilleBac(String value) {
    takeStoredValueForKey(value, ETUD_VILLE_BAC_KEY);
  }

  public String mentCode() {
    return (String) storedValueForKey(MENT_CODE_KEY);
  }

  public void setMentCode(String value) {
    takeStoredValueForKey(value, MENT_CODE_KEY);
  }

  public Integer noIndividu() {
    return (Integer) storedValueForKey(NO_INDIVIDU_KEY);
  }

  public void setNoIndividu(Integer value) {
    takeStoredValueForKey(value, NO_INDIVIDU_KEY);
  }

  public String proCode() {
    return (String) storedValueForKey(PRO_CODE_KEY);
  }

  public void setProCode(String value) {
    takeStoredValueForKey(value, PRO_CODE_KEY);
  }

  public String thebCode() {
    return (String) storedValueForKey(THEB_CODE_KEY);
  }

  public void setThebCode(String value) {
    takeStoredValueForKey(value, THEB_CODE_KEY);
  }


/**
 * Créer une instance de EOEtudiant avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOEtudiant createEOEtudiant(EOEditingContext editingContext, String bacCode
, Double etudNumero
, Long etudSitfam
, Long etudSportHn
, String proCode
			) {
    EOEtudiant eo = (EOEtudiant) createAndInsertInstance(editingContext, _EOEtudiant.ENTITY_NAME);    
		eo.setBacCode(bacCode);
		eo.setEtudNumero(etudNumero);
		eo.setEtudSitfam(etudSitfam);
		eo.setEtudSportHn(etudSportHn);
		eo.setProCode(proCode);
    return eo;
  }

  
	  public EOEtudiant localInstanceIn(EOEditingContext editingContext) {
	  		return (EOEtudiant)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOEtudiant creerInstance(EOEditingContext editingContext) {
	  		EOEtudiant object = (EOEtudiant)createAndInsertInstance(editingContext, _EOEtudiant.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOEtudiant localInstanceIn(EOEditingContext editingContext, EOEtudiant eo) {
    EOEtudiant localInstance = (eo == null) ? null : (EOEtudiant)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOEtudiant#localInstanceIn a la place.
   */
	public static EOEtudiant localInstanceOf(EOEditingContext editingContext, EOEtudiant eo) {
		return EOEtudiant.localInstanceIn(editingContext, eo);
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
	  public static EOEtudiant fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOEtudiant fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOEtudiant eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOEtudiant)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOEtudiant fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOEtudiant fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOEtudiant eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOEtudiant)eoObjects.objectAtIndex(0);
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
	  public static EOEtudiant fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOEtudiant eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOEtudiant ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOEtudiant fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
