package sairam;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {
	WebDriver driver;
	@Test
	public void image()



	{
		driver = new FirefoxDriver();
		driver.get("https://www.ebay.com");
		driver.findElement(By.linkText("Daily Deals")).click();
		driver.findElement(By.id("gh-logo")).click();
		
		
	}

	@Test
	public void downdrop()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.ebay.com");
		
	WebElement object =driver.findElement(By.id("gh-cat"));
	Select selectobject = new Select(object);
	selectobject.selectByVisibleText("Baby");
	
	
	}

	
	
}
