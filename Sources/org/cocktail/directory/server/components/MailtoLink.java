package org.cocktail.directory.server.components;

// Generated by the WOLips Templateengine Plug-in at 14 f�vr. 2007 10:19:14

import org.cocktail.directory.tools.DirUtilities;

import com.webobjects.appserver.WOComponent;
import com.webobjects.appserver.WOContext;


public class MailtoLink extends WOComponent {

    public MailtoLink(WOContext context) {
        super(context);
    }

    private static final String BND_MAIL = "mail";
    private static final String BND_MAIL_LABEL = "mailLabel";
    private static final String BND_MAIL_TIP = "mailTip";
    private static final String BND_USE_UNCRYPTED_MAIL = "useUncryptedMail";
    private static final String BND_SHOW_MAIL_ICON = "showMailIcon";
    // Les valeurs par defaut pour certains connecteurs.
    private static final String DefaultMailTip = "Cliquez pour envoyer un mail";
    
 
    
    public boolean canDisplaySomething() {
    	String mail = getMail();
    	if(mail!=null)
    		return true;
    	else
    		return false;
    }
    
    /**
     * Renvoie la valeur <i>false</i>.
     *
     * <p>Voir la definition de cette methode dans la documentation
     * de la classe <code>WOComponent</code> (WebObjects).
     */
    public boolean synchronizesVariablesWithBindings() {
      return false;
    }

    /**
      * Renvoie la valeur <i>true</i>.
     *
     * <p>Voir la definition de cette methode dans la documentation
     * de la classe <code>WOComponent</code> (WebObjects).
     */
    public boolean isStateless() {
      return true;
    }

    private String getMail() {
      return (String)valueForBinding(BND_MAIL);
    }

    private String getMailLabel() {
      return (String)valueForBinding(BND_MAIL_LABEL);
    }

    private String getMailTip() {
      if (hasBinding(BND_MAIL_TIP))
        return (String)valueForBinding(BND_MAIL_TIP);
      return DefaultMailTip;
    }
    
    private boolean isUseUncryptedMail() {
      if (hasBinding(BND_USE_UNCRYPTED_MAIL))
        return ((Boolean)valueForBinding(BND_USE_UNCRYPTED_MAIL)).booleanValue();
      return false;
    }

    public boolean isShowMailIcon() {
      if (hasBinding(BND_SHOW_MAIL_ICON))
        return ((Boolean)valueForBinding(BND_SHOW_MAIL_ICON)).booleanValue();
      return false;
    }
    
    public String getMailToScript() {
      if (isUseUncryptedMail()) {
        return getLinkText();
      } else {
        StringBuffer script = new StringBuffer();
        script.append("<script language=\"JavaScript\">");
        script.append("document.write(decryptText(\"");
        script.append(DirUtilities.cryptText(getLinkText()));
        script.append("\"))</script>");
        script.append("<noscript><font class=\"textError\"><font class=\"textNote\">");
        script.append("Votre navigateur ne supporte pas de<br>JavaScript pour ");
        script.append("afficher l'adresse mail&nbsp;!</font></font></noscript>"); 
        return script.toString();
      }
    }

    private String getLinkText() {
      StringBuffer text = new StringBuffer();
      String tip = getMailTip();
      text.append("<a href=\"mailto:").append(getMail()).append("\"");
      if (!isUseUncryptedMail()) {
        text.append(" onMouseover=\"window.status=''; return true;\"");
        text.append(" onMouseout=\"window.status=''; return true;\"");
      }
      if (tip.length() > 0) text.append(" title=\"").append(tip).append("\"");
      text.append(" class=\"linkPage\">");
      text.append(getMailLabel()).append("</a>");
      return text.toString();
    }
}