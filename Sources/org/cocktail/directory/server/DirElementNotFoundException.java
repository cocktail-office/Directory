package org.cocktail.directory.server;





import org.cocktail.directory.impl.Directory;
import org.cocktail.directory.impl.pathways.Pathway;
import org.cocktail.fwkcktlwebapp.common.util.StringCtrl;

public class DirElementNotFoundException extends Exception {

	private String message;
	
	public DirElementNotFoundException(Session session,Directory dir,Pathway path,String elementId) {
		super();
		prepareMessage(session,dir,path,elementId);
	}
	
	public DirElementNotFoundException(Session session,Directory dir,String elementId) {
		super();
		prepareMessage(session,dir,null,elementId);
	}

	public DirElementNotFoundException(Session session,String elementId) {
		super();
		prepareMessage(session,null,null,elementId);
	}

	
	private void prepareMessage(Session session,Directory dir,Pathway path,String elementId) {
		
		String pattern = null;
		
		if(dir!=null) {
			if(pattern!=null)
				pattern = "EXElementNotFound1";
			else
				pattern = "EXElementNotFound2";
		}
		else
			pattern = "EXElementNotFound3";
		
		message = session.getLocalizedString(pattern);
		
		String tmp;
		if(dir!=null) {
			tmp = session.getLocalizedString( dir.localeIdForTitle() );
			message = StringCtrl.replace(message,"$DIR",tmp);
		}
		
		if(path!=null) {
			tmp = session.getLocalizedString( path.getLocalizationId() );
			message = StringCtrl.replace(message,"$PATH",tmp);
		}
		
		message = StringCtrl.replace(message, "$RES",elementId);
	}

	public DirElementNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DirElementNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public DirElementNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}

}
