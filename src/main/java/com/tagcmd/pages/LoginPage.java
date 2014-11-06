package com.tagcmd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(xpath=".//*[@id='signin-form--username']")
	public WebElement userNameField;
	
	
	@FindBy(xpath=".//*[@id='signin-form--password']")
	public WebElement passwordField;
	
	
	@FindBy(xpath=".//*[@id='app-container']/div/div/div/form/div[2]/button")
	public WebElement signInButton;
	
}
