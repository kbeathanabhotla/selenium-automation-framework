package com.saikrishna.utils;

import org.openqa.selenium.WebElement;

public class ElementUtils {

	public static void enterTextToField(WebElement element, String textToEnter) {
		element.click();
		element.clear();
		element.sendKeys(textToEnter);
	}
}
