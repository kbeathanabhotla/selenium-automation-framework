package com.tagcmd.utils;

public class PageUtil {

	public static void waitForLoad(int numberOfSeconds) {
		
		try {
			Thread.sleep(numberOfSeconds * 1000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
