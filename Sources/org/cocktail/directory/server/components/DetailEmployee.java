package org.cocktail.directory.server.components;

// Generated by the WOLips Templateengine Plug-in at 17 janv. 2007 10:30:34

import org.cocktail.directory.eof.server.EOIndividuUlr;
import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.impl.elements.DirectoryEntity;
import org.cocktail.directory.impl.elements.FieldItem;
import org.cocktail.directory.impl.elements.ParameterizedFieldItem;
import org.cocktail.directory.impl.pathways.Pathway;
import org.cocktail.directory.server.Application;
import org.cocktail.directory.server.CommonDataHolder;
import org.cocktail.directory.server.DirElementNotFoundException;
import org.cocktail.directory.server.Session;

import com.webobjects.appserver.WOApplication;
import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;



public class DetailEmployee extends WOComponent {

	public Application app = (Application)WOApplication.application();
	
	// bindings
	private String detailItem;
	public Directory directory;
	public Pathway pathway;
	
	// misc class attributes
	public EOIndividuUlr item;
	public String currentLineAdress,currentAdresseWeb;
	
	public Session session;
	public NSMutableArray fieldsForService;
	
    public DetailEmployee(WOContext context) {
        super(context);
        session = (Session)session();
    }
    
    private void constructFieldsEmployees() {
    	
        if(item==null)
        	return;
        
    	fieldsForService = new NSMutableArray();
        
    	fieldsForService.addObject(new FieldItem("LEntity","displayString","lcStructure",false));
        
        fieldsForService.addObject(new FieldItem("LTelFaxReception","telephoneFaxPro",null,true));

        Object[] args = new Object[]{item.valueForKey("persId")};
        Class[] types = new Class[]{Number.class};
        ParameterizedFieldItem fieldTelephonePerson = new ParameterizedFieldItem(
        													"LTelFax","telephoneFaxProForPerson",null,true,args,types
        													);
        
        args = new Object[]{item.valueForKey("noIndividu")};
        ParameterizedFieldItem fieldBureauPerson = new ParameterizedFieldItem(
														"LLocalisation","bureauForPerson",null,true,args,types
														);
        
        args = new Object[]{item.valueForKey("persId")};
        ParameterizedFieldItem fieldAssocIndividu = new ParameterizedFieldItem(
														"LRole","associationsIndividu",null,true,args,types
														);
        	
        fieldsForService.addObject(fieldTelephonePerson);
        fieldsForService.addObject(fieldBureauPerson);
        fieldsForService.addObject(fieldAssocIndividu);
    }
    
    public String getClassForCurrentIndex() {
    	return "even";
    }
    
    public boolean isDispSupannCategory() {
    	return CommonDataHolder.afficherCategorieSupann;
    }
    
    // retourne la liste des services pour l'individu.
    public NSArray getServicesForPersonne() {
    	NSArray results = new NSArray();
    	if(item!=null) {
    		NSDictionary args = new NSDictionary(item.valueForKey("persId"),"persId");
   			results = EOUtilities.objectsWithFetchSpecificationAndBindings(
   						session().defaultEditingContext(),"StructureUlr","servicesForPersId",args
   					  );
    	}
    	return results;
    }
    
 	public String getDetailItem() {
		return detailItem;
	}
 	
 	public String getItemIdentification() {
 		return ((DirectoryEntity)item).displayString();
 	}
 	
 	// interception de l'identifiant de l'item dont on veut le detail 
 	// -> possibilit� de construire les FieldItem parametr�s
	public void setDetailItem(String detailItem) throws DirElementNotFoundException {
		this.detailItem = detailItem;
		if(detailItem!=null) {
	   		Directory dir = session.getDirectory();
	   		String dirId = dir.getId();
	   		
	   		if(dirId.equals(CommonDataHolder.DIR_EMPLOYEES)) {
	   			item = (EOIndividuUlr)dir.fetchObjectWithId(session.defaultEditingContext(),detailItem);
	   			constructFieldsEmployees();
	   		}
	   		
	   		if(dirId.equals(CommonDataHolder.DIR_SUPPLIERS)) {
	   			item = (EOIndividuUlr)dir.fetchObjectWithId(session.defaultEditingContext(),detailItem);
	   		}
	   		
	   		if(dirId.equals(CommonDataHolder.DIR_GROUPS)) {
	   			item = (EOIndividuUlr)dir.fetchObjectOfKindWithId(
	   						session.defaultEditingContext(),
	   						"IndividuUlr",
	   						"noIndividu",
	   						detailItem );
				
	   			constructFieldsEmployees();
	   		}
	   		
	   		//TODO : Gestion des erreurs en cas de ressource introuvable !!!
	   		if(item==null) {
	   			throw new DirElementNotFoundException(session,dir,detailItem);
	   		}
		
		}
	}
	
	
	public boolean isLinkProfilProvided() {
		String urlProfil = app.linkProfil();
		return (urlProfil != null) && (!urlProfil.trim().equals(""));
	}
	

}