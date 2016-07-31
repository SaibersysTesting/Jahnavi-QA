package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Timesofindia {
	WebDriver driver;
@BeforeTest
public void setUp(){
		driver=new FirefoxDriver();
	driver.get("http://timesofindia.indiatimes.com/");
	driver.manage().window().maximize();}
@Test
public void testWebLinks(){
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.linkText("World")))
	.click(driver.findElement(By.xpath("//li[@id='nav-world']//ul[@class='list7']/li[2]/a")))
	.build()
	.perform();
	
List<WebElement> list=driver.findElements(By.xpath("//a"));
System.out.println("Link text are :");
	for(WebElement web:list){
		System.out.println(web.getText());
	
	}
  }

@AfterTest
public void tearDown(){
	driver.quit();
}
}