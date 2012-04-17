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

// DO NOT EDIT.  Make changes to EOVFournisGrhum.java instead.
package org.cocktail.directory.eof.server;

import java.util.Enumeration;
import java.util.NoSuchElementException;

import com.webobjects.eocontrol.EOClassDescription;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSTimestamp;



public abstract class _EOVFournisGrhum extends  DirectoryRecord {
	public static final String ENTITY_NAME = "VFournisGrhum";
	public static final String ENTITY_TABLE_NAME = "V_FOURNIS_GRHUM";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "persId";

	public static final String ADR_ADRESSE1_KEY = "adrAdresse1";
	public static final String ADR_ADRESSE2_KEY = "adrAdresse2";
	public static final String ADR_BP_KEY = "adrBp";
	public static final String ADR_CIVILITE_KEY = "adrCivilite";
	public static final String ADR_CP_KEY = "adrCp";
	public static final String ADR_CP_ETRANGER_KEY = "adrCpEtranger";
	public static final String ADR_NOM_KEY = "adrNom";
	public static final String ADR_ORDRE_KEY = "adrOrdre";
	public static final String ADR_PRENOM_KEY = "adrPrenom";
	public static final String ADR_VILLE_KEY = "adrVille";
	public static final String AGT_ORDRE_KEY = "agtOrdre";
	public static final String CPT_ORDRE_KEY = "cptOrdre";
	public static final String D_CREATION_KEY = "dCreation";
	public static final String D_MODIFICATION_KEY = "dModification";
	public static final String FOU_CODE_KEY = "fouCode";
	public static final String FOU_DATE_KEY = "fouDate";
	public static final String FOU_ETRANGER_KEY = "fouEtranger";
	public static final String FOU_MARCHE_KEY = "fouMarche";
	public static final String FOU_ORDRE_KEY = "fouOrdre";
	public static final String FOU_TYPE_KEY = "fouType";
	public static final String FOU_VALIDE_KEY = "fouValide";
	public static final String PAYS_KEY = "pays";
	public static final String PERS_ID_KEY = "persId";

// Attributs non visibles

//Colonnes dans la base de donnees
	public static final String ADR_ADRESSE1_COLKEY = "ADR_ADRESSE1";
	public static final String ADR_ADRESSE2_COLKEY = "ADR_ADRESSE2";
	public static final String ADR_BP_COLKEY = "ADR_BP";
	public static final String ADR_CIVILITE_COLKEY = "ADR_CIVILITE";
	public static final String ADR_CP_COLKEY = "ADR_CP";
	public static final String ADR_CP_ETRANGER_COLKEY = "ADR_CP_ETRANGER";
	public static final String ADR_NOM_COLKEY = "ADR_NOM";
	public static final String ADR_ORDRE_COLKEY = "ADR_ORDRE";
	public static final String ADR_PRENOM_COLKEY = "ADR_PRENOM";
	public static final String ADR_VILLE_COLKEY = "ADR_VILLE";
	public static final String AGT_ORDRE_COLKEY = "AGT_ORDRE";
	public static final String CPT_ORDRE_COLKEY = "CPT_ORDRE";
	public static final String D_CREATION_COLKEY = "D_CREATION";
	public static final String D_MODIFICATION_COLKEY = "D_MODIFICATION";
	public static final String FOU_CODE_COLKEY = "FOU_CODE";
	public static final String FOU_DATE_COLKEY = "FOU_DATE";
	public static final String FOU_ETRANGER_COLKEY = "FOU_ETRANGER";
	public static final String FOU_MARCHE_COLKEY = "FOU_MARCHE";
	public static final String FOU_ORDRE_COLKEY = "FOU_ORDRE";
	public static final String FOU_TYPE_COLKEY = "FOU_TYPE";
	public static final String FOU_VALIDE_COLKEY = "FOU_VALIDE";
	public static final String PAYS_COLKEY = "PAYS";
	public static final String PERS_ID_COLKEY = "PERS_ID";



	// Relationships
	public static final String INDIVIDU_ULRS_KEY = "individuUlrs";
	public static final String REPART_PERSONNE_ADRESSES_KEY = "repartPersonneAdresses";
	public static final String RIBFOURS_KEY = "ribfours";
	public static final String STRUCTURES_ULR_KEY = "structuresUlr";



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

  public String adrCivilite() {
    return (String) storedValueForKey(ADR_CIVILITE_KEY);
  }

  public void setAdrCivilite(String value) {
    takeStoredValueForKey(value, ADR_CIVILITE_KEY);
  }

  public String adrCp() {
    return (String) storedValueForKey(ADR_CP_KEY);
  }

  public void setAdrCp(String value) {
    takeStoredValueForKey(value, ADR_CP_KEY);
  }

  public String adrCpEtranger() {
    return (String) storedValueForKey(ADR_CP_ETRANGER_KEY);
  }

  public void setAdrCpEtranger(String value) {
    takeStoredValueForKey(value, ADR_CP_ETRANGER_KEY);
  }

  public String adrNom() {
    return (String) storedValueForKey(ADR_NOM_KEY);
  }

  public void setAdrNom(String value) {
    takeStoredValueForKey(value, ADR_NOM_KEY);
  }

  public Double adrOrdre() {
    return (Double) storedValueForKey(ADR_ORDRE_KEY);
  }

  public void setAdrOrdre(Double value) {
    takeStoredValueForKey(value, ADR_ORDRE_KEY);
  }

  public String adrPrenom() {
    return (String) storedValueForKey(ADR_PRENOM_KEY);
  }

  public void setAdrPrenom(String value) {
    takeStoredValueForKey(value, ADR_PRENOM_KEY);
  }

  public String adrVille() {
    return (String) storedValueForKey(ADR_VILLE_KEY);
  }

  public void setAdrVille(String value) {
    takeStoredValueForKey(value, ADR_VILLE_KEY);
  }

  public Double agtOrdre() {
    return (Double) storedValueForKey(AGT_ORDRE_KEY);
  }

  public void setAgtOrdre(Double value) {
    takeStoredValueForKey(value, AGT_ORDRE_KEY);
  }

  public Double cptOrdre() {
    return (Double) storedValueForKey(CPT_ORDRE_KEY);
  }

  public void setCptOrdre(Double value) {
    takeStoredValueForKey(value, CPT_ORDRE_KEY);
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

  public String fouCode() {
    return (String) storedValueForKey(FOU_CODE_KEY);
  }

  public void setFouCode(String value) {
    takeStoredValueForKey(value, FOU_CODE_KEY);
  }

  public NSTimestamp fouDate() {
    return (NSTimestamp) storedValueForKey(FOU_DATE_KEY);
  }

  public void setFouDate(NSTimestamp value) {
    takeStoredValueForKey(value, FOU_DATE_KEY);
  }

  public String fouEtranger() {
    return (String) storedValueForKey(FOU_ETRANGER_KEY);
  }

  public void setFouEtranger(String value) {
    takeStoredValueForKey(value, FOU_ETRANGER_KEY);
  }

  public String fouMarche() {
    return (String) storedValueForKey(FOU_MARCHE_KEY);
  }

  public void setFouMarche(String value) {
    takeStoredValueForKey(value, FOU_MARCHE_KEY);
  }

  public Integer fouOrdre() {
    return (Integer) storedValueForKey(FOU_ORDRE_KEY);
  }

  public void setFouOrdre(Integer value) {
    takeStoredValueForKey(value, FOU_ORDRE_KEY);
  }

  public String fouType() {
    return (String) storedValueForKey(FOU_TYPE_KEY);
  }

  public void setFouType(String value) {
    takeStoredValueForKey(value, FOU_TYPE_KEY);
  }

  public String fouValide() {
    return (String) storedValueForKey(FOU_VALIDE_KEY);
  }

  public void setFouValide(String value) {
    takeStoredValueForKey(value, FOU_VALIDE_KEY);
  }

  public String pays() {
    return (String) storedValueForKey(PAYS_KEY);
  }

  public void setPays(String value) {
    takeStoredValueForKey(value, PAYS_KEY);
  }

  public Integer persId() {
    return (Integer) storedValueForKey(PERS_ID_KEY);
  }

  public void setPersId(Integer value) {
    takeStoredValueForKey(value, PERS_ID_KEY);
  }

  public NSArray individuUlrs() {
    return (NSArray)storedValueForKey(INDIVIDU_ULRS_KEY);
  }
  
  //ICI
  public void setIndividuUlrs(NSArray values) {
	  takeStoredValueForKey(values,INDIVIDU_ULRS_KEY);
  }
  

  public NSArray individuUlrs(EOQualifier qualifier) {
    return individuUlrs(qualifier, null);
  }

  public NSArray individuUlrs(EOQualifier qualifier, NSArray sortOrderings) {
    NSArray results;
      results = individuUlrs();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToIndividuUlrsRelationship(org.cocktail.directory.eof.server.EOIndividuUlr object) {
    addObjectToBothSidesOfRelationshipWithKey(object, INDIVIDU_ULRS_KEY);
  }

  public void removeFromIndividuUlrsRelationship(org.cocktail.directory.eof.server.EOIndividuUlr object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, INDIVIDU_ULRS_KEY);
  }

  public org.cocktail.directory.eof.server.EOIndividuUlr createIndividuUlrsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("IndividuUlr");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, INDIVIDU_ULRS_KEY);
    return (org.cocktail.directory.eof.server.EOIndividuUlr) eo;
  }

  public void deleteIndividuUlrsRelationship(org.cocktail.directory.eof.server.EOIndividuUlr object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, INDIVIDU_ULRS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllIndividuUlrsRelationships() {
    Enumeration objects = individuUlrs().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteIndividuUlrsRelationship((org.cocktail.directory.eof.server.EOIndividuUlr)objects.nextElement());
    }
  }

  public NSArray repartPersonneAdresses() {
    return (NSArray)storedValueForKey(REPART_PERSONNE_ADRESSES_KEY);
  }
  
  //ICI
  public void setRepartPersonneAdresses(NSArray values) {
	  takeStoredValueForKey(values,REPART_PERSONNE_ADRESSES_KEY);
  }
  

  public NSArray repartPersonneAdresses(EOQualifier qualifier) {
    return repartPersonneAdresses(qualifier, null);
  }

  public NSArray repartPersonneAdresses(EOQualifier qualifier, NSArray sortOrderings) {
    NSArray results;
      results = repartPersonneAdresses();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToRepartPersonneAdressesRelationship(org.cocktail.directory.eof.server.EORepartPersonneAdresse object) {
    addObjectToBothSidesOfRelationshipWithKey(object, REPART_PERSONNE_ADRESSES_KEY);
  }

  public void removeFromRepartPersonneAdressesRelationship(org.cocktail.directory.eof.server.EORepartPersonneAdresse object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_PERSONNE_ADRESSES_KEY);
  }

  public org.cocktail.directory.eof.server.EORepartPersonneAdresse createRepartPersonneAdressesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RepartPersonneAdresse");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, REPART_PERSONNE_ADRESSES_KEY);
    return (org.cocktail.directory.eof.server.EORepartPersonneAdresse) eo;
  }

  public void deleteRepartPersonneAdressesRelationship(org.cocktail.directory.eof.server.EORepartPersonneAdresse object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_PERSONNE_ADRESSES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartPersonneAdressesRelationships() {
    Enumeration objects = repartPersonneAdresses().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartPersonneAdressesRelationship((org.cocktail.directory.eof.server.EORepartPersonneAdresse)objects.nextElement());
    }
  }

  public NSArray ribfours() {
    return (NSArray)storedValueForKey(RIBFOURS_KEY);
  }
  
  //ICI
  public void setRibfours(NSArray values) {
	  takeStoredValueForKey(values,RIBFOURS_KEY);
  }
  

  public NSArray ribfours(EOQualifier qualifier) {
    return ribfours(qualifier, null);
  }

  public NSArray ribfours(EOQualifier qualifier, NSArray sortOrderings) {
    NSArray results;
      results = ribfours();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToRibfoursRelationship(org.cocktail.directory.eof.server.EORibfourUlr object) {
    addObjectToBothSidesOfRelationshipWithKey(object, RIBFOURS_KEY);
  }

  public void removeFromRibfoursRelationship(org.cocktail.directory.eof.server.EORibfourUlr object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, RIBFOURS_KEY);
  }

  public org.cocktail.directory.eof.server.EORibfourUlr createRibfoursRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RibfourUlr");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, RIBFOURS_KEY);
    return (org.cocktail.directory.eof.server.EORibfourUlr) eo;
  }

  public void deleteRibfoursRelationship(org.cocktail.directory.eof.server.EORibfourUlr object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, RIBFOURS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllRibfoursRelationships() {
    Enumeration objects = ribfours().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRibfoursRelationship((org.cocktail.directory.eof.server.EORibfourUlr)objects.nextElement());
    }
  }

  public NSArray structuresUlr() {
    return (NSArray)storedValueForKey(STRUCTURES_ULR_KEY);
  }
  
  //ICI
  public void setStructuresUlr(NSArray values) {
	  takeStoredValueForKey(values,STRUCTURES_ULR_KEY);
  }
  

  public NSArray structuresUlr(EOQualifier qualifier) {
    return structuresUlr(qualifier, null);
  }

  public NSArray structuresUlr(EOQualifier qualifier, NSArray sortOrderings) {
    NSArray results;
      results = structuresUlr();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToStructuresUlrRelationship(org.cocktail.directory.eof.server.EOStructureUlr object) {
    addObjectToBothSidesOfRelationshipWithKey(object, STRUCTURES_ULR_KEY);
  }

  public void removeFromStructuresUlrRelationship(org.cocktail.directory.eof.server.EOStructureUlr object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, STRUCTURES_ULR_KEY);
  }

  public org.cocktail.directory.eof.server.EOStructureUlr createStructuresUlrRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("StructureUlr");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, STRUCTURES_ULR_KEY);
    return (org.cocktail.directory.eof.server.EOStructureUlr) eo;
  }

  public void deleteStructuresUlrRelationship(org.cocktail.directory.eof.server.EOStructureUlr object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, STRUCTURES_ULR_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllStructuresUlrRelationships() {
    Enumeration objects = structuresUlr().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteStructuresUlrRelationship((org.cocktail.directory.eof.server.EOStructureUlr)objects.nextElement());
    }
  }


/**
 * Créer une instance de EOVFournisGrhum avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOVFournisGrhum createEOVFournisGrhum(EOEditingContext editingContext, String adrCivilite
, String adrNom
, Double adrOrdre
, NSTimestamp dCreation
, NSTimestamp dModification
, String fouCode
, String fouMarche
, Integer fouOrdre
, Integer persId
			) {
    EOVFournisGrhum eo = (EOVFournisGrhum) createAndInsertInstance(editingContext, _EOVFournisGrhum.ENTITY_NAME);    
		eo.setAdrCivilite(adrCivilite);
		eo.setAdrNom(adrNom);
		eo.setAdrOrdre(adrOrdre);
		eo.setDCreation(dCreation);
		eo.setDModification(dModification);
		eo.setFouCode(fouCode);
		eo.setFouMarche(fouMarche);
		eo.setFouOrdre(fouOrdre);
		eo.setPersId(persId);
    return eo;
  }

  
	  public EOVFournisGrhum localInstanceIn(EOEditingContext editingContext) {
	  		return (EOVFournisGrhum)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOVFournisGrhum creerInstance(EOEditingContext editingContext) {
	  		EOVFournisGrhum object = (EOVFournisGrhum)createAndInsertInstance(editingContext, _EOVFournisGrhum.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOVFournisGrhum localInstanceIn(EOEditingContext editingContext, EOVFournisGrhum eo) {
    EOVFournisGrhum localInstance = (eo == null) ? null : (EOVFournisGrhum)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOVFournisGrhum#localInstanceIn a la place.
   */
	public static EOVFournisGrhum localInstanceOf(EOEditingContext editingContext, EOVFournisGrhum eo) {
		return EOVFournisGrhum.localInstanceIn(editingContext, eo);
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
	  public static EOVFournisGrhum fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOVFournisGrhum fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOVFournisGrhum eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOVFournisGrhum)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOVFournisGrhum fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOVFournisGrhum fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOVFournisGrhum eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOVFournisGrhum)eoObjects.objectAtIndex(0);
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
	  public static EOVFournisGrhum fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOVFournisGrhum eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOVFournisGrhum ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOVFournisGrhum fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
