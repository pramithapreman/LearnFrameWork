package com.learnFramework.pompages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPasswordPage {
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextButton;

	public GmailPasswordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void clickNext() {
		nextButton.click();
	}
}
