// EOAccordsAvenant.java
// 

package org.cocktail.directory.eof.server;

import org.cocktail.directory.impl.elements.DirectoryEntity;
import org.cocktail.directory.tools.DirUtilities;

import com.webobjects.eoaccess.EOUtilities;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;

public class EOAccordsAvenant extends _EOAccordsAvenant implements DirectoryEntity {

	public EOAccordsAvenant() {
		super();
	}

	public EOAccordsAvenantPartenaire partenairePrinc() {

		NSDictionary args = new NSDictionary(avtOrdre(), "avtOrdre");
		NSArray parts = EOUtilities.objectsWithFetchSpecificationAndBindings(editingContext(), "AccordsAvenantPartenaire", "partenairesForAvenant",
				args);
		if (parts.count() > 0)
			return (EOAccordsAvenantPartenaire) parts.objectAtIndex(0);
		else
			return null;
	}

	public boolean hasPartenairesPhysiques() {
		return listPartenairesSecondaires(EOAccordsAvenantPartenaire.PART_PERS_PHYSIQUE).count() > 0;
	}

	public boolean hasPartenairesMoraux() {
		return listPartenairesSecondaires(EOAccordsAvenantPartenaire.PART_PERS_MORALE).count() > 0;
	}

	public NSArray listPartenairesSecondaires(int typePartenaire) {
		NSArray parts;
		if (typePartenaire == EOAccordsAvenantPartenaire.PART_PERS_MORALE) {
			parts = (NSArray) partenaires().valueForKey("structure");
		}
		else {
			parts = (NSArray) partenaires().valueForKey("individu");
		}
		return DirUtilities.cleanArray(parts);
	}

	public String displayString() {
		return null;
	}

	public String getPrimaryKey() {
		return null;
	}

}
