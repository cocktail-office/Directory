package org.cocktail.directory.tools;

import java.lang.reflect.Method;
import java.text.Normalizer.Form;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.cocktail.directory.server.CommonDataHolder;

import sun.text.Normalizer;

import com.webobjects.eoaccess.EODatabaseDataSource;
import com.webobjects.eocontrol.EOEditingContext;
import com.webobjects.eocontrol.EOFetchSpecification;
import com.webobjects.eocontrol.EOGenericRecord;
import com.webobjects.eocontrol.EOQualifier;
import com.webobjects.eocontrol.EOSortOrdering;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSMutableArray;

import er.extensions.appserver.ERXDisplayGroup;

public class DirUtilities {

	public static String STRINGS_LOWER_CASE = "�|a|au(?:x?)|dans|d|de(?:s?)|du|la|le(?:s?)|leur(?:s?)|en|et|l|la|par|pour|sur";
	public static String STRINGS_RESPECT_CASE = "ap|hp|umr|ea|cpe|cs|ca|ifr|ufr";

	public static final int STARTING_LEFT = 1;
	public static final int STARTING_RIGHT = 2;

	protected static final String CRYPT_KEY = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1029384756><#].@";

	private static String[][] htmlEscape = { { "&lt;", "<" }, { "&gt;", ">" }, { "&amp;", "&" }, { "&quot;", "\"" }, { "&agrave;", "�" },
			{ "&Agrave;", "�" }, { "&acirc;", "�" }, { "&auml;", "�" }, { "&Auml;", "�" }, { "&Acirc;", "�" }, { "&aring;", "�" },
			{ "&Aring;", "�" }, { "&aelig;", "�" }, { "&AElig;", "�" }, { "&ccedil;", "�" }, { "&Ccedil;", "�" }, { "&eacute;", "�" },
			{ "&Eacute;", "�" }, { "&egrave;", "�" }, { "&Egrave;", "�" }, { "&ecirc;", "�" }, { "&Ecirc;", "�" }, { "&euml;", "�" },
			{ "&Euml;", "�" }, { "&iuml;", "�" }, { "&Iuml;", "�" }, { "&ocirc;", "�" }, { "&Ocirc;", "�" }, { "&ouml;", "�" }, { "&Ouml;", "�" },
			{ "&oslash;", "�" }, { "&Oslash;", "�" }, { "&szlig;", "�" }, { "&ugrave;", "�" }, { "&Ugrave;", "�" }, { "&ucirc;", "�" },
			{ "&Ucirc;", "�" }, { "&uuml;", "�" }, { "&Uuml;", "�" }, { "&nbsp;", " " }, { "&copy;", "\u00a9" }, { "&reg;", "\u00ae" },
			{ "&euro;", "\u20a0" } };

	public static final String unescapeHTML(String s) {
		return unescapeHTML(s, 0);
	}

	public static final String unescapeHTML(String s, int start) {
		int i, j, k, l;

		i = s.indexOf("&", start);
		start = i + 1;
		if (i > -1) {
			j = s.indexOf(";", i);
			if (j > i) {
				String temp = s.substring(i, j + 1);
				k = 0;
				while (k < htmlEscape.length) {
					if (htmlEscape[k][0].equals(temp)) {
						break;
					}
					else {
						k++;
					}
				}
				if (k < htmlEscape.length) {
					s = s.substring(0, i) + htmlEscape[k][1] + s.substring(j + 1);
					return unescapeHTML(s, start);
				}
			}
		}
		return s;
	}

	private static String caseReplacement(String verifString) {
		return verifString == null ? "" : verifString;
	}

	public static String strForReplacement(String str) {
		if (CommonDataHolder.keepDisplayStringUnchanged || str == null) {
			return str;
		}

		StringBuffer buff = new StringBuffer();
		try {
			Pattern Regex = Pattern.compile("\\b(?:(" + STRINGS_LOWER_CASE + ")|(" + STRINGS_RESPECT_CASE + ")|(\\p{L})(\\p{L}*))\\b",
					Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
			Matcher RegexMatcher = Regex.matcher(str);
			while (RegexMatcher.find()) {
				try {
					RegexMatcher.appendReplacement(buff,
							caseReplacement(RegexMatcher.group(1)).toLowerCase(Locale.getDefault())
									+ caseReplacement(RegexMatcher.group(2)).toUpperCase(Locale.getDefault())
									+ caseReplacement(RegexMatcher.group(3)).toUpperCase(Locale.getDefault())
									+ caseReplacement(RegexMatcher.group(4)).toLowerCase(Locale.getDefault()));
				}
				catch (IllegalStateException ex) {
					ex.printStackTrace();
				}
				catch (IllegalArgumentException ex) {
					ex.printStackTrace();
				}
				catch (IndexOutOfBoundsException ex) {
					ex.printStackTrace();
				}
			}
			RegexMatcher.appendTail(buff);
		}
		catch (PatternSyntaxException ex) {
			ex.printStackTrace();
		}
		return buff.toString();
	}

	public static String removeAccentsForString(String str) {
		String result = str;
		if (str != null) {
			try {
//				result = Normalizer.decompose(result, false, 0).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
				// pour Java 1.6
				result = Normalizer.normalize(result, Form.NFD, 0).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
			}
			catch (Exception e) {
				result = result.replaceAll("[�����]", "A");
				result = result.replaceAll("[����]", "E");
				result = result.replaceAll("[����]", "I");
				result = result.replaceAll("[�����]", "O");
				result = result.replaceAll("[����]", "U");
				result = result.replaceAll("�", "C");
				result = result.replaceAll("�", "N");
				result = result.replaceAll("[�����]", "a");
				result = result.replaceAll("[����]", "e");
				result = result.replaceAll("[����]", "i");
				result = result.replaceAll("[�����]", "o");
				result = result.replaceAll("[����]", "u");
				result = result.replaceAll("�", "c");
				result = result.replaceAll("�", "n");
			}
			return result;
		}
		else {
			return null;
		}
	}

	public static String capitalizedString(String str) {
		if (CommonDataHolder.keepDisplayStringUnchanged || str == null) {
			return str;
		}
		char ch;
		char prevCh;
		int i;
		prevCh = '.';
		int length = str.length();
		StringBuffer buff = new StringBuffer(length);

		for (i = 0; i < length; i++) {
			ch = str.charAt(i);
			if (Character.isLetter(ch) && !Character.isLetter(prevCh)) {
				buff.append(Character.toUpperCase(ch));
			}
			else {
				buff.append(ch);
			}
			prevCh = ch;
		}
		return buff.toString();
	}

	public static String reverseString(String str) {
		int len = str.length();
		StringBuffer bf = new StringBuffer();
		for (int i = len - 1; i >= 0; i--) {
			bf.append(str.charAt(i));
		}
		return bf.toString();
	}

	/**
	 * permet d'inserer la caract�re char dans la chaine str tous les everyChar caract�res en partant soit de la gauche soit de la droite
	 * (parametre startFrom)
	 */
	public static String insertRepeatedChar(String str, char chr, int everyChar, int startFrom) {

		if (str == null) {
			return null;
		}

		String localStr = startFrom == STARTING_RIGHT ? reverseString(str) : str;

		StringBuffer bfr = new StringBuffer();
		int length = localStr.length();

		for (int i = 0; i < length; i++) {
			bfr.append(localStr.charAt(i));
			if (((i + 1) % everyChar == 0) && ((i + 1) < length)) {
				bfr.append(chr);
			}
		}

		return startFrom == STARTING_RIGHT ? reverseString(bfr.toString()) : bfr.toString();
	}

	/**
	 * inserts the character chr into the string str every everyChar from the string str example : with ("tintin",'.',2) we get ("ti.nt.in")
	 */
	public static String insertRepeatedChar(String str, char chr, int everyChar) {
		return insertRepeatedChar(str, chr, everyChar, STARTING_LEFT);
	}

	public static String enlargeYourStringWithChar(String str, char chr, int totalSize) {
		if (str == null) {
			return null;
		}
		else {
			StringBuffer bfr = new StringBuffer(str);
			int length = str.length();
			for (int i = length; i < totalSize; i++) {
				bfr.append(str.charAt(i));
				bfr.append(chr);
			}
			return bfr.toString();
		}
	}

	public static Object invokeMethod(Object object, String methodName) {
		return invokeMethod(object, methodName, null, null);
	}

	public static Object invokeMethod(Object object, String methodName, Object[] args, Class[] argTypes) {
		Object result = null;
		try {
			Class cls = object.getClass();
			Method method = cls.getMethod(methodName, argTypes);
			result = method.invoke(object, args);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	/** return a filtered array by applying a qualifier made from the string and the value */
	public static NSArray filteredArray(NSArray array, String qualifierString, Object qualiferValue) {
		Object[] args = qualiferValue != null ? new Object[] { qualiferValue } : null;
		return filteredArray(array, qualifierString, args);
	}

	/** return a filtered array by applying a simple qualifier made from the string */
	public static NSArray filteredArray(NSArray array, String simpleQualifier) {
		return filteredArray(array, simpleQualifier, (Object[]) null);
	}

	/** return a filtered array by applying a qualifier made from the string and the values */
	public static NSArray filteredArray(NSArray array, String qualifierString, Object[] qualiferValues) {
		if (qualifierString != null && array != null) {
			NSArray args = qualiferValues != null ? new NSArray(qualiferValues) : null;
			EOQualifier qualifier = EOQualifier.qualifierWithQualifierFormat(qualifierString, args);
			return EOQualifier.filteredArrayWithQualifier(array, qualifier);
		}
		else {
			return new NSArray();
		}
	}

	/**
	 * remove null values (NSKeyValueCoding.NullValue) and the repetitions of the same objects from the array and returns a clean array
	 */
	public static NSArray cleanArray(NSArray array) {
		if (array != null) {
			NSMutableArray tmp = array.mutableClone();
			tmp.removeObject(NSKeyValueCoding.NullValue);
			return retirerMultiples(tmp);
		}
		else {
			return null;
		}
	}

	public static NSMutableArray retirerMultiples(NSArray array) {
		NSMutableArray resultat = new NSMutableArray();
		for (int i = 0; i < array.count(); i++) {
			Object obj = array.objectAtIndex(i);
			if (!resultat.containsObject(obj)) {
				resultat.addObject(obj);
			}
		}
		return resultat;
	}

	public static ERXDisplayGroup createDisplayGroup(EOEditingContext context, String entity, int nbObjectsPerBatch) {
		if (context == null || entity == null) {
			return null;
		}
		ERXDisplayGroup dg = new ERXDisplayGroup();
		dg.setDataSource(new EODatabaseDataSource(context, entity));
		dg.setNumberOfObjectsPerBatch(nbObjectsPerBatch);
		return dg;
	}

	public static NSArray fetchData(EOEditingContext context, String leNomTable, EOQualifier leQualifier, NSArray sorts) {
		EOFetchSpecification myFetch;
		myFetch = new EOFetchSpecification(leNomTable, leQualifier, sorts);
		myFetch.setUsesDistinct(true);
		return context.objectsWithFetchSpecification(myFetch);
	}

	public static EOGenericRecord fetchUniqueData(EOEditingContext context, String tableName, String key, Object value) {
		EOQualifier qualifie = EOQualifier.qualifierWithQualifierFormat(key + "=%@", new NSArray(value));
		NSArray objets = fetchData(context, tableName, qualifie);
		if (objets.count() > 0) {
			return (EOGenericRecord) objets.objectAtIndex(0);
		}
		else {
			return null;
		}
	}

	public static NSArray fetchData(EOEditingContext context, String leNomTable, EOQualifier leQualifier) {
		EOFetchSpecification myFetch = new EOFetchSpecification(leNomTable, leQualifier, null);
		myFetch.setUsesDistinct(true);
		return context.objectsWithFetchSpecification(myFetch);
	}

	public static NSArray sortAscendingArrayWithKey(NSArray array, String key) {
		EOSortOrdering sort = EOSortOrdering.sortOrderingWithKey(key, EOSortOrdering.CompareAscending);
		return EOSortOrdering.sortedArrayUsingKeyOrderArray(array, new NSArray(sort));
	}

	public static NSArray sortDescendingArrayWithKey(NSArray array, String key) {
		EOSortOrdering sort = EOSortOrdering.sortOrderingWithKey(key, EOSortOrdering.CompareDescending);
		return EOSortOrdering.sortedArrayUsingKeyOrderArray(array, new NSArray(sort));
	}

	public static String cryptText(String text) {
		String xtext = "";
		int loc = -1;
		int mcH = CRYPT_KEY.length() / 2;

		for (int x = 0; x < text.length(); x++) {
			if (text.charAt(x) == 13 || text.charAt(x) == 10) {
				xtext += " ";
			}
			else {
				loc = CRYPT_KEY.indexOf(text.charAt(x));
				if (loc < 0) {
					xtext += (text.charAt(x) == '\"' ? "\\\"" : String.valueOf(text.charAt(x)));
				}
				else
					if (loc > mcH) {
						xtext += CRYPT_KEY.charAt(33 - (loc - mcH));
					}
					else {
						xtext += CRYPT_KEY.charAt(33 + (mcH - loc));
					}
			}
		}
		return xtext;
	}

	/** renvoie le nombre d'occurences de aPattern dans la cha�ne aString */
	public static int countPattern(String aString, String aPattern) {

		int occ = 0;
		if (aString == null || aPattern == null || aString.equals("") || aPattern.equals("")) {
			return occ;
		}

		int index = -1;
		do {
			index = aString.indexOf(aPattern, index + 1);
			if (index != -1) {
				occ++;
			}
		}
		while (index != -1);
		return occ;
	}

	public static String replacePart(final String inputString, final String oldPart, final String newPart) {
		if (oldPart.equals("")) {
			throw new IllegalArgumentException("The old part to replace must be specified");
		}
		final StringBuffer result = new StringBuffer();
		int startIdx = 0;
		int idxOld = 0;
		while ((idxOld = inputString.indexOf(oldPart, startIdx)) >= 0) {
			result.append(inputString.substring(startIdx, idxOld));
			result.append(newPart);
			startIdx = idxOld + oldPart.length();
		}
		result.append(inputString.substring(startIdx));
		return result.toString();
	}
}
