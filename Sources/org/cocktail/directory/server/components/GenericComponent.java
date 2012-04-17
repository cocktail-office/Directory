package org.cocktail.directory.server.components;

import org.cocktail.directory.server.Application;
import org.cocktail.directory.server.Session;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WOResponse;
import com.webobjects.eocontrol.EOEditingContext;

import er.ajax.CktlERXResponseRewriter;
import er.extensions.appserver.ERXResponseRewriter;

public class GenericComponent extends WOComponent {
	
	
	private static final long serialVersionUID = -8852096887565913469L;
	
	public Application application = (Application)application();
	public Session session = (Session)session();

	
	private EOEditingContext editingContext;
	private String errorMessage;
	
	public GenericComponent(WOContext context) {
		super(context);
		editingContext = session.defaultEditingContext();
	}

    public boolean synchronizesVariablesWithBindings() {
        return false;
    }

    
	public EOEditingContext editingContext() {
		return editingContext;
	}
	
	public void setEditingContext(EOEditingContext ec) {
		editingContext = ec;
	}

	public String errorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public void appendToResponse(WOResponse response, WOContext context) {

		super.appendToResponse(response, context);
		
		CktlERXResponseRewriter.addStylesheetResourceInHead(response, context, "app", "css/style.css");
		//CktlAjaxUtils.addStylesheetResourceInHead(context, response, "app", "css/style.css");
		ERXResponseRewriter.addScriptResourceInHead(response, context, "app", "javascript/functions.js");
		ERXResponseRewriter.addScriptResourceInHead(response, context, "app", "javascript/prototype.js");
		ERXResponseRewriter.addScriptResourceInHead(response, context, "app", "javascript/rico.js");
		ERXResponseRewriter.addScriptResourceInHead(response, context, "app", "javascript/overlib.js");
		
	}

	

}
