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

// DO NOT EDIT.  Make changes to EOStructureUlr.java instead.
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



public abstract class _EOStructureUlr extends  DirectoryRecord {
	public static final String ENTITY_NAME = "StructureUlr";
	public static final String ENTITY_TABLE_NAME = "STRUCTURE_ULR";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "cStructure";

	public static final String C_ACADEMIE_KEY = "cAcademie";
	public static final String C_NAF_KEY = "cNaf";
	public static final String C_NIC_KEY = "cNic";
	public static final String C_RNE_KEY = "cRne";
	public static final String C_STATUT_JURIDIQUE_KEY = "cStatutJuridique";
	public static final String C_STRUCTURE_KEY = "cStructure";
	public static final String C_TYPE_DECISION_STR_KEY = "cTypeDecisionStr";
	public static final String C_TYPE_ETABLISSEMEN_KEY = "cTypeEtablissemen";
	public static final String DATE_DECISION_KEY = "dateDecision";
	public static final String DATE_FERMETURE_KEY = "dateFermeture";
	public static final String DATE_OUVERTURE_KEY = "dateOuverture";
	public static final String D_CREATION_KEY = "dCreation";
	public static final String D_MODIFICATION_KEY = "dModification";
	public static final String ETAB_CODURSSAF_KEY = "etabCodurssaf";
	public static final String ETAB_NUMURSSAF_KEY = "etabNumurssaf";
	public static final String EXPORT_KEY = "export";
	public static final String GRP_ACCES_KEY = "grpAcces";
	public static final String GRP_ALIAS_KEY = "grpAlias";
	public static final String GRP_APE_CODE_KEY = "grpApeCode";
	public static final String GRP_APE_CODE_BIS_KEY = "grpApeCodeBis";
	public static final String GRP_APE_CODE_COMP_KEY = "grpApeCodeComp";
	public static final String GRP_CA_KEY = "grpCa";
	public static final String GRP_CAPITAL_KEY = "grpCapital";
	public static final String GRP_CENTRE_DECISION_KEY = "grpCentreDecision";
	public static final String GRP_EFFECTIFS_KEY = "grpEffectifs";
	public static final String GRP_FONCTION1_KEY = "grpFonction1";
	public static final String GRP_FONCTION2_KEY = "grpFonction2";
	public static final String GRP_FORME_JURIDIQUE_KEY = "grpFormeJuridique";
	public static final String GRP_MOTS_CLEFS_KEY = "grpMotsClefs";
	public static final String GRP_RESPONSABILITE_KEY = "grpResponsabilite";
	public static final String GRP_TRADEMARQUE_KEY = "grpTrademarque";
	public static final String GRP_WEBMESTRE_KEY = "grpWebmestre";
	public static final String LC_STRUCTURE_KEY = "lcStructure";
	public static final String LL_STRUCTURE_KEY = "llStructure";
	public static final String MOYENNE_AGE_KEY = "moyenneAge";
	public static final String NUM_ASSEDIC_KEY = "numAssedic";
	public static final String NUM_CNRACL_KEY = "numCnracl";
	public static final String NUM_IRCANTEC_KEY = "numIrcantec";
	public static final String NUM_RAFP_KEY = "numRafp";
	public static final String ORG_ORDRE_KEY = "orgOrdre";
	public static final String PERS_ID_KEY = "persId";
	public static final String PSEC_ORDRE_KEY = "psecOrdre";
	public static final String REF_DECISION_KEY = "refDecision";
	public static final String REF_EXT_COMP_KEY = "refExtComp";
	public static final String REF_EXT_CR_KEY = "refExtCr";
	public static final String REF_EXT_ETAB_KEY = "refExtEtab";
	public static final String RISQUE_ACC_TRAV_KEY = "risqueAccTrav";
	public static final String SIREN_KEY = "siren";
	public static final String SIRET_KEY = "siret";
	public static final String STR_ACCUEIL_KEY = "strAccueil";
	public static final String STR_ACTIVITE_KEY = "strActivite";
	public static final String STR_AFFICHAGE_KEY = "strAffichage";
	public static final String STR_ORIGINE_KEY = "strOrigine";
	public static final String STR_PHOTO_KEY = "strPhoto";
	public static final String STR_RECHERCHE_KEY = "strRecherche";
	public static final String TAUX_ACC_TRAV_KEY = "tauxAccTrav";
	public static final String TAUX_EXONERATION_TVA_KEY = "tauxExonerationTva";
	public static final String TAUX_IR_KEY = "tauxIr";
	public static final String TAUX_TRANSPORT_KEY = "tauxTransport";
	public static final String TEM_COTIS_ASSEDIC_KEY = "temCotisAssedic";
	public static final String TEM_DADS_KEY = "temDads";
	public static final String TEM_ETABLISSEMENT_PAYE_KEY = "temEtablissementPaye";
	public static final String TEM_PLAFOND_REDUIT_KEY = "temPlafondReduit";
	public static final String TEM_SECTORISE_KEY = "temSectorise";
	public static final String TEM_SOUMIS_TVA_KEY = "temSoumisTva";
	public static final String TEM_VALIDE_KEY = "temValide";
	public static final String TVA_INTRACOM_KEY = "tvaIntracom";

// Attributs non visibles
	public static final String C_STRUCTURE_PERE_KEY = "cStructurePere";
	public static final String C_TYPE_STRUCTURE_KEY = "cTypeStructure";
	public static final String GRP_OWNER_KEY = "grpOwner";
	public static final String GRP_RESPONSABLE_KEY = "grpResponsable";

//Colonnes dans la base de donnees
	public static final String C_ACADEMIE_COLKEY = "C_ACADEMIE";
	public static final String C_NAF_COLKEY = "C_NAF";
	public static final String C_NIC_COLKEY = "C_NIC";
	public static final String C_RNE_COLKEY = "C_RNE";
	public static final String C_STATUT_JURIDIQUE_COLKEY = "C_STATUT_JURIDIQUE";
	public static final String C_STRUCTURE_COLKEY = "C_STRUCTURE";
	public static final String C_TYPE_DECISION_STR_COLKEY = "C_TYPE_DECISION_STR";
	public static final String C_TYPE_ETABLISSEMEN_COLKEY = "C_TYPE_ETABLISSEMEN";
	public static final String DATE_DECISION_COLKEY = "DATE_DECISION";
	public static final String DATE_FERMETURE_COLKEY = "DATE_FERMETURE";
	public static final String DATE_OUVERTURE_COLKEY = "DATE_OUVERTURE";
	public static final String D_CREATION_COLKEY = "D_CREATION";
	public static final String D_MODIFICATION_COLKEY = "D_MODIFICATION";
	public static final String ETAB_CODURSSAF_COLKEY = "ETAB_CODURSSAF";
	public static final String ETAB_NUMURSSAF_COLKEY = "ETAB_NUMURSSAF";
	public static final String EXPORT_COLKEY = "EXPORT";
	public static final String GRP_ACCES_COLKEY = "GRP_ACCES";
	public static final String GRP_ALIAS_COLKEY = "GRP_ALIAS";
	public static final String GRP_APE_CODE_COLKEY = "GRP_APE_CODE";
	public static final String GRP_APE_CODE_BIS_COLKEY = "GRP_APE_CODE_BIS";
	public static final String GRP_APE_CODE_COMP_COLKEY = "GRP_APE_CODE_COMP";
	public static final String GRP_CA_COLKEY = "GRP_CA";
	public static final String GRP_CAPITAL_COLKEY = "GRP_CAPITAL";
	public static final String GRP_CENTRE_DECISION_COLKEY = "GRP_CENTRE_DECISION";
	public static final String GRP_EFFECTIFS_COLKEY = "GRP_EFFECTIFS";
	public static final String GRP_FONCTION1_COLKEY = "GRP_FONCTION1";
	public static final String GRP_FONCTION2_COLKEY = "GRP_FONCTION2";
	public static final String GRP_FORME_JURIDIQUE_COLKEY = "GRP_FORME_JURIDIQUE";
	public static final String GRP_MOTS_CLEFS_COLKEY = "GRP_MOTS_CLEFS";
	public static final String GRP_RESPONSABILITE_COLKEY = "GRP_RESPONSABILITE";
	public static final String GRP_TRADEMARQUE_COLKEY = "GRP_TRADEMARQUE";
	public static final String GRP_WEBMESTRE_COLKEY = "GRP_WEBMESTRE";
	public static final String LC_STRUCTURE_COLKEY = "LC_STRUCTURE";
	public static final String LL_STRUCTURE_COLKEY = "LL_STRUCTURE";
	public static final String MOYENNE_AGE_COLKEY = "MOYENNE_AGE";
	public static final String NUM_ASSEDIC_COLKEY = "NUM_ASSEDIC";
	public static final String NUM_CNRACL_COLKEY = "NUM_CNRACL";
	public static final String NUM_IRCANTEC_COLKEY = "NUM_IRCANTEC";
	public static final String NUM_RAFP_COLKEY = "NUM_RAFP";
	public static final String ORG_ORDRE_COLKEY = "ORG_ORDRE";
	public static final String PERS_ID_COLKEY = "PERS_ID";
	public static final String PSEC_ORDRE_COLKEY = "PSEC_ORDRE";
	public static final String REF_DECISION_COLKEY = "REF_DECISION";
	public static final String REF_EXT_COMP_COLKEY = "REF_EXT_COMP";
	public static final String REF_EXT_CR_COLKEY = "REF_EXT_CR";
	public static final String REF_EXT_ETAB_COLKEY = "REF_EXT_ETAB";
	public static final String RISQUE_ACC_TRAV_COLKEY = "RISQUE_ACC_TRAV";
	public static final String SIREN_COLKEY = "SIREN";
	public static final String SIRET_COLKEY = "SIRET";
	public static final String STR_ACCUEIL_COLKEY = "STR_ACCUEIL";
	public static final String STR_ACTIVITE_COLKEY = "STR_ACTIVITE";
	public static final String STR_AFFICHAGE_COLKEY = "STR_AFFICHAGE";
	public static final String STR_ORIGINE_COLKEY = "STR_ORIGINE";
	public static final String STR_PHOTO_COLKEY = "STR_PHOTO";
	public static final String STR_RECHERCHE_COLKEY = "STR_RECHERCHE";
	public static final String TAUX_ACC_TRAV_COLKEY = "TAUX_ACC_TRAV";
	public static final String TAUX_EXONERATION_TVA_COLKEY = "TAUX_EXONERATION_TVA";
	public static final String TAUX_IR_COLKEY = "TAUX_IR";
	public static final String TAUX_TRANSPORT_COLKEY = "TAUX_TRANSPORT";
	public static final String TEM_COTIS_ASSEDIC_COLKEY = "TEM_COTIS_ASSEDIC";
	public static final String TEM_DADS_COLKEY = "TEM_DADS";
	public static final String TEM_ETABLISSEMENT_PAYE_COLKEY = "TEM_ETABLISSEMENT_PAYE";
	public static final String TEM_PLAFOND_REDUIT_COLKEY = "TEM_PLAFOND_REDUIT";
	public static final String TEM_SECTORISE_COLKEY = "TEM_SECTORISE";
	public static final String TEM_SOUMIS_TVA_COLKEY = "TEM_SOUMIS_TVA";
	public static final String TEM_VALIDE_COLKEY = "TEM_VALIDE";
	public static final String TVA_INTRACOM_COLKEY = "TVA_INTRACOM";

	public static final String C_STRUCTURE_PERE_COLKEY = "C_STRUCTURE_PERE";
	public static final String C_TYPE_STRUCTURE_COLKEY = "C_TYPE_STRUCTURE";
	public static final String GRP_OWNER_COLKEY = "GRP_OWNER";
	public static final String GRP_RESPONSABLE_COLKEY = "GRP_RESPONSABLE";


	// Relationships
	public static final String INDIVIDU_ULR_KEY = "individuUlr";
	public static final String LISTE_FORUMS_KEY = "listeForums";
	public static final String PERSONNE_ALIASES_KEY = "personneAliases";
	public static final String PERSONNE_TELEPHONES_KEY = "personneTelephones";
	public static final String REPART_STRUCTURES_KEY = "repartStructures";
	public static final String REPART_TYPE_GROUPES_KEY = "repartTypeGroupes";
	public static final String RESPONSABLE_GROUPE_KEY = "responsableGroupe";
	public static final String STRUCTURE_ULR_KEY = "structureUlr";
	public static final String STRUCTURE_ULRS_KEY = "structureUlrs";
	public static final String TYPE_STRUCTURE_KEY = "typeStructure";



	// Accessors methods
  public String cAcademie() {
    return (String) storedValueForKey(C_ACADEMIE_KEY);
  }

  public void setCAcademie(String value) {
    takeStoredValueForKey(value, C_ACADEMIE_KEY);
  }

  public String cNaf() {
    return (String) storedValueForKey(C_NAF_KEY);
  }

  public void setCNaf(String value) {
    takeStoredValueForKey(value, C_NAF_KEY);
  }

  public String cNic() {
    return (String) storedValueForKey(C_NIC_KEY);
  }

  public void setCNic(String value) {
    takeStoredValueForKey(value, C_NIC_KEY);
  }

  public String cRne() {
    return (String) storedValueForKey(C_RNE_KEY);
  }

  public void setCRne(String value) {
    takeStoredValueForKey(value, C_RNE_KEY);
  }

  public String cStatutJuridique() {
    return (String) storedValueForKey(C_STATUT_JURIDIQUE_KEY);
  }

  public void setCStatutJuridique(String value) {
    takeStoredValueForKey(value, C_STATUT_JURIDIQUE_KEY);
  }

  public String cStructure() {
    return (String) storedValueForKey(C_STRUCTURE_KEY);
  }

  public void setCStructure(String value) {
    takeStoredValueForKey(value, C_STRUCTURE_KEY);
  }

  public String cTypeDecisionStr() {
    return (String) storedValueForKey(C_TYPE_DECISION_STR_KEY);
  }

  public void setCTypeDecisionStr(String value) {
    takeStoredValueForKey(value, C_TYPE_DECISION_STR_KEY);
  }

  public String cTypeEtablissemen() {
    return (String) storedValueForKey(C_TYPE_ETABLISSEMEN_KEY);
  }

  public void setCTypeEtablissemen(String value) {
    takeStoredValueForKey(value, C_TYPE_ETABLISSEMEN_KEY);
  }

  public NSTimestamp dateDecision() {
    return (NSTimestamp) storedValueForKey(DATE_DECISION_KEY);
  }

  public void setDateDecision(NSTimestamp value) {
    takeStoredValueForKey(value, DATE_DECISION_KEY);
  }

  public NSTimestamp dateFermeture() {
    return (NSTimestamp) storedValueForKey(DATE_FERMETURE_KEY);
  }

  public void setDateFermeture(NSTimestamp value) {
    takeStoredValueForKey(value, DATE_FERMETURE_KEY);
  }

  public NSTimestamp dateOuverture() {
    return (NSTimestamp) storedValueForKey(DATE_OUVERTURE_KEY);
  }

  public void setDateOuverture(NSTimestamp value) {
    takeStoredValueForKey(value, DATE_OUVERTURE_KEY);
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

  public String etabCodurssaf() {
    return (String) storedValueForKey(ETAB_CODURSSAF_KEY);
  }

  public void setEtabCodurssaf(String value) {
    takeStoredValueForKey(value, ETAB_CODURSSAF_KEY);
  }

  public String etabNumurssaf() {
    return (String) storedValueForKey(ETAB_NUMURSSAF_KEY);
  }

  public void setEtabNumurssaf(String value) {
    takeStoredValueForKey(value, ETAB_NUMURSSAF_KEY);
  }

  public Double export() {
    return (Double) storedValueForKey(EXPORT_KEY);
  }

  public void setExport(Double value) {
    takeStoredValueForKey(value, EXPORT_KEY);
  }

  public String grpAcces() {
    return (String) storedValueForKey(GRP_ACCES_KEY);
  }

  public void setGrpAcces(String value) {
    takeStoredValueForKey(value, GRP_ACCES_KEY);
  }

  public String grpAlias() {
    return (String) storedValueForKey(GRP_ALIAS_KEY);
  }

  public void setGrpAlias(String value) {
    takeStoredValueForKey(value, GRP_ALIAS_KEY);
  }

  public String grpApeCode() {
    return (String) storedValueForKey(GRP_APE_CODE_KEY);
  }

  public void setGrpApeCode(String value) {
    takeStoredValueForKey(value, GRP_APE_CODE_KEY);
  }

  public String grpApeCodeBis() {
    return (String) storedValueForKey(GRP_APE_CODE_BIS_KEY);
  }

  public void setGrpApeCodeBis(String value) {
    takeStoredValueForKey(value, GRP_APE_CODE_BIS_KEY);
  }

  public String grpApeCodeComp() {
    return (String) storedValueForKey(GRP_APE_CODE_COMP_KEY);
  }

  public void setGrpApeCodeComp(String value) {
    takeStoredValueForKey(value, GRP_APE_CODE_COMP_KEY);
  }

  public Double grpCa() {
    return (Double) storedValueForKey(GRP_CA_KEY);
  }

  public void setGrpCa(Double value) {
    takeStoredValueForKey(value, GRP_CA_KEY);
  }

  public Double grpCapital() {
    return (Double) storedValueForKey(GRP_CAPITAL_KEY);
  }

  public void setGrpCapital(Double value) {
    takeStoredValueForKey(value, GRP_CAPITAL_KEY);
  }

  public String grpCentreDecision() {
    return (String) storedValueForKey(GRP_CENTRE_DECISION_KEY);
  }

  public void setGrpCentreDecision(String value) {
    takeStoredValueForKey(value, GRP_CENTRE_DECISION_KEY);
  }

  public Double grpEffectifs() {
    return (Double) storedValueForKey(GRP_EFFECTIFS_KEY);
  }

  public void setGrpEffectifs(Double value) {
    takeStoredValueForKey(value, GRP_EFFECTIFS_KEY);
  }

  public String grpFonction1() {
    return (String) storedValueForKey(GRP_FONCTION1_KEY);
  }

  public void setGrpFonction1(String value) {
    takeStoredValueForKey(value, GRP_FONCTION1_KEY);
  }

  public String grpFonction2() {
    return (String) storedValueForKey(GRP_FONCTION2_KEY);
  }

  public void setGrpFonction2(String value) {
    takeStoredValueForKey(value, GRP_FONCTION2_KEY);
  }

  public String grpFormeJuridique() {
    return (String) storedValueForKey(GRP_FORME_JURIDIQUE_KEY);
  }

  public void setGrpFormeJuridique(String value) {
    takeStoredValueForKey(value, GRP_FORME_JURIDIQUE_KEY);
  }

  public String grpMotsClefs() {
    return (String) storedValueForKey(GRP_MOTS_CLEFS_KEY);
  }

  public void setGrpMotsClefs(String value) {
    takeStoredValueForKey(value, GRP_MOTS_CLEFS_KEY);
  }

  public String grpResponsabilite() {
    return (String) storedValueForKey(GRP_RESPONSABILITE_KEY);
  }

  public void setGrpResponsabilite(String value) {
    takeStoredValueForKey(value, GRP_RESPONSABILITE_KEY);
  }

  public String grpTrademarque() {
    return (String) storedValueForKey(GRP_TRADEMARQUE_KEY);
  }

  public void setGrpTrademarque(String value) {
    takeStoredValueForKey(value, GRP_TRADEMARQUE_KEY);
  }

  public String grpWebmestre() {
    return (String) storedValueForKey(GRP_WEBMESTRE_KEY);
  }

  public void setGrpWebmestre(String value) {
    takeStoredValueForKey(value, GRP_WEBMESTRE_KEY);
  }

  public String lcStructure() {
    return (String) storedValueForKey(LC_STRUCTURE_KEY);
  }

  public void setLcStructure(String value) {
    takeStoredValueForKey(value, LC_STRUCTURE_KEY);
  }

  public String llStructure() {
    return (String) storedValueForKey(LL_STRUCTURE_KEY);
  }

  public void setLlStructure(String value) {
    takeStoredValueForKey(value, LL_STRUCTURE_KEY);
  }

  public Double moyenneAge() {
    return (Double) storedValueForKey(MOYENNE_AGE_KEY);
  }

  public void setMoyenneAge(Double value) {
    takeStoredValueForKey(value, MOYENNE_AGE_KEY);
  }

  public String numAssedic() {
    return (String) storedValueForKey(NUM_ASSEDIC_KEY);
  }

  public void setNumAssedic(String value) {
    takeStoredValueForKey(value, NUM_ASSEDIC_KEY);
  }

  public String numCnracl() {
    return (String) storedValueForKey(NUM_CNRACL_KEY);
  }

  public void setNumCnracl(String value) {
    takeStoredValueForKey(value, NUM_CNRACL_KEY);
  }

  public String numIrcantec() {
    return (String) storedValueForKey(NUM_IRCANTEC_KEY);
  }

  public void setNumIrcantec(String value) {
    takeStoredValueForKey(value, NUM_IRCANTEC_KEY);
  }

  public String numRafp() {
    return (String) storedValueForKey(NUM_RAFP_KEY);
  }

  public void setNumRafp(String value) {
    takeStoredValueForKey(value, NUM_RAFP_KEY);
  }

  public Double orgOrdre() {
    return (Double) storedValueForKey(ORG_ORDRE_KEY);
  }

  public void setOrgOrdre(Double value) {
    takeStoredValueForKey(value, ORG_ORDRE_KEY);
  }

  public Integer persId() {
    return (Integer) storedValueForKey(PERS_ID_KEY);
  }

  public void setPersId(Integer value) {
    takeStoredValueForKey(value, PERS_ID_KEY);
  }

  public Double psecOrdre() {
    return (Double) storedValueForKey(PSEC_ORDRE_KEY);
  }

  public void setPsecOrdre(Double value) {
    takeStoredValueForKey(value, PSEC_ORDRE_KEY);
  }

  public String refDecision() {
    return (String) storedValueForKey(REF_DECISION_KEY);
  }

  public void setRefDecision(String value) {
    takeStoredValueForKey(value, REF_DECISION_KEY);
  }

  public String refExtComp() {
    return (String) storedValueForKey(REF_EXT_COMP_KEY);
  }

  public void setRefExtComp(String value) {
    takeStoredValueForKey(value, REF_EXT_COMP_KEY);
  }

  public String refExtCr() {
    return (String) storedValueForKey(REF_EXT_CR_KEY);
  }

  public void setRefExtCr(String value) {
    takeStoredValueForKey(value, REF_EXT_CR_KEY);
  }

  public String refExtEtab() {
    return (String) storedValueForKey(REF_EXT_ETAB_KEY);
  }

  public void setRefExtEtab(String value) {
    takeStoredValueForKey(value, REF_EXT_ETAB_KEY);
  }

  public String risqueAccTrav() {
    return (String) storedValueForKey(RISQUE_ACC_TRAV_KEY);
  }

  public void setRisqueAccTrav(String value) {
    takeStoredValueForKey(value, RISQUE_ACC_TRAV_KEY);
  }

  public String siren() {
    return (String) storedValueForKey(SIREN_KEY);
  }

  public void setSiren(String value) {
    takeStoredValueForKey(value, SIREN_KEY);
  }

  public String siret() {
    return (String) storedValueForKey(SIRET_KEY);
  }

  public void setSiret(String value) {
    takeStoredValueForKey(value, SIRET_KEY);
  }

  public String strAccueil() {
    return (String) storedValueForKey(STR_ACCUEIL_KEY);
  }

  public void setStrAccueil(String value) {
    takeStoredValueForKey(value, STR_ACCUEIL_KEY);
  }

  public String strActivite() {
    return (String) storedValueForKey(STR_ACTIVITE_KEY);
  }

  public void setStrActivite(String value) {
    takeStoredValueForKey(value, STR_ACTIVITE_KEY);
  }

  public String strAffichage() {
    return (String) storedValueForKey(STR_AFFICHAGE_KEY);
  }

  public void setStrAffichage(String value) {
    takeStoredValueForKey(value, STR_AFFICHAGE_KEY);
  }

  public String strOrigine() {
    return (String) storedValueForKey(STR_ORIGINE_KEY);
  }

  public void setStrOrigine(String value) {
    takeStoredValueForKey(value, STR_ORIGINE_KEY);
  }

  public String strPhoto() {
    return (String) storedValueForKey(STR_PHOTO_KEY);
  }

  public void setStrPhoto(String value) {
    takeStoredValueForKey(value, STR_PHOTO_KEY);
  }

  public String strRecherche() {
    return (String) storedValueForKey(STR_RECHERCHE_KEY);
  }

  public void setStrRecherche(String value) {
    takeStoredValueForKey(value, STR_RECHERCHE_KEY);
  }

  public String tauxAccTrav() {
    return (String) storedValueForKey(TAUX_ACC_TRAV_KEY);
  }

  public void setTauxAccTrav(String value) {
    takeStoredValueForKey(value, TAUX_ACC_TRAV_KEY);
  }

  public String tauxExonerationTva() {
    return (String) storedValueForKey(TAUX_EXONERATION_TVA_KEY);
  }

  public void setTauxExonerationTva(String value) {
    takeStoredValueForKey(value, TAUX_EXONERATION_TVA_KEY);
  }

  public String tauxIr() {
    return (String) storedValueForKey(TAUX_IR_KEY);
  }

  public void setTauxIr(String value) {
    takeStoredValueForKey(value, TAUX_IR_KEY);
  }

  public String tauxTransport() {
    return (String) storedValueForKey(TAUX_TRANSPORT_KEY);
  }

  public void setTauxTransport(String value) {
    takeStoredValueForKey(value, TAUX_TRANSPORT_KEY);
  }

  public String temCotisAssedic() {
    return (String) storedValueForKey(TEM_COTIS_ASSEDIC_KEY);
  }

  public void setTemCotisAssedic(String value) {
    takeStoredValueForKey(value, TEM_COTIS_ASSEDIC_KEY);
  }

  public String temDads() {
    return (String) storedValueForKey(TEM_DADS_KEY);
  }

  public void setTemDads(String value) {
    takeStoredValueForKey(value, TEM_DADS_KEY);
  }

  public String temEtablissementPaye() {
    return (String) storedValueForKey(TEM_ETABLISSEMENT_PAYE_KEY);
  }

  public void setTemEtablissementPaye(String value) {
    takeStoredValueForKey(value, TEM_ETABLISSEMENT_PAYE_KEY);
  }

  public String temPlafondReduit() {
    return (String) storedValueForKey(TEM_PLAFOND_REDUIT_KEY);
  }

  public void setTemPlafondReduit(String value) {
    takeStoredValueForKey(value, TEM_PLAFOND_REDUIT_KEY);
  }

  public String temSectorise() {
    return (String) storedValueForKey(TEM_SECTORISE_KEY);
  }

  public void setTemSectorise(String value) {
    takeStoredValueForKey(value, TEM_SECTORISE_KEY);
  }

  public String temSoumisTva() {
    return (String) storedValueForKey(TEM_SOUMIS_TVA_KEY);
  }

  public void setTemSoumisTva(String value) {
    takeStoredValueForKey(value, TEM_SOUMIS_TVA_KEY);
  }

  public String temValide() {
    return (String) storedValueForKey(TEM_VALIDE_KEY);
  }

  public void setTemValide(String value) {
    takeStoredValueForKey(value, TEM_VALIDE_KEY);
  }

  public String tvaIntracom() {
    return (String) storedValueForKey(TVA_INTRACOM_KEY);
  }

  public void setTvaIntracom(String value) {
    takeStoredValueForKey(value, TVA_INTRACOM_KEY);
  }

  public org.cocktail.directory.eof.server.EOIndividuUlr individuUlr() {
    return (org.cocktail.directory.eof.server.EOIndividuUlr)storedValueForKey(INDIVIDU_ULR_KEY);
  }
  
	public void setIndividuUlr(org.cocktail.directory.eof.server.EOIndividuUlr value) {
		takeStoredValueForKey(value,INDIVIDU_ULR_KEY);
	}


  public void setIndividuUlrRelationship(org.cocktail.directory.eof.server.EOIndividuUlr value) {
    if (value == null) {
    	org.cocktail.directory.eof.server.EOIndividuUlr oldValue = individuUlr();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, INDIVIDU_ULR_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, INDIVIDU_ULR_KEY);
    }
  }
  
  public org.cocktail.directory.eof.server.EOIndividuUlr responsableGroupe() {
    return (org.cocktail.directory.eof.server.EOIndividuUlr)storedValueForKey(RESPONSABLE_GROUPE_KEY);
  }
  
	public void setResponsableGroupe(org.cocktail.directory.eof.server.EOIndividuUlr value) {
		takeStoredValueForKey(value,RESPONSABLE_GROUPE_KEY);
	}


  public void setResponsableGroupeRelationship(org.cocktail.directory.eof.server.EOIndividuUlr value) {
    if (value == null) {
    	org.cocktail.directory.eof.server.EOIndividuUlr oldValue = responsableGroupe();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, RESPONSABLE_GROUPE_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, RESPONSABLE_GROUPE_KEY);
    }
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
  
  public org.cocktail.directory.eof.server.EOTypeStructure typeStructure() {
    return (org.cocktail.directory.eof.server.EOTypeStructure)storedValueForKey(TYPE_STRUCTURE_KEY);
  }
  
	public void setTypeStructure(org.cocktail.directory.eof.server.EOTypeStructure value) {
		takeStoredValueForKey(value,TYPE_STRUCTURE_KEY);
	}


  public void setTypeStructureRelationship(org.cocktail.directory.eof.server.EOTypeStructure value) {
    if (value == null) {
    	org.cocktail.directory.eof.server.EOTypeStructure oldValue = typeStructure();
    	if (oldValue != null) {
    		removeObjectFromBothSidesOfRelationshipWithKey(oldValue, TYPE_STRUCTURE_KEY);
      }
    } else {
    	addObjectToBothSidesOfRelationshipWithKey(value, TYPE_STRUCTURE_KEY);
    }
  }
  
  public NSArray listeForums() {
    return (NSArray)storedValueForKey(LISTE_FORUMS_KEY);
  }
  
  //ICI
  public void setListeForums(NSArray values) {
	  takeStoredValueForKey(values,LISTE_FORUMS_KEY);
  }
  

  public NSArray listeForums(EOQualifier qualifier) {
    return listeForums(qualifier, null);
  }

  public NSArray listeForums(EOQualifier qualifier, NSArray sortOrderings) {
    NSArray results;
      results = listeForums();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToListeForumsRelationship(org.cocktail.directory.eof.server.EOListeForums object) {
    addObjectToBothSidesOfRelationshipWithKey(object, LISTE_FORUMS_KEY);
  }

  public void removeFromListeForumsRelationship(org.cocktail.directory.eof.server.EOListeForums object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, LISTE_FORUMS_KEY);
  }

  public org.cocktail.directory.eof.server.EOListeForums createListeForumsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("ListeForums");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, LISTE_FORUMS_KEY);
    return (org.cocktail.directory.eof.server.EOListeForums) eo;
  }

  public void deleteListeForumsRelationship(org.cocktail.directory.eof.server.EOListeForums object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, LISTE_FORUMS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllListeForumsRelationships() {
    Enumeration objects = listeForums().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteListeForumsRelationship((org.cocktail.directory.eof.server.EOListeForums)objects.nextElement());
    }
  }

  public NSArray personneAliases() {
    return (NSArray)storedValueForKey(PERSONNE_ALIASES_KEY);
  }
  
  //ICI
  public void setPersonneAliases(NSArray values) {
	  takeStoredValueForKey(values,PERSONNE_ALIASES_KEY);
  }
  

  public NSArray personneAliases(EOQualifier qualifier) {
    return personneAliases(qualifier, null);
  }

  public NSArray personneAliases(EOQualifier qualifier, NSArray sortOrderings) {
    NSArray results;
      results = personneAliases();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    return results;
  }
  
  public void addToPersonneAliasesRelationship(org.cocktail.directory.eof.server.EOPersonneAlias object) {
    addObjectToBothSidesOfRelationshipWithKey(object, PERSONNE_ALIASES_KEY);
  }

  public void removeFromPersonneAliasesRelationship(org.cocktail.directory.eof.server.EOPersonneAlias object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, PERSONNE_ALIASES_KEY);
  }

  public org.cocktail.directory.eof.server.EOPersonneAlias createPersonneAliasesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("PersonneAlias");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, PERSONNE_ALIASES_KEY);
    return (org.cocktail.directory.eof.server.EOPersonneAlias) eo;
  }

  public void deletePersonneAliasesRelationship(org.cocktail.directory.eof.server.EOPersonneAlias object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, PERSONNE_ALIASES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllPersonneAliasesRelationships() {
    Enumeration objects = personneAliases().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deletePersonneAliasesRelationship((org.cocktail.directory.eof.server.EOPersonneAlias)objects.nextElement());
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
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.directory.eof.server.EORepartStructure.STRUCTURE_ULR_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
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

  public NSArray repartTypeGroupes() {
    return (NSArray)storedValueForKey(REPART_TYPE_GROUPES_KEY);
  }
  
  //ICI
  public void setRepartTypeGroupes(NSArray values) {
	  takeStoredValueForKey(values,REPART_TYPE_GROUPES_KEY);
  }
  

  public NSArray repartTypeGroupes(EOQualifier qualifier) {
    return repartTypeGroupes(qualifier, null, false);
  }

  public NSArray repartTypeGroupes(EOQualifier qualifier, boolean fetch) {
    return repartTypeGroupes(qualifier, null, fetch);
  }

  public NSArray repartTypeGroupes(EOQualifier qualifier, NSArray sortOrderings, boolean fetch) {
    NSArray results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.directory.eof.server.EORepartTypeGroupe.STRUCTURE_ULR_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.directory.eof.server.EORepartTypeGroupe.fetchAll(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = repartTypeGroupes();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToRepartTypeGroupesRelationship(org.cocktail.directory.eof.server.EORepartTypeGroupe object) {
    addObjectToBothSidesOfRelationshipWithKey(object, REPART_TYPE_GROUPES_KEY);
  }

  public void removeFromRepartTypeGroupesRelationship(org.cocktail.directory.eof.server.EORepartTypeGroupe object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_TYPE_GROUPES_KEY);
  }

  public org.cocktail.directory.eof.server.EORepartTypeGroupe createRepartTypeGroupesRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("RepartTypeGroupe");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, REPART_TYPE_GROUPES_KEY);
    return (org.cocktail.directory.eof.server.EORepartTypeGroupe) eo;
  }

  public void deleteRepartTypeGroupesRelationship(org.cocktail.directory.eof.server.EORepartTypeGroupe object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, REPART_TYPE_GROUPES_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllRepartTypeGroupesRelationships() {
    Enumeration objects = repartTypeGroupes().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteRepartTypeGroupesRelationship((org.cocktail.directory.eof.server.EORepartTypeGroupe)objects.nextElement());
    }
  }

  public NSArray structureUlrs() {
    return (NSArray)storedValueForKey(STRUCTURE_ULRS_KEY);
  }
  
  //ICI
  public void setStructureUlrs(NSArray values) {
	  takeStoredValueForKey(values,STRUCTURE_ULRS_KEY);
  }
  

  public NSArray structureUlrs(EOQualifier qualifier) {
    return structureUlrs(qualifier, null, false);
  }

  public NSArray structureUlrs(EOQualifier qualifier, boolean fetch) {
    return structureUlrs(qualifier, null, fetch);
  }

  public NSArray structureUlrs(EOQualifier qualifier, NSArray sortOrderings, boolean fetch) {
    NSArray results;
    if (fetch) {
      EOQualifier fullQualifier;
      EOQualifier inverseQualifier = new EOKeyValueQualifier(org.cocktail.directory.eof.server.EOStructureUlr.STRUCTURE_ULR_KEY, EOQualifier.QualifierOperatorEqual, this);
    	
      if (qualifier == null) {
        fullQualifier = inverseQualifier;
      }
      else {
        NSMutableArray qualifiers = new NSMutableArray();
        qualifiers.addObject(qualifier);
        qualifiers.addObject(inverseQualifier);
        fullQualifier = new EOAndQualifier(qualifiers);
      }

      results = org.cocktail.directory.eof.server.EOStructureUlr.fetchAll(editingContext(), fullQualifier, sortOrderings);
    }
    else {
      results = structureUlrs();
      if (qualifier != null) {
        results = (NSArray)EOQualifier.filteredArrayWithQualifier(results, qualifier);
      }
      if (sortOrderings != null) {
        results = (NSArray)EOSortOrdering.sortedArrayUsingKeyOrderArray(results, sortOrderings);
      }
    }
    return results;
  }
  
  public void addToStructureUlrsRelationship(org.cocktail.directory.eof.server.EOStructureUlr object) {
    addObjectToBothSidesOfRelationshipWithKey(object, STRUCTURE_ULRS_KEY);
  }

  public void removeFromStructureUlrsRelationship(org.cocktail.directory.eof.server.EOStructureUlr object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, STRUCTURE_ULRS_KEY);
  }

  public org.cocktail.directory.eof.server.EOStructureUlr createStructureUlrsRelationship() {
    EOClassDescription eoClassDesc = EOClassDescription.classDescriptionForEntityName("StructureUlr");
    EOEnterpriseObject eo = eoClassDesc.createInstanceWithEditingContext(editingContext(), null);
    editingContext().insertObject(eo);
    addObjectToBothSidesOfRelationshipWithKey(eo, STRUCTURE_ULRS_KEY);
    return (org.cocktail.directory.eof.server.EOStructureUlr) eo;
  }

  public void deleteStructureUlrsRelationship(org.cocktail.directory.eof.server.EOStructureUlr object) {
    removeObjectFromBothSidesOfRelationshipWithKey(object, STRUCTURE_ULRS_KEY);
    editingContext().deleteObject(object);
  }

  public void deleteAllStructureUlrsRelationships() {
    Enumeration objects = structureUlrs().immutableClone().objectEnumerator();
    while (objects.hasMoreElements()) {
      deleteStructureUlrsRelationship((org.cocktail.directory.eof.server.EOStructureUlr)objects.nextElement());
    }
  }


/**
 * Créer une instance de EOStructureUlr avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EOStructureUlr createEOStructureUlr(EOEditingContext editingContext, String cStructure
, Integer persId
, String temCotisAssedic
, String temDads
, String temSectorise
, String temSoumisTva
, String temValide
			) {
    EOStructureUlr eo = (EOStructureUlr) createAndInsertInstance(editingContext, _EOStructureUlr.ENTITY_NAME);    
		eo.setCStructure(cStructure);
		eo.setPersId(persId);
		eo.setTemCotisAssedic(temCotisAssedic);
		eo.setTemDads(temDads);
		eo.setTemSectorise(temSectorise);
		eo.setTemSoumisTva(temSoumisTva);
		eo.setTemValide(temValide);
    return eo;
  }

  
	  public EOStructureUlr localInstanceIn(EOEditingContext editingContext) {
	  		return (EOStructureUlr)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EOStructureUlr creerInstance(EOEditingContext editingContext) {
	  		EOStructureUlr object = (EOStructureUlr)createAndInsertInstance(editingContext, _EOStructureUlr.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EOStructureUlr localInstanceIn(EOEditingContext editingContext, EOStructureUlr eo) {
    EOStructureUlr localInstance = (eo == null) ? null : (EOStructureUlr)localInstanceOfObject(editingContext, eo);
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
   * @deprecated Utilisez EOStructureUlr#localInstanceIn a la place.
   */
	public static EOStructureUlr localInstanceOf(EOEditingContext editingContext, EOStructureUlr eo) {
		return EOStructureUlr.localInstanceIn(editingContext, eo);
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
	  public static EOStructureUlr fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
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
	public static EOStructureUlr fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EOStructureUlr eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EOStructureUlr)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EOStructureUlr fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EOStructureUlr fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EOStructureUlr eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EOStructureUlr)eoObjects.objectAtIndex(0);
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
	  public static EOStructureUlr fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EOStructureUlr eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EOStructureUlr ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EOStructureUlr fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
