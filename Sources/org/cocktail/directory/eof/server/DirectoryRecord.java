/*
 * Copyright COCKTAIL (www.cocktail.org), 1995, 2009 This software 
 * is governed by the CeCILL license under French law and abiding by the
 * rules of distribution of free software. You can use, modify and/or 
 * redistribute the software under the terms of the CeCILL license as 
 * circulated by CEA, CNRS and INRIA at the following URL 
 * "http://www.cecill.info". 
 * As a counterpart to the access to the source code and rights to copy, modify 
 * and redistribute granted by the license, users are provided only with a 
 * limited warranty and the software's author, the holder of the economic 
 * rights, and the successive licensors have only limited liability. In this 
 * respect, the user's attention is drawn to the risks associated with loading,
 * using, modifying and/or developing or reproducing the software by the user 
 * in light of its specific status of free software, that may mean that it
 * is complicated to manipulate, and that also therefore means that it is 
 * reserved for developers and experienced professionals having in-depth
 * computer knowledge. Users are therefore encouraged to load and test the 
 * software's suitability as regards their requirements in conditions enabling
 * the security of their systems and/or data to be ensured and, more generally, 
 * to use and operate it in the same conditions as regards security. The
 * fact that you are presently reading this means that you have had knowledge 
 * of the CeCILL license and that you accept its terms.
 */
package org.cocktail.directory.eof.server;

import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.webobjects.eoaccess.EOAttribute;
import com.webobjects.eoaccess.EOProperty;
import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.eocontrol.EOClassDescription;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOEnterpriseObject;
import com.webobjects.eocontrol.EOGenericRecord;
import com.webobjects.eocontrol.EOGlobalID;
import com.webobjects.eocontrol.EOObjectStore;
import com.webobjects.eocontrol.EOTemporaryGlobalID;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSValidation;


/**
 * 
 * Classe abstraite pour les entités métier du framework FwkCktlPersonne.
 * 
 * @author Rodolphe PRIN <rodolphe.prin at cocktail.org>
 */

public abstract class DirectoryRecord extends EOGenericRecord {

	public static final String OUI = "O";
	public static final String NON = "N";
	public static final String VIDE = "";
	public static final String SPACE = " ";
	public static final String ETOILE = "*";
	
	private NSArray attributes = null;
	private Map attributesTaillesMax;
	private NSArray attributesObligatoires;
	
	private EOEditingContext validationEditingContext;

	/**
	 * Verifie si la longueur d'une chaine est bien inferieure a un maximum.
	 * 
	 * @param s
	 * @param l
	 *            -1 si illimite.
	 * @return true si l=-1 ou si le nombre de caracteres de s est inferieur ou
	 *         egal a l.
	 */
	protected boolean verifieLongueurMax(String s, int l) {
		return (l == -1 || s == null || s.trim().length() <= l);
	}

	/**
	 * Verifie si la longeur d'une chaine est bien superieure a un maximum.
	 * 
	 * @param s
	 * @param l
	 * @return true si l=0 ou si le nombre de caracteres de s est superieur ou
	 *         egal a l.
	 */
	protected boolean verifieLongueurMin(String s, int l) {
		return (s == null || s.trim().length() >= l);
	}

	/**
	 * Nettoie toutes les chaines de l'objet (en effectuant un trim + remplace chaine vide par null). A appeler
	 * en debut de ValidateObjectMetier.
	 */
	protected void trimAllString() {
		EOEnterpriseObject obj = this;
		NSArray atts = obj.attributeKeys();
		for (int i = 0; i < atts.count(); i++) {
			String key = (String) atts.objectAtIndex(i);
			if (obj.valueForKey(key) != null && obj.valueForKey(key) instanceof String) {
				String value = ((String) obj.valueForKey(key)).trim();
				if (value.length() == 0) {
					value = null;
				}
				obj.takeValueForKey(value, key);
			}
		}
	}

	public void awakeFromInsertion(EOEditingContext ec) {
		super.awakeFromInsertion(ec);
	}

	public void validateForInsert() throws NSValidation.ValidationException {
		this.validateObjectMetier();
		super.validateForInsert();
	}

	public void validateForUpdate() throws NSValidation.ValidationException {
		this.validateObjectMetier();
		super.validateForUpdate();
	}

	public void validateForDelete() throws NSValidation.ValidationException {
		super.validateForDelete();
		throw new NSValidation.ValidationException("Suppression interdite.");
	}

	public void validateForSave() throws NSValidation.ValidationException {
		validateObjectMetier();
		super.validateForSave();
	}

	public void validateObjectMetier() throws NSValidation.ValidationException {
	}


	public static EOEnterpriseObject localInstanceOfObject(EOEditingContext eoeditingcontext, EOEnterpriseObject eoenterpriseobject) {
		if (eoenterpriseobject == null) {
			return null;
		}
		
		EOEditingContext eoeditingcontext1 = eoenterpriseobject.editingContext();
		if (eoeditingcontext1 == null) {
			throw new IllegalArgumentException("The EOEnterpriseObject " + eoenterpriseobject + " is not in an EOEditingContext.");
		}
		else if (eoeditingcontext1.equals(eoeditingcontext)) {
			return eoenterpriseobject;
		}
		com.webobjects.eocontrol.EOGlobalID eoglobalid = eoeditingcontext1.globalIDForObject(eoenterpriseobject);
		return eoeditingcontext.faultForGlobalID(eoglobalid, eoeditingcontext);
		
	}

	public static DirectoryRecord createAndInsertInstance(EOEditingContext eoeditingcontext, String s) {
		EOObjectStore objectStore = eoeditingcontext.parentObjectStore();
		boolean isClient = true;
		try {
			Class myEODistributedObjectStore = Class.forName("com.webobjects.eodistribution.client.EODistributedObjectStore");
			isClient = myEODistributedObjectStore.isInstance(objectStore);
		}
		catch (Exception e) {
			isClient = false;
		}
		
		if (isClient) {
			return createAndInsertClientInstance(eoeditingcontext, s);
		}
		else {
			EOClassDescription eoclassdescription = EOClassDescription.classDescriptionForEntityName(s);
			if (eoclassdescription == null) {
				throw new IllegalArgumentException("Could not find EOClassDescription for entity name '" + s + "' !");
			} else {
				DirectoryRecord eoenterpriseobject = (DirectoryRecord) eoclassdescription.createInstanceWithEditingContext(eoeditingcontext, null);
				eoeditingcontext.insertObject(eoenterpriseobject);
				return eoenterpriseobject;
			}
		}
		
	}
	
	/**
	 * 
	 * @param eoeditingcontext
	 * @param s
	 * @return Une instance de l'objet metier creee pour le client.
	 */
	public static DirectoryRecord createAndInsertClientInstance(EOEditingContext eoeditingcontext, String s) {
		try {
			Class myEOClassDescription = Class.forName("com.webobjects.eodistribution.client.EODistributedClassDescription");
			Method myEOClassDescription_classDescriptionForEntityName = myEOClassDescription.getDeclaredMethod("classDescriptionForEntityName", new Class[]{String.class});
			
			EOClassDescription eoclassdescription = (EOClassDescription) myEOClassDescription_classDescriptionForEntityName.invoke(null, new Object[]{s});
			if (eoclassdescription == null) {
				throw new IllegalArgumentException("Could not find EOClassDescription for entity name '" + s + "' !");
			} else {
				DirectoryRecord eoenterpriseobject = (DirectoryRecord) eoclassdescription.createInstanceWithEditingContext(eoeditingcontext, null);
				eoeditingcontext.insertObject(eoenterpriseobject);
				return eoenterpriseobject;
			}			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} 
	}


	/**
	 * 
	 * @return Les attributs de l'entité.
	 */
	public NSArray attributes() {
		if (attributes == null) {
			attributes = EOUtilities.entityForObject(this.editingContext(), this).  classProperties();
		}
		return attributes;
	}

	/**
	 * 
	 * @return Une map avec en clé le nom de l'attribut et en valeur un integer
	 *         contenant la taille max de l'attribut.
	 */
	public Map attributesTaillesMax() {
		if (attributesTaillesMax == null) {
			attributesTaillesMax = new HashMap();
			Enumeration enumeration = attributes().objectEnumerator();
			while (enumeration.hasMoreElements()) {
				EOProperty object = (EOProperty) enumeration.nextElement();
				if (object instanceof EOAttribute) {
					if (((EOAttribute)object).width() > 0) {
						attributesTaillesMax.put(object.name(), Integer.valueOf(((EOAttribute)object).width()));
					}
				}
				
			}
		}
		return attributesTaillesMax;
	}

	/**
	 * 
	 * @return Une map avec en clé le nom de l'attribut et en valeur un integer
	 *         contenant la taille max de l'attribut.
	 */
	public NSArray attributesObligatoires() {
		if (attributesObligatoires == null) {
			NSMutableArray _attributesObligatoires = new NSMutableArray();
			Enumeration enumeration = attributes().objectEnumerator();
			while (enumeration.hasMoreElements()) {
				EOProperty object = (EOProperty) enumeration.nextElement();
				if (object instanceof EOAttribute) {
					if (!((EOAttribute)object).allowsNull()  ) {
						_attributesObligatoires.addObject(object.name());
					}
				}
			}
			attributesObligatoires = _attributesObligatoires.immutableClone();
		}
		return attributesObligatoires;
	}

	/**
	 * Verifie la longueur maximale des champs saisis (a partir de la taille
	 * indiquée dans le modèle).
	 * 
	 * @throws NSValidation.ValidationException
	 */
	public void checkContraintesLongueursMax() throws NSValidation.ValidationException {
		Iterator iterator = attributesTaillesMax().keySet().iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			if (valueForKey(key) != null && ((String) valueForKey(key)).length() > ((Integer) attributesTaillesMax().get(key)).intValue()) {
				throw new NSValidation.ValidationException("La taille du champ " + getDisplayName(key) + " ne doit pas dépasser " + ((Integer) attributesTaillesMax().get(key)).intValue() + " caractères.");
			}
		}
	}

	/**
	 * Vérife si les champs obligatoires sont bien saisis (en fonction de ce qui
	 * est indiqué dans le modèle)
	 * 
	 * @throws NSValidation.ValidationException
	 */
	public void checkContraintesObligatoires() throws NSValidation.ValidationException {
		Iterator iterator = attributesObligatoires().iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			if (valueForKey(key) == null) {
				throw new NSValidation.ValidationException("Le champ " + getDisplayName(key) + " est obligatoire.");
			}
		}
	}

	/**
	 * 
	 * @param propertyName nom de la propriété (attribut ou relation)
	 * @return le nom d'affichage de la propriété. Utilise {@link #displayNames()}.
	 */
	public String getDisplayName(String propertyName) {
		if (displayNames().get(propertyName) != null) {
			return (String) displayNames().get(propertyName);
		}
		return propertyName;
	}

	/**
	 * Renvoie une Map contenant en clé le nom de la propriété et en valeur le
	 * nom d'affichage (parlant) de cette propriété. Par exemple <CP, Code
	 * Postal>. Par défaut la Map est vide, il faut surcharger la méthode.
	 */
	public Map displayNames() {
		return new HashMap();
	}

	/**
	 * 
	 * @param ec
	 * @return le globalID de l'objet à partir d'ec.
	 */
	public EOGlobalID globalID(EOEditingContext ec) {
		return ec.globalIDForObject(this);
	}
	
	/**
	 * @return le globalID de l'objet à partir de l'editingContext associé. Null si pas d'editingContext. 
	 */
	public EOGlobalID globalID() {
		if (editingContext() == null) {
			return null;
		}
		return globalID(this.editingContext());
	}
	
	
	/**
	 * @return true si l'objet possede un globalID temporaire (n'existe pas encore dans la base de données).
	 */
	public boolean hasTemporaryGlobalID() {
		return (globalID() != null && globalID() instanceof EOTemporaryGlobalID);
	}

	/**
	 * @return l'EditingContext de validation.
	 */
	public EOEditingContext getValidationEditingContext() {
		return validationEditingContext;
//		return (validationEditingContext!=null ? validationEditingContext : editingContext());
	}

	public void setValidationEditingContext(EOEditingContext validationEditingContext) {
		this.validationEditingContext = validationEditingContext;
	}

	/**
	 * @return true si l'objet se trouve dans l'editingContext de validation.
	 */
	public boolean isObjectInValidationEditingContext() {
		return (editingContext()!=null && getValidationEditingContext()!=null && editingContext().equals(getValidationEditingContext()));
	}
	
}
