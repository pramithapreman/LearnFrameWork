package com.learnFramework.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailEmailIdPage {
	@FindBy(xpath = "//input[@type='email']")
	WebElement email;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextButton;

	// initialize
	public GmailEmailIdPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilize
	public void setEmail(String emailId) {
		email.sendKeys(emailId);
	}

	public void clickNext() {
		nextButton.click();
	}
}
