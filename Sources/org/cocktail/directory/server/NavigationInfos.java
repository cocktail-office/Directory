package org.cocktail.directory.server;


import org.cocktail.directory.eof.server.EOStructureUlr;
import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.tools.LocaleRepresentation;

import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;



public class NavigationInfos {

	// type de requete vers la directAction discover
	public static final String REQ_LANGUAGE 		= "lang";
	public static final String REQ_DIRECTORY 		= "d" ;
	public static final String REQ_PATHWAY	 		= "p" ;
	public static final String REQ_AUTOCONNECT	 	= "autoconnect" ;
	public static final String REQ_STANDALONE		= "stdl";
	
	
	
	
	public static final String PAR_GRHUM_FUNCTION 	= "pgf";
	
	
	
	// type of display for an item
	public static final String REQ_PARENT_ITEM	 	= "pi" ;
	public static final String REQ_SPECIFIC_ITEM 	= "si";
	
	// type de page
	public static final int DISPLAY_START_PAGE	 			= 0;
	public static final int DISPLAY_BROWSING	 			= 1;
	public static final int DISPLAY_DETAILS 	 			= 2;
	public static final int DISPLAY_SIMPLE_SEARCH 	 		= 3;
	public static final int DISPLAY_ADVANCED_SEARCH 	 	= 4;
	
	// nature d'affichage
	public static final int VIEW_FOR_DIRECTORY_START 					= 1;
	public static final int VIEW_FOR_PARENT_ITEM 						= 2;
	public static final int VIEW_HIERARCHICALLY_FOR_DIRECTORY_START		= 3;
	public static final int VIEW_HIERARCHICALLY_FOR_PARENT_ITEM			= 4;
	
	
	
	private NSMutableArray listPaths;
	private Directory currentDisplayedDirectory;
	private NSMutableArray listStructuresSourceSelection;
	
	public LocaleRepresentation selectedLocale;
	
	private EOStructureUlr structDroitsConventions,structDroitsPartenaires;
	
	public NavigationInfos() {
		listPaths = new NSMutableArray();
	}
	
	public boolean isSpecificDirectory() {
		return currentDisplayedDirectory!=null;
	}
	
	public NSArray getListPaths() {
		return listPaths;
	}
	
	
	
	private int getHighestIndex() {
		int highestLevel = -1;
		NSArray tmp = (NSArray)listPaths.valueForKey("level");
		for(int i=0;i<tmp.count();i++) {
			int lvl = ((Integer)tmp.objectAtIndex(i)).intValue();
			if(lvl>highestLevel)
				highestLevel = lvl;
		}
		return highestLevel;
	}
	
	public void createNewPath(String locId,String displayString,int level,String daName,NSDictionary queryDico) {
		
		int highestLevel = getHighestIndex();
		
		if(level==highestLevel)
			removePathsWithLevel(level);
		else
		if(level<highestLevel)
			this.removePathRange(level+1,highestLevel);
		
		NSArray levelsList = (NSArray)listPaths.valueForKey("level");
		Integer intLevel = new Integer(level);
		if(levelsList.containsObject(intLevel)) {
			return;
		}
		
		boolean create = true;
		
		if(locId!=null && level==1) {
			NSArray localList = (NSArray)listPaths.valueForKey("localizationId");
			create = !localList.containsObject(locId);
		}
		else
		if(displayString!=null && level==2) {
			NSArray dispStringList = (NSArray)listPaths.valueForKey("displayString");
			create = !dispStringList.containsObject(displayString);
		}
		
		if(create) {
			NavigationPath defaultPath = new NavigationPath(
											locId,
											intLevel,
											daName,
											queryDico
											);
			defaultPath.setDisplayString(displayString);
			addToListPaths(defaultPath);
		}
	}
	
	public void removeAllAfterPath(NavigationPath path) {
		int index = listPaths.indexOfObject(path);
		if(index!=NSArray.NotFound) {
			for(int i=index+1;i<listPaths.count();i++) {
				listPaths.removeObjectAtIndex(i);
			}
		}
	}
	
	
	/** supprime les chemins situés après le chemin d'index passé en parametre (index) */
	public void removeAllPathsAfterIndex(int index) {
		
		int highestLevel = getHighestIndex();
		
		if(highestLevel>index) {
			this.removePathRange(index+1,highestLevel);
		}
	}
	
	public void removePathsWithLevel(int level) {
		for(int i=0;i<listPaths.count();i++) {
			NavigationPath currentPath = (NavigationPath)listPaths.objectAtIndex(i);
			if(currentPath.getLevel().intValue()==level)
				listPaths.removeObject(currentPath);
		}
	}

	//TODO : gérer le cas ou la navigation n'est pas partie de la racine de l'annuaire
	// lancement d'un permalink par exemple : Fait !
	public void removePathRange(int start,int end) {
		//int r1 = end-start+1;

		NSMutableArray copy = new NSMutableArray();
		
		for(int i=0;i<start;i++) {
			copy.addObject(listPaths.objectAtIndex(i));
		}
		
		for(int i=end+1;i<listPaths.count();i++) {
			copy.addObject(listPaths.objectAtIndex(i));
		}
		
		listPaths = copy;
	}
	
	public void setListPaths(NSArray listPaths) {
		this.listPaths = listPaths.mutableClone();
	}
	
	public void addToListPaths(NavigationPath path) {
		if(!listPaths.containsObject(path))
			listPaths.addObject(path);
	}

	public Directory getCurrentDisplayedDirectory() {
		return currentDisplayedDirectory;
	}

	public void setCurrentDisplayedDirectory(Directory currentDisplayedDirectory) {
		this.currentDisplayedDirectory = currentDisplayedDirectory;
	}

	public NSMutableArray getListStructuresSourceSelection() {
		return listStructuresSourceSelection;
	}

	public void setListStructuresSourceSelection(
			NSMutableArray listStructuresSourceSelection) {
		this.listStructuresSourceSelection = listStructuresSourceSelection;
	}
	
}
