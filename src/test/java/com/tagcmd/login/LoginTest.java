package com.tagcmd.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.tagcmd.configuration.DriverManager;
import com.tagcmd.pages.AssetsHomePage;
import com.tagcmd.utils.PageUtil;

public class LoginTest {

	@Test(groups = { "DAM" })
	public void test_login() {

		PageUtil.waitForLoad(3);

		//AssetsHomePage assetsHomePage = PageFactory.initElements(DriverManager.getCurrentDriver(), AssetsHomePage.class);

		System.out.println("---- ran DAM group");
		
		/*assetsHomePage.personalAssetsMenu.click();
		System.out.println("navigated to personal assets page");

		WebDriver wd = DriverManager.getCurrentDriver();

		PageUtil.waitForLoad(3);*/

	}

	@Test(groups = { "MRM" })
	public void test_login_mrm() {

		PageUtil.waitForLoad(3);

		//AssetsHomePage assetsHomePage = PageFactory.initElements(DriverManager.getCurrentDriver(), AssetsHomePage.class);

		System.out.println("---- ran MRM group");
		
		/*assetsHomePage.personalAssetsMenu.click();
		System.out.println("navigated to personal assets page");

		

		WebDriver wd = DriverManager.getCurrentDriver();

		PageUtil.waitForLoad(3);*/

	}

}
