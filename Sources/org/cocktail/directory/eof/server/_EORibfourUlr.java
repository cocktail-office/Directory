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

// DO NOT EDIT.  Make changes to EORibfourUlr.java instead.
package org.cocktail.directory.eof.server;

import java.util.NoSuchElementException;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOKeyValueQualifier;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSTimestamp;



public abstract class _EORibfourUlr extends  DirectoryRecord {
	public static final String ENTITY_NAME = "RibfourUlr";
	public static final String ENTITY_TABLE_NAME = "GRHUM.RIBFOUR_ULR";



	// Attributes

	public static final String ENTITY_PRIMARY_KEY = "ribOrdre";

	public static final String BIC_KEY = "bic";
	public static final String C_BANQUE_KEY = "cBanque";
	public static final String C_GUICHET_KEY = "cGuichet";
	public static final String CLE_RIB_KEY = "cleRib";
	public static final String D_CREATION_KEY = "dCreation";
	public static final String D_MODIFICATION_KEY = "dModification";
	public static final String FOU_ORDRE_KEY = "fouOrdre";
	public static final String IBAN_KEY = "iban";
	public static final String MOD_CODE_KEY = "modCode";
	public static final String NO_COMPTE_KEY = "noCompte";
	public static final String RIB_TITCO_KEY = "ribTitco";
	public static final String RIB_VALIDE_KEY = "ribValide";
	public static final String TEM_PAYE_UTIL_KEY = "temPayeUtil";

// Attributs non visibles
	public static final String RIB_ORDRE_KEY = "ribOrdre";

//Colonnes dans la base de donnees
	public static final String BIC_COLKEY = "BIC";
	public static final String C_BANQUE_COLKEY = "C_BANQUE";
	public static final String C_GUICHET_COLKEY = "C_GUICHET";
	public static final String CLE_RIB_COLKEY = "CLE_RIB";
	public static final String D_CREATION_COLKEY = "D_CREATION";
	public static final String D_MODIFICATION_COLKEY = "D_MODIFICATION";
	public static final String FOU_ORDRE_COLKEY = "FOU_ORDRE";
	public static final String IBAN_COLKEY = "IBAN";
	public static final String MOD_CODE_COLKEY = "MOD_CODE";
	public static final String NO_COMPTE_COLKEY = "NO_COMPTE";
	public static final String RIB_TITCO_COLKEY = "RIB_TITCO";
	public static final String RIB_VALIDE_COLKEY = "RIB_VALIDE";
	public static final String TEM_PAYE_UTIL_COLKEY = "TEM_PAYE_UTIL";

	public static final String RIB_ORDRE_COLKEY = "RIB_ORDRE";


	// Relationships



	// Accessors methods
  public String bic() {
    return (String) storedValueForKey(BIC_KEY);
  }

  public void setBic(String value) {
    takeStoredValueForKey(value, BIC_KEY);
  }

  public String cBanque() {
    return (String) storedValueForKey(C_BANQUE_KEY);
  }

  public void setCBanque(String value) {
    takeStoredValueForKey(value, C_BANQUE_KEY);
  }

  public String cGuichet() {
    return (String) storedValueForKey(C_GUICHET_KEY);
  }

  public void setCGuichet(String value) {
    takeStoredValueForKey(value, C_GUICHET_KEY);
  }

  public String cleRib() {
    return (String) storedValueForKey(CLE_RIB_KEY);
  }

  public void setCleRib(String value) {
    takeStoredValueForKey(value, CLE_RIB_KEY);
  }

  public NSTimestamp dCreation() {
    return (NSTimestamp) storedValueForKey(D_CREATION_KEY);
  }

  public void setDCreation(NSTimestamp value) {
    takeStoredValueForKey(value, D_CREATION_KEY);
  }

  public NSTimestamp dModification() {
    return (NSTimestamp) storedValueForKey(D_MODIFICATION_KEY);
  }

  public void setDModification(NSTimestamp value) {
    takeStoredValueForKey(value, D_MODIFICATION_KEY);
  }

  public Integer fouOrdre() {
    return (Integer) storedValueForKey(FOU_ORDRE_KEY);
  }

  public void setFouOrdre(Integer value) {
    takeStoredValueForKey(value, FOU_ORDRE_KEY);
  }

  public String iban() {
    return (String) storedValueForKey(IBAN_KEY);
  }

  public void setIban(String value) {
    takeStoredValueForKey(value, IBAN_KEY);
  }

  public String modCode() {
    return (String) storedValueForKey(MOD_CODE_KEY);
  }

  public void setModCode(String value) {
    takeStoredValueForKey(value, MOD_CODE_KEY);
  }

  public String noCompte() {
    return (String) storedValueForKey(NO_COMPTE_KEY);
  }

  public void setNoCompte(String value) {
    takeStoredValueForKey(value, NO_COMPTE_KEY);
  }

  public String ribTitco() {
    return (String) storedValueForKey(RIB_TITCO_KEY);
  }

  public void setRibTitco(String value) {
    takeStoredValueForKey(value, RIB_TITCO_KEY);
  }

  public String ribValide() {
    return (String) storedValueForKey(RIB_VALIDE_KEY);
  }

  public void setRibValide(String value) {
    takeStoredValueForKey(value, RIB_VALIDE_KEY);
  }

  public String temPayeUtil() {
    return (String) storedValueForKey(TEM_PAYE_UTIL_KEY);
  }

  public void setTemPayeUtil(String value) {
    takeStoredValueForKey(value, TEM_PAYE_UTIL_KEY);
  }


/**
 * Créer une instance de EORibfourUlr avec les champs et relations obligatoires et l'insere dans l'editingContext.
 */
  public static  EORibfourUlr createEORibfourUlr(EOEditingContext editingContext, String cBanque
, String cGuichet
, NSTimestamp dCreation
, NSTimestamp dModification
, Integer fouOrdre
, String modCode
, String noCompte
, String ribTitco
, String ribValide
, String temPayeUtil
			) {
    EORibfourUlr eo = (EORibfourUlr) createAndInsertInstance(editingContext, _EORibfourUlr.ENTITY_NAME);    
		eo.setCBanque(cBanque);
		eo.setCGuichet(cGuichet);
		eo.setDCreation(dCreation);
		eo.setDModification(dModification);
		eo.setFouOrdre(fouOrdre);
		eo.setModCode(modCode);
		eo.setNoCompte(noCompte);
		eo.setRibTitco(ribTitco);
		eo.setRibValide(ribValide);
		eo.setTemPayeUtil(temPayeUtil);
    return eo;
  }

  
	  public EORibfourUlr localInstanceIn(EOEditingContext editingContext) {
	  		return (EORibfourUlr)localInstanceOfObject(editingContext, this);
	  }
	

	/**
	 * Cree une instance de l'objet et l'insere dans l'editing context.
	 * @param editingContext
	 * 
	 * @return L'objet insere dans l'editing context.
	 */
	  public static EORibfourUlr creerInstance(EOEditingContext editingContext) {
	  		EORibfourUlr object = (EORibfourUlr)createAndInsertInstance(editingContext, _EORibfourUlr.ENTITY_NAME);
	  		return object;
		}


	
	
  
  public static EORibfourUlr localInstanceIn(EOEditingContext editingContext, EORibfourUlr eo) {
    EORibfourUlr localInstance = (eo == null) ? null : (EORibfourUlr)localInstanceOfObject(editingContext, eo);
    if (localInstance == null && eo != null) {
      throw new IllegalStateException("You attempted to localInstance " + eo + ", which has not yet committed.");
    }
    return localInstance;
  }

  /**
   * 
   * @param editingContext
   * @param eo
   * @return L'objet eo dans l'editingContext
   * @deprecated Utilisez EORibfourUlr#localInstanceIn a la place.
   */
	public static EORibfourUlr localInstanceOf(EOEditingContext editingContext, EORibfourUlr eo) {
		return EORibfourUlr.localInstanceIn(editingContext, eo);
	}
  
	
	
	
	
	
	
	/* Finders */

	  public static NSArray fetchAll(EOEditingContext editingContext) {
	    return fetchAll(editingContext, (EOQualifier)null);
	  }

	  public static NSArray fetchAll(EOEditingContext editingContext, NSArray sortOrderings) {
	    return fetchAll(editingContext, null, sortOrderings);
	  }
	  
	  public static NSArray fetchAll(EOEditingContext editingContext, EOQualifier qualifier) {
		  return fetchAll(editingContext, qualifier, null, false);
	  }

	  public static NSArray fetchAll(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
		return fetchAll(editingContext, qualifier, sortOrderings, false);
	  }

	  public static NSArray fetchAll(EOEditingContext editingContext, String keyName, Object value, NSArray sortOrderings) {
		return fetchAll(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value), sortOrderings, false);
	  }
	  
	  public static NSArray fetchAll(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings, boolean distinct) {
	    EOFetchSpecification fetchSpec = new EOFetchSpecification(ENTITY_NAME, qualifier, sortOrderings);
	    fetchSpec.setIsDeep(true);
	    fetchSpec.setUsesDistinct(distinct);
	    NSArray eoObjects = (NSArray)editingContext.objectsWithFetchSpecification(fetchSpec);
	    return eoObjects;
	  }

		/**
		* Renvoie un objet simple. Pour recuperer un tableau, utilisez fetchAll(EOEditingContext editingContext, String keyName, Object value, NSArray sortOrderings).
		* Une exception est declenchee si plusieurs objets sont trouves.
		* 
		* @return Renvoie l'objet correspondant a la paire cle/valeur
		* @throws IllegalStateException  
		*/
	  public static EORibfourUlr fetchByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
	    return fetchByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	  }

	  
	  /**
	   * Renvoie l'objet correspondant au qualifier. Si plusieurs objets sont susceptibles d'etre trouves, utilisez fetchFirstByQualifier().
	   * Une exception est declenchee si plusieurs objets sont trouves.
	   * 
	 * @param editingContext
	 * @param qualifier
	 * @return L'objet qui correspond au qualifier passé en parametre. Si plusieurs objets sont trouve, une Exception est declenchee. Si aucun objet est trouve, null est renvoye.
	 * @throws IllegalStateException
	 */
	public static EORibfourUlr fetchByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, null);
	    EORibfourUlr eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else if (count == 1) {
	      eoObject = (EORibfourUlr)eoObjects.objectAtIndex(0);
	    }
	    else {
	      throw new IllegalStateException("Il y a plus d'un objet qui correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }

	  
	  
	  
	  public static EORibfourUlr fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
	   	 return fetchFirstByQualifier(editingContext, qualifier, null);
	  }
	  
	  public static EORibfourUlr fetchFirstByQualifier(EOEditingContext editingContext, EOQualifier qualifier, NSArray sortOrderings) {
	    NSArray eoObjects = fetchAll(editingContext, qualifier, sortOrderings);
	    EORibfourUlr eoObject;
	    int count = eoObjects.count();
	    if (count == 0) {
	      eoObject = null;
	    }
	    else {
	      eoObject = (EORibfourUlr)eoObjects.objectAtIndex(0);
	    }
	    return eoObject;
	  }  

	  
	  /**
	   * Une exception est declenchee si aucun objet est trouve.
	   * 
	   * @param editingContext
	   * @param qualifier Le filtre
	   * @return L'objet correspondant au qualifier. Si l'objet n'est pas trouvé, une exception est declenchee. Pour ne pas avoir d'exception, utilisez fetchFirstByQualifier().
	   * @throws NoSuchElementException si aucun objet est trouve
	   */
	  public static EORibfourUlr fetchFirstRequiredByQualifier(EOEditingContext editingContext, EOQualifier qualifier) {
		  EORibfourUlr eoObject = fetchFirstByQualifier(editingContext, qualifier);
	    if (eoObject == null) {
	      throw new NoSuchElementException("Aucun objet EORibfourUlr ne correspond au qualifier '" + qualifier + "'.");
	    }
	    return eoObject;
	  }	
	

	public static EORibfourUlr fetchRequiredByKeyValue(EOEditingContext editingContext, String keyName, Object value) {
		    return fetchFirstRequiredByQualifier(editingContext, new EOKeyValueQualifier(keyName, EOQualifier.QualifierOperatorEqual, value));
	}
	  	
	
	
	
  
}
