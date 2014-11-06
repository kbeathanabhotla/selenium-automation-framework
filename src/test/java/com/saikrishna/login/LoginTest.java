package com.saikrishna.login;

import org.testng.annotations.Test;

import com.saikrishna.utils.PageUtil;

public class LoginTest {

	@Test(groups = { "group1" })
	public void test_login() {

		PageUtil.waitForLoad(3);

		//AssetsHomePage assetsHomePage = PageFactory.initElements(DriverManager.getCurrentDriver(), AssetsHomePage.class);

		System.out.println("---- ran group1 group");
		
		/*assetsHomePage.personalAssetsMenu.click();
		System.out.println("navigated to personal assets page");

		WebDriver wd = DriverManager.getCurrentDriver();

		PageUtil.waitForLoad(3);*/

	}

	@Test(groups = { "group2" })
	public void test_login_mrm() {

		PageUtil.waitForLoad(3);

		//AssetsHomePage assetsHomePage = PageFactory.initElements(DriverManager.getCurrentDriver(), AssetsHomePage.class);

		System.out.println("---- ran group2 group");
		
		/*assetsHomePage.personalAssetsMenu.click();
		System.out.println("navigated to personal assets page");

		

		WebDriver wd = DriverManager.getCurrentDriver();

		PageUtil.waitForLoad(3);*/

	}

}
