package com.learnFramework.scripts;

import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;

import com.learnFramework.generic.BaseTest;
import com.learnFramework.generic.Lib;
import com.learnFramework.pompages.GmailEmailIdPage;
import com.learnFramework.pompages.GmailPasswordPage;

public class TestInvalidLogin extends BaseTest {
	@Test
	public void enterEmail() {
		try {
			GmailEmailIdPage emailpage = new GmailEmailIdPage(driver);
			emailpage.setEmail(Lib.getCellValue("InvalidLogin", 1, 0));
			Thread.sleep(2000);
			emailpage.clickNext();
			Thread.sleep(2000);
			GmailPasswordPage pwdPage = new GmailPasswordPage(driver);
			Thread.sleep(2000);
			pwdPage.setPassword(Lib.getCellValue("InvalidLogin", 1, 1));
			Thread.sleep(2000);
			pwdPage.clickNext();
			Thread.sleep(3000);
			
		} catch (Exception e) {
		}
	}
}
