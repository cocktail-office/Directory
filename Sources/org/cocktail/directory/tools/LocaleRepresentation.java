package org.cocktail.directory.tools;

import com.webobjects.foundation.NSKeyValueCoding;

// 22 f�vr. 07
//created by : Fran�ois Adour

// Project : TestComp

public class LocaleRepresentation implements NSKeyValueCoding {

	private String name,value;
	
	public LocaleRepresentation(String name,String value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String toString() {
		return value+"-"+name;
	}
	
	public static boolean isCountryIndicated(String lang) {
		if(lang!=null) {
			return lang.indexOf("_") > -1;
		}
		else {
			return false;
		}
	}
	
	public void takeValueForKey(Object value, String key) {
		NSKeyValueCoding.DefaultImplementation.takeValueForKey(this,value,key);
	}

	public Object valueForKey(String key) {
		return NSKeyValueCoding.DefaultImplementation.valueForKey(this,key);
	}
}
