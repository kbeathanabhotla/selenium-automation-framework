package com.saikrishna.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssetsHomePage {

	@FindBy(xpath = ".//*[@id='left']/div/ul/li[3]/a")
	public WebElement personalAssetsMenu;
	
}
