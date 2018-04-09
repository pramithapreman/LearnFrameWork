package com.learnFramework.scripts;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import com.learnFramework.generic.*;
import com.learnFramework.pompages.*;

public class TestValidLogin extends BaseTest {
	@Test
	public void enterEmail() {
		try {
			GmailEmailIdPage emailpage = new GmailEmailIdPage(driver);
			emailpage.setEmail(Lib.getCellValue("ValidLogin", 1, 0));
			Thread.sleep(2000);
			emailpage.clickNext();
			Thread.sleep(2000);
			GmailPasswordPage pwdPage = new GmailPasswordPage(driver);
			Thread.sleep(2000);
			pwdPage.setPassword(Lib.getCellValue("ValidLogin", 1, 1));
			Thread.sleep(2000);
			pwdPage.clickNext();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.titleContains("- pramithapreman@gmail.com - Gmail"));
		} catch (Exception e) {
		}
	}
}
