package org.cocktail.directory.server;

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSLog;



public class CommonDataHolder {
	
	public static final String DIR_MAIN_ACTION = "discover";
	
	// structure racine de l'etablissement
	public static String cStructureRoot;
	public static NSArray cStructuresRoot;
	
	// structure racine pour le stockage des diplomes
	public static String cStructureRootDiploma;
	
	// a utiliser pour g�rer les racines multiples de diplome : ULR & IUT LR par exemple.
	public static NSArray cStructuresRootDiploma;
	public static String urlAgenda;
	public static String urlICS;
	public static String onlineICSViewer;
	public static String etabUrl;
	
	public static boolean afficherCategorieSupann = true;
	public static boolean afficherQualite = false;
	public static boolean afficherFonctions = false;
	
	public static boolean useFetchBuffers = false;
	public static boolean keepDisplayStringUnchanged = false;
	public static boolean activateSearchByFunctions = false;
	
	public static boolean enableStudentCalendar = false;
	public static boolean enableEmployeeCalendar = false;
	
	
	public static int minCaracteresRecherche = -1;
	public static int limitSearchResult = 0;
	
	public static int limitSearchHits = -1;
	public static int limitSearchWaitMinutes = -1;
	
	
	public static String relationshipNameToSearchEmployees;
	
	
	
	
	public static String mainDomain;
	
	public static String etudiantsDomain;
	
	
	public static String entityNamePhotoEmploye;
	
	
	public static void afficherConfiguration() {
		NSLog.out.appendln(" ********* CONFIGURATION DE DIRECTORY *********");
		NSLog.out.appendln(" * cStructures racine : "+cStructuresRoot);
		NSLog.out.appendln(" * cStructure diplomes : "+cStructureRootDiploma);
		NSLog.out.appendln(" * url agenda : "+urlAgenda);
		NSLog.out.appendln(" * url ICS : "+urlICS);
		NSLog.out.appendln(" * online ICS Viewer : "+onlineICSViewer);
		NSLog.out.appendln(" * afficher categorie supann : "+afficherCategorieSupann);
		NSLog.out.appendln(" * afficher individu.qualite : "+afficherQualite);
		NSLog.out.appendln(" * afficher roles/fonctions : "+afficherFonctions);
		NSLog.out.appendln(" * useFetchBuffers : "+useFetchBuffers);
		NSLog.out.appendln(" * keepDisplayStringUnchanged : "+keepDisplayStringUnchanged);
		NSLog.out.appendln(" * activateSearchByFunctions : "+activateSearchByFunctions);
		NSLog.out.appendln(" * enableStudentCalendar : "+enableStudentCalendar);
		NSLog.out.appendln(" * enableEmployeeCalendar : "+enableEmployeeCalendar);
		NSLog.out.appendln(" * min_caracteres_recherche : "+minCaracteresRecherche);
		NSLog.out.appendln(" * limite_resultats_recheche : "+limitSearchResult);
		NSLog.out.appendln(" * limite_nombre_recherches : "+limitSearchHits);
		NSLog.out.appendln(" * minutes_attente_limite_recherche : "+limitSearchWaitMinutes);
		NSLog.out.appendln(" * relationshipNameToSearchEmployees="+relationshipNameToSearchEmployees);
		NSLog.out.appendln(" * domaine principal : "+mainDomain);
		NSLog.out.appendln(" * domaine etudiants : "+etudiantsDomain);
		NSLog.out.appendln(" * entityNamePhotoEmploye : "+entityNamePhotoEmploye);
		NSLog.out.appendln(" **********************************************");
	}
	
	
	// Enum�rations des codes annuaires :
	public static final String DIR_EMPLOYEES 	= "pers";
	public static final String DIR_STUDENTS	 	= "etu";
	public static final String DIR_SUPPLIERS 	= "fou";
	public static final String DIR_MARKETS	 	= "mar";
	public static final String DIR_GROUPS	 	= "grp";
	public static final String DIR_CONVENTIONS	= "acc";
	
	
	public static final String VISIBILITY_OPEN  		= "open";
	public static final String VISIBILITY_LOGIN 		= "login";
	public static final String VISIBILITY_RESTRICTED 	= "restricted";
	public static final String VISIBILITY_AT_PATHWAY  	= "atpathway";
	
}
