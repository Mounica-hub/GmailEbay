package konica;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ebay.com");
		driver.findElementByXPath("//input[@id='gh-ac']").sendKeys("Electric Guitar"); 
		driver.findElementByXPath("//td[@id='gh-btn']']").click();
		List<WebElement> ListOfPrices = driver.findElementsByXPath("(//div[@id=srp-river-results'][.//h4[contains(text(), 'Electric Guitar')] and .//span[contains(text(), '40% OFF')]])/div[2]/span/span[@class='product-discountedPrice']");
		for (WebElement orderPrice:ListOfPrices) 
		{
			String priceList = orderPrice.getText();
			System.out.println("PriceList:"+priceList);
			
		}
	}
}

	}

}
