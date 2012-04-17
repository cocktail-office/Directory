package org.cocktail.directory.impl;

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

public class StudentsDirectory extends Directory {

	public StudentsDirectory() {
		super("etu");
		setLocaleIdForTitle("DStudentsTitle");
		setLocaleIdSubTitle("DStudentsSubTitle");
		setCssIdOfDirectory("etudiant");
		setWoDirActionName(CommonDataHolder.DIR_MAIN_ACTION);
		setMainEntity("IndividuUlr");
	}

	public void initDirectory() {

		FieldItem tmpField = new FieldItem("cCivilite", "codeCivilite", null, false);
		addToSummaryFields(tmpField);

		tmpField = new FieldItem("LNomUsuel", "indNom", null, false);
		addToSummaryFields(tmpField);

		tmpField = new FieldItem("LPrenom", "indPrenom", null, false);
		addToSummaryFields(tmpField);

		tmpField = new FieldItem("LStudentNumber", "getNoEtudiant", null, false);
		addToSummaryFields(tmpField);

		tmpField = new FieldItem("LMail", "emailEtudiant", null, false);
		this.addToSummaryFields(tmpField);

		if (CommonDataHolder.enableStudentCalendar) {

			LinkFieldItem field = new LinkFieldItem("LAgenda", "LSee", "urlAgendaPublic", LinkFieldItem.HREF_LINK);
			addToSummaryFields(field);

			field = new LinkFieldItem("LICal", "LStream", "urlICSPublic", LinkFieldItem.HREF_LINK);
			addToSummaryFields(field);
		}

		// les colonnes de recherche de l'annaire
		SearchItem item = new SearchItem("DEmployeesName", "nomUsuel", new String[] { "nomUsuel", "nomPatronymique" });
		addToSearchItems(item);
		item = new SearchItem("DEmployeesForName", "prenom", new String[] { "prenom" });
		addToSearchItems(item);

	}

	/*
	 * used to make a link on an item to its details in the listing interface.
	 * 
	 * @see SummaryItemsDisplay (shouldLinkToDetails) *
	 */
	public boolean areDetailsAvailable() {
		return false;
	}

	public NSArray processSimpleSearch(NSDictionary searchArgs, EOEditingContext eContext, EOIndividuUlr user) {

		StringBuffer query = new StringBuffer("(temValide = 'O' and etudiants.etudNumero <> nil)");
		query.append(" and ");

		String[] columns;
		String value;
		NSArray items = searchArgs.allKeys();

		for (int i = 0; i < items.count(); i++) {
			columns = (String[]) items.objectAtIndex(i);
			value = (String) searchArgs.objectForKey(columns);

			StringBuffer qualItem = new StringBuffer();

			qualItem.append("(");
			for (int ic = 0; ic < columns.length; ic++) {
				qualItem.append(columns[ic]).append(" caseInsensitiveLike '*").append(value).append("*'");
				if (ic < columns.length - 1) {
					qualItem.append(" or ");
				}
			}
			qualItem.append(")");

			query.append(qualItem.toString());
		}

		return DirUtilities.fetchData(eContext, getMainEntity(), EOQualifier.qualifierWithQualifierFormat(query.toString(), null),
				EOIndividuUlr.SORTS_NOM_PRENOM);
	}

	public boolean shouldDisplayListForFirstLevel() {
		return false;
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

	public String componentNameForDetails() {
		return "DetailStudents";
	}

	public boolean canDetailAParentItem() {
		return false;
	}

	public boolean processSearchAtPathwayLevel() {
		return false;
	}

	public boolean supportsRevertSearch() {
		return false;
	}

	public NSArray searchResultFields() {
		return this.getSummaryFields();
	}

}
