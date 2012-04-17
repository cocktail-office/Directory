package org.cocktail.directory.server.components;

// Generated by the WOLips Templateengine Plug-in at 12 f�vr. 2007 11:42:38

import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.impl.pathways.Pathway;
import org.cocktail.directory.server.CommonDataHolder;
import org.cocktail.directory.server.DirectAction;
import org.cocktail.directory.server.Session;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WORedirect;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSRange;

public class DirectorySearchResults extends WOComponent {

	public boolean initiallyCollapsed;
	public int dirIndex;
	public Directory directory;
	public Pathway currentPathway;
	// public String searchString;
	public NSDictionary searchArgs;
	public String typeRequestItem;

	private NSArray dirLevelResult;
	public Session session;
	private EOEditingContext ectx;

	private String errorMessage;

	public DirectorySearchResults(WOContext context) {
		super(context);
		session = (Session) session();
		ectx = session.defaultEditingContext();
	}

	public String collapsableDivInitialStyle() {
		return initiallyCollapsed ? "display:none;" : "display:block;";
	}

	public String collapserALinkInitStyle() {
		return initiallyCollapsed ? "show" : "hide";
	}

	public String onClickString() {
		StringBuffer bf = new StringBuffer("toggleDivVisibility('");
		bf.append(divResultID()).append("','").append(collapserButtonID()).append("')").append("; return false;");
		return bf.toString();
	}

	/**
	 * TODO : c'est pas s�r du tout que �a soit une g�n�ralit�, mais �a suffit tant qu'on a pas des pathways prot�g�s et non prot�g�s dans
	 * le m�me directory
	 */
	public boolean isNeedAuthentication() {
		// return directory.hasProtectedPathways();
		return directory.needsAuthentication();
	}

	public boolean isUserConnected() {
		return (session.connectedIndividu() != null);
	}

	public boolean cantShowResults() {
		return isUserConnected() && !canShowResults();
	}

	public boolean canShowResults() {
		boolean can = true;

		/* session.connectedUserInfo()==null */
		if (directory.hasProtectedPathways()) {
			can = session.canViewResults(directory);
		}
		return can;
	}

	public WOComponent connect() {
		session.setObjectForKey(session.getDirectoryRequest(), DirectAction.URL);
		String url = context().directActionURLForActionNamed("casLogin", null);
		WORedirect redirect = new WORedirect(context());
		redirect.setUrl(url);
		return redirect;
	}

	public String collapserButtonID() {
		return "divr" + dirIndex;
	}

	public String divResultID() {
		return "cbr" + dirIndex;
	}

	public NSArray getDirLevelResult() {
		NSArray local = null;
		if (dirLevelResult != null) {
			local = (NSArray) dirLevelResult.clone();
			dirLevelResult = null;
		}
		return local;
	}

	public void setDirLevelResult(NSArray results) {
		this.dirLevelResult = results;
	}

	public String localizedDirResultTitle() {
		StringBuffer bf = new StringBuffer();
		bf.append(session.getLocalizedString("TResultSearch"));
		bf.append(" ");
		bf.append(session.getLocalizedString(directory.localeIdForTitle()));

		int resultCount = 0;

		if (!directory.processSearchAtPathwayLevel()) {
			getResultsForCurrentDirectory();
			if (dirLevelResult != null) {
				bf.append(" : ");
				resultCount = dirLevelResult.count();
				bf.append(resultCount);
			}
		}
		else {
			// int resultsCount = directory.getPathwaysResultCount(searchString,ectx);
			resultCount = directory.getPathwaysResultCount(searchArgs, ectx);
			bf.append(" : ").append(resultCount); // trouver le resultat
		}

		if (resultCount > CommonDataHolder.limitSearchResult) {
			String msg = session.getLocalizedString("ErrTropDeResultats");
			System.out.println("msg=" + msg);
			System.out.println("limit:" + CommonDataHolder.limitSearchResult);
			msg = msg.replaceFirst("%NB%", String.valueOf(CommonDataHolder.limitSearchResult));
			setErrorMessage(msg);
		}

		dirLevelResult = firstRecordsFromArray(dirLevelResult, CommonDataHolder.limitSearchResult);

		return bf.toString();
	}

	private NSArray firstRecordsFromArray(NSArray array, int count) {
		if (array == null) {
			return null;
		}
		if (count >= array.count()) {
			return array;
		}
		else {
			return subsetOfArray(array, 0, count - 1);
		}
	}

	private NSArray subsetOfArray(NSArray array, int startIndex, int endIndex) {
		if (startIndex >= array.count() || startIndex > endIndex) {
			return array;
		}
		else {
			NSRange range = new NSRange(startIndex, (endIndex - startIndex));
			return array.subarrayWithRange(range);
		}
	}

	public NSArray searchResultFields() {
		if (directory.searchResultFields() != null) {
			return directory.searchResultFields();
		}
		else {
			return directory.getSummaryFields();
		}
	}

	// TODO : LR - liste rouge
	private void getResultsForCurrentDirectory() {
		dirLevelResult = directory.processSimpleSearch(searchArgs, session.defaultEditingContext(), session.connectedIndividu());
	}

	public String errorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}