package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Test Steps:
//i) Launch Browser
//ii) Navigate to wikipedia.org selenium software page
//iii) Click “Create account” link
//iv) Capture the URL
//v) Navigate back to Selenium Page
//vi) Click “selenium.dev” link
//vii) Capture the URL
//viii) Close Browser

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\100587434\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)");
		driver.findElement(By.linkText("Create account")).click();
		String url = driver.getCurrentUrl();
		if (url.contains("wikipedia.org")) {
			System.out.println("This is an internal link - Redirected to another page in the same application - Test Passed");
		}
		else {
			System.out.println("This is an external link - Redirected to another page in a different application - Test Failed");
		}
		driver.navigate().back();
		driver.findElement(By.partialLinkText("selenium.dev")).click();
		url = driver.getCurrentUrl();

		if (!url.contains("wikipedia.org")){
		System.out.println("This is an external link - Redirected to another page in a different application - Test Passed");
		}
		else{
		System.out.println("This is an internal link - Redirected to another page in the same application - Test Failed");
		}
		driver.close();
		}
	}

