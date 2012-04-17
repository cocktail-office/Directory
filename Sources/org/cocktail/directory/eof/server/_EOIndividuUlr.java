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

// DO NOT EDIT.  Make changes to EOIndividuUlr.java instead.
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



public abstract class _EOIndividuUlr extends  DirectoryRecord {
	public static final String ENTITY_NAME = "IndividuUlr";
	public static final String ENTITY_TABLE_NAME = "INDIVIDU_ULR";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "noIndividu";

	public static final String CATEGORIE_PRINC_KEY = "categoriePrinc";
	public static final String CAT_LIBELLE2_KEY = "catLibelle2";
	public static final String C_CIVILITE_KEY = "cCivilite";
	public static final String C_DEPT_NAISSANCE_KEY = "cDeptNaissance";
	public static final String C_PAYS_NAISSANCE_KEY = "cPaysNaissance";
	public static final String C_PAYS_NATIONALITE_KEY = "cPaysNationalite";
	public static final String IND_ACTIVITE_KEY = "indActivite";
	public static final String IND_AGENDA_KEY = "indAgenda";
	public static final String IND_CLE_INSEE_KEY = "indCleInsee";
	public static final String IND_C_SIT_MILITAIRE_KEY = "indCSitMilitaire";
	public static final String IND_C_SITUATION_FAMILLE_KEY = "indCSituationFamille";
	public static final String IND_NO_INSEE_KEY = "indNoInsee";
	public static final String IND_ORIGINE_KEY = "indOrigine";
	public static final String IND_PHOTO_KEY = "indPhoto";
	public static final String IND_QUALITE_KEY = "indQualite";
	public static final String LANGUE_PREF_KEY = "languePref";
	public static final String LISTE_ROUGE_KEY = "listeRouge";
	public static final String NO_INDIVIDU_KEY = "noIndividu";
	public static final String NOM_AFFICHAGE_KEY = "nomAffichage";
	public static final String NOM_PATRONYMIQUE_KEY = "nomPatronymique";
	public static final String NOM_USUEL_KEY = "nomUsuel";
	public static final String ORGA_CODE_KEY = "orgaCode";
	public static final String ORGA_LIBELLE_KEY = "orgaLibelle";
	public static final String PERS_ID_KEY = "persId";
	public static final String PRENOM_KEY = "prenom";
	public static final String PRENOM2_KEY = "prenom2";
	public static final String PRENOM_AFFICHAGE_KEY = "prenomAffichage";
	public static final String TEM_SS_DIPLOME_KEY = "temSsDiplome";
	public static final String TEM_VALIDE_KEY = "temValide";
	public static final String VILLE_DE_NAISSANCE_KEY = "villeDeNaissance";

// Attributs non visibles
	public static final String NO_INDIVIDU_CREATEUR_KEY = "noIndividuCreateur";

//Colonnes dans la base de donnees
	public static final String CATEGORIE_PRINC_COLKEY = "CATEGORIE_PRINC";
	public static final String CAT_LIBELLE2_COLKEY = "$attribute.columnName";
	public static final String C_CIVILITE_COLKEY = "C_CIVILITE";
	public static final String C_DEPT_NAISSANCE_COLKEY = "C_DEPT_NAISSANCE";
	public static final String C_PAYS_NAISSANCE_COLKEY = "C_PAYS_NAISSANCE";
	public static final String C_PAYS_NATIONALITE_COLKEY = "C_PAYS_NATIONALITE";
	public static final String IND_ACTIVITE_COLKEY = "IND_ACTIVITE";
	public static final String IND_AGENDA_COLKEY = "IND_AGENDA";
	public static final String IND_CLE_INSEE_COLKEY = "IND_CLE_INSEE";
	public static final String IND_C_SIT_MILITAIRE_COLKEY = "IND_C_SIT_MILITAIRE";
	public static final String IND_C_SITUATION_FAMILLE_COLKEY = "IND_C_SITUATION_FAMILLE";
	public static final String IND_NO_INSEE_COLKEY = "IND_NO_INSEE";
	public static final String IND_ORIGINE_COLKEY = "IND_ORIGINE";
	public static final String IND_PHOTO_COLKEY = "IND_PHOTO";
	public static final String IND_QUALITE_COLKEY = "IND_QUALITE";
	public static final String LANGUE_PREF_COLKEY = "LANGUE_PREF";
	public static final String LISTE_ROUGE_COLKEY = "LISTE_ROUGE";
	public static final String NO_INDIVIDU_COLKEY = "NO_INDIVIDU";
	public static final String NOM_AFFICHAGE_COLKEY = "NOM_AFFICHAGE";
	public static final String NOM_PATRONYMIQUE_COLKEY = "NOM_PATRONYMIQUE";
	public static final String NOM_USUEL_COLKEY = "NOM_USUEL";
	public static final String ORGA_CODE_COLKEY = "ORGA_CODE";
	public static final String ORGA_LIBELLE_COLKEY = "ORGA_LIBELLE";
	public static final String PERS_ID_COLKEY = "PERS_ID";
	public static final String PRENOM_COLKEY = "PRENOM";
	public static final String PRENOM2_COLKEY = "PRENOM2";
	public static final String PRENOM_AFFICHAGE_COLKEY = "PRENOM_AFFICHAGE";
	public static final String TEM_SS_DIPLOME_COLKEY = "TEM_SS_DIPLOME";
	public static final String TEM_VALIDE_COLKEY = "TEM_VALIDE";
	public static final String VILLE_DE_NAISSANCE_COLKEY = "VILLE_DE_NAISSANCE";

	public static final String NO_INDIVIDU_CREATEUR_COLKEY = "NO_INDIVIDU_CREATEUR";


	// Relationships
	public static final String ETUDIANTS_KEY = "etudiants";
	public static final String PERSONNE_TELEPHONES_KEY = "personneTelephones";
	public static final String REPART_ASSOCIATIONS_KEY = "repartAssociations";
	public static final String REPART_COMPTES_KEY = "repartComptes";
	public static final String REPART_EMPLOI_KEY = "repartEmploi";
	public static final String REPART_PERSONNE_ADRESSES_KEY = "repartPersonneAdresses";
	public static final String REPART_STRUCTURES_KEY = "repartStructures";
	public static final String SUPANN_CATEGORIE_KEY = "supannCategorie";
	public static final String TO_COMPTES_KEY = "toComptes";
	public static final String V_LDAP_PERSONNEL_ACTUEL_KEY = "vLdapPersonnelActuel";
	public static final String V_PERSONNEL_ACTUEL_KEY = "vPersonnelActuel";



	// Accessors methods
  public Integer categoriePrinc() {
    return (Integer) storedValueForKey(CATEGORIE_PRINC_KEY);
  }

  public void setCategoriePrinc(Integer value) {
    takeStoredValueForKey(value, CATEGORIE_PRINC_KEY);
  }

  public String catLibelle2() {
    return (String) storedValueForKey(CAT_LIBELLE2_KEY);
  }

  public void setCatLibelle2(String value) {
    takeStoredValueForKey(value, CAT_LIBELLE2_KEY);
  }

  public String cCivilite() {
    return (String) storedValueForKey(C_CIVILITE_KEY);
  }

  public void setCCivilite(String value) {
    takeStoredValueForKey(value, C_CIVILITE_KEY);
  }

  public String cDeptNaissance() {
    return (String) storedValueForKey(C_DEPT_NAISSANCE_KEY);
  }

  public void setCDeptNaissance(String value) {
    takeStoredValueForKey(value, C_DEPT_NAISSANCE_KEY);
  }

  public String cPaysNaissance() {
    return (String) storedValueForKey(C_PAYS_NAISSANCE_KEY);
  }

  public void setCPaysNaissance(String value) {
    takeStoredValueForKey(value, C_PAYS_NAISSANCE_KEY);
  }

  public String cPaysNationalite() {
    return (String) storedValueForKey(C_PAYS_NATIONALITE_KEY);
  }

  public void setCPaysNationalite(String value) {
    takeStoredValueForKey(value, C_PAYS_NATIONALITE_KEY);
  }

  public String indActivite() {
    return (String) storedValueForKey(IND_ACTIVITE_KEY);
  }

  public void setIndActivite(String value) {
    takeStoredValueForKey(value, IND_ACTIVITE_KEY);
  }

  public String indAgenda() {
    return (String) storedValueForKey(IND_AGENDA_KEY);
  }

  public void setIndAgenda(String value) {
    takeStoredValueForKey(value, IND_AGENDA_KEY);
  }

  public Long indCleInsee() {
    return (Long) storedValueForKey(IND_CLE_INSEE_KEY);
  }

  public void setIndCleInsee(Long value) {
    takeStoredValueForKey(value, IND_CLE_INSEE_KEY);
  }

  public String indCSitMilitaire() {
    return (String) storedValueForKey(IND_C_SIT_MILITAIRE_KEY);
  }

  public void setIndCSitMilitaire(String value) {
    takeStoredValueForKey(value, IND_C_SIT_MILITAIRE_KEY);
  }

  public String indCSituationFamille() {
    return (String) storedValueForKey(IND_C_SITUATION_FAMILLE_KEY);
  }

  public void setIndCSituationFamille(String value) {
    takeStoredValueForKey(value, IND_C_SITUATION_FAMILLE_KEY);
  }

  public String indNoInsee() {
    return (String) storedValueForKey(IND_NO_INSEE_KEY);
  }

  public void setIndNoInsee(String value) {
    takeStoredValueForKey(value, IND_NO_INSEE_KEY);
  }

  public String indOrigine() {
    return (String) storedValueForKey(IND_ORIGINE_KEY);
  }

  public void setIndOrigine(String value) {
    takeStoredValueForKey(value, IND_ORIGINE_KEY);
  }

  public String indPhoto() {
    return (String) storedValueForKey(IND_PHOTO_KEY);
  }

  public void setIndPhoto(String value) {
    takeStoredValueForKey(value, IND_PHOTO_KEY);
  }

  public String indQualite() {
    return (String) storedValueForKey(IND_QUALITE_KEY);
  }

  public void setIndQualite(String value) {
    takeStoredValueForKey(value, IND_QUALITE_KEY);
  }

  public String languePref() {
    return (String) storedValueForKey(LANGUE_PREF_KEY);
  }

  public void setLanguePref(String value) {
    takeStoredValueForKey(value, LANGUE_PREF_KEY);
  }

  public String listeRouge() {
    return (String) storedValueForKey(LISTE_ROUGE_KEY);
  }

  public void setListeRouge(String value) {
    takeStoredValueForKey(value, LISTE_ROUGE_KEY);
  }

  public Integer noIndividu() {
    return (Integer) storedValueForKey(NO_INDIVIDU_KEY);
  }

  public void setNoIndividu(Integer value) {
    takeStoredValueForKey(value, NO_INDIVIDU_KEY);
  }

  public String nomAffichage() {
    return (String) storedValueForKey(NOM_AFFICHAGE_KEY);
  }

  public void setNomAffichage(String value) {
    takeStoredValueForKey(value, NOM_AFFICHAGE_KEY);
  }

  public String nomPatronymique() {
    return (String) storedValueForKey(NOM_PATRONYMIQUE_KEY);
  }

  public void setNomPatronymique(String value) {
    takeStoredValueForKey(value, NOM_PATRONYMIQUE_KEY);
  }

  public String nomUsuel() {
    return (String) storedValueForKey(NOM_USUEL_KEY);
  }

  public void setNomUsuel(String value) {
    takeStoredValueForKey(value, NOM_USUEL_KEY);
  }

  public String orgaCode() {
    return (String) storedValueForKey(ORGA_CODE_KEY);
  }

  public void setOrgaCode(String value) {
    takeStoredValueForKey(value, ORGA_CODE_KEY);
  }

  public String orgaLibelle() {
    return (String) storedValueForKey(ORGA_LIBELLE_KEY);
  }

  public void setOrgaLibelle(String value) {
    takeStoredValueForKey(value, ORGA_LIBELLE_KEY);
  }

  public Integer persId() {
    return (Integer) storedValueForKey(PERS_ID_KEY);
  }

  public void setPersId(Integer value) {
    takeStoredValueForKey(value, PERS_ID_KEY);
  }

  public String prenom() {
    return (String) storedValueForKey(PRENOM_KEY);
  }

  public void setPrenom(String value) {
    takeStoredValueForKey(value, PRENOM_KEY);
  }

  public String prenom2() {
    return (String) storedValueForKey(PRENOM2_KEY);
  }

  public void setPrenom2(String value) {
    takeStoredValueForKey(value, PRENOM2_KEY);
  }

  public String prenomAffichage() {
    return (String) storedValueForKey(PRENOM_AFFICHAGE_KEY);
  }

  public void setPrenomAffichage(String value) {
    takeStoredValueForKey(value, PRENOM_AFFICHAGE_KEY);
  }

  public String temSsDiplome() {
    return (String) storedValueForKey(TEM_SS_DIPLOME_KEY);
  }

  public void setTemSsDiplome(String value) {
    takeStoredValueForKey(value, TEM_SS_DIPLOME_KEY);
  }

  public String temValide() {
    return (String) storedValueForKey(TEM_VALIDE_KEY);
  }

  public void setTemValide(String value) {
    takeStoredValueForKey(value, TEM_VALIDE_KEY);
  }

  public String villeDeNaissance() {
    return (String) storedValueForKey(VILLE_DE_NAISSANCE_KEY);
  }

  public void setVilleDeNaissance(String value) {
    takeStoredValueForKey(value, VILLE_DE_NAISSANCE_KEY);
  }

  public org.cocktail.directory.eof.server.EOSupannCategorie supannCategorie() {
    return (org.cocktail.directory.eof.server.EOSupannCategorie)storedValueForKey(SUPANN_CATEGORIE_KEY);
  }
  
	public void setSupannCategorie(org.cocktail.directory.eof.server.EOSupannCategorie value) {
		takeStoredValueForKey(value,SUPANN_CATEGORIE_KEY);
	}


  public void setSupannCategorieRelationship(org.cocktail.directory.eof.server.EOSupannCategorie value) {
    if (value == null) {
    	org.cocktail.directory.eof.server.EOSupannCategorie oldValue = supannCategorie();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, SUPANN_CATEGORIE_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, SUPANN_CATEGORIE_KEY);
    }
  }
  
  public org.cocktail.directory.eof.server.VLdapPersonnelActuel vLdapPersonnelActuel() {
    return (org.cocktail.directory.eof.server.VLdapPersonnelActuel)storedValueForKey(V_LDAP_PERSONNEL_ACTUEL_KEY);
  }
  
	public void setVLdapPersonnelActuel(org.cocktail.directory.eof.server.VLdapPersonnelActuel value) {
		takeStoredValueForKey(value,V_LDAP_PERSONNEL_ACTUEL_KEY);
	}


  public void setVLdapPersonnelActuelRelationship(org.cocktail.directory.eof.server.VLdapPersonnelActuel value) {
    if (value == null) {
    	org.cocktail.directory.eof.server.VLdapPersonnelActuel oldValue = vLdapPersonnelActuel();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, V_LDAP_PERSONNEL_ACTUEL_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, V_LDAP_PERSONNEL_ACTUEL_KEY);
    }
  }
  
  public org.cocktail.directory.eof.server.EOVPersonnelActuel vPersonnelActuel() {
    return (org.cocktail.directory.eof.server.EOVPersonnelActuel)storedValueForKey(V_PERSONNEL_ACTUEL_KEY);
  }
  
	public void setVPersonnelActuel(org.cocktail.directory.eof.server.EOVPersonnelActuel value) {
		takeStoredValueForKey(value,V_PERSONNEL_ACTUEL_KEY);
	}


  public void setVPersonnelActuelRelationship(org.cocktail.directory.eof.server.EOVPersonnelActuel value) {
    if (value == null) {
    	org.cocktail.directory.eof.server.EOVPersonnelActuel oldValue = vPersonnelActuel();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, V_PERSONNEL_ACTUEL_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, V_PERSONNEL_ACTUEL_KEY);
    }
  }
  
  public NSArray etudiants() {
    return (NSArray)storedValueForKey(ETUDIANTS_KEY);
  }
  
  //ICI
  public void setEtudiants(NSArray values) {
	  takeStoredValueForKey(values,ETUDIANTS_KEY);
  }
  

  public NSArray etudiants(EOQualifier qualifier) {
    return etudiants(qualifier, null);
  }

  public NSArray etudiants(EOQualifier qualifier, NSArray sortOrderings) {
    NSArray results;
      results = etudiants();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToEtudiantsRelationship(org.cocktail.directory.eof.server.EOEtudiant object) {
    addObjectToBothSidesOfRelationshipWithKey(object, ETUDIANTS_KEY);
  }

  public void removeFromEtudiantsRelationship(org.cocktail.directory.eof.server.EOEtudiant object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, ETUDIANTS_KEY);
  }

  public org.cocktail.directory.eof.server.EOEtudiant createEtudiantsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Etudiant");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, ETUDIANTS_KEY);
    return (org.cocktail.directory.eof.server.EOEtudiant) eo;
  }

  public void deleteEtudiantsRelationship(org.cocktail.directory.eof.server.EOEtudiant object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, ETUDIANTS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllEtudiantsRelationships() {
    Enumeration objects = etudiants().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteEtudiantsRelationship((org.cocktail.directory.eof.server.EOEtudiant)objects.nextElement());
    }
  }

  public NSArray personneTelephones() {
    return (NSArray)storedValueForKey(PERSONNE_TELEPHONES_KEY);
  }
  
  //ICI
  public void setPersonneTelephones(NSArray values) {
	  takeStoredValueForKey(values,PERSONNE_TELEPHONES_KEY);
  }
  

  public NSArray personneTelephones(EOQualifier qualifier) {
    return personneTelephones(qualifier, null);
  }

  public NSArray personneTelephones(EOQualifier qualifier, NSArray sortOrderings) {
    NSArray results;
      results = personneTelephones();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToPersonneTelephonesRelationship(org.cocktail.directory.eof.server.EOPersonneTelephone object) {
    addObjectToBothSidesOfRelationshipWithKey(object, PERSONNE_TELEPHONES_KEY);
  }

  public void removeFromPersonneTelephonesRelationship(org.cocktail.directory.eof.server.EOPersonneTelephone object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, PERSONNE_TELEPHONES_KEY);
  }

  public org.cocktail.directory.eof.server.EOPersonneTelephone createPersonneTelephonesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("PersonneTelephone");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, PERSONNE_TELEPHONES_KEY);
    return (org.cocktail.directory.eof.server.EOPersonneTelephone) eo;
  }

  public void deletePersonneTelephonesRelationship(org.cocktail.directory.eof.server.EOPersonneTelephone object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, PERSONNE_TELEPHONES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllPersonneTelephonesRelationships() {
    Enumeration objects = personneTelephones().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deletePersonneTelephonesRelationship((org.cocktail.directory.eof.server.EOPersonneTelephone)objects.nextElement());
    }
  }

  public NSArray repartAssociations() {
    return (NSArray)storedValueForKey(REPART_ASSOCIATIONS_KEY);
  }
  
  //ICI
  public void setRepartAssociations(NSArray values) {
	  takeStoredValueForKey(values,REPART_ASSOCIATIONS_KEY);
  }
  

  public NSArray repartAssociations(EOQualifier qualifier) {
    return repartAssociations(qualifier, null);
  }

  public NSArray repartAssociations(EOQualifier qualifier, NSArray sortOrderings) {
    NSArray results;
      results = repartAssociations();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToRepartAssociationsRelationship(org.cocktail.directory.eof.server.EORepartAssociation object) {
    addObjectToBothSidesOfRelationshipWithKey(object, REPART_ASSOCIATIONS_KEY);
  }

  public void removeFromRepartAssociationsRelationship(org.cocktail.directory.eof.server.EORepartAssociation object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_ASSOCIATIONS_KEY);
  }

  public org.cocktail.directory.eof.server.EORepartAssociation createRepartAssociationsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RepartAssociation");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, REPART_ASSOCIATIONS_KEY);
    return (org.cocktail.directory.eof.server.EORepartAssociation) eo;
  }

  public void deleteRepartAssociationsRelationship(org.cocktail.directory.eof.server.EORepartAssociation object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_ASSOCIATIONS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartAssociationsRelationships() {
    Enumeration objects = repartAssociations().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartAssociationsRelationship((org.cocktail.directory.eof.server.EORepartAssociation)objects.nextElement());
    }
  }

  public NSArray repartComptes() {
    return (NSArray)storedValueForKey(REPART_COMPTES_KEY);
  }
  
  //ICI
  public void setRepartComptes(NSArray values) {
	  takeStoredValueForKey(values,REPART_COMPTES_KEY);
  }
  

  public NSArray repartComptes(EOQualifier qualifier) {
    return repartComptes(qualifier, null);
  }

  public NSArray repartComptes(EOQualifier qualifier, NSArray sortOrderings) {
    NSArray results;
      results = repartComptes();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToRepartComptesRelationship(org.cocktail.directory.eof.server.EORepartCompte object) {
    addObjectToBothSidesOfRelationshipWithKey(object, REPART_COMPTES_KEY);
  }

  public void removeFromRepartComptesRelationship(org.cocktail.directory.eof.server.EORepartCompte object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_COMPTES_KEY);
  }

  public org.cocktail.directory.eof.server.EORepartCompte createRepartComptesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RepartCompte");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, REPART_COMPTES_KEY);
    return (org.cocktail.directory.eof.server.EORepartCompte) eo;
  }

  public void deleteRepartComptesRelationship(org.cocktail.directory.eof.server.EORepartCompte object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_COMPTES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartComptesRelationships() {
    Enumeration objects = repartComptes().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartComptesRelationship((org.cocktail.directory.eof.server.EORepartCompte)objects.nextElement());
    }
  }

  public NSArray repartEmploi() {
    return (NSArray)storedValueForKey(REPART_EMPLOI_KEY);
  }
  
  //ICI
  public void setRepartEmploi(NSArray values) {
	  takeStoredValueForKey(values,REPART_EMPLOI_KEY);
  }
  

  public NSArray repartEmploi(EOQualifier qualifier) {
    return repartEmploi(qualifier, null, false);
  }

  public NSArray repartEmploi(EOQualifier qualifier, boolean fetch) {
    return repartEmploi(qualifier, null, fetch);
  }

  public NSArray repartEmploi(EOQualifier qualifier, NSArray sortOrderings, boolean fetch) {
    NSArray results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.directory.eof.server.EORepartEmploi.INDIVIDU_ULR_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.directory.eof.server.EORepartEmploi.fetchAll(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = repartEmploi();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToRepartEmploiRelationship(org.cocktail.directory.eof.server.EORepartEmploi object) {
    addObjectToBothSidesOfRelationshipWithKey(object, REPART_EMPLOI_KEY);
  }

  public void removeFromRepartEmploiRelationship(org.cocktail.directory.eof.server.EORepartEmploi object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_EMPLOI_KEY);
  }

  public org.cocktail.directory.eof.server.EORepartEmploi createRepartEmploiRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RepartEmploi");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, REPART_EMPLOI_KEY);
    return (org.cocktail.directory.eof.server.EORepartEmploi) eo;
  }

  public void deleteRepartEmploiRelationship(org.cocktail.directory.eof.server.EORepartEmploi object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_EMPLOI_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartEmploiRelationships() {
    Enumeration objects = repartEmploi().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartEmploiRelationship((org.cocktail.directory.eof.server.EORepartEmploi)objects.nextElement());
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

  public NSArray repartStructures() {
    return (NSArray)storedValueForKey(REPART_STRUCTURES_KEY);
  }
  
  //ICI
  public void setRepartStructures(NSArray values) {
	  takeStoredValueForKey(values,REPART_STRUCTURES_KEY);
  }
  

  public NSArray repartStructures(EOQualifier qualifier) {
    return repartStructures(qualifier, null, false);
  }

  public NSArray repartStructures(EOQualifier qualifier, boolean fetch) {
    return repartStructures(qualifier, null, fetch);
  }

  public NSArray repartStructures(EOQualifier qualifier, NSArray sortOrderings, boolean fetch) {
    NSArray results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.directory.eof.server.EORepartStructure.INDIVIDU_ULR_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.directory.eof.server.EORepartStructure.fetchAll(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = repartStructures();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToRepartStructuresRelationship(org.cocktail.directory.eof.server.EORepartStructure object) {
    addObjectToBothSidesOfRelationshipWithKey(object, REPART_STRUCTURES_KEY);
  }

  public void removeFromRepartStructuresRelationship(org.cocktail.directory.eof.server.EORepartStructure object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_STRUCTURES_KEY);
  }

  public org.cocktail.directory.eof.server.EORepartStructure createRepartStructuresRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RepartStructure");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, REPART_STRUCTURES_KEY);
    return (org.cocktail.directory.eof.server.EORepartStructure) eo;
  }

  public void deleteRepartStructuresRelationship(org.cocktail.directory.eof.server.EORepartStructure object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_STRUCTURES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartStructuresRelationships() {
    Enumeration objects = repartStructures().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartStructuresRelationship((org.cocktail.directory.eof.server.EORepartStructure)objects.nextElement());
    }
  }

  public NSArray toComptes() {
    return (NSArray)storedValueForKey(TO_COMPTES_KEY);
  }
  
  //ICI
  public void setToComptes(NSArray values) {
	  takeStoredValueForKey(values,TO_COMPTES_KEY);
  }
  

  public NSArray toComptes(EOQualifier qualifier) {
    return toComptes(qualifier, null);
  }

  public NSArray toComptes(EOQualifier qualifier, NSArray sortOrderings) {
    NSArray results;
      results = toComptes();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToToComptesRelationship(org.cocktail.directory.eof.server.EOCompte object) {
    addObjectToBothSidesOfRelationshipWithKey(object, TO_COMPTES_KEY);
  }

  public void removeFromToComptesRelationship(org.cocktail.directory.eof.server.EOCompte object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, TO_COMPTES_KEY);
  }

  public org.cocktail.directory.eof.server.EOCompte createToComptesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("Compte");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, TO_COMPTES_KEY);
    return (org.cocktail.directory.eof.server.EOCompte) eo;
  }

  public void deleteToComptesRelationship(org.cocktail.directory.eof.server.EOCompte object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, TO_COMPTES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllToComptesRelationships() {
    Enumeration objects = toComptes().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteToComptesRelationship((org.cocktail.directory.eof.server.EOCompte)objects.nextElement());
    }
  }


/**
 * Créer une instance de EOIndividuUlr avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOIndividuUlr createEOIndividuUlr(EOEditingContext editingContext, String cCivilite
, String listeRouge
, Integer noIndividu
, String nomUsuel
, Integer persId
, String prenom
, String temSsDiplome
, String temValide
			) {
    EOIndividuUlr eo = (EOIndividuUlr) createAndInsertInstance(editingContext, _EOIndividuUlr.ENTITY_NAME);    
		eo.setCCivilite(cCivilite);
		eo.setListeRouge(listeRouge);
		eo.setNoIndividu(noIndividu);
		eo.setNomUsuel(nomUsuel);
		eo.setPersId(persId);
		eo.setPrenom(prenom);
		eo.setTemSsDiplome(temSsDiplome);
		eo.setTemValide(temValide);
    return eo;
  }

  
	  public EOIndividuUlr localInstanceIn(EOEditingContext editingContext) {
	  		return (EOIndividuUlr)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOIndividuUlr creerInstance(EOEditingContext editingContext) {
	  		EOIndividuUlr object = (EOIndividuUlr)createAndInsertInstance(editingContext, _EOIndividuUlr.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOIndividuUlr localInstanceIn(EOEditingContext editingContext, EOIndividuUlr eo) {
    EOIndividuUlr localInstance = (eo == null) ? null : (EOIndividuUlr)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOIndividuUlr#localInstanceIn a la place.
   */
	public static EOIndividuUlr localInstanceOf(EOEditingContext editingContext, EOIndividuUlr eo) {
		return EOIndividuUlr.localInstanceIn(editingContext, eo);
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
	  public static EOIndividuUlr fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOIndividuUlr fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOIndividuUlr eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOIndividuUlr)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOIndividuUlr fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOIndividuUlr fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOIndividuUlr eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOIndividuUlr)eoObjects.objectAtIndex(0);
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
	  public static EOIndividuUlr fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOIndividuUlr eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOIndividuUlr ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOIndividuUlr fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
