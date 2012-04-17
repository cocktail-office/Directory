package org.cocktail.directory.server;

import com.webobjects.foundation.NSKeyValueCoding;
import com.webobjects.foundation.NSTimestamp;

public class UserHitHolder implements NSKeyValueCoding {
	
	
	
	private String ipAddr;
	private NSTimestamp lastHitDate;
	private Integer hitCount;
	
	
	public UserHitHolder(String ipAddress) {
		super();
		ipAddr = ipAddress;
		hitCount = new Integer(1);
	}
	
	
	public void incrementHits() {
		hitCount = hitCount+1;
	}
	
	public String ipAddr() {
		return ipAddr;
	}
	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}
	public NSTimestamp lastHitDate() {
		return lastHitDate;
	}
	public void setLastHitDate(NSTimestamp lastHitDate) {
		this.lastHitDate = lastHitDate;
	}
	public Integer hitCount() {
		return hitCount;
	}
	public void setHitCount(Integer hitCount) {
		this.hitCount = hitCount;
	}
	
	public void takeValueForKey(Object value, String key) {
		NSKeyValueCoding.DefaultImplementation.takeValueForKey(this, value, key);
		
	}
	public Object valueForKey(String key) {
		return NSKeyValueCoding.DefaultImplementation.valueForKey(this, key);
	}
	
	
	public String toString() {
		return "["+ipAddr+" "+hitCount+" "+lastHitDate+"]";
	}
	
	
	

}
