package com.saikrishna.configuration;

import org.openqa.selenium.WebDriver;

public class DriverManager {

	private static ThreadLocal<WebDriver> driverForCurrentThread = new ThreadLocal<WebDriver>();

	public static void setDriver(WebDriver driver) {
		driverForCurrentThread.set(driver);
	}
	
	public static WebDriver getCurrentDriver() {
		return driverForCurrentThread.get();
	}
	
	public static void removeCurrentDriver() {
		driverForCurrentThread.remove();
	}
}
