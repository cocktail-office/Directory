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

// DO NOT EDIT.  Make changes to EOAccordsAvenant.java instead.
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



public abstract class _EOAccordsAvenant extends  DirectoryRecord {
	public static final String ENTITY_NAME = "AccordsAvenant";
	public static final String ENTITY_TABLE_NAME = "ACCORDS.AVENANT";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "avtOrdre";

	public static final String AVT_CR_GEST_KEY = "avtCrGest";
	public static final String AVT_DATE_CREATION_KEY = "avtDateCreation";
	public static final String AVT_DATE_DEB_KEY = "avtDateDeb";
	public static final String AVT_DATE_DEB_EXEC_KEY = "avtDateDebExec";
	public static final String AVT_DATE_FIN_KEY = "avtDateFin";
	public static final String AVT_DATE_FIN_EXEC_KEY = "avtDateFinExec";
	public static final String AVT_DATE_MODIF_KEY = "avtDateModif";
	public static final String AVT_DATE_SIGNATURE_KEY = "avtDateSignature";
	public static final String AVT_DATE_VALID_ADM_KEY = "avtDateValidAdm";
	public static final String AVT_DEP_ANTERIEURE_KEY = "avtDepAnterieure";
	public static final String AVT_INDEX_KEY = "avtIndex";
	public static final String AVT_LUCRATIVITE_KEY = "avtLucrativite";
	public static final String AVT_MNT_RELIQUAT_KEY = "avtMntReliquat";
	public static final String AVT_MODE_GEST_KEY = "avtModeGest";
	public static final String AVT_MONNAIE_KEY = "avtMonnaie";
	public static final String AVT_MONTANT_HT_KEY = "avtMontantHt";
	public static final String AVT_MONTANT_TTC_KEY = "avtMontantTtc";
	public static final String AVT_OBJET_KEY = "avtObjet";
	public static final String AVT_OBJET_COURT_KEY = "avtObjetCourt";
	public static final String AVT_OBSERVATIONS_KEY = "avtObservations";
	public static final String AVT_ORDRE_KEY = "avtOrdre";
	public static final String AVT_PCT_AVANCE_KEY = "avtPctAvance";
	public static final String AVT_REC_ANTERIEURE_KEY = "avtRecAnterieure";
	public static final String AVT_RECUP_TVA_KEY = "avtRecupTva";
	public static final String AVT_REF_EXTERNE_KEY = "avtRefExterne";
	public static final String AVT_STAT_RELIQUAT_KEY = "avtStatReliquat";
	public static final String AVT_SUPPR_KEY = "avtSuppr";
	public static final String CON_ORDRE_KEY = "conOrdre";
	public static final String DISC_ORDRE_KEY = "discOrdre";
	public static final String TA_ORDRE_KEY = "taOrdre";
	public static final String UTL_ORDRE_CREATION_KEY = "utlOrdreCreation";
	public static final String UTL_ORDRE_MODIF_KEY = "utlOrdreModif";
	public static final String UTL_ORDRE_VALID_ADM_KEY = "utlOrdreValidAdm";

// Attributs non visibles

//Colonnes dans la base de donnees
	public static final String AVT_CR_GEST_COLKEY = "AVT_CR_GEST";
	public static final String AVT_DATE_CREATION_COLKEY = "AVT_DATE_CREATION";
	public static final String AVT_DATE_DEB_COLKEY = "AVT_DATE_DEB";
	public static final String AVT_DATE_DEB_EXEC_COLKEY = "AVT_DATE_DEB_EXEC";
	public static final String AVT_DATE_FIN_COLKEY = "AVT_DATE_FIN";
	public static final String AVT_DATE_FIN_EXEC_COLKEY = "AVT_DATE_FIN_EXEC";
	public static final String AVT_DATE_MODIF_COLKEY = "AVT_DATE_MODIF";
	public static final String AVT_DATE_SIGNATURE_COLKEY = "AVT_DATE_SIGNATURE";
	public static final String AVT_DATE_VALID_ADM_COLKEY = "AVT_DATE_VALID_ADM";
	public static final String AVT_DEP_ANTERIEURE_COLKEY = "AVT_DEP_ANTERIEURE";
	public static final String AVT_INDEX_COLKEY = "AVT_INDEX";
	public static final String AVT_LUCRATIVITE_COLKEY = "AVT_LUCRATIVITE";
	public static final String AVT_MNT_RELIQUAT_COLKEY = "AVT_MNT_RELIQUAT";
	public static final String AVT_MODE_GEST_COLKEY = "AVT_MODE_GEST";
	public static final String AVT_MONNAIE_COLKEY = "AVT_MONNAIE";
	public static final String AVT_MONTANT_HT_COLKEY = "AVT_MONTANT_HT";
	public static final String AVT_MONTANT_TTC_COLKEY = "AVT_MONTANT_TTC";
	public static final String AVT_OBJET_COLKEY = "AVT_OBJET";
	public static final String AVT_OBJET_COURT_COLKEY = "AVT_OBJET_COURT";
	public static final String AVT_OBSERVATIONS_COLKEY = "AVT_OBSERVATIONS";
	public static final String AVT_ORDRE_COLKEY = "AVT_ORDRE";
	public static final String AVT_PCT_AVANCE_COLKEY = "AVT_PCT_AVANCE";
	public static final String AVT_REC_ANTERIEURE_COLKEY = "AVT_REC_ANTERIEURE";
	public static final String AVT_RECUP_TVA_COLKEY = "AVT_RECUP_TVA";
	public static final String AVT_REF_EXTERNE_COLKEY = "AVT_REF_EXTERNE";
	public static final String AVT_STAT_RELIQUAT_COLKEY = "AVT_STAT_RELIQUAT";
	public static final String AVT_SUPPR_COLKEY = "AVT_SUPPR";
	public static final String CON_ORDRE_COLKEY = "CON_ORDRE";
	public static final String DISC_ORDRE_COLKEY = "DISC_ORDRE";
	public static final String TA_ORDRE_COLKEY = "TA_ORDRE";
	public static final String UTL_ORDRE_CREATION_COLKEY = "UTL_ORDRE_CREATION";
	public static final String UTL_ORDRE_MODIF_COLKEY = "UTL_ORDRE_MODIF";
	public static final String UTL_ORDRE_VALID_ADM_COLKEY = "UTL_ORDRE_VALID_ADM";



	// Relationships
	public static final String PARTENAIRES_KEY = "partenaires";



	// Accessors methods
  public Double avtCrGest() {
    return (Double) storedValueForKey(AVT_CR_GEST_KEY);
  }

  public void setAvtCrGest(Double value) {
    takeStoredValueForKey(value, AVT_CR_GEST_KEY);
  }

  public NSTimestamp avtDateCreation() {
    return (NSTimestamp) storedValueForKey(AVT_DATE_CREATION_KEY);
  }

  public void setAvtDateCreation(NSTimestamp value) {
    takeStoredValueForKey(value, AVT_DATE_CREATION_KEY);
  }

  public NSTimestamp avtDateDeb() {
    return (NSTimestamp) storedValueForKey(AVT_DATE_DEB_KEY);
  }

  public void setAvtDateDeb(NSTimestamp value) {
    takeStoredValueForKey(value, AVT_DATE_DEB_KEY);
  }

  public NSTimestamp avtDateDebExec() {
    return (NSTimestamp) storedValueForKey(AVT_DATE_DEB_EXEC_KEY);
  }

  public void setAvtDateDebExec(NSTimestamp value) {
    takeStoredValueForKey(value, AVT_DATE_DEB_EXEC_KEY);
  }

  public NSTimestamp avtDateFin() {
    return (NSTimestamp) storedValueForKey(AVT_DATE_FIN_KEY);
  }

  public void setAvtDateFin(NSTimestamp value) {
    takeStoredValueForKey(value, AVT_DATE_FIN_KEY);
  }

  public NSTimestamp avtDateFinExec() {
    return (NSTimestamp) storedValueForKey(AVT_DATE_FIN_EXEC_KEY);
  }

  public void setAvtDateFinExec(NSTimestamp value) {
    takeStoredValueForKey(value, AVT_DATE_FIN_EXEC_KEY);
  }

  public NSTimestamp avtDateModif() {
    return (NSTimestamp) storedValueForKey(AVT_DATE_MODIF_KEY);
  }

  public void setAvtDateModif(NSTimestamp value) {
    takeStoredValueForKey(value, AVT_DATE_MODIF_KEY);
  }

  public NSTimestamp avtDateSignature() {
    return (NSTimestamp) storedValueForKey(AVT_DATE_SIGNATURE_KEY);
  }

  public void setAvtDateSignature(NSTimestamp value) {
    takeStoredValueForKey(value, AVT_DATE_SIGNATURE_KEY);
  }

  public NSTimestamp avtDateValidAdm() {
    return (NSTimestamp) storedValueForKey(AVT_DATE_VALID_ADM_KEY);
  }

  public void setAvtDateValidAdm(NSTimestamp value) {
    takeStoredValueForKey(value, AVT_DATE_VALID_ADM_KEY);
  }

  public java.math.BigDecimal avtDepAnterieure() {
    return (java.math.BigDecimal) storedValueForKey(AVT_DEP_ANTERIEURE_KEY);
  }

  public void setAvtDepAnterieure(java.math.BigDecimal value) {
    takeStoredValueForKey(value, AVT_DEP_ANTERIEURE_KEY);
  }

  public Double avtIndex() {
    return (Double) storedValueForKey(AVT_INDEX_KEY);
  }

  public void setAvtIndex(Double value) {
    takeStoredValueForKey(value, AVT_INDEX_KEY);
  }

  public String avtLucrativite() {
    return (String) storedValueForKey(AVT_LUCRATIVITE_KEY);
  }

  public void setAvtLucrativite(String value) {
    takeStoredValueForKey(value, AVT_LUCRATIVITE_KEY);
  }

  public java.math.BigDecimal avtMntReliquat() {
    return (java.math.BigDecimal) storedValueForKey(AVT_MNT_RELIQUAT_KEY);
  }

  public void setAvtMntReliquat(java.math.BigDecimal value) {
    takeStoredValueForKey(value, AVT_MNT_RELIQUAT_KEY);
  }

  public Double avtModeGest() {
    return (Double) storedValueForKey(AVT_MODE_GEST_KEY);
  }

  public void setAvtModeGest(Double value) {
    takeStoredValueForKey(value, AVT_MODE_GEST_KEY);
  }

  public String avtMonnaie() {
    return (String) storedValueForKey(AVT_MONNAIE_KEY);
  }

  public void setAvtMonnaie(String value) {
    takeStoredValueForKey(value, AVT_MONNAIE_KEY);
  }

  public java.math.BigDecimal avtMontantHt() {
    return (java.math.BigDecimal) storedValueForKey(AVT_MONTANT_HT_KEY);
  }

  public void setAvtMontantHt(java.math.BigDecimal value) {
    takeStoredValueForKey(value, AVT_MONTANT_HT_KEY);
  }

  public java.math.BigDecimal avtMontantTtc() {
    return (java.math.BigDecimal) storedValueForKey(AVT_MONTANT_TTC_KEY);
  }

  public void setAvtMontantTtc(java.math.BigDecimal value) {
    takeStoredValueForKey(value, AVT_MONTANT_TTC_KEY);
  }

  public String avtObjet() {
    return (String) storedValueForKey(AVT_OBJET_KEY);
  }

  public void setAvtObjet(String value) {
    takeStoredValueForKey(value, AVT_OBJET_KEY);
  }

  public String avtObjetCourt() {
    return (String) storedValueForKey(AVT_OBJET_COURT_KEY);
  }

  public void setAvtObjetCourt(String value) {
    takeStoredValueForKey(value, AVT_OBJET_COURT_KEY);
  }

  public String avtObservations() {
    return (String) storedValueForKey(AVT_OBSERVATIONS_KEY);
  }

  public void setAvtObservations(String value) {
    takeStoredValueForKey(value, AVT_OBSERVATIONS_KEY);
  }

  public Double avtOrdre() {
    return (Double) storedValueForKey(AVT_ORDRE_KEY);
  }

  public void setAvtOrdre(Double value) {
    takeStoredValueForKey(value, AVT_ORDRE_KEY);
  }

  public java.math.BigDecimal avtPctAvance() {
    return (java.math.BigDecimal) storedValueForKey(AVT_PCT_AVANCE_KEY);
  }

  public void setAvtPctAvance(java.math.BigDecimal value) {
    takeStoredValueForKey(value, AVT_PCT_AVANCE_KEY);
  }

  public java.math.BigDecimal avtRecAnterieure() {
    return (java.math.BigDecimal) storedValueForKey(AVT_REC_ANTERIEURE_KEY);
  }

  public void setAvtRecAnterieure(java.math.BigDecimal value) {
    takeStoredValueForKey(value, AVT_REC_ANTERIEURE_KEY);
  }

  public String avtRecupTva() {
    return (String) storedValueForKey(AVT_RECUP_TVA_KEY);
  }

  public void setAvtRecupTva(String value) {
    takeStoredValueForKey(value, AVT_RECUP_TVA_KEY);
  }

  public String avtRefExterne() {
    return (String) storedValueForKey(AVT_REF_EXTERNE_KEY);
  }

  public void setAvtRefExterne(String value) {
    takeStoredValueForKey(value, AVT_REF_EXTERNE_KEY);
  }

  public Double avtStatReliquat() {
    return (Double) storedValueForKey(AVT_STAT_RELIQUAT_KEY);
  }

  public void setAvtStatReliquat(Double value) {
    takeStoredValueForKey(value, AVT_STAT_RELIQUAT_KEY);
  }

  public String avtSuppr() {
    return (String) storedValueForKey(AVT_SUPPR_KEY);
  }

  public void setAvtSuppr(String value) {
    takeStoredValueForKey(value, AVT_SUPPR_KEY);
  }

  public Double conOrdre() {
    return (Double) storedValueForKey(CON_ORDRE_KEY);
  }

  public void setConOrdre(Double value) {
    takeStoredValueForKey(value, CON_ORDRE_KEY);
  }

  public Double discOrdre() {
    return (Double) storedValueForKey(DISC_ORDRE_KEY);
  }

  public void setDiscOrdre(Double value) {
    takeStoredValueForKey(value, DISC_ORDRE_KEY);
  }

  public Double taOrdre() {
    return (Double) storedValueForKey(TA_ORDRE_KEY);
  }

  public void setTaOrdre(Double value) {
    takeStoredValueForKey(value, TA_ORDRE_KEY);
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

  public NSArray partenaires() {
    return (NSArray)storedValueForKey(PARTENAIRES_KEY);
  }
  
  //ICI
  public void setPartenaires(NSArray values) {
	  takeStoredValueForKey(values,PARTENAIRES_KEY);
  }
  

  public NSArray partenaires(EOQualifier qualifier) {
    return partenaires(qualifier, null, false);
  }

  public NSArray partenaires(EOQualifier qualifier, boolean fetch) {
    return partenaires(qualifier, null, fetch);
  }

  public NSArray partenaires(EOQualifier qualifier, NSArray sortOrderings, boolean fetch) {
    NSArray results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.directory.eof.server.EOAccordsAvenantPartenaire.AVENANT_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.directory.eof.server.EOAccordsAvenantPartenaire.fetchAll(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = partenaires();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToPartenairesRelationship(org.cocktail.directory.eof.server.EOAccordsAvenantPartenaire object) {
    addObjectToBothSidesOfRelationshipWithKey(object, PARTENAIRES_KEY);
  }

  public void removeFromPartenairesRelationship(org.cocktail.directory.eof.server.EOAccordsAvenantPartenaire object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, PARTENAIRES_KEY);
  }

  public org.cocktail.directory.eof.server.EOAccordsAvenantPartenaire createPartenairesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("AccordsAvenantPartenaire");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, PARTENAIRES_KEY);
    return (org.cocktail.directory.eof.server.EOAccordsAvenantPartenaire) eo;
  }

  public void deletePartenairesRelationship(org.cocktail.directory.eof.server.EOAccordsAvenantPartenaire object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, PARTENAIRES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllPartenairesRelationships() {
    Enumeration objects = partenaires().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deletePartenairesRelationship((org.cocktail.directory.eof.server.EOAccordsAvenantPartenaire)objects.nextElement());
    }
  }


/**
 * Créer une instance de EOAccordsAvenant avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOAccordsAvenant createEOAccordsAvenant(EOEditingContext editingContext, Double avtIndex
, String avtObjet
, Double avtOrdre
, Double conOrdre
			) {
    EOAccordsAvenant eo = (EOAccordsAvenant) createAndInsertInstance(editingContext, _EOAccordsAvenant.ENTITY_NAME);    
		eo.setAvtIndex(avtIndex);
		eo.setAvtObjet(avtObjet);
		eo.setAvtOrdre(avtOrdre);
		eo.setConOrdre(conOrdre);
    return eo;
  }

  
	  public EOAccordsAvenant localInstanceIn(EOEditingContext editingContext) {
	  		return (EOAccordsAvenant)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOAccordsAvenant creerInstance(EOEditingContext editingContext) {
	  		EOAccordsAvenant object = (EOAccordsAvenant)createAndInsertInstance(editingContext, _EOAccordsAvenant.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOAccordsAvenant localInstanceIn(EOEditingContext editingContext, EOAccordsAvenant eo) {
    EOAccordsAvenant localInstance = (eo == null) ? null : (EOAccordsAvenant)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOAccordsAvenant#localInstanceIn a la place.
   */
	public static EOAccordsAvenant localInstanceOf(EOEditingContext editingContext, EOAccordsAvenant eo) {
		return EOAccordsAvenant.localInstanceIn(editingContext, eo);
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
	  public static EOAccordsAvenant fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOAccordsAvenant fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOAccordsAvenant eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOAccordsAvenant)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOAccordsAvenant fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOAccordsAvenant fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOAccordsAvenant eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOAccordsAvenant)eoObjects.objectAtIndex(0);
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
	  public static EOAccordsAvenant fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOAccordsAvenant eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOAccordsAvenant ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOAccordsAvenant fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
