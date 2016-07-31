package t1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Dice {

	WebDriver driver;

	

	@Test

	public <FireFoxDriver> void example()

	{

		driver = new FirefoxDriver();

		driver.get("https://www.dice.com/register/?CMPID=PS_MN_PD_JS_AV_OG&s_kwcid=AL!3853!10!10562910031!29302151346&ef_id=VjFFhQAAAByOLFB@:20160725005938:s");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.linkText("Login/Register")).click();

	driver.findElement(By.id("email")).sendKeys("syamala.1913@gmail.com");

	driver.findElement(By.id("password")).sendKeys("amengoto45");

	driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
	driver.findElement(By.id("job")).sendKeys("selenium");
	driver.findElement(By.id("location")).sendKeys("dallas");
	driver.findElement(By.xpath("//input[@value='Find Tech Jobs']")).click();
	List<WebElement> list =driver.findElements(By.xpath("//a"));
	System.out.println("Link text are :");
	for(WebElement web:list){
		System.out.println(web.getText());
	}






	}
	}