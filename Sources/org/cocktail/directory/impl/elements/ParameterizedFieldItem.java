package org.cocktail.directory.impl.elements;

public class ParameterizedFieldItem extends FieldItem implements Cloneable {
	
	public ParameterizedFieldItem(String id,Object[] args,Class[] typeArgs) {
		super(id);
		setAdditionalParameters(args,typeArgs);	
	}

	public ParameterizedFieldItem(String localizationId, String id,
			String tooltipId, boolean isList, Object[] args, Class[] typeArgs) {
		super(localizationId, id, tooltipId, isList);
		setAdditionalParameters(args,typeArgs);
	}

	public Object clone() throws CloneNotSupportedException {
		ParameterizedFieldItem aClone = (ParameterizedFieldItem)super.clone();
		return aClone;
	}


}
