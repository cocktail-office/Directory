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

// DO NOT EDIT.  Make changes to EOAdresse.java instead.
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



public abstract class _EOAdresse extends  DirectoryRecord {
	public static final String ENTITY_NAME = "Adresse";
	public static final String ENTITY_TABLE_NAME = "ADRESSE";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "adrOrdre";

	public static final String ADR_ADRESSE1_KEY = "adrAdresse1";
	public static final String ADR_ADRESSE2_KEY = "adrAdresse2";
	public static final String ADR_BP_KEY = "adrBp";
	public static final String ADR_LISTE_ROUGE_KEY = "adrListeRouge";
	public static final String ADR_URL_PERE_KEY = "adrUrlPere";
	public static final String ADR_URL_RELATIVE_KEY = "adrUrlRelative";
	public static final String ADR_URL_TEMPLATE_KEY = "adrUrlTemplate";
	public static final String BIS_TER_KEY = "bisTer";
	public static final String C_IMPLANTATION_KEY = "cImplantation";
	public static final String CODE_POSTAL_KEY = "codePostal";
	public static final String C_PAYS_KEY = "cPays";
	public static final String CP_ETRANGER_KEY = "cpEtranger";
	public static final String C_VOIE_KEY = "cVoie";
	public static final String D_CREATION_KEY = "dCreation";
	public static final String D_DEB_VAL_KEY = "dDebVal";
	public static final String D_FIN_VAL_KEY = "dFinVal";
	public static final String D_MODIFICATION_KEY = "dModification";
	public static final String HABITANT_CHEZ_KEY = "habitantChez";
	public static final String LOCALITE_KEY = "localite";
	public static final String NOM_VOIE_KEY = "nomVoie";
	public static final String NO_VOIE_KEY = "noVoie";
	public static final String TEM_PAYE_UTIL_KEY = "temPayeUtil";
	public static final String VILLE_KEY = "ville";

// Attributs non visibles
	public static final String ADR_ORDRE_KEY = "adrOrdre";

//Colonnes dans la base de donnees
	public static final String ADR_ADRESSE1_COLKEY = "ADR_ADRESSE1";
	public static final String ADR_ADRESSE2_COLKEY = "ADR_ADRESSE2";
	public static final String ADR_BP_COLKEY = "ADR_BP";
	public static final String ADR_LISTE_ROUGE_COLKEY = "ADR_LISTE_ROUGE";
	public static final String ADR_URL_PERE_COLKEY = "ADR_URL_PERE";
	public static final String ADR_URL_RELATIVE_COLKEY = "ADR_URL_RELATIVE";
	public static final String ADR_URL_TEMPLATE_COLKEY = "ADR_URL_TEMPLATE";
	public static final String BIS_TER_COLKEY = "BIS_TER";
	public static final String C_IMPLANTATION_COLKEY = "C_IMPLANTATION";
	public static final String CODE_POSTAL_COLKEY = "CODE_POSTAL";
	public static final String C_PAYS_COLKEY = "C_PAYS";
	public static final String CP_ETRANGER_COLKEY = "CP_ETRANGER";
	public static final String C_VOIE_COLKEY = "C_VOIE";
	public static final String D_CREATION_COLKEY = "D_CREATION";
	public static final String D_DEB_VAL_COLKEY = "D_DEB_VAL";
	public static final String D_FIN_VAL_COLKEY = "D_FIN_VAL";
	public static final String D_MODIFICATION_COLKEY = "D_MODIFICATION";
	public static final String HABITANT_CHEZ_COLKEY = "HABITANT_CHEZ";
	public static final String LOCALITE_COLKEY = "LOCALITE";
	public static final String NOM_VOIE_COLKEY = "NOM_VOIE";
	public static final String NO_VOIE_COLKEY = "NO_VOIE";
	public static final String TEM_PAYE_UTIL_COLKEY = "TEM_PAYE_UTIL";
	public static final String VILLE_COLKEY = "VILLE";

	public static final String ADR_ORDRE_COLKEY = "ADR_ORDRE";


	// Relationships
	public static final String PAYS_KEY = "pays";
	public static final String REPART_PERSONNE_ADRESSE_KEY = "repartPersonneAdresse";



	// Accessors methods
  public String adrAdresse1() {
    return (String) storedValueForKey(ADR_ADRESSE1_KEY);
  }

  public void setAdrAdresse1(String value) {
    takeStoredValueForKey(value, ADR_ADRESSE1_KEY);
  }

  public String adrAdresse2() {
    return (String) storedValueForKey(ADR_ADRESSE2_KEY);
  }

  public void setAdrAdresse2(String value) {
    takeStoredValueForKey(value, ADR_ADRESSE2_KEY);
  }

  public String adrBp() {
    return (String) storedValueForKey(ADR_BP_KEY);
  }

  public void setAdrBp(String value) {
    takeStoredValueForKey(value, ADR_BP_KEY);
  }

  public String adrListeRouge() {
    return (String) storedValueForKey(ADR_LISTE_ROUGE_KEY);
  }

  public void setAdrListeRouge(String value) {
    takeStoredValueForKey(value, ADR_LISTE_ROUGE_KEY);
  }

  public String adrUrlPere() {
    return (String) storedValueForKey(ADR_URL_PERE_KEY);
  }

  public void setAdrUrlPere(String value) {
    takeStoredValueForKey(value, ADR_URL_PERE_KEY);
  }

  public String adrUrlRelative() {
    return (String) storedValueForKey(ADR_URL_RELATIVE_KEY);
  }

  public void setAdrUrlRelative(String value) {
    takeStoredValueForKey(value, ADR_URL_RELATIVE_KEY);
  }

  public String adrUrlTemplate() {
    return (String) storedValueForKey(ADR_URL_TEMPLATE_KEY);
  }

  public void setAdrUrlTemplate(String value) {
    takeStoredValueForKey(value, ADR_URL_TEMPLATE_KEY);
  }

  public String bisTer() {
    return (String) storedValueForKey(BIS_TER_KEY);
  }

  public void setBisTer(String value) {
    takeStoredValueForKey(value, BIS_TER_KEY);
  }

  public String cImplantation() {
    return (String) storedValueForKey(C_IMPLANTATION_KEY);
  }

  public void setCImplantation(String value) {
    takeStoredValueForKey(value, C_IMPLANTATION_KEY);
  }

  public String codePostal() {
    return (String) storedValueForKey(CODE_POSTAL_KEY);
  }

  public void setCodePostal(String value) {
    takeStoredValueForKey(value, CODE_POSTAL_KEY);
  }

  public String cPays() {
    return (String) storedValueForKey(C_PAYS_KEY);
  }

  public void setCPays(String value) {
    takeStoredValueForKey(value, C_PAYS_KEY);
  }

  public String cpEtranger() {
    return (String) storedValueForKey(CP_ETRANGER_KEY);
  }

  public void setCpEtranger(String value) {
    takeStoredValueForKey(value, CP_ETRANGER_KEY);
  }

  public String cVoie() {
    return (String) storedValueForKey(C_VOIE_KEY);
  }

  public void setCVoie(String value) {
    takeStoredValueForKey(value, C_VOIE_KEY);
  }

  public NSTimestamp dCreation() {
    return (NSTimestamp) storedValueForKey(D_CREATION_KEY);
  }

  public void setDCreation(NSTimestamp value) {
    takeStoredValueForKey(value, D_CREATION_KEY);
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

  public NSTimestamp dModification() {
    return (NSTimestamp) storedValueForKey(D_MODIFICATION_KEY);
  }

  public void setDModification(NSTimestamp value) {
    takeStoredValueForKey(value, D_MODIFICATION_KEY);
  }

  public String habitantChez() {
    return (String) storedValueForKey(HABITANT_CHEZ_KEY);
  }

  public void setHabitantChez(String value) {
    takeStoredValueForKey(value, HABITANT_CHEZ_KEY);
  }

  public String localite() {
    return (String) storedValueForKey(LOCALITE_KEY);
  }

  public void setLocalite(String value) {
    takeStoredValueForKey(value, LOCALITE_KEY);
  }

  public String nomVoie() {
    return (String) storedValueForKey(NOM_VOIE_KEY);
  }

  public void setNomVoie(String value) {
    takeStoredValueForKey(value, NOM_VOIE_KEY);
  }

  public String noVoie() {
    return (String) storedValueForKey(NO_VOIE_KEY);
  }

  public void setNoVoie(String value) {
    takeStoredValueForKey(value, NO_VOIE_KEY);
  }

  public String temPayeUtil() {
    return (String) storedValueForKey(TEM_PAYE_UTIL_KEY);
  }

  public void setTemPayeUtil(String value) {
    takeStoredValueForKey(value, TEM_PAYE_UTIL_KEY);
  }

  public String ville() {
    return (String) storedValueForKey(VILLE_KEY);
  }

  public void setVille(String value) {
    takeStoredValueForKey(value, VILLE_KEY);
  }

  public org.cocktail.directory.eof.server.EOPays pays() {
    return (org.cocktail.directory.eof.server.EOPays)storedValueForKey(PAYS_KEY);
  }
  
	public void setPays(org.cocktail.directory.eof.server.EOPays value) {
		takeStoredValueForKey(value,PAYS_KEY);
	}


  public void setPaysRelationship(org.cocktail.directory.eof.server.EOPays value) {
    if (value == null) {
    	org.cocktail.directory.eof.server.EOPays oldValue = pays();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, PAYS_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, PAYS_KEY);
    }
  }
  
  public NSArray repartPersonneAdresse() {
    return (NSArray)storedValueForKey(REPART_PERSONNE_ADRESSE_KEY);
  }
  
  //ICI
  public void setRepartPersonneAdresse(NSArray values) {
	  takeStoredValueForKey(values,REPART_PERSONNE_ADRESSE_KEY);
  }
  

  public NSArray repartPersonneAdresse(EOQualifier qualifier) {
    return repartPersonneAdresse(qualifier, null, false);
  }

  public NSArray repartPersonneAdresse(EOQualifier qualifier, boolean fetch) {
    return repartPersonneAdresse(qualifier, null, fetch);
  }

  public NSArray repartPersonneAdresse(EOQualifier qualifier, NSArray sortOrderings, boolean fetch) {
    NSArray results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.directory.eof.server.EORepartPersonneAdresse.ADRESSE_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.directory.eof.server.EORepartPersonneAdresse.fetchAll(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = repartPersonneAdresse();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToRepartPersonneAdresseRelationship(org.cocktail.directory.eof.server.EORepartPersonneAdresse object) {
    addObjectToBothSidesOfRelationshipWithKey(object, REPART_PERSONNE_ADRESSE_KEY);
  }

  public void removeFromRepartPersonneAdresseRelationship(org.cocktail.directory.eof.server.EORepartPersonneAdresse object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_PERSONNE_ADRESSE_KEY);
  }

  public org.cocktail.directory.eof.server.EORepartPersonneAdresse createRepartPersonneAdresseRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RepartPersonneAdresse");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, REPART_PERSONNE_ADRESSE_KEY);
    return (org.cocktail.directory.eof.server.EORepartPersonneAdresse) eo;
  }

  public void deleteRepartPersonneAdresseRelationship(org.cocktail.directory.eof.server.EORepartPersonneAdresse object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_PERSONNE_ADRESSE_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartPersonneAdresseRelationships() {
    Enumeration objects = repartPersonneAdresse().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartPersonneAdresseRelationship((org.cocktail.directory.eof.server.EORepartPersonneAdresse)objects.nextElement());
    }
  }


/**
 * Créer une instance de EOAdresse avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOAdresse createEOAdresse(EOEditingContext editingContext, String adrListeRouge
, String cPays
, NSTimestamp dCreation
, NSTimestamp dModification
, String temPayeUtil
			) {
    EOAdresse eo = (EOAdresse) createAndInsertInstance(editingContext, _EOAdresse.ENTITY_NAME);    
		eo.setAdrListeRouge(adrListeRouge);
		eo.setCPays(cPays);
		eo.setDCreation(dCreation);
		eo.setDModification(dModification);
		eo.setTemPayeUtil(temPayeUtil);
    return eo;
  }

  
	  public EOAdresse localInstanceIn(EOEditingContext editingContext) {
	  		return (EOAdresse)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOAdresse creerInstance(EOEditingContext editingContext) {
	  		EOAdresse object = (EOAdresse)createAndInsertInstance(editingContext, _EOAdresse.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOAdresse localInstanceIn(EOEditingContext editingContext, EOAdresse eo) {
    EOAdresse localInstance = (eo == null) ? null : (EOAdresse)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOAdresse#localInstanceIn a la place.
   */
	public static EOAdresse localInstanceOf(EOEditingContext editingContext, EOAdresse eo) {
		return EOAdresse.localInstanceIn(editingContext, eo);
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
	  public static EOAdresse fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOAdresse fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOAdresse eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOAdresse)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOAdresse fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOAdresse fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOAdresse eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOAdresse)eoObjects.objectAtIndex(0);
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
	  public static EOAdresse fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOAdresse eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOAdresse ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOAdresse fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
