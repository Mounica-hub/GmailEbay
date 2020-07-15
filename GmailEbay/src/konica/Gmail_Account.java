package konica;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Account {
	
	public void login() throws IOException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//load URL	
		driver.get("https://accounts.google.com/signup");
		driver.findElementById("firstName").sendKeys("TestUser");
		driver.findElementById("lastName").sendKeys("Name1");
		driver.findElementById("username").sendKeys("Testuser1");
		driver.findElementByLinkText("Password").sendKeys("Password@1");
		driver.findElementByLinkText("Confirm").sendKeys("Password@1");
		String Title = driver.getTitle();
		System.out.println(Title);
		}
		}
}
