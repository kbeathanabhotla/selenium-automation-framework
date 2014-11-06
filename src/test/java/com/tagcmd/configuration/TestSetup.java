package com.tagcmd.configuration;

import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.tagcmd.pages.LoginPage;
import com.tagcmd.utils.ElementUtils;
import com.tagcmd.utils.PageUtil;

public class TestSetup {

	private Properties properties = new Properties();
	
	@Parameters(value={"environment"})
	public TestSetup(String environment) {
		try {
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream("properties/"+environment+".properties");
	        properties.load(inputStream);
		} catch(Exception e) {
			System.err.println("Unable to load config file "+environment+".properties on properties folder");
			throw new RuntimeException(e);
		}
	}
	
	@BeforeTest(alwaysRun = true)
	@Parameters(value={"browser"})
	public void login(String browser) {
		WebDriver webDriver = Config.getWebDriver(Browser.getBrowserByName(browser));
		DriverManager.setDriver(webDriver);
		webDriver.get(properties.getProperty("URL").toString());
		PageUtil.waitForLoad(3);
		LoginPage loginPage = PageFactory.initElements(webDriver, LoginPage.class);
		ElementUtils.enterTextToField(loginPage.userNameField, properties.getProperty("userName").toString());
		ElementUtils.enterTextToField(loginPage.passwordField, properties.getProperty("password").toString());
		loginPage.signInButton.click();
		PageUtil.waitForLoad(3);
	}

	@AfterTest(alwaysRun = true)
	public void tearDown() {
		WebDriver driver = DriverManager.getCurrentDriver();
		driver.close();
		driver.quit();
	}
}
