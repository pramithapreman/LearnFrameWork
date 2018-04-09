package com.learnFramework.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseTest {
	public WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	@BeforeMethod
	public void openApplication() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
	}

	@AfterMethod
	public void closeApplication() {
		driver.close();
	}

}
