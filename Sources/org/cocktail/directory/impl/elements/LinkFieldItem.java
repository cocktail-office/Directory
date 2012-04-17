package org.cocktail.directory.impl.elements;


public class LinkFieldItem extends FieldItem implements Cloneable {
	
	public static final int HREF_LINK = 1;
	public static final int MAILTO_LINK = 2;
	
	
	public static final String TARGET_BLANK = "blank";
	
	private int linkType;
	private String linkLabelLocId;
	private String linkValueId;
	private String linkTarget;
	
	public LinkFieldItem(String localizationId,String linkLabelLocId, String id, int linkType) {
		super(localizationId, id, null,false);
		this.linkLabelLocId = linkLabelLocId;
		setIsLink(true);
		setLinkType(linkType);
	}
	
	public void setLinkTarget(String target) {
		linkTarget = target;
	}
	
	public String linkTarget() {
		return linkTarget;
	}
	
	

	// avoir en plus la methode qui renvoie le texte du lien : linkValueId
	public LinkFieldItem(String localizationId,String id, int linkType) {
		super(localizationId, id, null,false);
		setIsLink(true);
		setLinkType(linkType);
	}

	public Object clone() throws CloneNotSupportedException {
		LinkFieldItem aClone = (LinkFieldItem)super.clone();
		if(linkLabelLocId!=null) aClone.linkLabelLocId = new String(linkLabelLocId);
		if(linkValueId!=null) aClone.linkValueId = new String(linkValueId);
		aClone.linkType = linkType;
		return aClone;
	}
	
	public String getLinkLabelLocId() {
		return linkLabelLocId;
	}

	
	
	public void setLinkLabelLocId(String linkLabelLocId) {
		this.linkLabelLocId = linkLabelLocId;
	}

	
	public boolean isLinkTitleALocalizedString() {
		return linkLabelLocId!=null;
	}
	
	public boolean isLinkValueALocalizedString() {
		return linkValueId==null;
	}
	
	public boolean isLinkTitleAGlobalLocalizedString() {
		return !isLinkTitleALocalizedString() && linkValueId==null;
	}
	

	public String prepareLink(String value,String displayString) {
		
		StringBuffer bfr = new StringBuffer();
		switch(linkType) {
			default :
			case HREF_LINK :
				bfr.append("<a href=\"");
				bfr.append(value);
				
				bfr.append("\"");
				
				if(linkTarget!=null) {
					bfr.append(" target=\"").append(linkTarget).append("\"");
				}
				
				bfr.append(">");
				bfr.append(displayString);
				bfr.append("</a>");
			break;
			
			case MAILTO_LINK : 
				bfr.append("<a href='mailto:");
				bfr.append(value);
				bfr.append("'>");
				bfr.append(displayString);
				bfr.append("</a>");
			break;
		}
		return bfr.toString();
	}

	public int getLinkType() {
		return linkType;
	}

	public void setLinkType(int linkType) {
		this.linkType = linkType;
	}

	public String getLinkValueId() {
		return linkValueId;
	}

	public void setLinkValueId(String linkValueId) {
		this.linkValueId = linkValueId;
	}

}
