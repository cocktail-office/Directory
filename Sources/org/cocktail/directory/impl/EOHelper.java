// 28 mars 07
//created by : Fran�ois Adour

// Project : Directory

package org.cocktail.directory.impl;

import org.cocktail.directory.eof.server.EOIndividuUlr;
import org.cocktail.directory.eof.server.EORepartStructure;

import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.foundation.NSArray;

public class EOHelper {

	public static boolean isMemberOfStructure(EOIndividuUlr individu, String cStruct, EOEditingContext ectx) {
		EOQualifier qual = EOQualifier.qualifierWithQualifierFormat("cStructure=%@ and individuUlr=%@", new NSArray(
				new Object[] { cStruct, individu }));

		return EORepartStructure.fetchFirstByQualifier(ectx, qual) != null;
	}

	public static boolean isMemberOfStructures(EOIndividuUlr individu, NSArray cStructs, EOEditingContext ectx) {
		String tmp;
		StringBuffer qualStr = new StringBuffer();
		for (int i = 0; i < cStructs.count(); i++) {
			tmp = (String) cStructs.objectAtIndex(i);
			if (i == 0) {
				qualStr.append("(");
			}

			qualStr.append("cStructure='").append(tmp).append("'");
			if (i < cStructs.count() - 1) {
				qualStr.append(" or ");
			}

			if (i == cStructs.count() - 1) {
				qualStr.append(")");
			}
		}

		qualStr.append(" and individuUlr=%@");

		EOQualifier qual = EOQualifier.qualifierWithQualifierFormat(qualStr.toString(), new NSArray(individu));

		return EORepartStructure.fetchFirstByQualifier(ectx, qual) != null;
	}

}
