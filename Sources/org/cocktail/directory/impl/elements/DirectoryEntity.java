package org.cocktail.directory.impl.elements;

import com.webobjects.foundation.NSKeyValueCoding;

public interface DirectoryEntity extends NSKeyValueCoding {
	
	public String displayString();
	public String getPrimaryKey();
	
	
}
