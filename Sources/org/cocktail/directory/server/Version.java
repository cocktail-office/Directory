package org.cocktail.directory.server;

import org.cocktail.fwkcktlwebapp.server.version.A_CktlVersion;

public class Version extends A_CktlVersion {

	// Nom de l'appli
	private static final String APPLI_ID = "AnnuaireWeb";

	// Version appli
	public static final String VERSIONDATE = "30/03/2012";

	public static final int VERSIONNUMMAJ = 1;
	public static final int VERSIONNUMMIN = 3;
	public static final int VERSIONNUMPATCH = 5;

	public static final int VERSIONNUMBUILD = 0;

	public static final String COPYRIGHT = "Association Cocktail";
	private static final String BR = "<br/>";

	public CktlVersionRequirements[] dependencies() {
		return new CktlVersionRequirements[] {
				new CktlVersionRequirements(new org.cocktail.fwkcktlwebapp.server.version.CktlVersionWebObjects(), "5.2.4", null, true),
				new CktlVersionRequirements(new org.cocktail.fwkcktlwebapp.server.version.CktlVersionJava(), "1.5", "1.5", true),
				new CktlVersionRequirements(new org.cocktail.fwkcktlwebapp.server.version.Version(), "3", null, false) };
	}

	public String name() {
		return APPLI_ID;
	}

	public int versionNumBuild() {
		return VERSIONNUMBUILD;
	}

	public int versionNumMaj() {
		return VERSIONNUMMAJ;
	}

	public int versionNumMin() {
		return VERSIONNUMMIN;
	}

	public int versionNumPatch() {
		return VERSIONNUMPATCH;
	}

	public static String getVersion() {
		StringBuffer buf = new StringBuffer(String.valueOf(VERSIONNUMMAJ));
		buf.append(".");
		buf.append(VERSIONNUMMIN);
		buf.append(".");
		buf.append(VERSIONNUMPATCH);
		return buf.toString();
	}

	public static String completeDescription() {
		StringBuffer bfr = new StringBuffer(APPLI_ID);
		bfr.append(BR).append(BR);
		bfr.append("Version : ").append(getVersion()).append(" du ").append(VERSIONDATE).append(BR).append(BR);
		bfr.append(COPYRIGHT);
		return bfr.toString();
	}

}
