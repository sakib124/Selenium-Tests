package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Test Steps:
//i) Launch the Browser
//ii) Navigate to Google Home page ("https://www.google.com")
//iii) Verify existence of gmail link
//iv) Close Browser

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\100587434\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		boolean existence = driver.findElement(By.linkText("Gmail")).isDisplayed();

		if (existence == true){
		System.out.println("Gmail Link Exists – Test Passed");
		}
		else {
		System.out.println("Gmail Link does not exist – Test Failed");
		}
		
		try
			{
		if (driver.findElement(By.linkText("mail")).isDisplayed()){
		System.out.println("Gmail Link Exists – Test Passed");
			}
		}

		catch (NoSuchElementException e)
		{
		System.out.println("Gmail Link does not exist – Test Failed");
		}
		driver.close();
		}
	
	
}

