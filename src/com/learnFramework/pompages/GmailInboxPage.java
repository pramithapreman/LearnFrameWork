package com.learnFramework.pompages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailInboxPage {
	@FindBy(xpath = "//span[@class='gb_db gbii']")
	WebElement image;

	@FindBy(xpath = "//a[text()='Sign out']")
	WebElement signOutButton;

	public GmailInboxPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void imageClick() {
		image.click();
	}

	public void signOutClick() {
		signOutButton.click();
	}
}
