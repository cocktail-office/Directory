package org.cocktail.directory.eof.server;

import org.cocktail.directory.impl.elements.DirectoryEntity;
import org.cocktail.directory.server.CommonDataHolder;
import org.cocktail.directory.tools.DirUtilities;

import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSTimestamp;

public class EOStructureUlr extends _EOStructureUlr implements DirectoryEntity {

	public static final String SERVICES_SONS_METHOD = "servicesFils";
	public static final String DIPLOMA_SONS_METHOD = "diplomesFils";
	public static final String GRPINSTIT_SONS_METHOD = "grpInstitFils";
	public static final String MGROUPS_SONS_METHOD = "mailGroupFils";

	private NSArray sons = null;
	private NSArray diplomesfils = null;

	private EOAdresse adr = null;

	// private NSArray membresStructure = null;

	private static final NSArray sortAlpha = new NSArray(EOSortOrdering.sortOrderingWithKey("llStructure", EOSortOrdering.CompareAscending));

	public EOStructureUlr() {
		super();
	}

	public NSArray grpInstitFils() {
		NSDictionary args = new NSDictionary(cStructure(), "parentId");
		NSArray theSons = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "StructureUlr", "listGrpInstitFils", args);
		theSons = EOSortOrdering.sortedArrayUsingKeyOrderArray(theSons, sortAlpha);
		return sons;
	}

	public NSArray servicesFils() {
		if (!CommonDataHolder.useFetchBuffers || (CommonDataHolder.useFetchBuffers && sons == null)) {
			NSDictionary args = new NSDictionary(cStructure(), "parentId");
			sons = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "StructureUlr", "listServicesFils", args);
			sons = EOSortOrdering.sortedArrayUsingKeyOrderArray(sons, sortAlpha);
		}
		return sons;
	}

	public NSArray mailGroupFils() {
		NSDictionary args = new NSDictionary(cStructure(), "parentId");
		NSArray theSons = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "StructureUlr", "listGrpMailFils", args);
		theSons = EOSortOrdering.sortedArrayUsingKeyOrderArray(theSons, sortAlpha);
		return sons;
	}

	public NSArray diplomesFils() {
		if (diplomesfils == null) {
			NSDictionary args = new NSDictionary(cStructure(), "parentId");
			diplomesfils = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "StructureUlr", "listFils", args);
			diplomesfils = EOSortOrdering.sortedArrayUsingKeyOrderArray(diplomesfils, sortAlpha);
		}
		return diplomesfils;
	}

	public String toString() {
		return DirUtilities.strForReplacement(super.llStructure());
	}

	public String displayString() {
		String str = strAffichage();
		if (str == null || str.equals("")) {
			str = llStructure();
		}
		return DirUtilities.strForReplacement(str);
	}

	public String getPrimaryKey() {
		return super.cStructure();
	}

	public NSArray telephoneFaxPro() {
		NSDictionary args = new NSDictionary(persId(), "persId");
		NSArray results = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "PersonneTelephone", "telFaxProForPersId", args);
		return EOPersonneTelephone.prepareFetchResultForDisplay(results, true);
	}

	// retourne les tel/fax de la personne dans la structure courante.
	public NSArray telephoneFaxProForPerson(Number persIdPerson) {
		try {
			NSDictionary args = new NSDictionary(new Object[] { persIdPerson, this.cStructure() }, new Object[] { "persIdPerson", "cStructure" });
			NSArray results = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "PersonneTelephone",
					"telephoneProOfPersonInStructure", args);
			return EOPersonneTelephone.prepareFetchResultForDisplay(results, true);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public NSArray bureauForPerson(Number noIndividu) {
		try {
			NSDictionary args = new NSDictionary(new Object[] { noIndividu, cStructure() }, new Object[] { "noIndividu", "cStructure" });
			NSArray results = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "Salles", "bureauForPersonInStructure", args);
			return EOSalles.prepareFetchResultForDisplay(results);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public NSArray associationsIndividu(Number persId) {
		try {
			NSDictionary args = new NSDictionary(new Object[] { persId, cStructure(), new NSTimestamp() }, new Object[] { "persId", "cStructure",
					"now" });
			NSArray results = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "Association", "associationsIndividu", args);

			return EOAssociation.prepareFetchResultForDisplay(results);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public String fonctionsGroupe() {
		if (grpFonction1() != null) {
			return grpFonction1();
		}
		else {
			return null;
		}
	}

	// retourne l'identit� civilit� + nom + pr�nom du responsable de la structure.
	public String identResponsableGroupe() {
		EOIndividuUlr responsable = responsableGroupe();
		if (responsable != null) {
			return responsable.displayString();
		}
		else {
			return null;
		}
	}

	public String htmlLinkWebSiteStructure() {
		String lnk = websiteStructure();
		if (lnk != null) {
			StringBuffer bf = new StringBuffer("<a href=");
			bf.append(lnk).append(">");
			bf.append(lnk).append("</a>");
			return bf.toString();
		}
		else {
			return null;
		}
	}

	public String websiteStructure() {
		if (!CommonDataHolder.useFetchBuffers || (CommonDataHolder.useFetchBuffers && adr == null)) {
			fetchAdresseStruct();
		}
		if (adr != null) {
			return adr.adrUrlPere();
		}
		else {
			return null;
		}
	}

	private void fetchAdresseStruct() {
		try {
			NSDictionary args = new NSDictionary(new Object[] { persId() }, new Object[] { "persId" });
			NSArray results = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "Adresse", "adresseProIndividu", args);

			if (results.count() > 0) {
				adr = (EOAdresse) results.objectAtIndex(0);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String adresseGroupe() {
		if (!CommonDataHolder.useFetchBuffers || (CommonDataHolder.useFetchBuffers && adr == null)) {
			fetchAdresseStruct();
		}
		if (adr != null) {
			return adr.toString();
		}
		else {
			return null;
		}
	}

	public String mailResponsable() {
		EOIndividuUlr responsable = responsableGroupe();
		if (responsable != null) {
			return responsable.emailPrincipalIndividu();
		}
		else {
			return null;
		}
	}

	public NSArray telFaxResponsable() {
		EOIndividuUlr responsable = responsableGroupe();
		if (responsable != null) {
			return telephoneFaxProForPerson(responsable.persId());
		}
		else {
			return null;
		}
	}

	public NSArray adresseResponsable() {
		EOIndividuUlr responsable = responsableGroupe();
		if (responsable != null) {
			return responsable.adresseProIndividu();
		}
		else {
			return null;
		}
	}

	public NSArray telephoneFaxStructure() {
		return EOPersonneTelephone.prepareFetchResultForDisplay(personneTelephones(), true);
	}

	public static EOStructureUlr fetchObjectWithId(EOEditingContext ctx, String id) {
		return EOStructureUlr.fetchFirstByQualifier(ctx, new EOKeyValueQualifier("cStructure", EOKeyValueQualifier.QualifierOperatorEqual, id));
	}

	// retourne l'adresse email pr�te � �tre affich�e en html sous forme de lien mailto.
	public String mailtoEmail() {
		String email = adresseEmail();
		if (email == null) {
			return null;
		}
		else {
			StringBuffer bfr = new StringBuffer("<a href=mailto:");
			bfr.append(email).append(">").append(email).append("</a>");
			return bfr.toString();
		}
	}

	public boolean isForum() {
		return ((NSArray) valueForKeyPath("repartTypeGroupes.tgrpCode")).containsObject(EOTypeGroupe.TGRP_CODE_FORUM);
	}

	public boolean isDiplome() {
		return ((NSArray) valueForKeyPath("repartTypeGroupes.tgrpCode")).containsObject(EOTypeGroupe.TGRP_CODE_DIPLOME);
	}

	// retourne l'adresse email de l'entit� en se basant sur l'alias et le domaine principal.
	public String adresseEmail() {

		if (isForum()) {
			return mailForum();
		}
		else
			if (isDiplome()) {
				return mailDiplome();
			}
			else {
				return adresseEmailStruct();
			}
	}

	public String adresseEmailStruct() {
		StringBuffer bfr = new StringBuffer();
		String alias = grpAlias();
		if (alias != null) {
			bfr.append(alias);
			if (alias.indexOf('@') == -1) {
				bfr.append("@");
				bfr.append(CommonDataHolder.mainDomain);
			}
			return bfr.toString();
		}
		else {
			return null;
		}
	}

	public String mailtoForum() {
		String email = mailForum();
		if (email == null) {
			return null;
		}
		else {
			StringBuffer bfr = new StringBuffer("<a href=mailto:");
			bfr.append(email).append(">").append(email).append("</a>");
			return bfr.toString();
		}
	}

	public String mailForum() {
		EOListeForums forum = getForum();
		if (forum != null) {
			return EOCompte.completeMailWithMainDomain(forum.lisEmail());
		}
		else {
			return null;
		}
	}

	public EOListeForums getForum() {
		NSArray list = this.listeForums();
		if (list.count() > 0) {
			return (EOListeForums) list.objectAtIndex(0);
		}
		else {
			return null;
		}
	}

	public String mailDiplome() {
		String alias = grpAlias();
		if (alias != null) {
			return EOCompte.completeMailWithDomain(alias, CommonDataHolder.etudiantsDomain);
		}
		else {
			return null;
		}
	}

	// infos sommaires sur les contacts des entreprises

	public NSArray infosContacts() {
		NSDictionary args = new NSDictionary(cStructure(), "idStructure");
		NSArray result = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "IndividuUlr", "individusContactForStructure", args);
		NSMutableArray infos = new NSMutableArray();
		StringBuffer bf;
		EOIndividuUlr ind;
		NSArray tels;
		String tmp;
		for (int i = 0; i < result.count(); i++) {
			bf = new StringBuffer();
			ind = (EOIndividuUlr) result.objectAtIndex(i);
			bf.append(ind.displayString());
			tmp = ind.emailPrincipalIndividu();
			if (tmp != null && !tmp.equals("")) {
				bf.append(" : ").append(tmp);
			}
			tels = ind.telephoneIndividu();
			if (tels.count() > 0) {
				bf.append(" : ");
				for (int j = 0; j < tels.count(); j++) {
					bf.append(tels.objectAtIndex(i)).append(" ");
				}
			}
			infos.addObject(bf.toString());
		}

		return infos;
	}

	public NSArray allTypesGroupe() {
		NSArray objects = (NSArray) valueForKeyPath("repartTypeGroupes.typeGroupe.tgrpLibelle");
		return DirUtilities.cleanArray(objects);
	}

	public boolean hasMembres() {
		return allMembres().count() > 0;
	}

	public NSArray allMembres() {
		return membres(true);
	}

	public NSArray membresNonLR() {
		return membres(false);
	}

	public NSArray membres(boolean listeRouge) {
		NSArray results = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "IndividuUlr",
				listeRouge ? "individusListeRougeForStructure" : "individusForStructure", new NSDictionary(cStructure(), "parentItem"));
		return results;
	}

}
