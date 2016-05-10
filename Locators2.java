package sairam;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators2 {
	WebDriver driver;
	@Test
	public void checkbox()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.ebay.com");
		driver.findElement(By.linkText("Sign in")).click();
		if(driver.findElement(By.id("csi")).isSelected());
		{
			driver.findElement(By.id("csi")).click();
		}
		}
		
	

@Test 
      public void Radiobutton()
{
	driver = new FirefoxDriver();
	driver.get("https://www.southwest.com/");
	String southwest = "oneway";
	
	if(southwest == "oneway")
	{
		driver.findElement(By.id("trip-type-one-way")).click();
	}else
	{
		driver.findElement(By.id("trip-type-round-trip")).click();
	}
	
}




	private Object by(String string) {
		// TODO Auto-generated method stub
		return null;
	}
      
      
      
}