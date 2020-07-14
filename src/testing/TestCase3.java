package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Test Steps:
//1) Launch Browser
//2) Verify Gmail Home Page title 
//3) Verify Yahoo Home Page title
//4) Close Browser

public class TestCase3 {
		public WebDriver driver;
		
		@BeforeClass
		public void launchBrowser(){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\100587434\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		@AfterClass
		public void closeBrowser(){
		driver.close();
		}
		@Test(priority=1)
		public void verifyGmailpage(){
		driver.get("https://www.gmail.com");
		Assert.assertEquals("Gmail", driver.getTitle());
		}
		@Test(priority=2)
		public void verifyYahoopage(){
		driver.get("https://uk.yahoo.com/");
		Assert.assertEquals("Yahoo", driver.getTitle());
		}
		}

