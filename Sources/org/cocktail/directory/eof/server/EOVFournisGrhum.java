// EOVFournisGrhum.java
// 

package org.cocktail.directory.eof.server;

import org.cocktail.directory.impl.elements.DirectoryEntity;
import org.cocktail.directory.tools.DirUtilities;

import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;

public class EOVFournisGrhum extends _EOVFournisGrhum implements DirectoryEntity {

	public EOVFournisGrhum() {
		super();
	}

	public String displayString() {
		EOIndividuUlr ind = individu();
		if (ind != null) {
			return ind.displayString();
		}
		else {
			StringBuffer bfr = new StringBuffer();
			if (adrNom() != null) {
				bfr.append(DirUtilities.strForReplacement(adrNom()));
				if (adrPrenom() != null) {
					bfr.append(" ");
					bfr.append(DirUtilities.strForReplacement(adrPrenom()));
				}
			}
			return bfr.toString();
		}
	}

	public String codeCivilite() {
		if (individu() != null) {
			return individu().codeCivilite();
		}
		else {
			return super.adrCivilite();
		}
	}

	public String lesRIB() {
		StringBuffer bf = new StringBuffer();

		NSArray ribs = getRibs();
		int nbRibs = ribs.count();

		if (nbRibs == 0) {
			return "Aucun rib valide";
		}
		else {
			EORibfourUlr aRib;
			for (int i = 0; i < ribs.count(); i++) {
				aRib = (EORibfourUlr) ribs.objectAtIndex(i);
				bf.append("Code Banque : ").append(aRib.cBanque());
				bf.append(" Code Guichet : ").append(aRib.cGuichet());
				bf.append(" No Compte : ").append(aRib.noCompte());
				bf.append(" Cle : ").append(aRib.cleRib()).append("\n");
				if (aRib.bic() != null) {
					bf.append("BIC : ").append(aRib.bic());
				}

				if (aRib.iban() != null) {
					bf.append(" IBAN : ").append(aRib.iban()).append("\n");
				}

				if (aRib.ribTitco() != null) {
					bf.append("Titulaire : ").append(aRib.ribTitco()).append("\n");
				}

				if (nbRibs > 1) {
					bf.append("\n\n");
				}
			}
			return bf.toString().replaceAll("\n", "<br/>");
		}

	}

	public boolean isFounisPhysique() {
		return !"STR".equals(adrCivilite());
	}

	public String fouLibelle() {
		StringBuffer lib = new StringBuffer();
		if (isFounisPhysique()) {
			lib.append(DirUtilities.strForReplacement(adrCivilite())).append(" ");
			lib.append(DirUtilities.strForReplacement(super.adrNom())).append(" ");
			lib.append(DirUtilities.strForReplacement(super.adrPrenom()));
		}
		else {
			return DirUtilities.strForReplacement(super.adrNom());
		}
		return lib.toString();
	}

	public String fouPrenom() {
		return DirUtilities.strForReplacement(super.adrPrenom());
	}

	public String getPrimaryKey() {
		return String.valueOf(persId().intValue());
	}

	public EOIndividuUlr individu() {
		NSArray tmp = this.individuUlrs();
		if (tmp.count() > 0) {
			return (EOIndividuUlr) tmp.objectAtIndex(0);
		}
		else {
			return null;
		}
	}

	/** retourne la structure associ�e au fournisseur (si personne morale) */
	public EOStructureUlr structure() {
		NSArray tmp = structuresUlr();
		if (tmp.count() > 0) {
			return (EOStructureUlr) tmp.objectAtIndex(0);
		}
		else {
			return null;
		}
	}

	/** retourne le siret du fournisseur entreprise */
	public String siret() {
		EOStructureUlr struct = structure();
		if (struct != null) {
			return struct.siret();
		}
		else {
			return null;
		}
	}

	public NSArray telephoneFournis() {
		NSDictionary args = new NSDictionary(persId(), "persId");
		NSArray results = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "PersonneTelephone", "telProForPersId", args);
		return EOPersonneTelephone.prepareFetchResultForDisplay(results, false);
	}

	public NSArray faxFournis() {
		NSDictionary args = new NSDictionary(persId(), "persId");
		NSArray results = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "PersonneTelephone", "faxForPersId", args);
		return EOPersonneTelephone.prepareFetchResultForDisplay(results, false);
	}

	/** retourne les individus enregistr�s comme contacts de l'entreprise fournisseur courante */
	public NSArray individusContactForFournis() {
		NSArray result;
		EOStructureUlr struct = structure();
		if (struct != null) {
			NSDictionary args = new NSDictionary(struct.cStructure(), "idStructure");
			result = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "IndividuUlr", "individusContactForStructure", args);
		}
		else {
			result = new NSArray();
		}
		return result;
	}

	/** retourne l'email du fournisseur : repart_personne_adresse.e_mail */
	public NSArray emails() {
		NSArray tmp = this.repartPersonneAdresses();
		tmp = (NSArray) tmp.valueForKey("eMail");
		return DirUtilities.cleanArray(tmp);
	}

	public NSArray adresseFournis() {
		NSMutableArray adr = new NSMutableArray();

		String tmp = adrAdresse1();
		if (tmp != null && !tmp.equals("")) {
			adr.addObject(tmp);
		}

		tmp = adrAdresse2();
		if (tmp != null && !tmp.equals("")) {
			adr.addObject(tmp);
		}

		StringBuffer ville = new StringBuffer();

		tmp = adrCp();
		if (tmp != null && !tmp.equals("")) {
			ville.append(tmp);
		}
		else {
			tmp = adrCpEtranger();
			if (tmp != null && !tmp.equals("")) {
				ville.append(tmp);
			}
		}

		tmp = adrVille();
		if (tmp != null && !tmp.equals("")) {
			ville.append(" ");
			ville.append(tmp);
		}
		if (!ville.toString().equals("")) {
			adr.addObject(ville.toString());
		}

		adr.addObject(pays());

		return adr;
	}

	public NSArray adresseWeb() {
		NSArray data = (NSArray) valueForKeyPath("repartPersonneAdresses.adresse.adrUrlPere");
		return DirUtilities.cleanArray(data);
	}

	public NSArray getRibs() {
		return DirUtilities.filteredArray(ribfours(), "ribValide='O'");
	}

}
