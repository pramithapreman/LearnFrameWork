package com.learnFramework.scripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.learnFramework.generic.*;
import com.learnFramework.pompages.*;

public class VerifyLogout extends BaseTest {

	@Test
	void enterEmail() {
		try {
			GmailEmailIdPage emailpage = new GmailEmailIdPage(driver);
			emailpage.setEmail("pramithapreman");
			emailpage.clickNext();
			Thread.sleep(3000);

			GmailPasswordPage pwdPage = new GmailPasswordPage(driver);
			pwdPage.setPassword("chinnooty280793");
			pwdPage.clickNext();
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.titleContains("- pramithapreman@gmail.com - Gmail"));

			GmailInboxPage inbPage = new GmailInboxPage(driver);
			inbPage.imageClick();
			inbPage.signOutClick();
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}

	}
}
