package org.cocktail.directory.server.components;

// Generated by the WOLips Templateengine Plug-in at 23 avr. 2007 17:29:27

import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.impl.elements.DirectoryEntity;
import org.cocktail.directory.impl.pathways.Pathway;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSArray;


public class MultRootTreeView extends WOComponent {
	
	private static final long serialVersionUID = 2242435020979786434L;

	public Directory directory;
	public Pathway pathway;
	public String typeRequestItem;
	public NSArray listRootRecords;
	public String libelKey;
	public String sonsKey;
	public int openLevel;
	public String selectionKey;
	public String selectionTextColor;
	public DirectoryEntity currentRoot;
	
    public MultRootTreeView(WOContext context) {
        super(context);
    }



}


