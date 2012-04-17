package org.cocktail.directory.impl;

import java.util.ArrayList;

import org.cocktail.directory.eof.server.EOIndividuUlr;
import org.cocktail.directory.impl.elements.FieldItem;
import org.cocktail.directory.impl.elements.LinkFieldItem;
import org.cocktail.directory.server.CommonDataHolder;
import org.cocktail.directory.tools.DirUtilities;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;

public class EmployeesDirectory extends Directory {

	private String cStructureRoot; // cStructure de la racine des structures du referenciel.
	private ArrayList listCStructureRoot; // une liste dans le cas ou il y'a plus d'une racine.

	private NSMutableArray _searchResultsFields;

	public EmployeesDirectory() {
		super("pers");
		setLocaleIdForTitle("DEmployeesTitle");
		setLocaleIdSubTitle("DEmployeesSubTitle");
		setCssIdOfDirectory("personnel");
		setWoDirActionName(CommonDataHolder.DIR_MAIN_ACTION);
		setMainEntity(EOIndividuUlr.ENTITY_NAME);
		// deux champs de recherche, nom et prenom
		setNumberOfFieldsForSearch(2);
	}

	public String getCStructureRoot() {
		return cStructureRoot;
	}

	public void setCStructureRoot(String structureRoot) {
		cStructureRoot = structureRoot;
	}

	public ArrayList getListCStructureRoot() {
		return listCStructureRoot;
	}

	public void setListCStructureRoot(ArrayList listCStructureRoot) {
		this.listCStructureRoot = listCStructureRoot;
	}

	public void initDirectory() {

		_searchResultsFields = new NSMutableArray();

		FieldItem tmpField = new FieldItem("LNomUsuel", "displayString", null, false);
		addToSummaryFields(tmpField);
		_searchResultsFields.addObject(tmpField);

		tmpField = new FieldItem("LTel", "telephoneIndividu", null, true);
		addToSummaryFields(tmpField);
		_searchResultsFields.addObject(tmpField);

		tmpField = new FieldItem("LFax", "faxIndividu", null, true);
		addToSummaryFields(tmpField);
		_searchResultsFields.addObject(tmpField);

		LinkFieldItem mailField = new LinkFieldItem("LMail", "emailPrincipalIndividu", LinkFieldItem.MAILTO_LINK);
		addToSummaryFields(mailField);
		_searchResultsFields.addObject(mailField);

		if (CommonDataHolder.afficherCategorieSupann) {
			tmpField = new FieldItem("LCategory", "catLibelle2", null, false);
			addToSummaryFields(tmpField);
			_searchResultsFields.addObject(tmpField);
		}

		if (CommonDataHolder.afficherQualite) {
			tmpField = new FieldItem("LQuality", "indQualite", null, false);
			addToSummaryFields(tmpField);
			_searchResultsFields.addObject(tmpField);
		}
		if (CommonDataHolder.afficherFonctions) {
			tmpField = new FieldItem("LFunctions", "fonctions", null, true);
			_searchResultsFields.addObject(tmpField);
			_searchResultsFields.addObject(tmpField);
		}

		if (CommonDataHolder.enableEmployeeCalendar) {
			LinkFieldItem field = new LinkFieldItem("LAgenda", "LSee", "urlAgendaPublic", LinkFieldItem.HREF_LINK);
			field.setLinkTarget(LinkFieldItem.TARGET_BLANK);
			addToSummaryFields(field);
			_searchResultsFields.addObject(field);

			field = new LinkFieldItem("LICal", "LStream", "urlICSPublic", LinkFieldItem.HREF_LINK);
			addToSummaryFields(field);
			_searchResultsFields.addObject(field);
		}

		// Configuration des fields � afficher par profondeur (level) d'affichage
		// Voir les pathways

		SearchItem item = new SearchItem("DEmployeesName", "nomUsuel", new String[] { "nomUsuel", "nomPatronymique" });
		item.setRemoveAccents(true);
		addToSearchItems(item);
		item = new SearchItem("DEmployeesForName", "prenom", new String[] { "prenom" });
		item.setRemoveAccents(true);
		addToSearchItems(item);

		// la recherche par fonction est utilis� ou non suivant le parametre du fichier de config
		if (CommonDataHolder.activateSearchByFunctions) {
			item = new SearchItem("DEmployeesFunction", "fonction", new String[] { "fonctions" });
			item.setNewLine(true);
			addToSearchItems(item);
		}
		else {
			item = new SearchItem("DEmployeesQuality", "qualite", new String[] { "indQualite" });
			item.setNewLine(true);
			addToSearchItems(item);
		}

	}

	/*
	 * used to make a link on an item to its details in the listing interface.
	 * 
	 * @see SummaryItemsDisplay (shouldLinkToDetails) *
	 */
	public boolean areDetailsAvailable() {
		return true;
	}

	public boolean shouldDisplayListForFirstLevel() {
		return true;
	}

	public String componentNameForDetails() {
		return "DetailEmployee";
	}

	public boolean canDetailAParentItem() {
		return true;
	}

	public EOEnterpriseObject fetchObjectWithId(EOEditingContext ectx, String id) {
		EOEnterpriseObject obj = null;
		try {
			obj = DirUtilities.fetchUniqueData(ectx, getMainEntity(), "noIndividu", new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

	public NSArray searchResultFields() {
		return _searchResultsFields;
	}

	public NSArray processSimpleSearch(NSDictionary searchArgs, EOEditingContext eContext, EOIndividuUlr user) {

		boolean lr = (user != null) ? user.canViewListeRouge() : false;

		StringBuffer query = new StringBuffer("(temValide = 'O')");

		query.append(" and ");
		query.append("(");
		query.append("repartStructures.structureUlr.repartTypeGroupes.tgrpCode = 'A'");
		query.append(" or ");
		query.append("repartStructures.structureUlr.repartTypeGroupes.tgrpCode = 'S'");
		query.append(" or ");
		query.append("repartStructures.structureUlr.repartTypeGroupes.tgrpCode = 'LA'");
		query.append(")");

		if (!lr) {
			query.append(" and listeRouge = 'N' ");
		}

		query.append(" and ");

		/*
		 * String column,value; NSArray columns = searchArgs.allKeys(); for(int i=0;i<columns.count();i++) { column =
		 * (String)searchArgs.allKeys().objectAtIndex(i); value = (String)searchArgs.objectForKey(column);
		 * query.append(column).append(" caseInsensitiveLike '*").append( value ).append("*'"); if(i<columns.count()-1)
		 * query.append(" and "); }
		 */

		System.out.println("searchArgs:" + searchArgs);

		String[] columns;
		String value;
		NSArray items = searchArgs.allKeys();

		StringBuffer qualItem = new StringBuffer();

		for (int i = 0; i < items.count(); i++) {
			columns = (String[]) items.objectAtIndex(i);
			value = (String) searchArgs.objectForKey(columns);

			qualItem.append("(");
			for (int ic = 0; ic < columns.length; ic++) {
				qualItem.append(columns[ic]).append(" caseInsensitiveLike '*").append(value).append("*'");
				if (ic < columns.length - 1)
					qualItem.append(" or ");
			}
			qualItem.append(")");

			if (i < items.count() - 1) {
				qualItem.append(" and ");
			}
		}

		query.append(qualItem.toString());

		// en fonction de la vue qui filtre les employes parametree dans le fichier de config.
		if (CommonDataHolder.relationshipNameToSearchEmployees != null) {
			query.append(" and ").append(CommonDataHolder.relationshipNameToSearchEmployees).append(" <> null");
		}

		EOQualifier qualInd = EOQualifier.qualifierWithQualifierFormat(query.toString(), null);

		return DirUtilities.fetchData(eContext, getMainEntity(), qualInd, EOIndividuUlr.SORTS_NOM_PRENOM);

		// NSDictionary args = new NSDictionary("*"+crt+"*","criterion");
		// return EOUtilities.objectsWithFetchSpecificationAndBindings(
		// eContext,getMainEntity(),
		// lr ? "recherchePersonnelListeRouge" : "recherchePersonnel",
		// args);
	}

	public boolean processSearchAtPathwayLevel() {
		return false;
	}

	public boolean supportsRevertSearch() {
		return true;
	}

}
