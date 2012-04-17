package org.cocktail.directory.server;

import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSKeyValueCoding;


public class NavigationPath implements NSKeyValueCoding {

	private String directActionName,localizationId,displayString;
	private NSDictionary queryArgs;
	private Integer level;
	private String specificClass;
	
	public String getSpecificClass() {
		return specificClass;
	}

	public void setSpecificClass(String specificClass) {
		this.specificClass = specificClass;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public NavigationPath(String localizationId,Integer level,String daURI,NSDictionary queryArgs) {
		this.localizationId = localizationId;
		this.level = level;
		this.directActionName = daURI;
		this.queryArgs = queryArgs;
	}
	
//	public WORedirect invokeDirectAction(WOContext context) {
//		String daName = null;
//		if(directActionName != null)
//			daName = directActionName;
//				
//    	String url = context.directActionURLForActionNamed(directActionName,queryArgs);
//    	WORedirect redirect = new WORedirect(context);
//    	redirect.setUrl(url);
//    	return redirect;
//	}
	
	
	public boolean hasDisplayString() {
		return localizationId==null && displayString!=null;
	}
	
	public String getDirectActionName() {
		return directActionName;
	}

	public void setDirectActionName(String daName) {
		this.directActionName = daName;
	}

	public String localizationId() {
		return localizationId;
	}

	public void setLocalizationId(String aLocalizationId) {
		this.localizationId = aLocalizationId;
	}

	public String toString() {
		StringBuffer bf = new StringBuffer("[NP] ");
		bf.append(displayString!=null ? displayString : localizationId);
		bf.append(" ");
		bf.append(level);
		return bf.toString();
	}

	public NSDictionary getQueryArgs() {
		return queryArgs;
	}


	public void setQueryArgs(NSDictionary queryArgs) {
		this.queryArgs = queryArgs;
	}

	public void takeValueForKey(Object value, String key) {
		NSKeyValueCoding.DefaultImplementation.takeValueForKey(this,value,key);
	}

	public Object valueForKey(String key) {
		return NSKeyValueCoding.DefaultImplementation.valueForKey(this,key);
	}

	public String getDisplayString() {
		return displayString;
	}

	public void setDisplayString(String displayString) {
		this.displayString = displayString;
	}
	
}
