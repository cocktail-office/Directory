package org.cocktail.directory.eof.server;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.cocktail.directory.impl.elements.DirectoryEntity;
import org.cocktail.directory.server.CommonDataHolder;
import org.cocktail.directory.tools.DirUtilities;

import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOGenericRecord;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSData;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSTimestamp;

public class EOIndividuUlr extends _EOIndividuUlr implements DirectoryEntity {

	public static final NSArray SORTS_NOM_PRENOM = new NSArray(new Object[] {
			EOSortOrdering.sortOrderingWithKey("nomUsuel", EOSortOrdering.CompareAscending),
			EOSortOrdering.sortOrderingWithKey("prenom", EOSortOrdering.CompareAscending) });

	private NSData datasPhoto = null;

	public String displayString() {
		StringBuffer buff = new StringBuffer(codeCivilite());
		buff.append(" ");
		String tmp = nomAffichage();
		if (tmp != null) {
			buff.append(tmp);
			buff.append(" ");
			buff.append(DirUtilities.strForReplacement(prenomAffichage()));
		}
		else {
			buff.append(nomUsuel());
			buff.append(" ");
			buff.append(DirUtilities.strForReplacement(prenom()));
		}
		return buff.toString();
	}

	public String codeCivilite() {
		return DirUtilities.strForReplacement(super.cCivilite());
	}

	// TODO : Ceci peut-�tre provisoire le temps que les noms d'affichage soient tous renseign�s
	public String indNom() {
		String nom = nomAffichage();
		if (nom != null) {
			return nom;
		}
		else {
			return nomUsuel();
		}
	}

	public String indPrenom() {
		String prenom = prenomAffichage();
		if (prenom != null) {
			return prenom;
		}
		else {
			return prenom();
		}
	}

	// fin todo

	public String getPrimaryKey() {
		Number noIndividu = noIndividu();
		if (noIndividu != null) {
			return String.valueOf(noIndividu.intValue());
		}
		else {
			return null;
		}
	}

	public NSArray telephoneIndividu_old() {
		NSDictionary args = new NSDictionary(persId(), "persId");
		NSArray results = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "PersonneTelephone", "telephoneIndividu", args);

		return EOPersonneTelephone.prepareFetchResultForDisplay(results, false);
	}

	public NSArray faxIndividu_old() {
		NSDictionary args = new NSDictionary(persId(), "persId");
		NSArray results = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "PersonneTelephone", "faxForPersId", args);

		return EOPersonneTelephone.prepareFetchResultForDisplay(results, false);
	}

	public NSArray faxIndividu() {
		String qual = "( (typeTel <> 'PRV') and (typeNo = 'FAX') )";
		NSArray tels = DirUtilities.filteredArray(personneTelephones(), qual);

		return EOPersonneTelephone.prepareFetchResultForDisplay(tels, false);
	}

	/** renvoie l'email avec vlan P ou R de l'individu */
	public String emailPrincipalIndividu() {
		NSArray results = (NSArray) valueForKeyPath("repartComptes.compte");

		results = EOQualifier.filteredArrayWithQualifier(results, EOCompte.QUAL_VALIDE);

		EOCompte cpt;
		NSMutableArray tmp = new NSMutableArray();
		for (int i = 0; i < results.count(); i++) {
			cpt = (EOCompte) results.objectAtIndex(i);
			if (cpt.cptDomaine() != null && (cpt.cptVlan().equals("P") || cpt.cptVlan().equals("R"))) {
				tmp.addObject(cpt);
			}
		}
		return emailFromArray(tmp);
	}

	public String emailEtudiant() {
		return emailFromFetchSpec("emailEtudiant");
	}

	public String emailEtudiant_new() {
		NSArray results = (NSArray) repartComptes().valueForKey("compte");
		EOCompte cpt;
		NSMutableArray tmp = new NSMutableArray();
		for (int i = 0; i < results.count(); i++) {
			cpt = (EOCompte) results.objectAtIndex(i);
			if (cpt.cptDomaine() != null && (cpt.cptVlan().endsWith("E") || cpt.cptVlan().equals("R"))) {
				tmp.addObject(cpt);
			}
		}

		// String qual = "((cptDomaine <> nil) and ((cptVlan like '*E') or (cptVlan='R')))";
		// results = DirUtilities.filteredArray(results,qual);
		return emailFromArray(results);
	}

	public String emailFromArray(NSArray array) {
		StringBuffer buff = new StringBuffer();
		if (array.count() > 0) {
			EOCompte compte = (EOCompte) array.objectAtIndex(0);
			buff.append(compte.cptEmail());
			buff.append("@");
			buff.append(compte.cptDomaine());
		}
		return buff.toString();
	}

	public String emailFromFetchSpec(String specName) {
		NSDictionary args = new NSDictionary(persId(), "persId");
		NSArray results = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "Compte", specName, args);

		StringBuffer buff = new StringBuffer();
		if (results.count() > 0) {
			EOCompte compte = (EOCompte) results.objectAtIndex(0);
			buff.append(compte.cptEmail());
			buff.append("@");
			buff.append(compte.cptDomaine());
		}
		return buff.toString();
	}

	public NSArray adresseWeb() {
		NSArray data = (NSArray) valueForKeyPath("repartPersonneAdresses.adresse.adrUrlPere");
		return DirUtilities.cleanArray(data);
	}

	public NSArray adresseProIndividu() {
		NSDictionary args = new NSDictionary(persId(), "persId");
		NSArray results = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "Adresse", "adresseProIndividu", args);

		NSMutableArray adr = new NSMutableArray();

		if (results.count() > 0) {
			EOAdresse adresse = (EOAdresse) results.objectAtIndex(0);
			EOPays pays = adresse.pays();
			String tmp = adresse.adrAdresse1();
			if (tmp != null && !tmp.equals("")) {
				adr.addObject(tmp);
			}

			tmp = adresse.adrAdresse2();
			if (tmp != null && !tmp.equals("")) {
				adr.addObject(tmp);
			}

			StringBuffer ville = new StringBuffer();

			tmp = adresse.codePostal();
			if (tmp != null && !tmp.equals("")) {
				ville.append(tmp);
			}

			tmp = adresse.ville();
			if (tmp != null && !tmp.equals("")) {
				ville.append(" ");
				ville.append(tmp);
			}
			if (!ville.toString().equals("")) {
				adr.addObject(ville.toString());
			}

			adr.addObject(pays.llPays());
		}

		return adr;
	}

	// http://www.univ-lr.fr/cgi-bin/WebObjects/EdtWeb.woa/wa/default?agenda=1&login=fred&agendaAcces=public
	// URL_AGENDA : http://www.univ-lr.fr/apps/edt/wa/default?agenda=1&login
	public String urlAgendaPublicOld() {

		String indAgenda = indAgenda();
		if (indAgenda == null || indAgenda.equals("N")) {
			return null;
		}
		else {

			String urlAgenda = CommonDataHolder.urlAgenda;
			StringBuffer bfr = null;
			if (urlAgenda != null) {
				String login = login();
				if (login != null) {
					bfr = new StringBuffer();
					bfr.append(urlAgenda);
					bfr.append("=");
					bfr.append(login);
					bfr.append("&agendaAcces=public");
				}
			}
			return bfr != null ? bfr.toString() : null;
		}
	}

	// on passe par le flux ics
	public String urlAgendaPublic() {

		String indAgenda = indAgenda();
		if (indAgenda == null || indAgenda.equals("N")) {
			return null;
		}
		else {

			String onlineReader = CommonDataHolder.onlineICSViewer;
			String urlICSPublic = urlICSPublic();

			urlICSPublic = DirUtilities.replacePart(urlICSPublic, "webcal", "http");

			StringBuffer bfr = null;
			if (onlineReader != null && urlICSPublic != null) {
				bfr = new StringBuffer();
				bfr.append(onlineReader);
				bfr.append(urlICSPublic);
			}

			return bfr != null ? bfr.toString() : null;
		}
	}

	public String urlICSPublic() {
		String result = null;

		String indAgenda = indAgenda();
		if (indAgenda == null || indAgenda.equals("N")) {
			return null;
		}

		if (CommonDataHolder.urlICS != null) {
			String login = login();
			if (login != null) {
				StringBuffer bf = new StringBuffer(CommonDataHolder.urlICS);
				bf.append("iCalendarOccupations?login=").append(login);
				result = bf.toString();

			}
		}

		try {
			result = URLEncoder.encode(result, "UTF-8");
		}
		catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return result;
	}

	// TODO : gerer la date de validit� des telephones et exclure les INT.
	public NSArray telephoneIndividu() {
		// String qual = "((typeTel <> 'PRV') and ((typeNo = 'TEL') or (typeNo = 'MOB')) )";
		String qual = "((typeTel = 'PRF' or typeTel = 'INT') and ((typeNo = 'TEL') or (typeNo = 'MOB')) )";
		NSArray tels = DirUtilities.filteredArray(personneTelephones(), qual);
		return EOPersonneTelephone.prepareFetchResultForDisplay(tels, false);
	}

	public String login() {
		NSDictionary args = new NSDictionary(persId(), "persId");
		NSArray results = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "Compte", "compteIndividu", args);
		String login = null;
		if (results.count() > 0) {
			login = ((EOCompte) results.objectAtIndex(0)).cptLogin();
		}
		return login;
	}

	public boolean hasPhoto() {
		return datasPhoto() != null;
	}

	public NSData datasPhoto() {
		if (datasPhoto == null && "O".equals(indPhoto())) {
			EOQualifier qual = EOQualifier.qualifierWithQualifierFormat("noIndividu" + " = %@", new NSArray(noIndividu()));
			EOFetchSpecification myFetch = new EOFetchSpecification(CommonDataHolder.entityNamePhotoEmploye, qual, null);
			NSArray data = editingContext().objectsWithFetchSpecification(myFetch);

			if (data.count() > 0) {
				datasPhoto = (NSData) ((EOGenericRecord) data.objectAtIndex(0)).storedValueForKey("datasPhoto");
			}
		}
		return datasPhoto;
	}

	/** Si c'est un �tudiant, on peut renvoyer son etud_numero (cf table Etudiant) */
	public int getNoEtudiant() {
		NSArray toManyEtudiants = this.etudiants();
		if (toManyEtudiants.count() == 0) {
			return -1;
		}
		else {
			return ((EOEtudiant) toManyEtudiants.objectAtIndex(0)).etudNumero().intValue();
		}
	}

	/** indique si la personne peut voir les personnes qui sont d�clar�es en liste rouge en fonction de sa categorie supann */
	public boolean canViewListeRouge() {
		EOSupannCategorie categorie = supannCategorie();
		boolean response = true;
		if (categorie == null) {
			response = false;
		}
		else {
			String lr = categorie.catListeRouge();
			if (lr == null) {
				response = false;
			}
			else {
				response = lr.equals("O");
			}
		}
		return response;
	}

	// TODO: Controller le d�but et la fin de la fonction dans repart_association
	public NSArray fonctions() {
		// return (NSArray)valueForKeyPath("repartAssociations.assLibelle");

		NSDictionary args = new NSDictionary(new Object[] { persId(), new NSTimestamp() }, new Object[] { "persId", "now" });
		NSArray results = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "Association", "associationsPrincipales", args);

		return (NSArray) results.valueForKey("assLibelle");
	}

}
