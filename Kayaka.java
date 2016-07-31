package testCases;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Kayaka {
WebDriver driver;

	

	@Test

	public <FireFoxDriver> void example()

	{

		driver = new FirefoxDriver();

		driver.get("https://www.kayak.com/horizon/sem/hotels/general?lang=en&utm_campaign=Brand+-+Exact&utm_content=Kayak&utm_medium=cpc&utm_source=bing&utm_term=kayak");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.findElement(By.linkText("FLIGHTS")).click();
	driver.findElement(By.xpath("//*[@id='onewaytrip-label']/span")).click();
	driver.findElement(By.id("origin")).clear();
	driver.findElement(By.id("origin")).sendKeys("Dallas (DFW)");
	driver.findElement(By.id("destination")).sendKeys("Tampa (TPA)");
	driver.findElement(By.id("travel_dates-start-display")).click();
	driver.findElement(By.id("fdimgbutton")).click();
	driver.findElement(By.xpath(".//*[@id='content_div']/div[1]/div/div/div[1]/div/span/a/span")).click();
	}
}
