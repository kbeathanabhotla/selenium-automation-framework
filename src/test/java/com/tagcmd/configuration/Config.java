package com.tagcmd.configuration;

import java.io.File;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Config {

	public static WebDriver getWebDriver(Browser browser) {
		
		
		System.out.println("a new "+browser.name()+" created");
		

		/*switch(b) {
			case CHROME:
				getChromeDriver();
				break;
			default:
				System.out.println("No browser Found....   ");
		}
		*/
		
		WebDriver webDriver = getChromeDriver(); 
		DriverManager.setDriver(webDriver);
		return webDriver;
	}

	private static WebDriver getChromeDriver() {
		try {
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			File chromeDriverPath = new File(Config.class.getClassLoader().getResource("drivers/chromedriver.exe").toURI());
			System.setProperty("webdriver.chrome.driver", chromeDriverPath.getAbsolutePath());
			capabilities.setCapability("chrome.switches", Arrays.asList("--disable-extensions"));
			WebDriver driver = new ChromeDriver(capabilities);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			return driver;
		} catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
}
