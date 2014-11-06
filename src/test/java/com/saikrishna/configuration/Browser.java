package com.saikrishna.configuration;

import java.util.HashMap;
import java.util.Map;

public enum Browser {

	FIREFOX("FIREFOX"), CHROME("CHROME");
	
	private static Map<String, Browser> browsers = new HashMap<String, Browser>(0);
	
	static {
		for(Browser b : values()) {
			browsers.put(b.name.toUpperCase(), b);
		}
	}
	
	private String name;
	
	private Browser(String browser) {
		this.name = browser;
	}
	
	public static Browser getBrowserByName(String name) {
		if(browsers.containsKey(name.toUpperCase())) {
			return browsers.get(name.toUpperCase());
		} else {
			throw new IllegalArgumentException("No browser found with name : "+name);
		}
	}
}
