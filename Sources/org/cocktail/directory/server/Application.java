package org.cocktail.directory.server;

/**
 * Copyright Cocktail Consortium
 *
 * Auteur : M F Adour email : francois.adour@univ-provence.fr
 *   
 * Ce logiciel est un programme informatique servant d'annuaire des personnels, 
 * des �tudiants, des fournisseurs etc en s'appuyant sur le r�ferenciel Grhum. 
 *
 * Ce logiciel est r�gi par la licence CeCILL soumise au droit fran�ais et
 * respectant les principes de diffusion des logiciels libres. Vous pouvez
 * utiliser, modifier et/ou redistribuer ce programme sous les conditions
 * de la licence CeCILL telle que diffus�e par le CEA, le CNRS et l'INRIA 
 * sur le site "http://www.cecill.info".
 *
 * En contrepartie de l'accessibilit� au code source et des droits de copie,
 * de modification et de redistribution accord�s par cette licence, il n'est
 * offert aux utilisateurs qu'une garantie limit�e.  Pour les m�mes raisons,
 * seule une responsabilit� restreinte p�se sur l'auteur du programme,  le
 * titulaire des droits patrimoniaux et les conc�dants successifs.
 * 
 * A cet �gard  l'attention de l'utilisateur est attir�e sur les risques
 * associ�s au chargement,  � l'utilisation,  � la modification et/ou au
 * d�veloppement et � la reproduction du logiciel par l'utilisateur �tant 
 * donn� sa sp�cificit� de logiciel libre, qui peut le rendre complexe � 
 * manipuler et qui le r�serve donc � des d�veloppeurs et des professionnels
 * avertis poss�dant  des  connaissances  informatiques approfondies.  Les
 * utilisateurs sont donc invit�s � charger  et  tester  l'ad�quation  du
 * logiciel � leurs besoins dans des conditions permettant d'assurer la
 * s�curit� de leurs syst�mes et ou de leurs donn�es et, plus g�n�ralement, 
 * � l'utiliser et l'exploiter dans les m�mes conditions de s�curit�. 
 *
 * Le fait que vous puissiez acc�der � cet en-t�te signifie que vous avez 
 * pris connaissance de la licence CeCILL, et que vous en avez accept� les
 * termes.
 */

import java.util.Date;
import java.util.StringTokenizer;
import java.util.Timer;
import java.util.TimerTask;

import org.cocktail.directory.eof.server.EOGrhumParametres;
import org.cocktail.directory.eof.server.EOVlans;
import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.impl.ExternalDirectory;
import org.cocktail.directory.server.components.MessagesViewer;
import org.cocktail.directory.tools.CLog;
import org.cocktail.directory.tools.DirUtilities;
import org.cocktail.directory.tools.LocaleRepresentation;
import org.cocktail.fwkcktlwebapp.server.CktlConfig;
import org.cocktail.fwkcktlwebapp.server.CktlMailBus;
import org.cocktail.fwkcktlwebapp.server.CktlWebAction;
import org.cocktail.fwkcktlwebapp.server.CktlWebApplication;
import org.cocktail.fwkcktlwebapp.server.version.A_CktlVersion;

import com.webobjects.appserver.WOApplication;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WOMessage;
import com.webobjects.appserver.WOResponse;
import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOSharedEditingContext;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSLog;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSTimestamp;

import er.extensions.appserver.ERXMessageEncoding;

public class Application extends CktlWebApplication {

	private EOSharedEditingContext sharedEC;

	public NSArray listDirectories;
	public NSMutableArray<LocaleRepresentation> listLocales;
	private String defaultLocal;
	private String helpLnk, mailReaction;

	private NSArray dirsNames;

	private static final boolean COCKTAIL_COLLECTE = false;

	private A_CktlVersion _appCktlVersion = null;

	private NSMutableArray listSearchUserHitHolders;

	public static void main(String argv[]) {
		WOApplication.main(argv, Application.class);
	}

	public boolean _isSupportedDevelopmentPlatform() {
		return (super._isSupportedDevelopmentPlatform() || System.getProperty("os.name").startsWith("Win"));
	}

	public String applicationParamForKey(String key) {
		return config().stringForKey(key);
	}

	public String getHelpLink() {
		if (helpLnk == null) {
			helpLnk = config().stringForKey("HELP_RESOURCE_LINK");
		}
		return helpLnk;
	}

	public boolean isHelpAvailable() {
		String helpLnk = getHelpLink();
		return helpLnk != null && !helpLnk.equals("");
	}

	public Application() {
		super();

		WOMessage.setDefaultEncoding("UTF8");

		WOMessage.setDefaultURLEncoding("UTF-8");
		ERXMessageEncoding.setDefaultEncoding("UTF8");
		ERXMessageEncoding.setDefaultEncodingForAllLanguages("UTF8");

		listSearchUserHitHolders = new NSMutableArray();

		NSLog.out.appendln("Bienvenue dans " + this.name() + " !");
		NSLog.out.appendln("Version " + Version.getVersion() + " du " + Version.VERSIONDATE);

		sharedEC = EOSharedEditingContext.defaultSharedEditingContext();

		setDefaultRequestHandler(requestHandlerForKey(directActionRequestHandlerKey()));

		prepareSupportedLocales();
		loadConfiguration();
		loadDirectories();

		setupCleanHitCounterTimer();

		CommonDataHolder.afficherConfiguration();
	}

	// private NSArray getPathwaysForDirectory(String dirName) throws Exception {
	// String tmp = config().stringForKey(dirName);
	// NSMutableArray paths = new NSMutableArray();
	// if(tmp!=null) {
	// StringTokenizer st = new StringTokenizer(tmp,"|");
	// while (st.hasMoreTokens()) {
	// String item = st.nextToken();
	// for(int i=0;i<PATHWAY_CLASSES.length;i++) {
	// Class cls = PATHWAY_CLASSES[i];
	// Field fld = cls.getDeclaredField("code");
	// String val = (String) fld.get(cls);
	// if(val!=null && val.equals(item)) {
	// paths.addObject(cls);
	// }
	// }
	// }
	// }
	// return paths;
	// }

	public String configValue(String configFileEntry) {
		return config().stringForKey(configFileEntry);
	}

	private NSArray getPathwayNamesForDirectory(String directoryName) throws Exception {
		String tmp = config().stringForKey(directoryName);
		if (tmp != null) {
			return NSArray.componentsSeparatedByString(tmp, "|");
		}
		else {
			return new NSArray();
		}
	}

	private void loadDirectories() {
		CktlConfig cfg = config();
		String dirsToLoad = config().stringForKey("DISPLAYED_DIRECTORIES");
		dirsNames = NSArray.componentsSeparatedByString(dirsToLoad, "|");
		String currentDir, shortDirName;
		NSMutableArray dirs = new NSMutableArray();
		Class aCls = null;
		String dirVisibility;

		for (int i = 0; i < dirsNames.count(); i++) {
			shortDirName = (String) dirsNames.objectAtIndex(i);
			currentDir = "org.cocktail.directory.impl." + shortDirName;
			dirVisibility = cfg.stringForKey(shortDirName + ".visibility");

			Directory dir;
			try {
				aCls = Class.forName(currentDir);
				dir = (Directory) aCls.newInstance();
				dir.setVisibilityType(dirVisibility);

				NSArray pathways = this.getPathwayNamesForDirectory(shortDirName);

				String currentPathInfos;
				for (int idx = 0; idx < pathways.count(); idx++) {
					currentPathInfos = (String) pathways.objectAtIndex(idx);

					NSArray elemPath = NSArray.componentsSeparatedByString(currentPathInfos, "*");

					if (elemPath.count() == 2) {
						dir.createPathway((String) elemPath.objectAtIndex(0), (String) elemPath.objectAtIndex(1));
					}
				}

				dir.initDirectory();
				dirs.addObject(dir);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

		// c_structure racine de l'annuaire :
		String tmp = null;

		if (dirsNames.contains("EmployeesDirectory")) {
			tmp = config().stringForKey("STRUCT_ROOT_SERVICES");
			if (tmp != null && !tmp.trim().equals("")) {
				CommonDataHolder.cStructuresRoot = NSArray.componentsSeparatedByString(tmp.trim(), "|");
			}
			else {
				warn("Impossible de trouver la structure racine des diplomes.\nL'annuaire des diplomes sera inopérant.");
			}
		}

		NSArray list = null;
		StringBuffer query = null;

		// c_structure racine emplacement des diplomes :
		if (dirsNames.contains("StudentsDirectory")) {
			query = new StringBuffer("select c_structure from GRHUM.STRUCTURE_ULR where ");
			NSArray listCstructure = NSArray.componentsSeparatedByString(config().stringForKey("ROOT_DIPLOMES"), "|");
			String currentStruct;
			for (int i = 0; i < listCstructure.count(); i++) {
				currentStruct = (String) listCstructure.objectAtIndex(i);
				if (i > 0) {
					query.append("and ");
				}
				query.append("c_structure = '").append(currentStruct).append("' ");
			}

			list = EOUtilities.rawRowsForSQL(sharedEC, config().stringForKey("MAIN_MODEL_NAME"), query.toString(), null);

			if (list.count() > 0) {
				CommonDataHolder.cStructureRootDiploma = (String) ((NSKeyValueCoding) list.objectAtIndex(0)).valueForKey("C_STRUCTURE");
			}
		}

		dirsToLoad = cfg.stringForKey("EXTERNAL_DIRECTORIES");
		dirsNames = NSArray.componentsSeparatedByString(dirsToLoad, "|");
		ExternalDirectory extDir;
		String dirUrl;

		for (int i = 0; i < dirsNames.count(); i++) {
			shortDirName = (String) dirsNames.objectAtIndex(i);
			dirUrl = cfg.stringForKey(shortDirName);
			currentDir = "org.cocktail.directory.impl." + shortDirName;
			try {
				aCls = Class.forName(currentDir);
				extDir = (ExternalDirectory) aCls.newInstance();
				extDir.setExternalUrl(dirUrl);
				dirs.addObject(extDir);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}

		listDirectories = dirs.immutableClone();
	}

	/** retourne la liste des annuaires qui supportent une recherche invers�e */
	public NSArray revertSearchSupportingDirectories() {
		NSMutableArray array = new NSMutableArray();
		Directory currentDir;
		for (int i = 0; i < listDirectories.count(); i++) {
			currentDir = (Directory) listDirectories.objectAtIndex(i);
			if (currentDir.supportsRevertSearch()) {
				array.addObject(currentDir);
			}
		}
		return array;
	}

	private void loadConfiguration() {

		CommonDataHolder.mainDomain = grhumParametre("GRHUM_DOMAINE_PRINCIPAL");
		CommonDataHolder.urlAgenda = grhumParametre("URL_AGENDA");

		String grhumPlan = grhumParametre("GRHUM_PLANNING_URL");
		if (grhumPlan != null) {
			CommonDataHolder.urlICS = grhumPlan;
		}
		else {
			CommonDataHolder.urlICS = null;
		}

		CommonDataHolder.entityNamePhotoEmploye = config().stringForKey("ENTITY_PHOTO_EMPLOYE");

		String tmpstr = config().stringForKey("USE_FETCH_BUFFERS");
		if (tmpstr != null && "true".equals(tmpstr)) {
			CommonDataHolder.useFetchBuffers = true;
		}

		tmpstr = config().stringForKey("KEEP_DISPLAY_STRING_UNCHANGED");
		if (tmpstr != null && "true".equals(tmpstr)) {
			CommonDataHolder.keepDisplayStringUnchanged = true;
		}

		tmpstr = config().stringForKey("ACTIVER_AGENDA_ETUDIANT");
		if (tmpstr != null && "true".equals(tmpstr)) {
			CommonDataHolder.enableStudentCalendar = true;
		}

		tmpstr = config().stringForKey("ACTIVER_AGENDA_PERSONNEL");
		if (tmpstr != null && "true".equals(tmpstr)) {
			CommonDataHolder.enableEmployeeCalendar = true;
		}

		tmpstr = config().stringForKey("VIEW_SEARCH_EMPLOYES");

		if ("V_PERSONNEL_ACTUEL".equals(tmpstr)) {
			CommonDataHolder.relationshipNameToSearchEmployees = "vPersonnelActuel.noDossierPers";
		}
		if ("V_LDAP_PERSONNEL_ACTUEL".equals(tmpstr)) {
			CommonDataHolder.relationshipNameToSearchEmployees = "vLdapPersonnelActuel.noIndividu";
		}
		if ("NONE".equals(tmpstr)) {
			CommonDataHolder.relationshipNameToSearchEmployees = null;
		}

		tmpstr = config().stringForKey("MIN_CARACTERES_RECHERCHE");
		if (tmpstr != null && !tmpstr.trim().equals("")) {
			CommonDataHolder.minCaracteresRecherche = Integer.parseInt(tmpstr);
		}

		tmpstr = config().stringForKey("LIMITE_NOMBRE_RECHERCHES");
		if (tmpstr != null && !tmpstr.trim().equals("")) {
			CommonDataHolder.limitSearchHits = Integer.parseInt(tmpstr);
		}

		tmpstr = config().stringForKey("MINUTES_ATTENTE_LIMITE_RECHERCHE");
		if (tmpstr != null && !tmpstr.trim().equals("")) {
			CommonDataHolder.limitSearchWaitMinutes = Integer.parseInt(tmpstr);
		}

		CommonDataHolder.etabUrl = config().stringForKey("ETAB_URL");

		tmpstr = config().stringForKey("JAVA_LOGGING_MODE");

		if (tmpstr.equals("LOG_ALL")) {
			CLog.setMode(CLog.LOG_ALL);
		}
		else
			if (tmpstr.equals("LOG_EXCEPTIONS")) {
				CLog.setMode(CLog.LOG_EXCEPTIONS);
			}
			else
				if (tmpstr.equals("LOG_NOTHING")) {
					CLog.setMode(CLog.LOG_NOTHING);
				}

		tmpstr = config().stringForKey("ACTIVER_AFFICHAGE_FONCTION");
		if (tmpstr != null && !tmpstr.trim().equals("")) {
			CommonDataHolder.afficherFonctions = tmpstr.trim().equals("true");
		}

		tmpstr = config().stringForKey("ACTIVER_AFFICHAGE_QUALITE");
		if (tmpstr != null && !tmpstr.trim().equals("")) {
			CommonDataHolder.afficherQualite = tmpstr.trim().equals("true");
		}

		tmpstr = config().stringForKey("ACTIVER_AFFICHAGE_CATEGORIE_SUPANN");
		if (tmpstr != null && !tmpstr.trim().equals("")) {
			CommonDataHolder.afficherCategorieSupann = tmpstr.trim().equals("true");
		}

		tmpstr = config().stringForKey("ACTIVER_RECHERCHE_PAR_FONCTION");
		if (tmpstr != null && !tmpstr.trim().equals("")) {
			CommonDataHolder.activateSearchByFunctions = tmpstr.trim().equals("true");
		}

		tmpstr = config().stringForKey("URL_ONLINE_ICS_VIEWER");
		if (tmpstr != null && !tmpstr.trim().equals("")) {
			CommonDataHolder.onlineICSViewer = tmpstr;
		}

		tmpstr = config().stringForKey("LIMITE_RESULTATS_RECHERCHE");
		if (tmpstr != null && !tmpstr.trim().equals("")) {
			CommonDataHolder.limitSearchResult = Integer.parseInt(tmpstr);
		}

		/*
		 * tmpstr = config().stringForKey("LIMITE_NOMBRE_RECHERCHES"); if(tmpstr!=null && !tmpstr.trim().equals(""))
		 * CommonDataHolder.limitSearchHits = Integer.parseInt(tmpstr);
		 * 
		 * tmpstr = config().stringForKey("MINUTES_ATTENTE_LIMITE_RECHERCHE"); if(tmpstr!=null && !tmpstr.trim().equals(""))
		 * CommonDataHolder.limitSearchWaitMinutes = Integer.parseInt(tmpstr);
		 */

		// Charger le domaine du vlan diplome -> etudiants
		EOVlans diplVlan = (EOVlans) DirUtilities.fetchUniqueData(sharedEC, "Vlans", "cVlan", "D");
		if (diplVlan != null) {
			CommonDataHolder.etudiantsDomain = diplVlan.domaine();
			NSLog.out.appendln(":-) VLAN et domaine avec code 'D' trouv� = " + CommonDataHolder.etudiantsDomain);
		}
		else {
			NSLog.out.appendln(":-( Erreur : VLAN et domaine avec code 'D' manquant dans grhum.vlans");
			CommonDataHolder.etudiantsDomain = "-";
		}

		String verboseMode = config().stringForKey("LOG_SQL");

		CLog.log("CAS_SERVICE_URL=" + CktlWebAction.casServiceURL());
		CLog.log("casLoginURL=" + CktlWebAction.casLoginURL());
		CLog.log("APP_USE_CAS=" + config().stringForKey("APP_USE_CAS"));

		if (verboseMode != null && verboseMode.trim().toUpperCase().equals("YES")) {
			NSLog.debug.setAllowedDebugLevel(NSLog.DebugLevelDetailed);
			NSLog.allowDebugLoggingForGroups(NSLog.DebugGroupSQLGeneration);
			NSLog.allowDebugLoggingForGroups(NSLog.DebugGroupDatabaseAccess);
		}

	}

	public String linkProfil() {
		return config().stringForKey("URL_APP_PROFIL");
	}

	protected void prepareSupportedLocales() {
		String listSupportedLocales = config().stringForKey("LIST_SUPPORTED_LOCALES");
		defaultLocal = config().stringForKey("DEFAULT_LOCALE");

		StringTokenizer st = new StringTokenizer(listSupportedLocales, "|");
		String currentToken;
		String[] elements;
		LocaleRepresentation locale;
		listLocales = new NSMutableArray<LocaleRepresentation>();
		while (st.hasMoreTokens()) {
			currentToken = st.nextToken();
			elements = currentToken.split("-");
			locale = new LocaleRepresentation(elements[0], elements[1]);
			listLocales.addObject(locale);
		}
	}

	public LocaleRepresentation getMatchingLocale(String lang) {

		if (listLocales.count() == 0) {
			return null;
		}

		if (lang == null) {
			return listLocales.objectAtIndex(0);
		}

		boolean isCountry = LocaleRepresentation.isCountryIndicated(lang);
		NSArray<String> comp = null;
		String pattern = null;
		if (isCountry) {
			comp = NSArray.componentsSeparatedByString(lang, "_");
			if (comp.count() == 2) {
				pattern = comp.objectAtIndex(0);
			}
		}
		else {
			pattern = lang;
		}
		for (LocaleRepresentation aLocale : listLocales) {
			if (aLocale.getValue().equals(pattern)) {
				return aLocale;
			}
		}

		if (isCountry) {
			return listLocales.objectAtIndex(0);
		}
		else {
			return null;
		}
	}

	public Directory getDirectoryWithId(String id) {
		Directory dir;
		for (int i = 0; i < listDirectories.count(); i++) {
			dir = (Directory) listDirectories.objectAtIndex(i);
			if (dir.getId().equals(id)) {
				return dir;
			}
		}
		return null;
	}

	public String grhumParametre(String paramKey) {
		EOGrhumParametres param = (EOGrhumParametres) DirUtilities.fetchUniqueData(sharedEC, "GrhumParametres", "paramKey", paramKey);
		if (param != null) {
			return param.paramValue();
		}
		else {
			return null;
		}
	}

	public String copyright() {
		return "&copy; ENS Cachan";
	}

	public String configFileName() {
		return "Directory.config";
	}

	public EOSharedEditingContext getSharedEC() {
		return sharedEC;
	}

	public String version() {
		return Version.getVersion();
	}

	// sert a afficher un message visible sur la sortie standard cot� serveur.
	public void warn(String message) {
		CLog.log("*******************************************************");
		CLog.log(":( " + message);
		CLog.log("*******************************************************");
	}

	public WOResponse handleException(Exception anException, WOContext aContext) {

		CLog.log("handleException");

		Session session = (Session) aContext.session();
		String sender = null;
		if (session != null && session.connectedUserInfo() != null) {
			sender = session.connectedUserInfo().email();
		}
		else {
			sender = "application_annuaire";
		}

		String to = config().stringForKey("SEND_ERRORS_EMAIL");
		if (to != null && !to.equals("")) {
			String subject = "[Directory] Exception";
			String message = stackTraceToString(anException, true);
			// sendMail(sender,to,null,subject,message);
		}

		MessagesViewer error = new MessagesViewer(aContext);
		error.setException(anException);
		return error.generateResponse();

		// return super.handleException(anException,aContext);
	}

	private String stackTraceToString(Throwable e, boolean useHtml) {
		String tagCR = "\n";
		if (useHtml) {
			tagCR = "<br>";
		}
		String stackStr = e.getMessage() + tagCR + tagCR;
		StackTraceElement[] stack = e.getStackTrace();
		for (int i = 0; i < stack.length; i++) {
			stackStr += stack[i].toString() + tagCR;
		}
		return stackStr;
	}

	public boolean enableGlobalSearch() {
		String global = config().stringForKey("ENABLE_GLOBAL_SEARCH");
		return global == null || global.equals("true");
	}

	public void sendMail(String from, String to, String cc, String subject, String message) {
		CktlMailBus mailBus = mailBus();
		// String redirectTo = config().stringForKey("REDIRECTION_EMAIL");
		// String localCc = cc;
		// if(redirectTo==null || redirectTo.trim().equals("")) {
		// redirectTo= to;
		// localCc=null;
		// }
		mailBus.sendMail(from, to, cc, subject, message);
	}

	public String etabUrl() {
		return CommonDataHolder.etabUrl;
	}

	public String etabHrefUrl() {
		String url = CommonDataHolder.etabUrl;
		if (url != null) {
			StringBuffer bf = new StringBuffer();
			bf.append("<a href=\"");
			bf.append(url).append("\">");
			bf.append(url).append("</a>");
			return bf.toString();
		}
		else {
			return null;
		}
	}

	public String mailReaction() {
		if (mailReaction == null) {
			mailReaction = config().stringForKey("MAIL_REACTION");
		}
		return mailReaction;
	}

	public String getDefaultLocal() {
		return defaultLocal;
	}

	public void setDefaultLocal(String defaultLocal) {
		this.defaultLocal = defaultLocal;
	}

	public NSMutableArray getListSearchUserHitHolders() {
		return listSearchUserHitHolders;
	}

	public void setListSearchUserHitHolders(NSMutableArray listSearchUserHitHolders) {
		this.listSearchUserHitHolders = listSearchUserHitHolders;
	}

	/* retire de la liste des ip, l'ip passée en paramètre avec toutes ses informations */
	public void removeFromListSearchHolder(String ipAddress) {
		UserHitHolder userHit = retrieveUserHit(ipAddress);
		if (userHit != null) {
			listSearchUserHitHolders.removeObject(userHit);
		}
	}

	public UserHitHolder retrieveUserHit(String ipAddress) {
		UserHitHolder userHit = null;
		for (int i = 0; i < listSearchUserHitHolders.count(); i++) {
			userHit = (UserHitHolder) listSearchUserHitHolders.objectAtIndex(i);
			if (userHit.ipAddr().equals(ipAddress)) {
				return userHit;
			}
		}
		return null;
	}

	/* permet de stocker un nouvel Hit de recherche de la part d'un utilisateur, si action autorisée retourne true, sinon retourne false */
	public long addUserHit(String ipAdress) {
		// Si -1 : pas de limitation du nombre de hits
		if (CommonDataHolder.limitSearchHits == -1) {
			return 0;
		}

		UserHitHolder userHit = retrieveUserHit(ipAdress);
		if (userHit == null) {
			userHit = new UserHitHolder(ipAdress);
			listSearchUserHitHolders.addObject(userHit);
		}
		else {
			userHit.incrementHits();
		}

		if (userHit.hitCount().intValue() > CommonDataHolder.limitSearchHits) {
			if (userHit.lastHitDate() == null) {
				userHit.setLastHitDate(new NSTimestamp());
				return CommonDataHolder.limitSearchWaitMinutes;
			}
			else {
				return waitTime(userHit);
			}
		}
		else {
			return 0;
		}
	}

	public long waitTime(UserHitHolder userHit) {
		NSTimestamp waitingSince = userHit.lastHitDate();

		long waitingMS = waitingSince.getTime();
		long nowMS = (new NSTimestamp()).getTime();

		long diffMinutes = (nowMS - waitingMS) / 60000;
		if (diffMinutes < CommonDataHolder.limitSearchWaitMinutes) {
			return CommonDataHolder.limitSearchWaitMinutes - diffMinutes;
		}
		else {
			userHit.setHitCount(new Integer(1));
			userHit.setLastHitDate(null);
			return 0;
		}
	}

	public A_CktlVersion appCktlVersion() {
		if (_appCktlVersion == null) {
			_appCktlVersion = new Version();
		}
		return _appCktlVersion;
	}

	/*
	 * public WORequest createRequest(String aMethod, String aURL, String anHTTPVersion, NSDictionary someHeaders, NSData aContent,
	 * NSDictionary someInfo) { WORequest newRequest = super.createRequest(aMethod, aURL, anHTTPVersion, someHeaders, aContent, someInfo);
	 * newRequest.setDefaultFormValueEncoding(_NSUtilities.UTF8StringEncoding); return newRequest; }
	 */

	public void setupCleanHitCounterTimer() {
		Timer timer = new Timer(true);
		// vacuum hit counter every 6 hours
		timer.scheduleAtFixedRate(new CleanHitCounterTask(), new Date(), 21600000);
	}

	class CleanHitCounterTask extends TimerTask {
		public CleanHitCounterTask() {
			super();
		}

		public void run() {
			listSearchUserHitHolders.clear();
			NSLog.out.appendln("clean hit counter timer started : " + new NSTimestamp());
		}
	}

}