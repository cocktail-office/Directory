package org.cocktail.directory.tools;

import com.webobjects.foundation.NSLog;

public class CLog {

	public static final int LOG_ALL = 1;
	public static final int LOG_EXCEPTIONS = 2;
	public static final int LOG_NOTHING = 3;
	
	private static int mode = LOG_ALL;
	private static boolean isLogInfo = true;  

	public static int getMode() {
		return mode;
	}

	public static void setLogInfo(boolean logInfo) {
		isLogInfo = logInfo;
	}

	public static void setMode(int mode) {
		CLog.mode = mode;
	}
	
	public static void logInfo(Object info) {
		if(isLogInfo)
			NSLog.out.appendln("Info : "+info.toString());
	}
	
	public static void log(int n) {
		if(mode==LOG_ALL)
			System.out.println(n);
	}

	public static void log(String s) {
		if(mode==LOG_ALL)
			System.out.println(s);
	}
	
	public static void log(char c) {
		if(mode==LOG_ALL)
			System.out.println(c);
	}
	
	public static void log(Object o) {
		if((o instanceof Throwable))
			log((Throwable)o);
		else
		if(o instanceof Exception)
			log((Exception)o);
		else {
			System.out.println(o.toString());
		}
	}
	
	public static void log(Exception e) {
		if(mode==LOG_ALL || mode==LOG_EXCEPTIONS)
			e.printStackTrace();
	}
	
	public static void log(Throwable e) {
		if(mode==LOG_ALL || mode==LOG_EXCEPTIONS)
			e.printStackTrace();
	}
	
}
